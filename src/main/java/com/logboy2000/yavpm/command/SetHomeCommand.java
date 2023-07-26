package com.logboy2000.yavpm.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.*;
import net.minecraft.util.math.BlockPos;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class SetHomeCommand {
    // A data structure to store the homes of players
    private static final Map<UUID, BlockPos> playerHomes = new HashMap<>();

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(
                CommandManager.literal("sethome")
                        .executes(context -> {
                            ServerPlayerEntity player = context.getSource().getPlayer();
                            BlockPos playerPos = player.getBlockPos();
                            playerHomes.put(player.getUuid(), playerPos);
                            player.sendMessage(Text.of("Home Set to \nX:"+player.getX()+"\nY:"+player.getY()+"\nZ:"+player.getZ()));
                            return 1;
                        })
        );
    }

    public static BlockPos getPlayerHome(UUID playerUUID) {
        return playerHomes.get(playerUUID);
    }
}
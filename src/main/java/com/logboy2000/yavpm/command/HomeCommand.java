package com.logboy2000.yavpm.command;

import com.mojang.brigadier.CommandDispatcher;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;

public class HomeCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(
                CommandManager.literal("home")
                        .executes(context -> {
                            ServerPlayerEntity player = context.getSource().getPlayer();
                            BlockPos homePos = SetHomeCommand.getPlayerHome(player.getUuid());
                            if (homePos != null) {
                                player.teleport(player.getServerWorld(), homePos.getX(), homePos.getY(), homePos.getZ(), player.getYaw(), player.getPitch());
                                player.sendMessage(Text.of("Teleported to home!"), false);
                                return 1;
                            } else {
                                player.sendMessage(Text.of("Home not set. Use /sethome to set your home."), false);
                                return 0;
                            }
                        })
        );
    }
}
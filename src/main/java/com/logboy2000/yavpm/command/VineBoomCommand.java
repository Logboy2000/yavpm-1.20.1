package com.logboy2000.yavpm.command;



import com.logboy2000.yavpm.sound.ModSounds;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.context.CommandContext;
import net.minecraft.command.argument.EntityArgumentType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.sound.SoundCategory;

import java.util.Collection;

public class VineBoomCommand {
    public static void register(CommandDispatcher<ServerCommandSource> dispatcher) {
        dispatcher.register(CommandManager.literal("boom")
                .then(CommandManager.argument("target", EntityArgumentType.players())
                        .executes(context -> boom(context, EntityArgumentType.getPlayers(context, "target")))));
    }

    private static int boom(CommandContext<ServerCommandSource> context, Collection<? extends PlayerEntity> targets) {
        for (PlayerEntity player : targets) {
            player.playSound(ModSounds.VINE_BOOM, SoundCategory.MASTER, 1.0f, 1.0f);
        }
        return targets.size();
    }
}

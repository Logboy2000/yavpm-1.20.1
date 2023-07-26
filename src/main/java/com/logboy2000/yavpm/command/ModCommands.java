package com.logboy2000.yavpm.command;

import com.logboy2000.yavpm.YetAnotherVanillaPlusMod;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;

public class ModCommands {
    public static void registerModCommands(){
        YetAnotherVanillaPlusMod.LOGGER.info("Registering Mod Commands for " + YetAnotherVanillaPlusMod.MOD_ID);

        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            SetHomeCommand.register(dispatcher);
            HomeCommand.register(dispatcher);
            VineBoomCommand.register(dispatcher);
        });


    }
}

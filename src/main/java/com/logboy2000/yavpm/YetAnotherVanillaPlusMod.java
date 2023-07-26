package com.logboy2000.yavpm;

import com.logboy2000.yavpm.block.ModBlocks;
import com.logboy2000.yavpm.command.HomeCommand;
import com.logboy2000.yavpm.command.SetHomeCommand;
import com.logboy2000.yavpm.item.ModItemGroups;
import com.logboy2000.yavpm.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YetAnotherVanillaPlusMod implements ModInitializer {
	public static final String MOD_ID = "yavpm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	@Override
	public void onInitialize() {

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModItemGroups.registerItemGroups();


		// Register the commands
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
			SetHomeCommand.register(dispatcher);
			HomeCommand.register(dispatcher);
		});



	LOGGER.info("Hello Fabric world!");
	}
}
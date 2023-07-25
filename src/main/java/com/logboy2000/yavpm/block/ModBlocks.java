package com.logboy2000.yavpm.block;

import com.logboy2000.yavpm.YetAnotherVanillaPlusMod;
import com.logboy2000.yavpm.block.custom.BoostBlock;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block BOOST_BLOCK = registerBlock("boost_block",
            new BoostBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_GLAZED_TERRACOTTA)));

    //public static final Block BOOST_BLOCK = registerBlock("boost_block", new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_GLAZED_TERRACOTTA)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(YetAnotherVanillaPlusMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(YetAnotherVanillaPlusMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }


    public static void registerModBlocks(){
        YetAnotherVanillaPlusMod.LOGGER.info("Registering Mod Blocks for " + YetAnotherVanillaPlusMod.MOD_ID);
    }
}

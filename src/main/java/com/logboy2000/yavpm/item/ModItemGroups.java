package com.logboy2000.yavpm.item;

import com.logboy2000.yavpm.YetAnotherVanillaPlusMod;
import com.logboy2000.yavpm.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup VP_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(YetAnotherVanillaPlusMod.MOD_ID, "vp"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.vp"))
                    .icon(()-> new ItemStack(ModItems.ENCHANTED_SLIME)).entries((displayContext, entries) -> {


                        entries.add(ModItems.ENCHANTED_SLIME);
                        //entries.add(ModItems.EXPERIENCED_FIREWORK);

                        entries.add(ModBlocks.BOOST_BLOCK);


                    }).build());

    public  static void registerItemGroups(){
        YetAnotherVanillaPlusMod.LOGGER.info("Registering Item Groups for " + YetAnotherVanillaPlusMod.MOD_ID);
    }
}

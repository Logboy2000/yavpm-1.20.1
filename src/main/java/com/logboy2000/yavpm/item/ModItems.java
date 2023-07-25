package com.logboy2000.yavpm.item;

import com.logboy2000.yavpm.YetAnotherVanillaPlusMod;
import com.logboy2000.yavpm.item.custom.EnchantedSlime;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item TEMPLATE = registerItem("template", new Item(new FabricItemSettings()));


    public static final EnchantedSlime ENCHANTED_SLIME = new EnchantedSlime(new FabricItemSettings());



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(YetAnotherVanillaPlusMod.MOD_ID, name), item);
    }



    public static void registerModItems() {
        YetAnotherVanillaPlusMod.LOGGER.info("Registering Mod Items for " + YetAnotherVanillaPlusMod.MOD_ID);
    }
}

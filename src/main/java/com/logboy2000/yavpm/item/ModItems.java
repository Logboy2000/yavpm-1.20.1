package com.logboy2000.yavpm.item;

import com.logboy2000.yavpm.YetAnotherVanillaPlusMod;
import com.logboy2000.yavpm.item.custom.EnchantedSlimeItem;
import com.logboy2000.yavpm.item.custom.MoaiItem;
import com.logboy2000.yavpm.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {



    public static final Item ENCHANTED_SLIME = registerItem("enchanted_slime",
            new EnchantedSlimeItem(new FabricItemSettings()));
    public static final Item MOAI = registerItem("moai",
            new MoaiItem(new FabricItemSettings()));
    public static final Item CAREFREE_MUSIC_DISC = registerItem("carefree_music_disc",
            new MusicDiscItem(6, ModSounds.CAREFREE_MUSIC_DISC, new FabricItemSettings().maxCount(1), 305));

    public static final Item FRIED_EGG = registerItem("fried_egg", new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG)));
    public static final Item FRIED_EGG_SANDWICH = registerItem("fried_egg_sandwich", new Item(new FabricItemSettings().food(ModFoodComponents.FRIED_EGG_SANDWICH)));
    public static final Item SLICED_BREAD = registerItem("sliced_bread", new Item(new FabricItemSettings().food(ModFoodComponents.SLICED_BREAD)));
    public static final Item SCRAMBLED_EGG = registerItem("scrambled_egg", new Item(new FabricItemSettings().food(ModFoodComponents.SCRAMBLED_EGG)));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(YetAnotherVanillaPlusMod.MOD_ID, name), item);
    }



    public static void registerModItems() {
        YetAnotherVanillaPlusMod.LOGGER.info("Registering Mod Items for " + YetAnotherVanillaPlusMod.MOD_ID);
    }
}

package com.logboy2000.yavpm.enchantments;

import com.logboy2000.yavpm.YetAnotherVanillaPlusMod;
import com.logboy2000.yavpm.enchantments.custom.BoomEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEnchantments {



    public static Enchantment BOOM = register("boom", new BoomEnchantment());








    private static Enchantment register(String name, Enchantment enchantment) {
        return Registry.register(Registries.ENCHANTMENT, new Identifier(YetAnotherVanillaPlusMod.MOD_ID, name), enchantment);
    }


    public static void registerModEnchantments() {
        YetAnotherVanillaPlusMod.LOGGER.info("Registering Mod Items for " + YetAnotherVanillaPlusMod.MOD_ID);
    }
}

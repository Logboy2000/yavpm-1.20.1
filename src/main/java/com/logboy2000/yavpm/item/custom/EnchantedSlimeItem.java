package com.logboy2000.yavpm.item.custom;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class EnchantedSlimeItem extends Item {


    public EnchantedSlimeItem(Settings settings) {
        super(settings);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

package com.logboy2000.yavpm.enchantments.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class AutosmeltEnchantment extends Enchantment {
    public AutosmeltEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
        super(weight, type, slotTypes);



    }
    @Override
    public boolean isAcceptableItem(ItemStack stack) {
        // Return true if the enchantment can be applied to the item (e.g., pickaxes)
        return stack.isOf(Items.DIAMOND_PICKAXE);
    }

    @Override
    public boolean isTreasure() {
        return false; // Set to true if it should be a treasure enchantment.
    }
}

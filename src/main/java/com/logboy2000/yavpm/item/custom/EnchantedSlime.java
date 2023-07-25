package com.logboy2000.yavpm.item.custom;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EnchantedSlime extends Item {


    public EnchantedSlime(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            user.addVelocity(0,50,0);
            if (!user.isCreative()){
                user.getStackInHand(hand).decrement(1);
            }
        }
        return null;
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

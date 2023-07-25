package com.logboy2000.yavpm.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class EnchantedSlimeItem extends Item {


    public EnchantedSlimeItem(Settings settings) {
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
        return super.use(world, user, hand);
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

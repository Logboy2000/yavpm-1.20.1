package com.logboy2000.yavpm.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class EnchantedSlimeItem extends Item {


    public EnchantedSlimeItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        if (!world.isClient) {
            // Adjust the vertical velocity here as needed (in this case, 0.5 for a moderate boost upwards)
            double verticalVelocity = 10;
            // Get the player's current velocity
            Vec3d motion = user.getVelocity();
            // Set the vertical velocity component of the motion vector
            user.setVelocity(motion.x, verticalVelocity, motion.z);
        }
        return TypedActionResult.success(user.getStackInHand(hand));
    }

    public boolean hasGlint(ItemStack stack) {
        return true;
    }
}

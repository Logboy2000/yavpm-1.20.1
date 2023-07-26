package com.logboy2000.yavpm.item.custom;

import com.logboy2000.yavpm.sound.ModSounds;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class MoaiItem extends Item {
    public MoaiItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        user.playSound(ModSounds.VINE_BOOM, 10f, 1f);
        return super.use(world, user, hand);
    }


}

package com.logboy2000.yavpm.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class BoostBlock extends Block {
    public BoostBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
        super.onSteppedOn(world, pos, state, entity);
        if (!world.isClient){
            if (entity instanceof LivingEntity){
                LivingEntity livingEntity = (LivingEntity) entity;
                livingEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 20, 3));
                entity.handleFallDamage(entity.fallDistance, 0.2f, world.getDamageSources().fall());
            }
        }
    }


}

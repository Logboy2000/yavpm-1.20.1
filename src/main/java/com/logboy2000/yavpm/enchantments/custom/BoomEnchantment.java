package com.logboy2000.yavpm.enchantments.custom;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;
import net.minecraft.world.World;

public class BoomEnchantment extends Enchantment {
    public BoomEnchantment() {
        super(Rarity.VERY_RARE, EnchantmentTarget.BOW, new EquipmentSlot[]{EquipmentSlot.MAINHAND,EquipmentSlot.OFFHAND});
    }

    @Override
    public int getMinLevel() {
        return 1;
    }

    @Override
    public int getMaxLevel() {
        return 10;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {

        if (target instanceof LivingEntity){
            float explosionPower = (float) (level * 1.5);

            user.getWorld().createExplosion(null, target.getBlockX(),target.getBlockY(),target.getBlockZ(), explosionPower, World.ExplosionSourceType.TNT);
            user.sendMessage(Text.of("Explosion Power = "+ explosionPower));

            /**
            if (level == 1){
                user.getWorld().createExplosion(null, target.getBlockX(),target.getBlockY(),target.getBlockZ(), 1.5F, World.ExplosionSourceType.NONE);
            }

            if (level == 2){
                user.getWorld().createExplosion(null, target.getBlockX(),target.getBlockY(),target.getBlockZ(), 3F, World.ExplosionSourceType.NONE);
            }

            if (level == 3){
                user.getWorld().createExplosion(null, target.getBlockX(),target.getBlockY(),target.getBlockZ(), 6F, World.ExplosionSourceType.NONE);
            }
             **/
        }
        super.onTargetDamaged(user, target, level);
    }
}

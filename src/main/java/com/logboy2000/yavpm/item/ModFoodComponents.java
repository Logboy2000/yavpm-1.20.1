package com.logboy2000.yavpm.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent FRIED_EGG = new FoodComponent.Builder().hunger(5).saturationModifier(0.3f).build();
    public static final FoodComponent FRIED_EGG_SANDWICH = new FoodComponent.Builder().hunger(10).saturationModifier(0.6f).build();
    public static final FoodComponent SLICED_BREAD = new FoodComponent.Builder().hunger(1).saturationModifier(0.1f).build();
    public static final FoodComponent SCRAMBLED_EGG = new FoodComponent.Builder().hunger(2).saturationModifier(0.3f).build();
}

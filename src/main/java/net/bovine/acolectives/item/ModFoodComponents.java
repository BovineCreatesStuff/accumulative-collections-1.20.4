package net.bovine.acolectives.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent WHITE_CHOCOLATE = new FoodComponent.Builder().hunger(5).saturationModifier(.50f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 600), 1f).build();
    public static final FoodComponent MILK_CHOCOLATE = new FoodComponent.Builder().hunger(6).saturationModifier(.50f).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 900), 1f).build();
    public static final FoodComponent MOOSHROOM_BURGER = new FoodComponent.Builder().hunger(10).saturationModifier(.75f)
            .build();
    public static final FoodComponent CHEESE = new FoodComponent.Builder().hunger(6).saturationModifier(.50f)
            .build();
}

package net.bovine.acollectives.item;

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
    public static final FoodComponent GOAT_CHEESE = new FoodComponent.Builder().hunger(7).saturationModifier(0.25f)
            .build();
    public static final FoodComponent CHEVON = new FoodComponent.Builder().hunger(3).saturationModifier(0.25f)
            .build();
    public static final FoodComponent COOKED_CHEVON = new FoodComponent.Builder().hunger(7).saturationModifier(0.50f)
            .build();
    public static final FoodComponent GRAY_COD = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f)
            .build();
    public static final FoodComponent COOKED_GRAY_COD = new FoodComponent.Builder().hunger(5).saturationModifier(0.50f)
            .build();
    public static final FoodComponent CALAMARI = new FoodComponent.Builder().hunger(4).saturationModifier(0.55f)
            .build();
    public static final FoodComponent FRIED_CALAMARI = new FoodComponent.Builder().hunger(10).saturationModifier(0.75f)
            .build();
    public static final FoodComponent MEAT_CHUNK = new FoodComponent.Builder().hunger(20).saturationModifier(1f)
            .build();
}

package net.bovine.acollectives.datagen;

import net.bovine.acollectives.block.ModBlocks;
import net.bovine.acollectives.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_PLANKS);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCOA_BUTTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MILK_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOSHROOM_BURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUDDED_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUDDED_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUDDED_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.STUDDED_LEGGINGS, Models.GENERATED);
    }
}

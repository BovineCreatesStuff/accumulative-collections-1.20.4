package net.bovine.acolectives.datagen;

import net.bovine.acolectives.block.ModBlocks;
import net.bovine.acolectives.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD,
            ModBlocks.LEAD_ORE);

    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT,
                0.7f, 200, "lead");
        offerBlasting(exporter, LEAD_SMELTABLES, RecipeCategory.MISC, ModItems.LEAD_INGOT,
                0.7f, 100, "lead");
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,
                0.7f, 100, "ruby");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY, RecipeCategory.DECORATIONS,
                ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.LEAD_INGOT, RecipeCategory.DECORATIONS,
                ModBlocks.LEAD_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COCOA_BUTTER, 1)
                .pattern("###")
                .input('#', Items.COCOA_BEANS)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter);
    }
}

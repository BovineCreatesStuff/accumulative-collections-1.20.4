package net.bovine.acollectives.datagen;

import net.bovine.acollectives.block.ModBlocks;
import net.bovine.acollectives.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.CookingRecipeCategory;
import net.minecraft.recipe.book.RecipeCategory;

import java.util.List;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> LEAD_SMELTABLES = List.of(ModItems.RAW_LEAD,
            ModBlocks.LEAD_ORE, ModBlocks.DEEPSLATE_LEAD_ORE);

    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModBlocks.RUBY_ORE, ModBlocks.DEEPSLATE_RUBY_ORE);

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
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GOLD_COIN, RecipeCategory.DECORATIONS,
                ModBlocks.COIN_PILE);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.COCOA_BUTTER, 1)
                .pattern("###")
                .input('#', Items.COCOA_BEANS)
                .criterion(hasItem(Items.COCOA_BEANS), conditionsFromItem(Items.COCOA_BEANS))
                .offerTo(exporter);


        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.OLIVE_OIL_BUCKET, 1)
                .input(ModItems.OLIVE)
                .input(ModItems.OLIVE)
                .input(ModItems.OLIVE)
                .input(Items.BUCKET)
                .criterion(hasItem(ModItems.OLIVE), conditionsFromItem(ModItems.OLIVE))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.CHEESE, 2)
                .input(Items.MILK_BUCKET)
                .criterion(hasItem(Items.MILK_BUCKET), conditionsFromItem(Items.MILK_BUCKET))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MILK_CHOCOLATE, 4)
                .input(ModItems.COCOA_BUTTER)
                .input(Items.COCOA_BEANS)
                .input(Items.MILK_BUCKET)
                .input(Items.SUGAR)
                .criterion(hasItem(ModItems.COCOA_BUTTER), conditionsFromItem(ModItems.COCOA_BUTTER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.WHITE_CHOCOLATE, 4)
                .input(ModItems.COCOA_BUTTER)
                .input(Items.COCOA_BEANS)
                .input(Items.SUGAR)
                .criterion(hasItem(ModItems.COCOA_BUTTER), conditionsFromItem(ModItems.COCOA_BUTTER))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.FOOD, ModItems.MOOSHROOM_BURGER, 2)
                .input(ModItems.CHEESE)
                .input(Items.BREAD)
                .input(Items.RED_MUSHROOM)
                .input(Items.BROWN_MUSHROOM)
                .input(Items.BEEF)
                .criterion(hasItem(Items.RED_MUSHROOM), conditionsFromItem(Items.RED_MUSHROOM))
                .offerTo(exporter);

        /*
        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.RED_DYE, 1)
                .input(ModBlocks.RED_ROSE.asItem())
                .criterion(hasItem(ModBlocks.RED_ROSE.asItem()), conditionsFromItem(ModBlocks.RED_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.ORANGE_DYE, 1)
                .input(ModBlocks.ORANGE_ROSE.asItem())
                .criterion(hasItem(ModBlocks.ORANGE_ROSE.asItem()), conditionsFromItem(ModBlocks.ORANGE_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.GREEN_DYE, 1)
                .input(ModBlocks.GREEN_ROSE.asItem())
                .criterion(hasItem(ModBlocks.GREEN_ROSE.asItem()), conditionsFromItem(ModBlocks.GREEN_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.CYAN_DYE, 1)
                .input(ModBlocks.CYAN_ROSE.asItem())
                .criterion(hasItem(ModBlocks.CYAN_ROSE.asItem()), conditionsFromItem(ModBlocks.CYAN_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.BLUE_DYE, 1)
                .input(ModBlocks.BLUE_ROSE.asItem())
                .criterion(hasItem(ModBlocks.BLUE_ROSE.asItem()), conditionsFromItem(ModBlocks.BLUE_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.PURPLE_DYE, 1)
                .input(ModBlocks.PURPLE_ROSE.asItem())
                .criterion(hasItem(ModBlocks.PURPLE_ROSE.asItem()), conditionsFromItem(ModBlocks.PURPLE_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.WHITE_DYE, 1)
                .input(ModBlocks.WHITE_ROSE.asItem())
                .criterion(hasItem(ModBlocks.WHITE_ROSE.asItem()), conditionsFromItem(ModBlocks.WHITE_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.BLACK_DYE, 1)
                .input(ModBlocks.BLACK_ROSE.asItem())
                .criterion(hasItem(ModBlocks.BLACK_ROSE.asItem()), conditionsFromItem(ModBlocks.BLACK_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.YELLOW_DYE, 1)
                .input(ModBlocks.BUTTERCUP.asItem())
                .criterion(hasItem(ModBlocks.BUTTERCUP.asItem()), conditionsFromItem(ModBlocks.BUTTERCUP.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.PINK_DYE, 1)
                .input(ModBlocks.PINK_DAISY.asItem())
                .criterion(hasItem(ModBlocks.PINK_DAISY.asItem()), conditionsFromItem(ModBlocks.PINK_DAISY.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.BROWN_DYE, 1)
                .input(ModBlocks.BROWN_ROSE.asItem())
                .criterion(hasItem(ModBlocks.BROWN_ROSE.asItem()), conditionsFromItem(ModBlocks.BROWN_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.LIGHT_GRAY_DYE, 1)
                .input(ModBlocks.LIGHT_GRAY_ROSE.asItem())
                .criterion(hasItem(ModBlocks.LIGHT_GRAY_ROSE.asItem()), conditionsFromItem(ModBlocks.LIGHT_GRAY_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.MAGENTA_DYE, 1)
                .input(ModBlocks.MAGENTA_ROSE.asItem())
                .criterion(hasItem(ModBlocks.MAGENTA_ROSE.asItem()), conditionsFromItem(ModBlocks.MAGENTA_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.LIME_DYE, 1)
                .input(ModBlocks.GREEN_ROSE.asItem())
                .criterion(hasItem(ModBlocks.GREEN_ROSE.asItem()), conditionsFromItem(ModBlocks.GREEN_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.GRAY_DYE, 1)
                .input(ModBlocks.GRAY_ROSE.asItem())
                .criterion(hasItem(ModBlocks.GRAY_ROSE.asItem()), conditionsFromItem(ModBlocks.GRAY_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, Items.LIGHT_BLUE_DYE, 1)
                .input(ModBlocks.LIGHT_BLUE_ROSE.asItem())
                .criterion(hasItem(ModBlocks.LIGHT_BLUE_ROSE.asItem()), conditionsFromItem(ModBlocks.LIGHT_BLUE_ROSE.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_PLANKS, 4)
                .input(ModBlocks.ANCIENT_LOG.asItem())
                .criterion(hasItem(ModBlocks.ANCIENT_LOG.asItem()), conditionsFromItem(ModBlocks.ANCIENT_LOG.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_PLANKS, 4)
                .input(ModBlocks.STRIPPED_ANCIENT_LOG.asItem())
                .criterion(hasItem(ModBlocks.STRIPPED_ANCIENT_LOG.asItem()), conditionsFromItem(ModBlocks.STRIPPED_ANCIENT_LOG.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_PLANKS, 4)
                .input(ModBlocks.ANCIENT_WOOD.asItem())
                .criterion(hasItem(ModBlocks.ANCIENT_WOOD.asItem()), conditionsFromItem(ModBlocks.ANCIENT_WOOD.asItem()))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANCIENT_PLANKS, 4)
                .input(ModBlocks.STRIPPED_ANCIENT_WOOD.asItem())
                .criterion(hasItem(ModBlocks.STRIPPED_ANCIENT_WOOD.asItem()), conditionsFromItem(ModBlocks.STRIPPED_ANCIENT_WOOD.asItem()))
                .offerTo(exporter);
         */

        createStairsRecipe(ModBlocks.ANCIENT_STAIRS, Ingredient.ofItems(ModBlocks.ANCIENT_PLANKS.asItem()))
                .criterion(hasItem(ModBlocks.ANCIENT_PLANKS.asItem()), conditionsFromItem(ModBlocks.ANCIENT_PLANKS.asItem())).offerTo(exporter);
    }
}

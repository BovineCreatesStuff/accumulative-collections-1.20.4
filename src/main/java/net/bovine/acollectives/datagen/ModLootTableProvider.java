package net.bovine.acollectives.datagen;

import net.bovine.acollectives.block.ModBlocks;
import net.bovine.acollectives.block.custom.BarleyCropBlock;
import net.bovine.acollectives.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Blocks;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.ANCIENT_LOG);
        addDrop(ModBlocks.ANCIENT_WOOD);
        addDrop(ModBlocks.STRIPPED_ANCIENT_LOG);
        addDrop(ModBlocks.STRIPPED_ANCIENT_WOOD);
        addDrop(ModBlocks.ANCIENT_PLANKS);
        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.LEAD_BLOCK);
        addDrop(ModBlocks.SKYSTONE);
        addDrop(ModBlocks.GLOWING_OBSIDIAN);
        addDrop(ModBlocks.SMALL_STONE_BRICKS);
        addDrop(ModBlocks.CRACKED_SMALL_STONE_BRICKS);

        addDrop(ModBlocks.ANCIENT_LEAVES, leavesDrops(ModBlocks.ANCIENT_LEAVES, Blocks.SMOOTH_STONE_SLAB, 0.0025f)); //TODO

        addDrop(ModBlocks.ANCIENT_STAIRS);
        addDrop(ModBlocks.ANCIENT_SLAB, slabDrops(ModBlocks.ANCIENT_SLAB));
        addDrop(ModBlocks.ANCIENT_BUTTON);
        //addDrop(ModBlocks.ANCIENT_PRESSURE_PLATE);
        addDrop(ModBlocks.ANCIENT_FENCE);
        addDrop(ModBlocks.ANCIENT_FENCE_GATE);
        addDrop(ModBlocks.ANCIENT_DOOR, doorDrops(ModBlocks.ANCIENT_DOOR));
        addDrop(ModBlocks.ANCIENT_TRAPDOOR);

        addDrop(ModBlocks.HAUNT_LOG);
        addDrop(ModBlocks.HAUNT_WOOD);
        addDrop(ModBlocks.STRIPPED_HAUNT_LOG);
        addDrop(ModBlocks.STRIPPED_HAUNT_WOOD);
        addDrop(ModBlocks.HAUNT_PLANKS);

        addDrop(ModBlocks.HAUNT_STAIRS);
        addDrop(ModBlocks.HAUNT_SLAB, slabDrops(ModBlocks.HAUNT_SLAB));
        addDrop(ModBlocks.HAUNT_BUTTON);
        //addDrop(ModBlocks.HAUNT_PRESSURE_PLATE);
        addDrop(ModBlocks.HAUNT_FENCE);
        addDrop(ModBlocks.HAUNT_FENCE_GATE);

        addDrop(ModBlocks.PALM_LOG);
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_LOG);
        addDrop(ModBlocks.STRIPPED_PALM_WOOD);
        addDrop(ModBlocks.PALM_PLANKS);

        addDrop(ModBlocks.PALM_STAIRS);
        addDrop(ModBlocks.PALM_SLAB, slabDrops(ModBlocks.PALM_SLAB));
        addDrop(ModBlocks.PALM_BUTTON);
        //addDrop(ModBlocks.HAUNT_PRESSURE_PLATE);
        addDrop(ModBlocks.PALM_FENCE);
        addDrop(ModBlocks.PALM_FENCE_GATE);

        addDrop(ModBlocks.OLIVE_LOG);
        addDrop(ModBlocks.OLIVE_WOOD);
        addDrop(ModBlocks.STRIPPED_OLIVE_LOG);
        addDrop(ModBlocks.STRIPPED_OLIVE_WOOD);
        addDrop(ModBlocks.OLIVE_PLANKS);

        addDrop(ModBlocks.OLIVE_STAIRS);
        addDrop(ModBlocks.OLIVE_SLAB, slabDrops(ModBlocks.OLIVE_SLAB));
        addDrop(ModBlocks.OLIVE_BUTTON);
        //addDrop(ModBlocks.HAUNT_PRESSURE_PLATE);
        addDrop(ModBlocks.OLIVE_FENCE);
        addDrop(ModBlocks.OLIVE_FENCE_GATE);

        addDrop(ModBlocks.CHOCOLATE_DIRT);
        addDrop(ModBlocks.VANILLA_DIRT);
        addDrop(ModBlocks.SUGAR_BRICKS);
        addDrop(ModBlocks.SMOOTH_SUGAR_BRICKS);
        addDrop(ModBlocks.PALE_SMOOTH_SUGAR_BRICKS);

        addDrop(ModBlocks.RED_ROSE);
        addDrop(ModBlocks.CYAN_ROSE);
        addDrop(ModBlocks.WHITE_ROSE);
        addDrop(ModBlocks.PINK_ROSE);
        addDrop(ModBlocks.BLUE_ROSE);
        addDrop(ModBlocks.GREEN_ROSE);
        addDrop(ModBlocks.YELLOW_ROSE);
        addDrop(ModBlocks.BUTTERCUP);
        addDrop(ModBlocks.PINK_DAISY);

        addDrop(ModBlocks.SMALL_STONE_BRICKS);
        addDrop(ModBlocks.SMALL_STONE_BRICK_STAIRS);
        addDrop(ModBlocks.SMALL_STONE_BRICK_SLAB, slabDrops(ModBlocks.SMALL_STONE_BRICK_SLAB));
        addDrop(ModBlocks.SMALL_STONE_BRICK_WALL);
        addDrop(ModBlocks.CRACKED_SMALL_STONE_BRICKS);
        addDrop(ModBlocks.FRAGILE_SMALL_STONE_BRICKS, ModItems.WALL_MEAT);

        addDrop(ModBlocks.SALT_BLOCK);

        //addDrop(ModBlocks.CONSTRUCTION_CRATE);

        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.LEAD_ORE, oreDrops(ModBlocks.LEAD_ORE, ModItems.RAW_LEAD));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_LEAD_ORE, oreDrops(ModBlocks.DEEPSLATE_LEAD_ORE, ModItems.RAW_LEAD));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.BARLEY_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(BarleyCropBlock.AGE, 7));
        addDrop(ModBlocks.BARLEY_CROP, cropDrops(ModBlocks.BARLEY_CROP, ModItems.BARLEY, ModItems.BARLEY_SEEDS, builder));

        builder = BlockStatePropertyLootCondition.builder(ModBlocks.TEA_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(BarleyCropBlock.AGE, 7));
        addDrop(ModBlocks.TEA_CROP, cropDrops(ModBlocks.TEA_CROP, ModItems.TEA_LEAF, ModItems.TEA_SEEDS, builder));


    }
}

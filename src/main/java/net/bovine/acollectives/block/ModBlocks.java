package net.bovine.acollectives.block;

import net.bovine.acollectives.AccumulativeCollections;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ANCIENT_LOG = registerBlock("ancient_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block ANCIENT_WOOD = registerBlock("ancient_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_ANCIENT_LOG = registerBlock("stripped_ancient_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_ANCIENT_WOOD = registerBlock("stripped_ancient_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));

    public static final Block ANCIENT_PLANKS = registerBlock("ancient_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block ANCIENT_LEAVES = registerBlock("ancient_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));

    public static final Block BUTTERCUP = registerBlock("buttercup",
            new FlowerBlock(StatusEffects.POISON, 10,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque().noCollision()));
    public static final Block POTTED_BUTTERCUP = registerBlock("potted_buttercup",
            new FlowerPotBlock(BUTTERCUP, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).nonOpaque()));
    public static final Block PINK_DAISY = registerBlock("pink_daisy",
            new FlowerBlock(StatusEffects.REGENERATION, 16,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision()));
    public static final Block POTTED_PINK_DAISY = registerBlock("potted_pink_daisy",
            new FlowerPotBlock(PINK_DAISY, FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY).nonOpaque()));
    public static final Block RED_ROSE = registerBlock("red_rose",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 10,
                    FabricBlockSettings.copyOf(Blocks.POPPY).nonOpaque().noCollision()));
    public static final Block POTTED_RED_ROSE = registerBlock("potted_red_rose",
            new FlowerPotBlock(RED_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_POPPY).nonOpaque()));
    public static final Block CYAN_ROSE = registerBlock("cyan_rose",
            new FlowerBlock(StatusEffects.SATURATION, 1,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_CYAN_ROSE = registerBlock("potted_pink_cyan_rose",
            new FlowerPotBlock(CYAN_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block RAINBOW_WOOL = registerBlock("rainbow_wool",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL)));

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.DEEPSLATE_EMERALD_ORE)));
    public static final Block DEEPSLATE_LEAD_ORE = registerBlock("deepslate_lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));

    public static final Block SKYSTONE = registerBlock("skystone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).lightLevel(0)));
    public static final Block GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).lightLevel(12)));

    public static final Block UNLIT_TORCH = registerBlock("unlit_torch",
            new Block(FabricBlockSettings.copyOf(Blocks.TORCH).lightLevel(0)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(AccumulativeCollections.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        AccumulativeCollections.LOGGER.info("Registering Mod Blocks for " + AccumulativeCollections.MOD_ID);
    }
}

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
import net.minecraft.sound.BlockSoundGroup;
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

    public static final Block ANCIENT_STAIRS = registerBlock("ancient_stairs",
            new StairsBlock(ModBlocks.ANCIENT_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block ANCIENT_SLAB = registerBlock("ancient_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));

    public static final Block ANCIENT_BUTTON = registerBlock("ancient_button",
            new ButtonBlock(BlockSetType.OAK, 30, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).collidable(false)));

    public static final Block ANCIENT_FENCE = registerBlock("ancient_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block ANCIENT_FENCE_GATE = registerBlock("ancient_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)));


    public static final Block ANCIENT_DOOR = registerBlock("ancient_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block ANCIENT_TRAPDOOR = registerBlock("ancient_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));

    public static final Block HAUNT_LOG = registerBlock("haunt_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(4f)));
    public static final Block HAUNT_WOOD = registerBlock("haunt_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_HAUNT_LOG = registerBlock("stripped_haunt_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_DARK_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_HAUNT_WOOD = registerBlock("stripped_haunt_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_DARK_OAK_WOOD).strength(4f)));

    public static final Block HAUNT_PLANKS = registerBlock("haunt_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.DARK_OAK_PLANKS).strength(4f)));

    public static final Block HAUNT_STAIRS = registerBlock("haunt_stairs",
            new StairsBlock(ModBlocks.HAUNT_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.DARK_OAK_STAIRS)));
    public static final Block HAUNT_SLAB = registerBlock("haunt_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_SLAB)));

    public static final Block HAUNT_BUTTON = registerBlock("haunt_button",
            new ButtonBlock(BlockSetType.DARK_OAK, 30, FabricBlockSettings.copyOf(Blocks.DARK_OAK_BUTTON).collidable(false)));

    public static final Block HAUNT_FENCE = registerBlock("haunt_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE)));
    public static final Block HAUNT_FENCE_GATE = registerBlock("haunt_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, FabricBlockSettings.copyOf(Blocks.DARK_OAK_FENCE_GATE)));

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(4f)));
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).strength(4f)));
    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).strength(4f)));

    public static final Block CHOCOLATE_CAKE = registerBlock("chocolate_cake",
            new CakeBlock(FabricBlockSettings.copyOf(Blocks.CAKE))); 

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
    public static final Block POTTED_CYAN_ROSE = registerBlock("potted_cyan_rose",
            new FlowerPotBlock(CYAN_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));
    public static final Block WHITE_ROSE = registerBlock("white_rose",
            new FlowerBlock(StatusEffects.REGENERATION, 1,
                    FabricBlockSettings.copyOf(Blocks.LILY_OF_THE_VALLEY).nonOpaque().noCollision()));
    public static final Block POTTED_WHITE_ROSE = registerBlock("potted_white_rose",
            new FlowerPotBlock(WHITE_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_LILY_OF_THE_VALLEY).nonOpaque()));
    public static final Block PINK_ROSE = registerBlock("pink_rose",
            new FlowerBlock(StatusEffects.STRENGTH, 1,
                    FabricBlockSettings.copyOf(Blocks.PINK_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_PINK_ROSE = registerBlock("potted_pink_rose",
            new FlowerPotBlock(PINK_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_PINK_TULIP).nonOpaque()));
    public static final Block BLUE_ROSE = registerBlock("blue_rose",
            new FlowerBlock(StatusEffects.JUMP_BOOST, 1,
                    FabricBlockSettings.copyOf(Blocks.CORNFLOWER).nonOpaque().noCollision()));
    public static final Block POTTED_BLUE_ROSE = registerBlock("potted_blue_rose",
            new FlowerPotBlock(BLUE_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_CORNFLOWER).nonOpaque()));
    public static final Block GREEN_ROSE = registerBlock("green_rose",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 8,
                    FabricBlockSettings.copyOf(Blocks.AZURE_BLUET).nonOpaque().noCollision()));
    public static final Block POTTED_GREEN_ROSE = registerBlock("potted_green_rose",
            new FlowerPotBlock(GREEN_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_AZURE_BLUET).nonOpaque()));
    public static final Block YELLOW_ROSE = registerBlock("yellow_rose",
            new FlowerBlock(StatusEffects.SATURATION, 20,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque().noCollision()));
    public static final Block POTTED_YELLOW_ROSE = registerBlock("potted_yellow_rose",
            new FlowerPotBlock(YELLOW_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).nonOpaque()));
    public static final Block ORANGE_ROSE = registerBlock("orange_rose",
            new FlowerBlock(StatusEffects.STRENGTH, 1,
                    FabricBlockSettings.copyOf(Blocks.ORANGE_TULIP).nonOpaque().noCollision()));
    public static final Block POTTED_ORANGE_ROSE = registerBlock("potted_orange_rose",
            new FlowerPotBlock(ORANGE_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_ORANGE_TULIP).nonOpaque()));
    public static final Block PURPLE_ROSE = registerBlock("purple_rose",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 1,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_PURPLE_ROSE = registerBlock("potted_purple_rose",
            new FlowerPotBlock(PURPLE_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block BLACK_ROSE = registerBlock("black_rose",
            new FlowerBlock(StatusEffects.REGENERATION, 1,
                    FabricBlockSettings.copyOf(Blocks.AZURE_BLUET).nonOpaque().noCollision()));
    public static final Block POTTED_BLACK_ROSE = registerBlock("potted_black_rose",
            new FlowerPotBlock(BLACK_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_AZURE_BLUET).nonOpaque()));
    public static final Block BROWN_ROSE = registerBlock("brown_rose",
            new FlowerBlock(StatusEffects.SATURATION, 10,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque().noCollision()));
    public static final Block POTTED_BROWN_ROSE = registerBlock("potted_brown_rose",
            new FlowerPotBlock(BROWN_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).nonOpaque()));
    public static final Block LIGHT_GRAY_ROSE = registerBlock("light_gray_rose",
            new FlowerBlock(StatusEffects.REGENERATION, 10,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision()));
    public static final Block POTTED_LIGHT_GRAY_ROSE = registerBlock("potted_light_gray_rose",
            new FlowerPotBlock(LIGHT_GRAY_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY).nonOpaque()));
    public static final Block MAGENTA_ROSE = registerBlock("magenta_rose",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 10,
                    FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_MAGENTA_ROSE = registerBlock("potted_magenta_rose",
            new FlowerPotBlock(MAGENTA_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block LIME_ROSE = registerBlock("lime_rose",
            new FlowerBlock(StatusEffects.NIGHT_VISION, 10,
                    FabricBlockSettings.copyOf(Blocks.DANDELION).nonOpaque().noCollision()));
    public static final Block POTTED_LIME_ROSE = registerBlock("potted_lime_rose",
            new FlowerPotBlock(LIME_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_DANDELION).nonOpaque()));
    public static final Block GRAY_ROSE = registerBlock("gray_rose",
            new FlowerBlock(StatusEffects.REGENERATION, 10,
                    FabricBlockSettings.copyOf(Blocks.OXEYE_DAISY).nonOpaque().noCollision()));
    public static final Block POTTED_GRAY_ROSE = registerBlock("potted_gray_rose",
            new FlowerPotBlock(GRAY_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_OXEYE_DAISY).nonOpaque()));
    public static final Block LIGHT_BLUE_ROSE = registerBlock("light_blue_rose",
            new FlowerBlock(StatusEffects.SATURATION, 1,
                    FabricBlockSettings.copyOf(Blocks.BLUE_ORCHID).nonOpaque().noCollision()));
    public static final Block POTTED_LIGHT_BLUE_ROSE = registerBlock("potted_light_blue_rose",
            new FlowerPotBlock(LIGHT_BLUE_ROSE, FabricBlockSettings.copyOf(Blocks.POTTED_BLUE_ORCHID).nonOpaque()));

    public static final Block RAINBOW_WOOL = registerBlock("rainbow_wool",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.RED_WOOL)));

    public static final Block CHOCOLATE_DIRT = registerBlock("chocolate_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));
    public static final Block VANILLA_DIRT = registerBlock("vanilla_dirt",
            new Block(FabricBlockSettings.copyOf(Blocks.DIRT)));

    public static final Block SUGAR_BRICKS = registerBlock("sugar_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.BRICKS)));
    public static final Block SMOOTH_SUGAR_BRICKS = registerBlock("smooth_sugar_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHER_BRICKS).sounds(BlockSoundGroup.STONE)));
    public static final Block PALE_SMOOTH_SUGAR_BRICKS = registerBlock("pale_smooth_sugar_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_NETHER_BRICKS).sounds(BlockSoundGroup.STONE)));

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

    public static final Block SUPPLY_CRATE = registerBlock("supply_crate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));

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

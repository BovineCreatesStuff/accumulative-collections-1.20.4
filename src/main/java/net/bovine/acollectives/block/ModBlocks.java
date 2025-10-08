package net.bovine.acollectives.block;

import net.bovine.acollectives.AccumulativeCollections;
import net.bovine.acollectives.block.custom.BarleyCropBlock;
//import net.bovine.acollectives.block.custom.CookingRangeBlock;
import net.bovine.acollectives.sound.ModSounds;
import net.bovine.acollectives.world.tree.ModSaplingGenerators;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
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
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR)));
    public static final Block ANCIENT_TRAPDOOR = registerBlock("ancient_trapdoor",
            new TrapdoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_TRAPDOOR)));

    public static final Block ANCIENT_SAPLING = registerBlock("ancient_sapling",
            new SaplingBlock(ModSaplingGenerators.ANCIENT, FabricBlockSettings.copyOf(Blocks.OAK_SAPLING)));

    public static final Block POTTED_ANCIENT_SAPLING = registerBlock("potted_ancient_sapling",
            new FlowerPotBlock(ANCIENT_SAPLING, FabricBlockSettings.copyOf(Blocks.POTTED_OAK_SAPLING).nonOpaque()));

    //public static final BlockSetType ANCIENT = BlockSetType.register(new BlockSetType("ancient"));
    //public static final WoodType ANCIENTWOODTYPE = WoodType.register(new WoodType("ancientwoodtype", BlockSetType.ANCIENT));

    /*
    public static final Identifier ANCIENT_SIGN_TEXTURE = new Identifier(AccumulativeCollections.MOD_ID, "entity/signs/ancient");
    public static final Identifier ANCIENT_HANGING_SIGN_TEXTURE = new Identifier(AccumulativeCollections.MOD_ID, "entity/signs/hanging/ancient");
    public static final Identifier ANCIENT_HANGING_GUI_SIGN_TEXTURE = new Identifier(AccumulativeCollections.MOD_ID, "texture/gui/hanging_signs/ancient");

    public static final Block ANCIENT_STANDING_SIGN = Registry.register(Registries.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, "ancient_standing_sign"),
            new TerraformSignBlock(ANCIENT_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block ANCIENT_WALL_SIGN = Registry.register(Registries.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, "ancient_wall_sign"),
            new TerraformWallSignBlock(ANCIENT_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block ANCIENT_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, "ancient_hanging_sign"),
            new TerraformHangingSignBlock(ANCIENT_HANGING_SIGN_TEXTURE, ANCIENT_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block ANCIENT_WALL_HANGING_SIGN = Registry.register(Registries.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, "ancient_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(ANCIENT_SIGN_TEXTURE, ANCIENT_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

    public static final BlockFamily ANCIENT_FAMILY = BlockFamilies.register(ModBlocks.ANCIENT_PLANKS)
            .sign(ModBlocks.ANCIENT_STANDING_SIGN, ModBlocks.ANCIENT_WALL_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
     */

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

    public static final Block HAUNT_DOOR = registerBlock("haunt_door",
            new DoorBlock(BlockSetType.DARK_OAK, FabricBlockSettings.copyOf(Blocks.DARK_OAK_DOOR)));
    public static final Block HAUNT_TRAPDOOR = registerBlock("haunt_trapdoor",
            new TrapdoorBlock(BlockSetType.DARK_OAK, FabricBlockSettings.copyOf(Blocks.DARK_OAK_TRAPDOOR)));

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(4f)));
    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_WOOD).strength(4f)));
    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.JUNGLE_PLANKS).strength(4f)));
    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(4f)));
    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(4f)));

    public static final Block OLIVE_LOG = registerBlock("olive_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block OLIVE_WOOD = registerBlock("olive_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block OLIVE_PLANKS = registerBlock("olive_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block OLIVE_LEAVES = registerBlock("olive_leaves",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f)));
    public static final Block STRIPPED_OLIVE_LOG = registerBlock("stripped_olive_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block STRIPPED_OLIVE_WOOD = registerBlock("stripped_olive_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));

    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.JUNGLE_STAIRS)));
    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_SLAB)));

    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(BlockSetType.JUNGLE, 30, FabricBlockSettings.copyOf(Blocks.JUNGLE_BUTTON).collidable(false)));

    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE)));
    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(WoodType.JUNGLE, FabricBlockSettings.copyOf(Blocks.JUNGLE_FENCE_GATE)));

    public static final Block OLIVE_STAIRS = registerBlock("olive_stairs",
            new StairsBlock(ModBlocks.OLIVE_PLANKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS)));
    public static final Block OLIVE_SLAB = registerBlock("olive_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB)));

    public static final Block OLIVE_BUTTON = registerBlock("olive_button",
            new ButtonBlock(BlockSetType.OAK, 30, FabricBlockSettings.copyOf(Blocks.OAK_BUTTON).collidable(false)));

    public static final Block OLIVE_FENCE = registerBlock("olive_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.OAK_FENCE)));
    public static final Block OLIVE_FENCE_GATE = registerBlock("olive_fence_gate",
            new FenceGateBlock(WoodType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_FENCE_GATE)));

    public static final Block OLIVE_DOOR = registerBlock("olive_door",
            new DoorBlock(BlockSetType.OAK, FabricBlockSettings.copyOf(Blocks.OAK_DOOR)));

    public static final Block BARLEY_CROP = Registry.register(Registries.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, "barley_crop"),
            new BarleyCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));

    public static final Block TEA_CROP = Registry.register(Registries.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, "tea_crop"),
            new BarleyCropBlock(FabricBlockSettings.copyOf(Blocks.BEETROOTS)));

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

    public static final Block LIGHT_BLUE_ROSE_BUSH = registerBlock("light_blue_rose_bush",
            new TallFlowerBlock(FabricBlockSettings.copyOf(Blocks.ROSE_BUSH).nonOpaque().noCollision()));

    public static final Block REINFORCED_OAK_LOG = registerBlock("reinforced_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(6f)));
    public static final Block REINFORCED_BIRCH_LOG = registerBlock("reinforced_birch_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.BIRCH_LOG).strength(6f)));
    public static final Block REINFORCED_SPRUCE_LOG = registerBlock("reinforced_spruce_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.SPRUCE_LOG).strength(6f)));
    public static final Block REINFORCED_JUNGLE_LOG = registerBlock("reinforced_jungle_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.JUNGLE_LOG).strength(6f)));
    public static final Block REINFORCED_ACACIA_LOG = registerBlock("reinforced_acacia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.ACACIA_LOG).strength(6f)));
    public static final Block REINFORCED_DARK_OAK_LOG = registerBlock("reinforced_dark_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(6f)));
    public static final Block REINFORCED_MANGROVE_LOG = registerBlock("reinforced_mangrove_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.MANGROVE_LOG).strength(6f)));
    public static final Block REINFORCED_CHERRY_LOG = registerBlock("reinforced_cherry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.CHERRY_LOG).strength(6f)));
    public static final Block REINFORCED_ANCIENT_LOG = registerBlock("reinforced_ancient_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(6f)));
    public static final Block REINFORCED_HAUNT_LOG = registerBlock("reinforced_haunt_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.DARK_OAK_LOG).strength(6f)));

    public static final Block REINFORCED_STRIPPED_OAK_LOG = registerBlock("reinforced_stripped_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_LOG).strength(6f)));
    public static final Block REINFORCED_STRIPPED_BIRCH_LOG = registerBlock("reinforced_stripped_birch_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_BIRCH_LOG).strength(6f)));
    public static final Block REINFORCED_STRIPPED_SPRUCE_LOG = registerBlock("reinforced_stripped_spruce_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_SPRUCE_LOG).strength(6f)));
    public static final Block REINFORCED_STRIPPED_JUNGLE_LOG = registerBlock("reinforced_stripped_jungle_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_JUNGLE_LOG).strength(6f)));
    public static final Block REINFORCED_STRIPPED_ACACIA_LOG = registerBlock("reinforced_stripped_acacia_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_ACACIA_LOG).strength(6f)));
    public static final Block REINFORCED_STRIPPED_DARK_OAK_LOG = registerBlock("reinforced_stripped_dark_oak_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_DARK_OAK_LOG).strength(6f)));
    public static final Block REINFORCED_STRIPPED_MANGROVE_LOG = registerBlock("reinforced_stripped_mangrove_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_MANGROVE_LOG).strength(6f)));
    public static final Block REINFORCED_STRIPPED_CHERRY_LOG = registerBlock("reinforced_stripped_cherry_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_CHERRY_LOG).strength(6f)));

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

    public static final Block THATCH_BLOCK = registerBlock("thatch_block",
            new Block(FabricBlockSettings.copyOf(Blocks.HAY_BLOCK).sounds(BlockSoundGroup.GRASS)));

    public static final Block THATCH_STAIRS = registerBlock("thatch_stairs",
            new StairsBlock(ModBlocks.THATCH_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.OAK_STAIRS).sounds(BlockSoundGroup.GRASS)));
    public static final Block THATCH_SLAB = registerBlock("thatch_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.OAK_SLAB).sounds(BlockSoundGroup.GRASS)));

    public static final Block MAUSTONE = registerBlock("maustone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block LURSTONE = registerBlock("lurstone",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block SMALL_STONE_BRICKS = registerBlock("small_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));
    public static final Block CRACKED_SMALL_STONE_BRICKS = registerBlock("cracked_small_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block FRAGILE_SMALL_STONE_BRICKS = registerBlock("fragile_small_stone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.CRACKED_STONE_BRICKS)));
    public static final Block STONE_PILLAR = registerBlock("stone_pillar",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.QUARTZ_PILLAR)));
    public static final Block STONE_TILES = registerBlock("stone_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block COBBLESTONE_BRICKS = registerBlock("cobblestone_bricks",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE_BRICKS)));

    public static final Block SMALL_STONE_BRICK_STAIRS = registerBlock("small_stone_brick_stairs",
            new StairsBlock(ModBlocks.SMALL_STONE_BRICKS.getDefaultState(), FabricBlockSettings.copyOf(Blocks.STONE_BRICK_STAIRS)));
    public static final Block SMALL_STONE_BRICK_SLAB = registerBlock("small_stone_brick_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_SLAB)));
    public static final Block SMALL_STONE_BRICK_WALL = registerBlock("small_stone_brick_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.STONE_BRICK_WALL)));

    public static final Block SKYSTONE = registerBlock("skystone",
            new Block(FabricBlockSettings.copyOf(Blocks.GLOWSTONE).luminance(0)));
    public static final Block GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            new Block(FabricBlockSettings.copyOf(Blocks.OBSIDIAN).luminance(12)));

    public static final Block MISSING_TILES = registerBlock("missing_tiles",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));

    public static final Block CONSTRUCTION_CRATE = registerBlock("construction_crate",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_WOOD)));

    public static final Block EXPLOSIVE_BARREL = registerBlock("explosive_barrel",
            new TntBlock(FabricBlockSettings.copyOf(Blocks.TNT)));

    public static final Block SUPPLY_CRATE = registerBlock("supply_crate",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));

    /*
    public static final Block COOKING_RANGE = registerBlock("cooking_range",
            new CookingRangeBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
     */

    public static final Block COOKING_RANGE = registerBlock("cooking_range",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));

    public static final Block COIN_PILE = registerBlock("coin_pile",
            new Block(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).sounds(ModSounds.COIN_PILE_SOUNDS).breakInstantly()));
    public static final Block COIN_PILE_SLAB = registerBlock("coin_pile_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.GOLD_BLOCK).sounds(ModSounds.COIN_PILE_SOUNDS).breakInstantly()));

    public static final Block SALT_BLOCK = registerBlock("salt_block",
            new Block(FabricBlockSettings.copyOf(Blocks.SANDSTONE)));

    public static final Block TRIMMED_RED_CARPET_LEFT = registerBlock("trimmed_red_carpet_left",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_RIGHT = registerBlock("trimmed_red_carpet_right",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_UP = registerBlock("trimmed_red_carpet_up",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_DOWN = registerBlock("trimmed_red_carpet_down",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_TOP_LEFT = registerBlock("trimmed_red_carpet_top_left",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_TOP_RIGHT = registerBlock("trimmed_red_carpet_top_right",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_BOTTOM_LEFT = registerBlock("trimmed_red_carpet_bottom_left",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_BOTTOM_RIGHT = registerBlock("trimmed_red_carpet_bottom_right",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_CENTER = registerBlock("trimmed_red_carpet_center",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_U_LEFT = registerBlock("trimmed_red_carpet_u_left",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_U_RIGHT = registerBlock("trimmed_red_carpet_u_right",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_U_UP = registerBlock("trimmed_red_carpet_u_up",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_U_DOWN = registerBlock("trimmed_red_carpet_u_down",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_COLUMN_HORIZONTAL = registerBlock("trimmed_red_carpet_column_horizontal",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    public static final Block TRIMMED_RED_CARPET_COLUMN_VERTICAL = registerBlock("trimmed_red_carpet_column_vertical",
            new CarpetBlock(FabricBlockSettings.copyOf(Blocks.RED_CARPET)));
    /*
    public static final Block UNLIT_TORCH = registerBlock("unlit_torch",
            new TorchBlock(DefaultParticleType smoke, FabricBlockSettings.copyOf(Blocks.WALL_TORCH).lightLevel(0)));

    public static final Block WALL_UNLIT_TORCH = registerBlock("wall_unlit_torch",
            new Block(FabricBlockSettings.copyOf(Blocks.TORCH).lightLevel(0)));
     */

    public static final Block LEADED_BLACK_STAINED_GLASS = registerBlock("leaded_black_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS)));
    public static final Block LEADED_BLUE_STAINED_GLASS = registerBlock("leaded_blue_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS)));
    public static final Block LEADED_BROWN_STAINED_GLASS = registerBlock("leaded_brown_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS)));
    public static final Block LEADED_CYAN_STAINED_GLASS = registerBlock("leaded_cyan_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS)));
    public static final Block LEADED_GREEN_STAINED_GLASS = registerBlock("leaded_green_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS)));
    public static final Block LEADED_GRAY_STAINED_GLASS = registerBlock("leaded_gray_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS)));
    public static final Block LEADED_LIGHT_BLUE_STAINED_GLASS = registerBlock("leaded_light_blue_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS)));
    public static final Block LEADED_LIGHT_GRAY_STAINED_GLASS = registerBlock("leaded_light_gray_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS)));
    public static final Block LEADED_LIME_STAINED_GLASS = registerBlock("leaded_lime_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS)));
    public static final Block LEADED_MAGENTA_STAINED_GLASS = registerBlock("leaded_magenta_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS)));
    public static final Block LEADED_ORANGE_STAINED_GLASS = registerBlock("leaded_orange_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS)));
    public static final Block LEADED_PINK_STAINED_GLASS = registerBlock("leaded_pink_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS)));
    public static final Block LEADED_PURPLE_STAINED_GLASS = registerBlock("leaded_purple_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS)));
    public static final Block LEADED_RED_STAINED_GLASS = registerBlock("leaded_red_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS)));
    public static final Block LEADED_WHITE_STAINED_GLASS = registerBlock("leaded_white_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS)));
    public static final Block LEADED_YELLOW_STAINED_GLASS = registerBlock("leaded_yellow_stained_glass",
            new Block(FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS)));

    public static final Block LEADED_BLACK_STAINED_GLASS_PANE = registerBlock("leaded_black_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLACK_STAINED_GLASS_PANE)));
    public static final Block LEADED_BLUE_STAINED_GLASS_PANE = registerBlock("leaded_blue_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BLUE_STAINED_GLASS_PANE)));
    public static final Block LEADED_BROWN_STAINED_GLASS_PANE = registerBlock("leaded_brown_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.BROWN_STAINED_GLASS_PANE)));
    public static final Block LEADED_CYAN_STAINED_GLASS_PANE = registerBlock("leaded_cyan_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.CYAN_STAINED_GLASS_PANE)));
    public static final Block LEADED_GRAY_STAINED_GLASS_PANE = registerBlock("leaded_gray_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GRAY_STAINED_GLASS_PANE)));
    public static final Block LEADED_GREEN_STAINED_GLASS_PANE = registerBlock("leaded_green_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.GREEN_STAINED_GLASS_PANE)));
    public static final Block LEADED_LIGHT_BLUE_STAINED_GLASS_PANE = registerBlock("leaded_light_blue_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_BLUE_STAINED_GLASS_PANE)));
    public static final Block LEADED_LIGHT_GRAY_STAINED_GLASS_PANE = registerBlock("leaded_light_gray_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.LIGHT_GRAY_STAINED_GLASS_PANE)));
    public static final Block LEADED_LIME_STAINED_GLASS_PANE = registerBlock("leaded_lime_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.LIME_STAINED_GLASS_PANE)));
    public static final Block LEADED_MAGENTA_STAINED_GLASS_PANE = registerBlock("leaded_magenta_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.MAGENTA_STAINED_GLASS_PANE)));
    public static final Block LEADED_ORANGE_STAINED_GLASS_PANE = registerBlock("leaded_orange_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.ORANGE_STAINED_GLASS_PANE)));
    public static final Block LEADED_PINK_STAINED_GLASS_PANE = registerBlock("leaded_pink_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.PINK_STAINED_GLASS_PANE)));
    public static final Block LEADED_PURPLE_STAINED_GLASS_PANE = registerBlock("leaded_purple_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.PURPLE_STAINED_GLASS_PANE)));
    public static final Block LEADED_RED_STAINED_GLASS_PANE = registerBlock("leaded_red_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.RED_STAINED_GLASS_PANE)));
    public static final Block LEADED_WHITE_STAINED_GLASS_PANE = registerBlock("leaded_white_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.WHITE_STAINED_GLASS_PANE)));
    public static final Block LEADED_YELLOW_STAINED_GLASS_PANE = registerBlock("leaded_yellow_stained_glass_pane",
            new PaneBlock(FabricBlockSettings.copyOf(Blocks.YELLOW_STAINED_GLASS_PANE)));

    public static final Block HALL_TILE = registerBlock("hall_tile",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block HALL_FLOOR = registerBlock("hall_floor",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block HALL_CEILING = registerBlock("hall_ceiling",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE)));
    public static final Block BLUE_HALL_LIGHT = registerBlock("blue_hall_light",
            new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block GREEN_HALL_LIGHT = registerBlock("green_hall_light",
            new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block RED_HALL_LIGHT = registerBlock("red_hall_light",
            new Block(FabricBlockSettings.copyOf(Blocks.SEA_LANTERN).luminance(15)));
    public static final Block BLUE_HALL_FLOOR_LIGHT = registerBlock("blue_hall_floor_light",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).luminance(15)));
    public static final Block GREEN_HALL_FLOOR_LIGHT = registerBlock("green_hall_floor_light",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).luminance(15)));
    public static final Block RED_HALL_FLOOR_LIGHT = registerBlock("red_hall_floor_light",
            new Block(FabricBlockSettings.copyOf(Blocks.STONE).luminance(15)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(AccumulativeCollections.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        AccumulativeCollections.LOGGER.info("Registering Mod Blocks for " + AccumulativeCollections.MOD_ID);
    }
}

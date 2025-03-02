package net.bovine.acollectives.item;

import net.bovine.acollectives.AccumulativeCollections;
import net.bovine.acollectives.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ACOLLECTIVES_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(AccumulativeCollections.MOD_ID, "acollectives"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.acollectives"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BARLEY);
                        entries.add(ModItems.TEA_LEAF);
                        entries.add(ModItems.OLIVE);
                        entries.add(ModItems.BARLEY_SEEDS);
                        entries.add(ModItems.TEA_SEEDS);
                        entries.add(ModItems.COCOA_BUTTER);
                        entries.add(ModItems.WHITE_CHOCOLATE);
                        entries.add(ModItems.MILK_CHOCOLATE);
                        entries.add(ModItems.CHEESE);
                        entries.add(ModItems.GOAT_CHEESE);
                        entries.add(ModItems.OLIVE_OIL_BUCKET);
                        entries.add(ModItems.CHEVON);
                        entries.add(ModItems.COOKED_CHEVON);
                        entries.add(ModItems.CALAMARI);
                        entries.add(ModItems.FRIED_CALAMARI);
                        entries.add(ModItems.GRAY_COD);
                        entries.add(ModItems.COOKED_GRAY_COD);
                        entries.add(ModItems.GRAY_COD_BUCKET);
                        entries.add(ModItems.MOOSHROOM_BURGER);
                        entries.add(ModItems.FANCY_FEATHER);
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_LEAD);
                        entries.add(ModItems.LEAD_INGOT);

                        entries.add(ModBlocks.ANCIENT_LOG);
                        entries.add(ModBlocks.ANCIENT_WOOD);
                        entries.add(ModBlocks.ANCIENT_LEAVES);
                        entries.add(ModBlocks.ANCIENT_PLANKS);
                        entries.add(ModBlocks.STRIPPED_ANCIENT_LOG);
                        entries.add(ModBlocks.STRIPPED_ANCIENT_WOOD);
                        entries.add(ModBlocks.ANCIENT_STAIRS);
                        entries.add(ModBlocks.ANCIENT_SLAB);
                        entries.add(ModBlocks.ANCIENT_BUTTON);
                        entries.add(ModBlocks.ANCIENT_FENCE);
                        entries.add(ModBlocks.ANCIENT_FENCE_GATE);
                        entries.add(ModBlocks.ANCIENT_DOOR);
                        entries.add(ModBlocks.ANCIENT_TRAPDOOR);
                        //entries.add(ModItems.ANCIENT_SIGN);
                        //entries.add(ModItems.ANCIENT_HANGING_SIGN);
                        entries.add(ModBlocks.HAUNT_LOG);
                        entries.add(ModBlocks.HAUNT_WOOD);
                        entries.add(ModBlocks.HAUNT_PLANKS);
                        entries.add(ModBlocks.STRIPPED_HAUNT_LOG);
                        entries.add(ModBlocks.STRIPPED_HAUNT_WOOD);
                        entries.add(ModBlocks.HAUNT_STAIRS);
                        entries.add(ModBlocks.HAUNT_SLAB);
                        entries.add(ModBlocks.HAUNT_BUTTON);
                        entries.add(ModBlocks.HAUNT_FENCE);
                        entries.add(ModBlocks.HAUNT_FENCE_GATE);
                        entries.add(ModBlocks.HAUNT_DOOR);
                        entries.add(ModBlocks.HAUNT_TRAPDOOR);
                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.PALM_WOOD);
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.OLIVE_LOG);
                        entries.add(ModBlocks.OLIVE_WOOD);
                        entries.add(ModBlocks.OLIVE_PLANKS);
                        entries.add(ModBlocks.REINFORCED_OAK_LOG);
                        entries.add(ModBlocks.REINFORCED_BIRCH_LOG);
                        entries.add(ModBlocks.REINFORCED_SPRUCE_LOG);
                        entries.add(ModBlocks.REINFORCED_JUNGLE_LOG);
                        entries.add(ModBlocks.REINFORCED_ACACIA_LOG);
                        entries.add(ModBlocks.REINFORCED_DARK_OAK_LOG);
                        entries.add(ModBlocks.REINFORCED_MANGROVE_LOG);
                        entries.add(ModBlocks.REINFORCED_CHERRY_LOG);
                        entries.add(ModBlocks.REINFORCED_ANCIENT_LOG);
                        entries.add(ModBlocks.REINFORCED_HAUNT_LOG);
                        entries.add(ModBlocks.REINFORCED_STRIPPED_OAK_LOG);
                        entries.add(ModBlocks.REINFORCED_STRIPPED_BIRCH_LOG);
                        entries.add(ModBlocks.REINFORCED_STRIPPED_SPRUCE_LOG);
                        entries.add(ModBlocks.REINFORCED_STRIPPED_JUNGLE_LOG);
                        entries.add(ModBlocks.REINFORCED_STRIPPED_ACACIA_LOG);
                        entries.add(ModBlocks.REINFORCED_STRIPPED_DARK_OAK_LOG);
                        entries.add(ModBlocks.REINFORCED_STRIPPED_MANGROVE_LOG);
                        entries.add(ModBlocks.REINFORCED_STRIPPED_CHERRY_LOG);
                        entries.add(ModBlocks.MAUSTONE);
                        entries.add(ModBlocks.LURSTONE);
                        entries.add(ModBlocks.LEADED_WHITE_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_LIGHT_GRAY_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_GRAY_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_BLACK_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_BROWN_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_RED_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_ORANGE_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_YELLOW_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_LIME_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_GREEN_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_CYAN_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_LIGHT_BLUE_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_BLUE_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_PURPLE_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_MAGENTA_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_PINK_STAINED_GLASS);
                        entries.add(ModBlocks.LEADED_WHITE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_LIGHT_GRAY_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_GRAY_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_BLACK_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_BROWN_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_RED_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_ORANGE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_YELLOW_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_LIME_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_GREEN_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_CYAN_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_LIGHT_BLUE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_BLUE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_PURPLE_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_MAGENTA_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.LEADED_PINK_STAINED_GLASS_PANE);
                        entries.add(ModBlocks.SKYSTONE);
                        entries.add(ModBlocks.EXPLOSIVE_BARREL);
                        entries.add(ModBlocks.COOKING_RANGE);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        /* entries.add(ModBlocks.RAINBOW_WOOL); Note to developers, this one is broken at the moment,
                        unless you can get the data gen to create column blocks with different under and over sides,
                        don't try it or else it breaks
                         */
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.GLOWING_OBSIDIAN);

                        entries.add(ModBlocks.CHOCOLATE_DIRT);
                        entries.add(ModBlocks.VANILLA_DIRT);
                        entries.add(ModBlocks.SUGAR_BRICKS);
                        entries.add(ModBlocks.SMOOTH_SUGAR_BRICKS);
                        entries.add(ModBlocks.PALE_SMOOTH_SUGAR_BRICKS);

                        entries.add(ModBlocks.WHITE_ROSE);
                        entries.add(ModBlocks.LIGHT_GRAY_ROSE);
                        entries.add(ModBlocks.GRAY_ROSE);
                        entries.add(ModBlocks.BLACK_ROSE);
                        entries.add(ModBlocks.BROWN_ROSE);
                        entries.add(ModBlocks.RED_ROSE);
                        entries.add(ModBlocks.ORANGE_ROSE);
                        entries.add(ModBlocks.YELLOW_ROSE);
                        entries.add(ModBlocks.LIME_ROSE);
                        entries.add(ModBlocks.GREEN_ROSE);
                        entries.add(ModBlocks.CYAN_ROSE);
                        entries.add(ModBlocks.LIGHT_BLUE_ROSE);
                        entries.add(ModBlocks.BLUE_ROSE);
                        entries.add(ModBlocks.PURPLE_ROSE);
                        entries.add(ModBlocks.MAGENTA_ROSE);
                        entries.add(ModBlocks.PINK_ROSE);
                        entries.add(ModBlocks.BUTTERCUP);
                        entries.add(ModBlocks.PINK_DAISY);

                        entries.add(ModItems.COPPER_KEY);
                        entries.add(ModItems.IRON_KEY);
                        entries.add(ModItems.GOLD_KEY);
                        entries.add(ModItems.OBSIDIAN_ARROW);
                        entries.add(ModItems.WOODEN_BATTLEAXE);
                        entries.add(ModItems.STONE_BATTLEAXE);
                        entries.add(ModItems.IRON_BATTLEAXE);
                        entries.add(ModItems.GOLD_BATTLEAXE);
                        entries.add(ModItems.DIAMOND_BATTLEAXE);
                        entries.add(ModItems.NETHERITE_BATTLEAXE);
                        entries.add(ModItems.WOODEN_DAGGER);
                        entries.add(ModItems.STONE_DAGGER);
                        entries.add(ModItems.IRON_DAGGER);
                        entries.add(ModItems.GOLD_DAGGER);
                        entries.add(ModItems.DIAMOND_DAGGER);
                        entries.add(ModItems.NETHERITE_DAGGER);
                        entries.add(ModItems.STUDDED_HELMET);
                        entries.add(ModItems.STUDDED_CHESTPLATE);
                        entries.add(ModItems.STUDDED_LEGGINGS);
                        entries.add(ModItems.STUDDED_BOOTS);
                        entries.add(ModItems.PLATE_HELMET);
                        entries.add(ModItems.PLATE_CHESTPLATE);
                        entries.add(ModItems.PLATE_LEGGINGS);
                        entries.add(ModItems.PLATE_BOOTS);

                        entries.add(ModItems.GOLD_AMULET);
                        entries.add(ModItems.GOLD_RING);

                        entries.add(ModItems.MUSIC_DISC_ALPHA);
                        entries.add(ModItems.MUSIC_DISC_DOG);
                        entries.add(ModItems.MUSIC_DISC_DROOPY);
                        entries.add(ModItems.MUSIC_DISC_ELEVEN);
                        entries.add(ModItems.MUSIC_DISC_FOOLIN);
                        entries.add(ModItems.MUSIC_DISC_INTRO);
                        entries.add(ModItems.MUSIC_DISC_MAGNETIC_CIRCUIT);

                        entries.add(ModItems.GOLD_COIN);
                    }).build());

    public static void registerItemGroups() {
        AccumulativeCollections.LOGGER.info("Registering Item Groups for " + AccumulativeCollections.MOD_ID);
    }
}

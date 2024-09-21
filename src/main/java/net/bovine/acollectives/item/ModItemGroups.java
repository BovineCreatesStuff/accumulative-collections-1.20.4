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
                        entries.add(ModItems.COCOA_BUTTER);
                        entries.add(ModItems.WHITE_CHOCOLATE);
                        entries.add(ModItems.MILK_CHOCOLATE);
                        entries.add(ModItems.CHEESE);
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
                        entries.add(ModBlocks.SKYSTONE);
                        entries.add(ModBlocks.LEAD_ORE);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_LEAD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.LEAD_BLOCK);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.GLOWING_OBSIDIAN);

                        entries.add(ModBlocks.RED_ROSE);
                        entries.add(ModBlocks.CYAN_ROSE);
                        entries.add(ModBlocks.BUTTERCUP);
                        entries.add(ModBlocks.PINK_DAISY);

                        entries.add(ModItems.COPPER_KEY);
                        entries.add(ModItems.IRON_KEY);
                        entries.add(ModItems.GOLD_KEY);
                        entries.add(ModItems.OBSIDIAN_ARROW);
                        entries.add(ModItems.STUDDED_HELMET);
                        entries.add(ModItems.STUDDED_CHESTPLATE);
                        entries.add(ModItems.STUDDED_LEGGINGS);
                        entries.add(ModItems.STUDDED_BOOTS);

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

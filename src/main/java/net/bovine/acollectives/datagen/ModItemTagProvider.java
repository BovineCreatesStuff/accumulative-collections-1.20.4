package net.bovine.acollectives.datagen;

import net.bovine.acollectives.block.ModBlocks;
import net.bovine.acollectives.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_ALPHA)
                .add(ModItems.MUSIC_DISC_DOG)
                .add(ModItems.MUSIC_DISC_DROOPY)
                .add(ModItems.MUSIC_DISC_ELEVEN)
                .add(ModItems.MUSIC_DISC_FOOLIN)
                .add(ModItems.MUSIC_DISC_INTRO)
                .add(ModItems.MUSIC_DISC_MAGNETIC_CIRCUIT);

        getOrCreateTagBuilder(ItemTags.CREEPER_DROP_MUSIC_DISCS)
                .add(ModItems.MUSIC_DISC_ALPHA)
                .add(ModItems.MUSIC_DISC_DOG)
                .add(ModItems.MUSIC_DISC_DROOPY)
                .add(ModItems.MUSIC_DISC_ELEVEN)
                .add(ModItems.MUSIC_DISC_FOOLIN)
                .add(ModItems.MUSIC_DISC_INTRO)
                .add(ModItems.MUSIC_DISC_MAGNETIC_CIRCUIT);

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ANCIENT_LOG.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.ANCIENT_LOG.asItem())
                .add(ModBlocks.ANCIENT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_ANCIENT_LOG.asItem())
                .add(ModBlocks.STRIPPED_ANCIENT_WOOD.asItem())
                .add(ModBlocks.HAUNT_LOG.asItem())
                .add(ModBlocks.HAUNT_WOOD.asItem())
                .add(ModBlocks.STRIPPED_HAUNT_LOG.asItem())
                .add(ModBlocks.STRIPPED_HAUNT_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.STUDDED_HELMET, ModItems.STUDDED_CHESTPLATE, ModItems.STUDDED_LEGGINGS, ModItems.STUDDED_BOOTS);

        getOrCreateTagBuilder(ItemTags.FISHES)
                .add(ModItems.GRAY_COD, ModItems.COOKED_GRAY_COD);
    }
}

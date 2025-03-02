package net.bovine.acollectives.datagen;

import net.bovine.acollectives.block.ModBlocks;
import net.bovine.acollectives.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ModTags.Blocks.LEAD_BLOCKS)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.DEEPSLATE_LEAD_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.RUBY_BLOCKS)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(ModTags.Blocks.LEADED_GLASS_BLOCKS)
                .add(ModBlocks.LEADED_BLACK_STAINED_GLASS)
                .add(ModBlocks.LEADED_BLUE_STAINED_GLASS)
                .add(ModBlocks.LEADED_BROWN_STAINED_GLASS)
                .add(ModBlocks.LEADED_CYAN_STAINED_GLASS)
                .add(ModBlocks.LEADED_GRAY_STAINED_GLASS)
                .add(ModBlocks.LEADED_GREEN_STAINED_GLASS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LEAD_ORE)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.DEEPSLATE_LEAD_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LEAD_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_LEAD_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.LEAD_BLOCK)
                .add(ModBlocks.RUBY_BLOCK);

        getOrCreateTagBuilder(ModTags.Blocks.ANCIENT_LOGS)
                .add(ModBlocks.ANCIENT_LOG)
                .add(ModBlocks.ANCIENT_WOOD)
                .add(ModBlocks.STRIPPED_ANCIENT_LOG)
                .add(ModBlocks.STRIPPED_ANCIENT_WOOD);

        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.ANCIENT_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.ANCIENT_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.ANCIENT_LOG)
                .add(ModBlocks.ANCIENT_WOOD)
                .add(ModBlocks.STRIPPED_ANCIENT_LOG)
                .add(ModBlocks.STRIPPED_ANCIENT_WOOD)
                .add(ModBlocks.HAUNT_LOG)
                .add(ModBlocks.HAUNT_WOOD)
                .add(ModBlocks.STRIPPED_HAUNT_LOG)
                .add(ModBlocks.STRIPPED_HAUNT_WOOD);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.ANCIENT_PLANKS)
                .add(ModBlocks.HAUNT_PLANKS);
    }
}

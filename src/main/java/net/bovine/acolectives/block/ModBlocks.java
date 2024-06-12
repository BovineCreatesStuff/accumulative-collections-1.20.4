package net.bovine.acolectives.block;

import net.bovine.acolectives.AccumulativeCollections;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block ANCIENT_PLANKS = registerBlock("ancient_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS)));
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.copyOf(Blocks.EMERALD_BLOCK)));
    public static final Block LEAD_BLOCK = registerBlock("lead_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), FabricBlockSettings.copyOf(Blocks.EMERALD_ORE)));
    public static final Block LEAD_ORE = registerBlock("lead_ore",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));

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

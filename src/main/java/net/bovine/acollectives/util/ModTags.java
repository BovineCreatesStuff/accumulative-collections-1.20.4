package net.bovine.acollectives.util;

import net.bovine.acollectives.AccumulativeCollections;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> ANCIENT_LOGS =
                createTag("ancient_logs");

        public static final TagKey<Block> RUBY_BLOCKS =
                createTag("ruby_blocks");

        public static final TagKey<Block> LEAD_BLOCKS =
                createTag("lead_blocks");

        public static final TagKey<Block> LEADED_GLASS_BLOCKS =
                createTag("leaded_glass_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(AccumulativeCollections.MOD_ID, name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(AccumulativeCollections.MOD_ID, name));
        }
    }
}

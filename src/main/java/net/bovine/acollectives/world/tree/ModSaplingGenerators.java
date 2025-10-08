package net.bovine.acollectives.world.tree;

import net.bovine.acollectives.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator ANCIENT =
            new SaplingGenerator("ancient", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.ANCIENT_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}

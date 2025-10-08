package net.bovine.acollectives.world.gen;

import net.bovine.acollectives.world.ModPlacedFeatures;
import net.bovine.acollectives.world.biome.ModBiomes;
import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.ANCIENT_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ANCIENT_PLACEMENT_KEY);
    }
}

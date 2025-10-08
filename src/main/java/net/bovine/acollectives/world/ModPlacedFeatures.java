package net.bovine.acollectives.world;

import net.bovine.acollectives.AccumulativeCollections;
import net.bovine.acollectives.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;

import java.util.List;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> LEAD_ORE_PLACEMENT_KEY = registerKey("lead_ore_placed");
    public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACEMENT_KEY = registerKey("ruby_ore_placed");

    public static final RegistryKey<PlacedFeature> ANCIENT_PLACEMENT_KEY = registerKey("ancient_placed");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configureFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, LEAD_ORE_PLACEMENT_KEY, configureFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.LEAD_ORE_KEY),
                ModOrePlacement.modifiersWithCount(6,
                        HeightRangePlacementModifier.trapezoid(YOffset.fixed(-80), YOffset.fixed(44))));

        register(context, RUBY_ORE_PLACEMENT_KEY, configureFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                ModOrePlacement.modifiersWithCount(2,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(24))));

        register(context, ANCIENT_PLACEMENT_KEY, configureFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.ANCIENT_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(PlacedFeatures.createCountExtraModifier(1, 0.05f, 1),
                        ModBlocks.ANCIENT_SAPLING));
    }

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(AccumulativeCollections.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}

package net.bovine.acollectives.world.biome;

import net.bovine.acollectives.AccumulativeCollections;
import net.bovine.acollectives.world.biome.surface.ModMaterialRules;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerraBlenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new ModOverworldRegion(new Identifier(AccumulativeCollections.MOD_ID, "overworld"), 1));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, AccumulativeCollections.MOD_ID, ModMaterialRules.makeRules());
    }
}

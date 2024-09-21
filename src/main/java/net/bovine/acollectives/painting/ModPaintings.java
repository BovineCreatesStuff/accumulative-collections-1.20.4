package net.bovine.acollectives.painting;

import net.bovine.acollectives.AccumulativeCollections;
import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModPaintings {
    public static final PaintingVariant MONA = registerPainting("mona", new PaintingVariant(32, 32));
    public static final PaintingVariant PEARL = registerPainting("pearl", new PaintingVariant(16, 16));
    public static final PaintingVariant SCREAM = registerPainting("scream", new PaintingVariant(16, 32));
    public static final PaintingVariant SMILODON = registerPainting("smilodon", new PaintingVariant(32, 16));
    public static final PaintingVariant VENUS = registerPainting("venus", new PaintingVariant(64, 32));
    public static final PaintingVariant WAVE = registerPainting("wave", new PaintingVariant(64, 48));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(AccumulativeCollections.MOD_ID, name ), paintingVariant);
    }

    public static void registerPaintings() {
        AccumulativeCollections.LOGGER.info("Registering Paintings for " + AccumulativeCollections.MOD_ID);
    }
}

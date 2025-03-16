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
    public static final PaintingVariant SULFUR_SKULL = registerPainting("sulfur_skull", new PaintingVariant(16, 32));
    public static final PaintingVariant MERCURY_SKULL = registerPainting("mercury_skull", new PaintingVariant(16, 32));
    public static final PaintingVariant PARADISE_AND_INFERNO = registerPainting("paradise_and_inferno", new PaintingVariant(32, 64));
    public static final PaintingVariant RED_SHEPHERD = registerPainting("red_shepherd", new PaintingVariant(16, 32));
    public static final PaintingVariant BLUE_SHEPHERD = registerPainting("blue_shepherd", new PaintingVariant(16, 32));
    public static final PaintingVariant DIVINE_DOVE = registerPainting("divine_dove", new PaintingVariant(32, 64));
    public static final PaintingVariant ADAM = registerPainting("adam", new PaintingVariant(64, 32));
    public static final PaintingVariant NAPOLEON = registerPainting("napoleon", new PaintingVariant(64, 64));
    public static final PaintingVariant CONVERSATION = registerPainting("conversation", new PaintingVariant(32, 32));
    public static final PaintingVariant RHONE = registerPainting("rhone", new PaintingVariant(32, 32));
    public static final PaintingVariant WHISTLE = registerPainting("whistle", new PaintingVariant(16, 16));
    public static final PaintingVariant JUNE = registerPainting("june", new PaintingVariant(32, 32));
    public static final PaintingVariant CIRCLES = registerPainting("circles", new PaintingVariant(32, 16));
    public static final PaintingVariant BLISS = registerPainting("bliss", new PaintingVariant(64, 48));
    public static final PaintingVariant JATTE = registerPainting("jatte", new PaintingVariant(64, 48));
    public static final PaintingVariant FIELD = registerPainting("field", new PaintingVariant(64, 64));
    public static final PaintingVariant GEORGE = registerPainting("george", new PaintingVariant(16, 16));

    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registries.PAINTING_VARIANT, new Identifier(AccumulativeCollections.MOD_ID, name ), paintingVariant);
    }

    public static void registerPaintings() {
        AccumulativeCollections.LOGGER.info("Registering Paintings for " + AccumulativeCollections.MOD_ID);
    }
}

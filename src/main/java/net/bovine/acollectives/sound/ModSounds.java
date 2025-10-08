package net.bovine.acollectives.sound;

import net.bovine.acollectives.AccumulativeCollections;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent COIN_PILE_BREAK = registerSound("coin_pile_break");
    public static final SoundEvent COIN_PILE_STEP = registerSound("coin_pile_step");
    public static final SoundEvent COIN_PILE_PLACE = registerSound("coin_pile_place");
    public static final SoundEvent COIN_PILE_HIT = registerSound("coin_pile_hit");
    public static final SoundEvent COIN_PILE_FALL = registerSound("coin_pile_fall");

    public static final BlockSoundGroup COIN_PILE_SOUNDS = new BlockSoundGroup(1f, 1f,
            COIN_PILE_BREAK, COIN_PILE_STEP, COIN_PILE_PLACE,
            COIN_PILE_HIT, COIN_PILE_FALL);

    public static final SoundEvent ALPHA = registerSound("alpha");
    public static final SoundEvent DOG = registerSound("dog");
    public static final SoundEvent DROOPY = registerSound("droopy");
    public static final SoundEvent ELEVEN = registerSound("eleven");
    public static final SoundEvent FOOLIN = registerSound("foolin");
    public static final SoundEvent INTRO = registerSound("intro");
    public static final SoundEvent MAGNETIC_CIRCUIT = registerSound("magnetic_circuit");

    private static SoundEvent registerSound(String id) {
        Identifier identifier = new Identifier(AccumulativeCollections.MOD_ID, id);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSounds() {
        AccumulativeCollections.LOGGER.info("Registering Sounds for " + AccumulativeCollections.MOD_ID);
    }
}

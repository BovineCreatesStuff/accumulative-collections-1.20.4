package net.bovine.acollectives.sound;

import net.bovine.acollectives.AccumulativeCollections;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent COIN_PILE_BREAK = registerSoundEvent("coin_pile_break");
    public static final SoundEvent COIN_PILE_STEP = registerSoundEvent("coin_pile_step");
    public static final SoundEvent COIN_PILE_PLACE = registerSoundEvent("coin_pile_place");
    public static final SoundEvent COIN_PILE_HIT = registerSoundEvent("coin_pile_hit");
    public static final SoundEvent COIN_PILE_FALL = registerSoundEvent("coin_pile_fall");

    public static final BlockSoundGroup COIN_PILE_SOUNDS = new BlockSoundGroup(1f, 1f,
            ModSounds.COIN_PILE_BREAK, ModSounds.COIN_PILE_STEP, ModSounds.COIN_PILE_PLACE,
            ModSounds.COIN_PILE_HIT, ModSounds.COIN_PILE_FALL);

    public static final SoundEvent ALPHA = registerSoundEvent("alpha");
    public static final SoundEvent DOG = registerSoundEvent("dog");
    public static final SoundEvent DROOPY = registerSoundEvent("droopy");
    public static final SoundEvent ELEVEN = registerSoundEvent("eleven");
    public static final SoundEvent FOOLIN = registerSoundEvent("foolin");
    public static final SoundEvent INTRO = registerSoundEvent("intro");
    public static final SoundEvent MAGNETIC_CIRCUIT = registerSoundEvent("magnetic_circuit");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(AccumulativeCollections.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        AccumulativeCollections.LOGGER.info("Registering Sounds for " + AccumulativeCollections.MOD_ID);
    }
}

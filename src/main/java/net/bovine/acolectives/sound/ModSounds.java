package net.bovine.acolectives.sound;

import net.bovine.acolectives.AccumulativeCollections;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {


    public static final SoundEvent MAGNETIC_CIRCUIT = registerSoundEvent("magnetic_circuit");

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(AccumulativeCollections.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        AccumulativeCollections.LOGGER.info("Registering Sounds for " + AccumulativeCollections.MOD_ID);
    }
}

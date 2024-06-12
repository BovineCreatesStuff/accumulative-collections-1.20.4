package net.bovine.acolectives;

import net.bovine.acolectives.block.ModBlocks;
import net.bovine.acolectives.item.ModItemGroups;
import net.bovine.acolectives.item.ModItems;
import net.bovine.acolectives.sound.ModSounds;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AccumulativeCollections implements ModInitializer {
	public static final String MOD_ID = "acollectives";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("BOOTING UP MINECRAFT: ACCUMULATIVE COLLECTIONS. PLEASE STAND BY!");

		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModSounds.registerSounds();
		LOGGER.info("Hello Fabric world!");
	}
}
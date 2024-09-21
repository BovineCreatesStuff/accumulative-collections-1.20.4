package net.bovine.acollectives;

import net.bovine.acollectives.block.ModBlocks;
import net.bovine.acollectives.item.ModItemGroups;
import net.bovine.acollectives.item.ModItems;
import net.bovine.acollectives.painting.ModPaintings;
import net.bovine.acollectives.sound.ModSounds;
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
		ModPaintings.registerPaintings();
		ModSounds.registerSounds();

		ModSounds.registerSounds();
		LOGGER.info("Hello Fabric world!");
	}
}
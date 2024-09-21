package net.bovine.acollectives.item;

import net.bovine.acollectives.AccumulativeCollections;
import net.bovine.acollectives.sound.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item COCOA_BUTTER = registerItem("cocoa_butter", new Item(new FabricItemSettings()));
    public static final Item CHEESE = registerItem("cheese", new Item(new FabricItemSettings().food(ModFoodComponents.CHEESE)));
    public static final Item WHITE_CHOCOLATE = registerItem("white_chocolate", new Item(new FabricItemSettings().food(ModFoodComponents.WHITE_CHOCOLATE)));
    public static final Item MILK_CHOCOLATE = registerItem("milk_chocolate", new Item(new FabricItemSettings().food(ModFoodComponents.MILK_CHOCOLATE)));
    public static final Item MOOSHROOM_BURGER = registerItem("mooshroom_burger", new Item(new FabricItemSettings().food(ModFoodComponents.MOOSHROOM_BURGER)));
    public static final Item FANCY_FEATHER = registerItem("fancy_feather", new Item(new FabricItemSettings()));
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item LEAD_INGOT = registerItem("lead_ingot", new Item(new FabricItemSettings()));
    public static final Item RAW_LEAD = registerItem("raw_lead", new Item(new FabricItemSettings()));
    public static final Item COPPER_KEY = registerItem("copper_key", new Item(new FabricItemSettings().maxCount(1))); 
    public static final Item IRON_KEY = registerItem("iron_key", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item GOLD_KEY = registerItem("gold_key", new Item(new FabricItemSettings().maxCount(1)));
    public static final Item CRATE_KEY = registerItem("crate_key", new Item(new FabricItemSettings().maxCount(1)));

    public static final Item OBSIDIAN_ARROW = registerItem("obsidian_arrow",
            new ArrowItem(new FabricItemSettings()));

    public static final Item STUDDED_HELMET = registerItem("studded_helmet",
            new ArmorItem(ModArmorMaterials.STUDDED, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final Item STUDDED_CHESTPLATE = registerItem("studded_chestplate",
            new ArmorItem(ModArmorMaterials.STUDDED, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final Item STUDDED_LEGGINGS = registerItem("studded_leggings",
            new ArmorItem(ModArmorMaterials.STUDDED, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final Item STUDDED_BOOTS = registerItem("studded_boots",
            new ArmorItem(ModArmorMaterials.STUDDED, ArmorItem.Type.BOOTS, new FabricItemSettings()));

    public static final Item MUSIC_DISC_ALPHA = registerItem("music_disc_alpha",
            new MusicDiscItem(15, ModSounds.ALPHA,new FabricItemSettings().maxCount(1), 603));
    public static final Item MUSIC_DISC_DOG = registerItem("music_disc_dog",
            new MusicDiscItem(2, ModSounds.DOG,new FabricItemSettings().maxCount(1), 145));
    public static final Item MUSIC_DISC_DROOPY = registerItem("music_disc_droopy",
            new MusicDiscItem(12, ModSounds.DROOPY,new FabricItemSettings().maxCount(1), 209));
    public static final Item MUSIC_DISC_ELEVEN = registerItem("music_disc_eleven",
            new MusicDiscItem(11, ModSounds.ELEVEN,new FabricItemSettings().maxCount(1), 71));
    public static final Item MUSIC_DISC_FOOLIN = registerItem("music_disc_foolin",
            new MusicDiscItem(10, ModSounds.ELEVEN,new FabricItemSettings().maxCount(1), 201));
    public static final Item MUSIC_DISC_INTRO = registerItem("music_disc_intro",
            new MusicDiscItem(7, ModSounds.INTRO,new FabricItemSettings().maxCount(1), 276));
    public static final Item MUSIC_DISC_MAGNETIC_CIRCUIT = registerItem("music_disc_magnetic_circuit",
            new MusicDiscItem(12, ModSounds.MAGNETIC_CIRCUIT,new FabricItemSettings().maxCount(1), 193));

    public static final Item GOLD_COIN = registerItem("gold_coin", new Item(new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(COCOA_BUTTER);
        entries.add(RUBY);
        entries.add(LEAD_INGOT);
        entries.add(RAW_LEAD);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(AccumulativeCollections.MOD_ID, name), item);
    }

    public static void registerModItems() {
        AccumulativeCollections.LOGGER .info("Registering Mod Items for " + AccumulativeCollections.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}

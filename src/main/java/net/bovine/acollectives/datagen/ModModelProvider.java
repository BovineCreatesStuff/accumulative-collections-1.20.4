package net.bovine.acollectives.datagen;

import net.bovine.acollectives.block.ModBlocks;
import net.bovine.acollectives.block.custom.BarleyCropBlock;
import net.bovine.acollectives.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.LightBlock;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LEAD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_LEAD_ORE);
        blockStateModelGenerator.registerLog(ModBlocks.ANCIENT_LOG).log(ModBlocks.ANCIENT_LOG).wood(ModBlocks.ANCIENT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_ANCIENT_LOG).log(ModBlocks.STRIPPED_ANCIENT_LOG).wood(ModBlocks.STRIPPED_ANCIENT_WOOD);
        BlockStateModelGenerator.BlockTexturePool ancientPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ANCIENT_PLANKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ANCIENT_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OLIVE_LEAVES);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SKYSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOWING_OBSIDIAN);

        blockStateModelGenerator.registerSingleton(ModBlocks.COOKING_RANGE, TexturedModel.ORIENTABLE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.MAUSTONE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LURSTONE);

        blockStateModelGenerator.registerLog(ModBlocks.HAUNT_LOG).log(ModBlocks.HAUNT_LOG).wood(ModBlocks.HAUNT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_HAUNT_LOG).log(ModBlocks.STRIPPED_HAUNT_LOG).wood(ModBlocks.STRIPPED_HAUNT_WOOD);
        BlockStateModelGenerator.BlockTexturePool hauntPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HAUNT_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.PALM_LOG).log(ModBlocks.PALM_LOG).wood(ModBlocks.PALM_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_PALM_LOG).log(ModBlocks.STRIPPED_PALM_LOG).wood(ModBlocks.STRIPPED_PALM_WOOD);
        BlockStateModelGenerator.BlockTexturePool palmPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALM_PLANKS);

        blockStateModelGenerator.registerLog(ModBlocks.OLIVE_LOG).log(ModBlocks.OLIVE_LOG).wood(ModBlocks.OLIVE_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_OLIVE_LOG).log(ModBlocks.STRIPPED_OLIVE_LOG).wood(ModBlocks.STRIPPED_OLIVE_WOOD);
        BlockStateModelGenerator.BlockTexturePool olivePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.OLIVE_PLANKS);

        BlockStateModelGenerator.BlockTexturePool sugarBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SUGAR_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothSugarBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_SUGAR_BRICKS);
        BlockStateModelGenerator.BlockTexturePool paleSmoothSugarBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PALE_SMOOTH_SUGAR_BRICKS);

        //ancientPool.family(ModBlocks.ANCIENT_FAMILY);

        ancientPool.stairs(ModBlocks.ANCIENT_STAIRS);
        ancientPool.slab(ModBlocks.ANCIENT_SLAB);
        ancientPool.button(ModBlocks.ANCIENT_BUTTON);
        //ancientPool.button(ModBlocks.ANCIENT_PRESSURE_PLATE);
        ancientPool.fence(ModBlocks.ANCIENT_FENCE);
        ancientPool.fenceGate(ModBlocks.ANCIENT_FENCE_GATE);

        hauntPool.stairs(ModBlocks.HAUNT_STAIRS);
        hauntPool.slab(ModBlocks.HAUNT_SLAB);
        hauntPool.button(ModBlocks.HAUNT_BUTTON);
        //hauntPool.pressurePlate(ModBlocks.HAUNT_PRESSURE_PLATE);
        hauntPool.fence(ModBlocks.HAUNT_FENCE);
        hauntPool.fenceGate(ModBlocks.HAUNT_FENCE_GATE);

        palmPool.stairs(ModBlocks.PALM_STAIRS);
        palmPool.slab(ModBlocks.PALM_SLAB);
        palmPool.button(ModBlocks.PALM_BUTTON);
        //palmPool.pressurePlate(ModBlocks.PALM_PRESSURE_PLATE);
        palmPool.fence(ModBlocks.PALM_FENCE);
        palmPool.fenceGate(ModBlocks.PALM_FENCE_GATE);

        olivePool.stairs(ModBlocks.OLIVE_STAIRS);
        olivePool.slab(ModBlocks.OLIVE_SLAB);
        olivePool.button(ModBlocks.OLIVE_BUTTON);
        //olivePool.pressurePlate(ModBlocks.OLIVE_PRESSURE_PLATE);
        olivePool.fence(ModBlocks.OLIVE_FENCE);
        olivePool.fenceGate(ModBlocks.OLIVE_FENCE_GATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ANCIENT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ANCIENT_TRAPDOOR);

        blockStateModelGenerator.registerDoor(ModBlocks.HAUNT_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.HAUNT_TRAPDOOR);

        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHOCOLATE_DIRT);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VANILLA_DIRT);

        blockStateModelGenerator.registerCrop(ModBlocks.BARLEY_CROP, BarleyCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

        blockStateModelGenerator.registerCrop(ModBlocks.TEA_CROP, BarleyCropBlock.AGE, 0, 1, 2, 3, 4, 5, 6, 7);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.RED_ROSE, ModBlocks.POTTED_RED_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.CYAN_ROSE, ModBlocks.POTTED_CYAN_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BUTTERCUP, ModBlocks.POTTED_BUTTERCUP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_DAISY, ModBlocks.POTTED_PINK_DAISY, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.WHITE_ROSE, ModBlocks.POTTED_WHITE_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PINK_ROSE, ModBlocks.POTTED_PINK_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLUE_ROSE, ModBlocks.POTTED_BLUE_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GREEN_ROSE, ModBlocks.POTTED_GREEN_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.YELLOW_ROSE, ModBlocks.POTTED_YELLOW_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.ORANGE_ROSE, ModBlocks.POTTED_ORANGE_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.PURPLE_ROSE, ModBlocks.POTTED_PURPLE_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BLACK_ROSE, ModBlocks.POTTED_BLACK_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.BROWN_ROSE, ModBlocks.POTTED_BROWN_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_GRAY_ROSE, ModBlocks.POTTED_LIGHT_GRAY_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.MAGENTA_ROSE, ModBlocks.POTTED_MAGENTA_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIME_ROSE, ModBlocks.POTTED_LIME_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GRAY_ROSE, ModBlocks.POTTED_GRAY_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LIGHT_BLUE_ROSE, ModBlocks.POTTED_LIGHT_BLUE_ROSE, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_BLACK_STAINED_GLASS, ModBlocks.LEADED_BLACK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_BLUE_STAINED_GLASS, ModBlocks.LEADED_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_BROWN_STAINED_GLASS, ModBlocks.LEADED_BROWN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_CYAN_STAINED_GLASS, ModBlocks.LEADED_CYAN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_GRAY_STAINED_GLASS, ModBlocks.LEADED_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_GREEN_STAINED_GLASS, ModBlocks.LEADED_GREEN_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_LIGHT_BLUE_STAINED_GLASS, ModBlocks.LEADED_LIGHT_BLUE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_LIGHT_GRAY_STAINED_GLASS, ModBlocks.LEADED_LIGHT_GRAY_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_LIME_STAINED_GLASS, ModBlocks.LEADED_LIME_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_MAGENTA_STAINED_GLASS, ModBlocks.LEADED_MAGENTA_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_ORANGE_STAINED_GLASS, ModBlocks.LEADED_ORANGE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_PINK_STAINED_GLASS, ModBlocks.LEADED_PINK_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_PURPLE_STAINED_GLASS, ModBlocks.LEADED_PURPLE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_RED_STAINED_GLASS, ModBlocks.LEADED_RED_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_WHITE_STAINED_GLASS, ModBlocks.LEADED_WHITE_STAINED_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(ModBlocks.LEADED_YELLOW_STAINED_GLASS, ModBlocks.LEADED_YELLOW_STAINED_GLASS_PANE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SUPPLY_CRATE);

        blockStateModelGenerator.registerSingleton(ModBlocks.COIN_PILE, TexturedModel.CUBE_COLUMN);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HALL_TILE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HALL_FLOOR);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.HALL_CEILING);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLUE_HALL_LIGHT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GREEN_HALL_LIGHT);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RED_HALL_LIGHT);
        blockStateModelGenerator.registerSingleton(ModBlocks.BLUE_HALL_FLOOR_LIGHT, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.GREEN_HALL_FLOOR_LIGHT, TexturedModel.CUBE_BOTTOM_TOP);
        blockStateModelGenerator.registerSingleton(ModBlocks.RED_HALL_FLOOR_LIGHT, TexturedModel.CUBE_BOTTOM_TOP);

        //blockStateModelGenerator.registerTorch(ModBlocks.UNLIT_TORCH, ModBlocks.WALL_UNLIT_TORCH);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_LEAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.LEAD_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.BARLEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.TEA_LEAF, Models.GENERATED);
        itemModelGenerator.register(ModItems.OLIVE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COCOA_BUTTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MILK_CHOCOLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MOOSHROOM_BURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOAT_CHEESE, Models.GENERATED);
        itemModelGenerator.register(ModItems.OLIVE_OIL_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHEVON, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_CHEVON, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_COD, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_GRAY_COD, Models.GENERATED);
        itemModelGenerator.register(ModItems.CALAMARI, Models.GENERATED);
        itemModelGenerator.register(ModItems.FRIED_CALAMARI, Models.GENERATED);
        itemModelGenerator.register(ModItems.GRAY_COD_BUCKET, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.FANCY_FEATHER, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_ARROW, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STUDDED_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STUDDED_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STUDDED_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.STUDDED_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATE_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.PLATE_LEGGINGS));

        itemModelGenerator.register(ModItems.WOODEN_BATTLEAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_BATTLEAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_BATTLEAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_BATTLEAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_BATTLEAXE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_BATTLEAXE, Models.GENERATED);

        itemModelGenerator.register(ModItems.WOODEN_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_DAGGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.NETHERITE_DAGGER, Models.GENERATED);

        itemModelGenerator.register(ModItems.GOLD_AMULET, Models.GENERATED);
        itemModelGenerator.register(ModItems.GOLD_RING, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_AMULET, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMOND_RING, Models.GENERATED);

        itemModelGenerator.register(ModItems.MUSIC_DISC_ALPHA, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DOG, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_DROOPY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_ELEVEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_FOOLIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_INTRO, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUSIC_DISC_MAGNETIC_CIRCUIT, Models.GENERATED);

        itemModelGenerator.register(ModItems.GOLD_COIN, Models.GENERATED);
        itemModelGenerator.register(ModItems.DEVELOPER_NOTE_ERROR, Models.GENERATED);

        itemModelGenerator.register(ModItems.CRATE_KEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.OPEN_ENVELOPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.FILLED_ENVELOPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CLOSED_ENVELOPE, Models.GENERATED);
        itemModelGenerator.register(ModItems.ORDER_FORM, Models.GENERATED);

        itemModelGenerator.register(ModItems.MEAT_CHUNK, Models.GENERATED);

        //itemModelGenerator.register(ModItems.ANCIENT_HANGING_SIGN, Models.GENERATED);
    }
}

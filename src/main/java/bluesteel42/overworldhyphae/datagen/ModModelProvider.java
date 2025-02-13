package bluesteel42.overworldhyphae.datagen;

import bluesteel42.overworldhyphae.block.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.MUSHROOM_STEM).stem(ModBlocks.MUSHROOM_STEM).wood(ModBlocks.MUSHROOM_HYPHAE);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_MUSHROOM_STEM).stem(ModBlocks.STRIPPED_MUSHROOM_STEM).wood(ModBlocks.STRIPPED_MUSHROOM_HYPHAE);

        BlockStateModelGenerator.BlockTexturePool mushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MUSHROOM_PLANKS);
        mushroomPlankPool.stairs(ModBlocks.MUSHROOM_STAIRS);
        mushroomPlankPool.slab(ModBlocks.MUSHROOM_SLAB);
        mushroomPlankPool.button(ModBlocks.MUSHROOM_BUTTON);
        mushroomPlankPool.fence(ModBlocks.MUSHROOM_FENCE);
        mushroomPlankPool.fenceGate(ModBlocks.MUSHROOM_FENCE_GATE);
        mushroomPlankPool.pressurePlate(ModBlocks.MUSHROOM_PRESSURE_PLATE);
        blockStateModelGenerator.registerDoor(ModBlocks.MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool whiteMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.WHITE_MUSHROOM_PLANKS);
        whiteMushroomPlankPool.stairs(ModBlocks.WHITE_MUSHROOM_STAIRS);
        whiteMushroomPlankPool.slab(ModBlocks.WHITE_MUSHROOM_SLAB);
        whiteMushroomPlankPool.button(ModBlocks.WHITE_MUSHROOM_BUTTON);
        whiteMushroomPlankPool.fence(ModBlocks.WHITE_MUSHROOM_FENCE);
        whiteMushroomPlankPool.fenceGate(ModBlocks.WHITE_MUSHROOM_FENCE_GATE);
        whiteMushroomPlankPool.pressurePlate(ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.WHITE_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.WHITE_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool lightGrayMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS);
        lightGrayMushroomPlankPool.stairs(ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS);
        lightGrayMushroomPlankPool.slab(ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB);
        lightGrayMushroomPlankPool.button(ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON);
        lightGrayMushroomPlankPool.fence(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE);
        lightGrayMushroomPlankPool.fenceGate(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE);
        lightGrayMushroomPlankPool.pressurePlate(ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool grayMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GRAY_MUSHROOM_PLANKS);
        grayMushroomPlankPool.stairs(ModBlocks.GRAY_MUSHROOM_STAIRS);
        grayMushroomPlankPool.slab(ModBlocks.GRAY_MUSHROOM_SLAB);
        grayMushroomPlankPool.button(ModBlocks.GRAY_MUSHROOM_BUTTON);
        grayMushroomPlankPool.fence(ModBlocks.GRAY_MUSHROOM_FENCE);
        grayMushroomPlankPool.fenceGate(ModBlocks.GRAY_MUSHROOM_FENCE_GATE);
        grayMushroomPlankPool.pressurePlate(ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.GRAY_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GRAY_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool blackMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_MUSHROOM_PLANKS);
        blackMushroomPlankPool.stairs(ModBlocks.BLACK_MUSHROOM_STAIRS);
        blackMushroomPlankPool.slab(ModBlocks.BLACK_MUSHROOM_SLAB);
        blackMushroomPlankPool.button(ModBlocks.BLACK_MUSHROOM_BUTTON);
        blackMushroomPlankPool.fence(ModBlocks.BLACK_MUSHROOM_FENCE);
        blackMushroomPlankPool.fenceGate(ModBlocks.BLACK_MUSHROOM_FENCE_GATE);
        blackMushroomPlankPool.pressurePlate(ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BLACK_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLACK_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool brownMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BROWN_MUSHROOM_PLANKS);
        brownMushroomPlankPool.stairs(ModBlocks.BROWN_MUSHROOM_STAIRS);
        brownMushroomPlankPool.slab(ModBlocks.BROWN_MUSHROOM_SLAB);
        brownMushroomPlankPool.button(ModBlocks.BROWN_MUSHROOM_BUTTON);
        brownMushroomPlankPool.fence(ModBlocks.BROWN_MUSHROOM_FENCE);
        brownMushroomPlankPool.fenceGate(ModBlocks.BROWN_MUSHROOM_FENCE_GATE);
        brownMushroomPlankPool.pressurePlate(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BROWN_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BROWN_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool redMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RED_MUSHROOM_PLANKS);
        redMushroomPlankPool.stairs(ModBlocks.RED_MUSHROOM_STAIRS);
        redMushroomPlankPool.slab(ModBlocks.RED_MUSHROOM_SLAB);
        redMushroomPlankPool.button(ModBlocks.RED_MUSHROOM_BUTTON);
        redMushroomPlankPool.fence(ModBlocks.RED_MUSHROOM_FENCE);
        redMushroomPlankPool.fenceGate(ModBlocks.RED_MUSHROOM_FENCE_GATE);
        redMushroomPlankPool.pressurePlate(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.RED_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RED_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool orangeMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.ORANGE_MUSHROOM_PLANKS);
        orangeMushroomPlankPool.stairs(ModBlocks.ORANGE_MUSHROOM_STAIRS);
        orangeMushroomPlankPool.slab(ModBlocks.ORANGE_MUSHROOM_SLAB);
        orangeMushroomPlankPool.button(ModBlocks.ORANGE_MUSHROOM_BUTTON);
        orangeMushroomPlankPool.fence(ModBlocks.ORANGE_MUSHROOM_FENCE);
        orangeMushroomPlankPool.fenceGate(ModBlocks.ORANGE_MUSHROOM_FENCE_GATE);
        orangeMushroomPlankPool.pressurePlate(ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.ORANGE_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.ORANGE_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool yellowMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.YELLOW_MUSHROOM_PLANKS);
        yellowMushroomPlankPool.stairs(ModBlocks.YELLOW_MUSHROOM_STAIRS);
        yellowMushroomPlankPool.slab(ModBlocks.YELLOW_MUSHROOM_SLAB);
        yellowMushroomPlankPool.button(ModBlocks.YELLOW_MUSHROOM_BUTTON);
        yellowMushroomPlankPool.fence(ModBlocks.YELLOW_MUSHROOM_FENCE);
        yellowMushroomPlankPool.fenceGate(ModBlocks.YELLOW_MUSHROOM_FENCE_GATE);
        yellowMushroomPlankPool.pressurePlate(ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.YELLOW_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.YELLOW_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool limeMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIME_MUSHROOM_PLANKS);
        limeMushroomPlankPool.stairs(ModBlocks.LIME_MUSHROOM_STAIRS);
        limeMushroomPlankPool.slab(ModBlocks.LIME_MUSHROOM_SLAB);
        limeMushroomPlankPool.button(ModBlocks.LIME_MUSHROOM_BUTTON);
        limeMushroomPlankPool.fence(ModBlocks.LIME_MUSHROOM_FENCE);
        limeMushroomPlankPool.fenceGate(ModBlocks.LIME_MUSHROOM_FENCE_GATE);
        limeMushroomPlankPool.pressurePlate(ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.LIME_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIME_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool greenMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GREEN_MUSHROOM_PLANKS);
        greenMushroomPlankPool.stairs(ModBlocks.GREEN_MUSHROOM_STAIRS);
        greenMushroomPlankPool.slab(ModBlocks.GREEN_MUSHROOM_SLAB);
        greenMushroomPlankPool.button(ModBlocks.GREEN_MUSHROOM_BUTTON);
        greenMushroomPlankPool.fence(ModBlocks.GREEN_MUSHROOM_FENCE);
        greenMushroomPlankPool.fenceGate(ModBlocks.GREEN_MUSHROOM_FENCE_GATE);
        greenMushroomPlankPool.pressurePlate(ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.GREEN_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.GREEN_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool cyanMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CYAN_MUSHROOM_PLANKS);
        cyanMushroomPlankPool.stairs(ModBlocks.CYAN_MUSHROOM_STAIRS);
        cyanMushroomPlankPool.slab(ModBlocks.CYAN_MUSHROOM_SLAB);
        cyanMushroomPlankPool.button(ModBlocks.CYAN_MUSHROOM_BUTTON);
        cyanMushroomPlankPool.fence(ModBlocks.CYAN_MUSHROOM_FENCE);
        cyanMushroomPlankPool.fenceGate(ModBlocks.CYAN_MUSHROOM_FENCE_GATE);
        cyanMushroomPlankPool.pressurePlate(ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.CYAN_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CYAN_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool lightBlueMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS);
        lightBlueMushroomPlankPool.stairs(ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS);
        lightBlueMushroomPlankPool.slab(ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB);
        lightBlueMushroomPlankPool.button(ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON);
        lightBlueMushroomPlankPool.fence(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE);
        lightBlueMushroomPlankPool.fenceGate(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE);
        lightBlueMushroomPlankPool.pressurePlate(ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool blueMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLUE_MUSHROOM_PLANKS);
        blueMushroomPlankPool.stairs(ModBlocks.BLUE_MUSHROOM_STAIRS);
        blueMushroomPlankPool.slab(ModBlocks.BLUE_MUSHROOM_SLAB);
        blueMushroomPlankPool.button(ModBlocks.BLUE_MUSHROOM_BUTTON);
        blueMushroomPlankPool.fence(ModBlocks.BLUE_MUSHROOM_FENCE);
        blueMushroomPlankPool.fenceGate(ModBlocks.BLUE_MUSHROOM_FENCE_GATE);
        blueMushroomPlankPool.pressurePlate(ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.BLUE_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.BLUE_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool purpleMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PURPLE_MUSHROOM_PLANKS);
        purpleMushroomPlankPool.stairs(ModBlocks.PURPLE_MUSHROOM_STAIRS);
        purpleMushroomPlankPool.slab(ModBlocks.PURPLE_MUSHROOM_SLAB);
        purpleMushroomPlankPool.button(ModBlocks.PURPLE_MUSHROOM_BUTTON);
        purpleMushroomPlankPool.fence(ModBlocks.PURPLE_MUSHROOM_FENCE);
        purpleMushroomPlankPool.fenceGate(ModBlocks.PURPLE_MUSHROOM_FENCE_GATE);
        purpleMushroomPlankPool.pressurePlate(ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PURPLE_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PURPLE_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool magentaMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MAGENTA_MUSHROOM_PLANKS);
        magentaMushroomPlankPool.stairs(ModBlocks.MAGENTA_MUSHROOM_STAIRS);
        magentaMushroomPlankPool.slab(ModBlocks.MAGENTA_MUSHROOM_SLAB);
        magentaMushroomPlankPool.button(ModBlocks.MAGENTA_MUSHROOM_BUTTON);
        magentaMushroomPlankPool.fence(ModBlocks.MAGENTA_MUSHROOM_FENCE);
        magentaMushroomPlankPool.fenceGate(ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE);
        magentaMushroomPlankPool.pressurePlate(ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.MAGENTA_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR);

        BlockStateModelGenerator.BlockTexturePool pinkMushroomPlankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.PINK_MUSHROOM_PLANKS);
        pinkMushroomPlankPool.stairs(ModBlocks.PINK_MUSHROOM_STAIRS);
        pinkMushroomPlankPool.slab(ModBlocks.PINK_MUSHROOM_SLAB);
        pinkMushroomPlankPool.button(ModBlocks.PINK_MUSHROOM_BUTTON);
        pinkMushroomPlankPool.fence(ModBlocks.PINK_MUSHROOM_FENCE);
        pinkMushroomPlankPool.fenceGate(ModBlocks.PINK_MUSHROOM_FENCE_GATE);
        pinkMushroomPlankPool.pressurePlate(ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.PINK_MUSHROOM_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.PINK_MUSHROOM_TRAPDOOR);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}

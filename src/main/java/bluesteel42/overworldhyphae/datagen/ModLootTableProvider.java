package bluesteel42.overworldhyphae.datagen;

import bluesteel42.overworldhyphae.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.MUSHROOM_STEM);
        addDrop(ModBlocks.MUSHROOM_HYPHAE);
        addDrop(ModBlocks.STRIPPED_MUSHROOM_STEM);
        addDrop(ModBlocks.STRIPPED_MUSHROOM_HYPHAE);

        addDrop(ModBlocks.MUSHROOM_PLANKS);
        addDrop(ModBlocks.MUSHROOM_STAIRS);
        addDrop(ModBlocks.MUSHROOM_BUTTON);
        addDrop(ModBlocks.MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.MUSHROOM_FENCE);
        addDrop(ModBlocks.MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.MUSHROOM_DOOR, doorDrops(ModBlocks.MUSHROOM_DOOR));
        addDrop(ModBlocks.MUSHROOM_SLAB, slabDrops(ModBlocks.MUSHROOM_SLAB));

        addDrop(ModBlocks.WHITE_MUSHROOM_PLANKS);
        addDrop(ModBlocks.WHITE_MUSHROOM_STAIRS);
        addDrop(ModBlocks.WHITE_MUSHROOM_BUTTON);
        addDrop(ModBlocks.WHITE_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.WHITE_MUSHROOM_FENCE);
        addDrop(ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.WHITE_MUSHROOM_DOOR, doorDrops(ModBlocks.WHITE_MUSHROOM_DOOR));
        addDrop(ModBlocks.WHITE_MUSHROOM_SLAB, slabDrops(ModBlocks.WHITE_MUSHROOM_SLAB));

        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS);
        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR, doorDrops(ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR));
        addDrop(ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB));

        addDrop(ModBlocks.GRAY_MUSHROOM_PLANKS);
        addDrop(ModBlocks.GRAY_MUSHROOM_STAIRS);
        addDrop(ModBlocks.GRAY_MUSHROOM_BUTTON);
        addDrop(ModBlocks.GRAY_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.GRAY_MUSHROOM_FENCE);
        addDrop(ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.GRAY_MUSHROOM_DOOR, doorDrops(ModBlocks.GRAY_MUSHROOM_DOOR));
        addDrop(ModBlocks.GRAY_MUSHROOM_SLAB, slabDrops(ModBlocks.GRAY_MUSHROOM_SLAB));

        addDrop(ModBlocks.BLACK_MUSHROOM_PLANKS);
        addDrop(ModBlocks.BLACK_MUSHROOM_STAIRS);
        addDrop(ModBlocks.BLACK_MUSHROOM_BUTTON);
        addDrop(ModBlocks.BLACK_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.BLACK_MUSHROOM_FENCE);
        addDrop(ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.BLACK_MUSHROOM_DOOR, doorDrops(ModBlocks.BLACK_MUSHROOM_DOOR));
        addDrop(ModBlocks.BLACK_MUSHROOM_SLAB, slabDrops(ModBlocks.BLACK_MUSHROOM_SLAB));

        addDrop(ModBlocks.BROWN_MUSHROOM_PLANKS);
        addDrop(ModBlocks.BROWN_MUSHROOM_STAIRS);
        addDrop(ModBlocks.BROWN_MUSHROOM_BUTTON);
        addDrop(ModBlocks.BROWN_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.BROWN_MUSHROOM_FENCE);
        addDrop(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.BROWN_MUSHROOM_DOOR, doorDrops(ModBlocks.BROWN_MUSHROOM_DOOR));
        addDrop(ModBlocks.BROWN_MUSHROOM_SLAB, slabDrops(ModBlocks.BROWN_MUSHROOM_SLAB));

        addDrop(ModBlocks.RED_MUSHROOM_PLANKS);
        addDrop(ModBlocks.RED_MUSHROOM_STAIRS);
        addDrop(ModBlocks.RED_MUSHROOM_BUTTON);
        addDrop(ModBlocks.RED_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.RED_MUSHROOM_FENCE);
        addDrop(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.RED_MUSHROOM_DOOR, doorDrops(ModBlocks.RED_MUSHROOM_DOOR));
        addDrop(ModBlocks.RED_MUSHROOM_SLAB, slabDrops(ModBlocks.RED_MUSHROOM_SLAB));

        addDrop(ModBlocks.ORANGE_MUSHROOM_PLANKS);
        addDrop(ModBlocks.ORANGE_MUSHROOM_STAIRS);
        addDrop(ModBlocks.ORANGE_MUSHROOM_BUTTON);
        addDrop(ModBlocks.ORANGE_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_MUSHROOM_FENCE);
        addDrop(ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.ORANGE_MUSHROOM_DOOR, doorDrops(ModBlocks.ORANGE_MUSHROOM_DOOR));
        addDrop(ModBlocks.ORANGE_MUSHROOM_SLAB, slabDrops(ModBlocks.ORANGE_MUSHROOM_SLAB));

        addDrop(ModBlocks.YELLOW_MUSHROOM_PLANKS);
        addDrop(ModBlocks.YELLOW_MUSHROOM_STAIRS);
        addDrop(ModBlocks.YELLOW_MUSHROOM_BUTTON);
        addDrop(ModBlocks.YELLOW_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_MUSHROOM_FENCE);
        addDrop(ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.YELLOW_MUSHROOM_DOOR, doorDrops(ModBlocks.YELLOW_MUSHROOM_DOOR));
        addDrop(ModBlocks.YELLOW_MUSHROOM_SLAB, slabDrops(ModBlocks.YELLOW_MUSHROOM_SLAB));

        addDrop(ModBlocks.LIME_MUSHROOM_PLANKS);
        addDrop(ModBlocks.LIME_MUSHROOM_STAIRS);
        addDrop(ModBlocks.LIME_MUSHROOM_BUTTON);
        addDrop(ModBlocks.LIME_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.LIME_MUSHROOM_FENCE);
        addDrop(ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.LIME_MUSHROOM_DOOR, doorDrops(ModBlocks.LIME_MUSHROOM_DOOR));
        addDrop(ModBlocks.LIME_MUSHROOM_SLAB, slabDrops(ModBlocks.LIME_MUSHROOM_SLAB));

        addDrop(ModBlocks.GREEN_MUSHROOM_PLANKS);
        addDrop(ModBlocks.GREEN_MUSHROOM_STAIRS);
        addDrop(ModBlocks.GREEN_MUSHROOM_BUTTON);
        addDrop(ModBlocks.GREEN_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.GREEN_MUSHROOM_FENCE);
        addDrop(ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.GREEN_MUSHROOM_DOOR, doorDrops(ModBlocks.GREEN_MUSHROOM_DOOR));
        addDrop(ModBlocks.GREEN_MUSHROOM_SLAB, slabDrops(ModBlocks.GREEN_MUSHROOM_SLAB));

        addDrop(ModBlocks.CYAN_MUSHROOM_PLANKS);
        addDrop(ModBlocks.CYAN_MUSHROOM_STAIRS);
        addDrop(ModBlocks.CYAN_MUSHROOM_BUTTON);
        addDrop(ModBlocks.CYAN_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.CYAN_MUSHROOM_FENCE);
        addDrop(ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.CYAN_MUSHROOM_DOOR, doorDrops(ModBlocks.CYAN_MUSHROOM_DOOR));
        addDrop(ModBlocks.CYAN_MUSHROOM_SLAB, slabDrops(ModBlocks.CYAN_MUSHROOM_SLAB));

        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS);
        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR, doorDrops(ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR));
        addDrop(ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB));

        addDrop(ModBlocks.BLUE_MUSHROOM_PLANKS);
        addDrop(ModBlocks.BLUE_MUSHROOM_STAIRS);
        addDrop(ModBlocks.BLUE_MUSHROOM_BUTTON);
        addDrop(ModBlocks.BLUE_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.BLUE_MUSHROOM_FENCE);
        addDrop(ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.BLUE_MUSHROOM_DOOR, doorDrops(ModBlocks.BLUE_MUSHROOM_DOOR));
        addDrop(ModBlocks.BLUE_MUSHROOM_SLAB, slabDrops(ModBlocks.BLUE_MUSHROOM_SLAB));

        addDrop(ModBlocks.PURPLE_MUSHROOM_PLANKS);
        addDrop(ModBlocks.PURPLE_MUSHROOM_STAIRS);
        addDrop(ModBlocks.PURPLE_MUSHROOM_BUTTON);
        addDrop(ModBlocks.PURPLE_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.PURPLE_MUSHROOM_FENCE);
        addDrop(ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.PURPLE_MUSHROOM_DOOR, doorDrops(ModBlocks.PURPLE_MUSHROOM_DOOR));
        addDrop(ModBlocks.PURPLE_MUSHROOM_SLAB, slabDrops(ModBlocks.PURPLE_MUSHROOM_SLAB));

        addDrop(ModBlocks.MAGENTA_MUSHROOM_PLANKS);
        addDrop(ModBlocks.MAGENTA_MUSHROOM_STAIRS);
        addDrop(ModBlocks.MAGENTA_MUSHROOM_BUTTON);
        addDrop(ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_MUSHROOM_FENCE);
        addDrop(ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.MAGENTA_MUSHROOM_DOOR, doorDrops(ModBlocks.MAGENTA_MUSHROOM_DOOR));
        addDrop(ModBlocks.MAGENTA_MUSHROOM_SLAB, slabDrops(ModBlocks.MAGENTA_MUSHROOM_SLAB));

        addDrop(ModBlocks.PINK_MUSHROOM_PLANKS);
        addDrop(ModBlocks.PINK_MUSHROOM_STAIRS);
        addDrop(ModBlocks.PINK_MUSHROOM_BUTTON);
        addDrop(ModBlocks.PINK_MUSHROOM_FENCE_GATE);
        addDrop(ModBlocks.PINK_MUSHROOM_FENCE);
        addDrop(ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_MUSHROOM_TRAPDOOR);
        addDrop(ModBlocks.PINK_MUSHROOM_DOOR, doorDrops(ModBlocks.PINK_MUSHROOM_DOOR));
        addDrop(ModBlocks.PINK_MUSHROOM_SLAB, slabDrops(ModBlocks.PINK_MUSHROOM_SLAB));
    }
}

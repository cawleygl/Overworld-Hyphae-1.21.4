package bluesteel42.overworldhyphae.datagen;

import bluesteel42.overworldhyphae.block.ModBlocks;
import bluesteel42.overworldhyphae.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Blocks.MUSHROOM_LOGS)
                .add(ModBlocks.MUSHROOM_STEM)
                .add(ModBlocks.MUSHROOM_HYPHAE)
                .add(ModBlocks.STRIPPED_MUSHROOM_STEM)
                .add(ModBlocks.STRIPPED_MUSHROOM_HYPHAE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN).addOptionalTag(ModTags.Blocks.MUSHROOM_LOGS);

        getOrCreateTagBuilder(BlockTags.PLANKS)
                .add(ModBlocks.MUSHROOM_PLANKS)
                .add(ModBlocks.WHITE_MUSHROOM_PLANKS)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS)
                .add(ModBlocks.GRAY_MUSHROOM_PLANKS)
                .add(ModBlocks.BLACK_MUSHROOM_PLANKS)
                .add(ModBlocks.BROWN_MUSHROOM_PLANKS)
                .add(ModBlocks.RED_MUSHROOM_PLANKS)
                .add(ModBlocks.ORANGE_MUSHROOM_PLANKS)
                .add(ModBlocks.YELLOW_MUSHROOM_PLANKS)
                .add(ModBlocks.LIME_MUSHROOM_PLANKS)
                .add(ModBlocks.GREEN_MUSHROOM_PLANKS)
                .add(ModBlocks.CYAN_MUSHROOM_PLANKS)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS)
                .add(ModBlocks.BLUE_MUSHROOM_PLANKS)
                .add(ModBlocks.PURPLE_MUSHROOM_PLANKS)
                .add(ModBlocks.MAGENTA_MUSHROOM_PLANKS)
                .add(ModBlocks.PINK_MUSHROOM_PLANKS);

        getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
                .add(ModBlocks.MUSHROOM_STAIRS)
                .add(ModBlocks.WHITE_MUSHROOM_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS)
                .add(ModBlocks.GRAY_MUSHROOM_STAIRS)
                .add(ModBlocks.BLACK_MUSHROOM_STAIRS)
                .add(ModBlocks.BROWN_MUSHROOM_STAIRS)
                .add(ModBlocks.RED_MUSHROOM_STAIRS)
                .add(ModBlocks.ORANGE_MUSHROOM_STAIRS)
                .add(ModBlocks.YELLOW_MUSHROOM_STAIRS)
                .add(ModBlocks.LIME_MUSHROOM_STAIRS)
                .add(ModBlocks.GREEN_MUSHROOM_STAIRS)
                .add(ModBlocks.CYAN_MUSHROOM_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS)
                .add(ModBlocks.BLUE_MUSHROOM_STAIRS)
                .add(ModBlocks.PURPLE_MUSHROOM_STAIRS)
                .add(ModBlocks.MAGENTA_MUSHROOM_STAIRS)
                .add(ModBlocks.PINK_MUSHROOM_STAIRS);

        getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
                .add(ModBlocks.MUSHROOM_SLAB)
                .add(ModBlocks.WHITE_MUSHROOM_SLAB)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB)
                .add(ModBlocks.GRAY_MUSHROOM_SLAB)
                .add(ModBlocks.BLACK_MUSHROOM_SLAB)
                .add(ModBlocks.BROWN_MUSHROOM_SLAB)
                .add(ModBlocks.RED_MUSHROOM_SLAB)
                .add(ModBlocks.ORANGE_MUSHROOM_SLAB)
                .add(ModBlocks.YELLOW_MUSHROOM_SLAB)
                .add(ModBlocks.LIME_MUSHROOM_SLAB)
                .add(ModBlocks.GREEN_MUSHROOM_SLAB)
                .add(ModBlocks.CYAN_MUSHROOM_SLAB)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB)
                .add(ModBlocks.BLUE_MUSHROOM_SLAB)
                .add(ModBlocks.PURPLE_MUSHROOM_SLAB)
                .add(ModBlocks.MAGENTA_MUSHROOM_SLAB)
                .add(ModBlocks.PINK_MUSHROOM_SLAB);

        getOrCreateTagBuilder(BlockTags.WOODEN_DOORS)
                .add(ModBlocks.MUSHROOM_DOOR)
                .add(ModBlocks.WHITE_MUSHROOM_DOOR)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR)
                .add(ModBlocks.GRAY_MUSHROOM_DOOR)
                .add(ModBlocks.BLACK_MUSHROOM_DOOR)
                .add(ModBlocks.BROWN_MUSHROOM_DOOR)
                .add(ModBlocks.RED_MUSHROOM_DOOR)
                .add(ModBlocks.ORANGE_MUSHROOM_DOOR)
                .add(ModBlocks.YELLOW_MUSHROOM_DOOR)
                .add(ModBlocks.LIME_MUSHROOM_DOOR)
                .add(ModBlocks.GREEN_MUSHROOM_DOOR)
                .add(ModBlocks.CYAN_MUSHROOM_DOOR)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR)
                .add(ModBlocks.BLUE_MUSHROOM_DOOR)
                .add(ModBlocks.PURPLE_MUSHROOM_DOOR)
                .add(ModBlocks.MAGENTA_MUSHROOM_DOOR)
                .add(ModBlocks.PINK_MUSHROOM_DOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_TRAPDOORS)
                .add(ModBlocks.MUSHROOM_TRAPDOOR)
                .add(ModBlocks.WHITE_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.GRAY_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.BLACK_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.BROWN_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.RED_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.ORANGE_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.YELLOW_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.LIME_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.GREEN_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.CYAN_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.BLUE_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.PURPLE_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR)
                .add(ModBlocks.PINK_MUSHROOM_TRAPDOOR);

        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
                .add(ModBlocks.MUSHROOM_FENCE)
                .add(ModBlocks.WHITE_MUSHROOM_FENCE)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE)
                .add(ModBlocks.GRAY_MUSHROOM_FENCE)
                .add(ModBlocks.BLACK_MUSHROOM_FENCE)
                .add(ModBlocks.BROWN_MUSHROOM_FENCE)
                .add(ModBlocks.RED_MUSHROOM_FENCE)
                .add(ModBlocks.ORANGE_MUSHROOM_FENCE)
                .add(ModBlocks.YELLOW_MUSHROOM_FENCE)
                .add(ModBlocks.LIME_MUSHROOM_FENCE)
                .add(ModBlocks.GREEN_MUSHROOM_FENCE)
                .add(ModBlocks.CYAN_MUSHROOM_FENCE)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE)
                .add(ModBlocks.BLUE_MUSHROOM_FENCE)
                .add(ModBlocks.PURPLE_MUSHROOM_FENCE)
                .add(ModBlocks.MAGENTA_MUSHROOM_FENCE)
                .add(ModBlocks.PINK_MUSHROOM_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.MUSHROOM_FENCE_GATE)
                .add(ModBlocks.WHITE_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.GRAY_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.BLACK_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.BROWN_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.RED_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.ORANGE_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.YELLOW_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.LIME_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.GREEN_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.CYAN_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.BLUE_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.PURPLE_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE)
                .add(ModBlocks.PINK_MUSHROOM_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WOODEN_BUTTONS)
                .add(ModBlocks.MUSHROOM_BUTTON)
                .add(ModBlocks.WHITE_MUSHROOM_BUTTON)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON)
                .add(ModBlocks.GRAY_MUSHROOM_BUTTON)
                .add(ModBlocks.BLACK_MUSHROOM_BUTTON)
                .add(ModBlocks.BROWN_MUSHROOM_BUTTON)
                .add(ModBlocks.RED_MUSHROOM_BUTTON)
                .add(ModBlocks.ORANGE_MUSHROOM_BUTTON)
                .add(ModBlocks.YELLOW_MUSHROOM_BUTTON)
                .add(ModBlocks.LIME_MUSHROOM_BUTTON)
                .add(ModBlocks.GREEN_MUSHROOM_BUTTON)
                .add(ModBlocks.CYAN_MUSHROOM_BUTTON)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON)
                .add(ModBlocks.BLUE_MUSHROOM_BUTTON)
                .add(ModBlocks.PURPLE_MUSHROOM_BUTTON)
                .add(ModBlocks.MAGENTA_MUSHROOM_BUTTON)
                .add(ModBlocks.PINK_MUSHROOM_BUTTON);

        getOrCreateTagBuilder(BlockTags.WOODEN_PRESSURE_PLATES)
                .add(ModBlocks.MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE)
                .add(ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE);

    }
}

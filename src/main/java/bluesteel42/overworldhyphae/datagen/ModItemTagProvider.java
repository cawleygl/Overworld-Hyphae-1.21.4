package bluesteel42.overworldhyphae.datagen;

import bluesteel42.overworldhyphae.block.ModBlocks;
import bluesteel42.overworldhyphae.util.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_STEMS)
                .add(ModBlocks.MUSHROOM_STEM.asItem())
                .add(ModBlocks.MUSHROOM_HYPHAE.asItem())
                .add(ModBlocks.STRIPPED_MUSHROOM_STEM.asItem())
                .add(ModBlocks.STRIPPED_MUSHROOM_HYPHAE.asItem());

        getOrCreateTagBuilder(ItemTags.LOGS).addOptionalTag(ModTags.Items.MUSHROOM_STEMS);

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_PLANKS)
                .add(ModBlocks.MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.RED_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.LIME_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_PLANKS.asItem())
                .add(ModBlocks.PINK_MUSHROOM_PLANKS.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_STAIRS)
                .add(ModBlocks.MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.RED_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.LIME_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_STAIRS.asItem())
                .add(ModBlocks.PINK_MUSHROOM_STAIRS.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_SLABS)
                .add(ModBlocks.MUSHROOM_SLAB.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.RED_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.LIME_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_SLAB.asItem())
                .add(ModBlocks.PINK_MUSHROOM_SLAB.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_DOORS)
                .add(ModBlocks.MUSHROOM_DOOR.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.RED_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.LIME_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_DOOR.asItem())
                .add(ModBlocks.PINK_MUSHROOM_DOOR.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_TRAPDOORS)
                .add(ModBlocks.MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.RED_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.LIME_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR.asItem())
                .add(ModBlocks.PINK_MUSHROOM_TRAPDOOR.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_FENCES)
                .add(ModBlocks.MUSHROOM_FENCE.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.RED_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.LIME_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_FENCE.asItem())
                .add(ModBlocks.PINK_MUSHROOM_FENCE.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_FENCE_GATES)
                .add(ModBlocks.MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.RED_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.LIME_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE.asItem())
                .add(ModBlocks.PINK_MUSHROOM_FENCE_GATE.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_BUTTONS)
                .add(ModBlocks.MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.RED_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.LIME_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_BUTTON.asItem())
                .add(ModBlocks.PINK_MUSHROOM_BUTTON.asItem());

        getOrCreateTagBuilder(ModTags.Items.MUSHROOM_PRESSURE_PLATES)
                .add(ModBlocks.MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE.asItem())
                .add(ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE.asItem());

        getOrCreateTagBuilder(ItemTags.PLANKS).addOptionalTag(ModTags.Items.MUSHROOM_PLANKS);
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS).addOptionalTag(ModTags.Items.MUSHROOM_STAIRS);
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS).addOptionalTag(ModTags.Items.MUSHROOM_SLABS);
        getOrCreateTagBuilder(ItemTags.WOODEN_DOORS).addOptionalTag(ModTags.Items.MUSHROOM_DOORS);
        getOrCreateTagBuilder(ItemTags.WOODEN_TRAPDOORS).addOptionalTag(ModTags.Items.MUSHROOM_TRAPDOORS);
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES).addOptionalTag(ModTags.Items.MUSHROOM_FENCES);
        getOrCreateTagBuilder(ItemTags.FENCE_GATES).addOptionalTag(ModTags.Items.MUSHROOM_FENCE_GATES);
        getOrCreateTagBuilder(ItemTags.WOODEN_BUTTONS).addOptionalTag(ModTags.Items.MUSHROOM_BUTTONS);
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES).addOptionalTag(ModTags.Items.MUSHROOM_PRESSURE_PLATES);

        getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
                .addOptionalTag(ModTags.Items.MUSHROOM_PLANKS)
                .addOptionalTag(ModTags.Items.MUSHROOM_STAIRS)
                .addOptionalTag(ModTags.Items.MUSHROOM_SLABS)
                .addOptionalTag(ModTags.Items.MUSHROOM_DOORS)
                .addOptionalTag(ModTags.Items.MUSHROOM_TRAPDOORS)
                .addOptionalTag(ModTags.Items.MUSHROOM_FENCES)
                .addOptionalTag(ModTags.Items.MUSHROOM_FENCE_GATES)
                .addOptionalTag(ModTags.Items.MUSHROOM_BUTTONS)
                .addOptionalTag(ModTags.Items.MUSHROOM_PRESSURE_PLATES);

    }
}

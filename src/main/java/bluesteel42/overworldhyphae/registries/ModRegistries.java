package bluesteel42.overworldhyphae.registries;

import bluesteel42.overworldhyphae.block.ModBlocks;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.MUSHROOM_STEM, ModBlocks.STRIPPED_MUSHROOM_STEM);
        StrippableBlockRegistry.register(ModBlocks.MUSHROOM_HYPHAE, ModBlocks.STRIPPED_MUSHROOM_HYPHAE);
    }

    private static final float compostChance = 0.65F;

    public static void registerCompostables() {
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_HYPHAE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_MUSHROOM_STEM, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.STRIPPED_MUSHROOM_HYPHAE, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.WHITE_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GRAY_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLACK_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BROWN_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.RED_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.ORANGE_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.YELLOW_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIME_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.GREEN_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.CYAN_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.BLUE_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PURPLE_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR, compostChance);

        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_PLANKS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_STAIRS, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_SLAB, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_BUTTON, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_FENCE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_FENCE_GATE, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_DOOR, compostChance);
        CompostingChanceRegistry.INSTANCE.add(ModBlocks.PINK_MUSHROOM_TRAPDOOR, compostChance);
    }

}

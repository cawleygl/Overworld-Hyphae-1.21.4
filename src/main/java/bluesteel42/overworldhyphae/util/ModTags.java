package bluesteel42.overworldhyphae.util;

import bluesteel42.overworldhyphae.OverworldHyphae;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MUSHROOM_STEMS = createTag("mushroom_stems");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(OverworldHyphae.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MUSHROOM_STEMS = createTag("mushroom_stems");
        public static final TagKey<Item> MUSHROOM_PLANKS = createTag("mushroom_planks");
        public static final TagKey<Item> MUSHROOM_SLABS = createTag("mushroom_slabs");
        public static final TagKey<Item> MUSHROOM_PRESSURE_PLATES = createTag("mushroom_pressure_plates");
        public static final TagKey<Item> MUSHROOM_FENCES = createTag("mushroom_fences");
        public static final TagKey<Item> MUSHROOM_TRAPDOORS = createTag("mushroom_trapdoors");
        public static final TagKey<Item> MUSHROOM_FENCE_GATES = createTag("mushroom_fence_gates");
        public static final TagKey<Item> MUSHROOM_STAIRS = createTag("mushroom_stairs");
        public static final TagKey<Item> MUSHROOM_BUTTONS = createTag("mushroom_buttons");
        public static final TagKey<Item> MUSHROOM_DOORS = createTag("mushroom_doors");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(OverworldHyphae.MOD_ID, name));
        }
    }
}

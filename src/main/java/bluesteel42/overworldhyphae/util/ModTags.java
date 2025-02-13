package bluesteel42.overworldhyphae.util;

import bluesteel42.overworldhyphae.OverworldHyphae;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> MUSHROOM_LOGS = createTag("mushroom_logs");

        public static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(OverworldHyphae.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> MUSHROOM_LOGS = createTag("mushroom_logs");

        public static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, Identifier.of(OverworldHyphae.MOD_ID, name));
        }
    }
}

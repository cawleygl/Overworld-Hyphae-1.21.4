package bluesteel42.overworldhyphae.registries;

import bluesteel42.overworldhyphae.block.ModBlocks;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModRegistries {

    public static void registerStrippables() {
        StrippableBlockRegistry.register(ModBlocks.MUSHROOM_STEM, ModBlocks.STRIPPED_MUSHROOM_STEM);
        StrippableBlockRegistry.register(ModBlocks.MUSHROOM_HYPHAE, ModBlocks.STRIPPED_MUSHROOM_HYPHAE);
    }

}

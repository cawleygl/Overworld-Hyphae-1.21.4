package bluesteel42.overworldhyphae.block;

import bluesteel42.overworldhyphae.OverworldHyphae;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.function.Function;

public class ModBlocks {
    public static final Block MUSHROOM_STEM = registerModBlock("mushroom_stem", PillarBlock::new, AbstractBlock.Settings.create()
            .mapColor(state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? MapColor.OAK_TAN : MapColor.WHITE_GRAY)
            .instrument(NoteBlockInstrument.BASS)
            .strength(0.2F)
            .sounds(BlockSoundGroup.WOOD)
            .burnable());

    public static final Block MUSHROOM_PLANKS = registerModBlock("mushroom_planks", Block::new, AbstractBlock.Settings.create()
            .mapColor(MapColor.OAK_TAN)
            .instrument(NoteBlockInstrument.BASS)
            .strength(0.2F)
            .sounds(BlockSoundGroup.WOOD)
            .burnable());

    private static Block registerMinecraftBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.ofVanilla(path);

        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);

        return block;
    }

    private static Block registerModBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(OverworldHyphae.MOD_ID, path);

        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);

        return block;

    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.MUSHROOM_STEM, Items.BROWN_MUSHROOM_BLOCK);
                    itemGroup.addAfter(Items.MUSHROOM_STEM, Items.RED_MUSHROOM_BLOCK);
                }
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                            itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.BAMBOO_BUTTON, Items.MUSHROOM_STEM);
                        }
                );
    }
}

package bluesteel42.overworldhyphae.block;

import bluesteel42.overworldhyphae.OverworldHyphae;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

import java.util.function.Function;

public class ModBlocks {
    private static final float blockStrength = 0.5F;

    private static final String plainDyeColor = "";
    private static final MapColor plainMapColor = MapColor.OAK_TAN;

    public static final Block MUSHROOM_HYPHAE = registerBlock("mushroom_hyphae",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(plainMapColor)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(blockStrength)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable());

    public static final Block MUSHROOM_STEM = registerBlock("mushroom_stem",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(state -> state.get(PillarBlock.AXIS) == Direction.Axis.Y ? plainMapColor : MapColor.WHITE_GRAY)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(blockStrength)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable());

    public static final Block STRIPPED_MUSHROOM_HYPHAE = registerBlock("stripped_mushroom_hyphae",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(plainMapColor)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(blockStrength)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable());

    public static final Block STRIPPED_MUSHROOM_STEM = registerBlock("stripped_mushroom_stem",
            PillarBlock::new,
            AbstractBlock.Settings.create()
                    .mapColor(plainMapColor)
                    .instrument(NoteBlockInstrument.BASS)
                    .strength(blockStrength)
                    .sounds(BlockSoundGroup.WOOD)
                    .burnable());

    public static final Block MUSHROOM_PLANKS = registerPlanks(plainDyeColor, plainMapColor);
    public static final Block MUSHROOM_STAIRS = registerStairs(plainDyeColor);
    public static final Block MUSHROOM_SLAB = registerSlab(plainDyeColor);
    public static final Block MUSHROOM_BUTTON = registerButton(plainDyeColor);
    public static final Block MUSHROOM_PRESSURE_PLATE = registerPressurePlate(plainDyeColor, plainMapColor);
    public static final Block MUSHROOM_FENCE = registerFence(plainDyeColor, plainMapColor);
    public static final Block MUSHROOM_FENCE_GATE = registerFenceGate(plainDyeColor, plainMapColor);
    public static final Block MUSHROOM_DOOR = registerDoor(plainDyeColor, plainMapColor);
    public static final Block MUSHROOM_TRAPDOOR = registerTrapdoor(plainDyeColor, plainMapColor);

    private static final String whiteDyeColor = "white_";
    private static final MapColor whiteMapColor = MapColor.WHITE;
    public static final Block WHITE_MUSHROOM_PLANKS = registerPlanks(whiteDyeColor, whiteMapColor);
    public static final Block WHITE_MUSHROOM_STAIRS = registerStairs(whiteDyeColor);
    public static final Block WHITE_MUSHROOM_SLAB = registerSlab(whiteDyeColor);
    public static final Block WHITE_MUSHROOM_BUTTON = registerButton(whiteDyeColor);
    public static final Block WHITE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(whiteDyeColor, whiteMapColor);
    public static final Block WHITE_MUSHROOM_FENCE = registerFence(whiteDyeColor, whiteMapColor);
    public static final Block WHITE_MUSHROOM_FENCE_GATE = registerFenceGate(whiteDyeColor, whiteMapColor);
    public static final Block WHITE_MUSHROOM_DOOR = registerDoor(whiteDyeColor, whiteMapColor);
    public static final Block WHITE_MUSHROOM_TRAPDOOR = registerTrapdoor(whiteDyeColor, whiteMapColor);

    private static final String lightGrayDyeColor = "light_gray_";
    private static final MapColor lightGrayMapColor = MapColor.LIGHT_GRAY;
    public static final Block LIGHT_GRAY_MUSHROOM_PLANKS = registerPlanks(lightGrayDyeColor, lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_STAIRS = registerStairs(lightGrayDyeColor);
    public static final Block LIGHT_GRAY_MUSHROOM_SLAB = registerSlab(lightGrayDyeColor);
    public static final Block LIGHT_GRAY_MUSHROOM_BUTTON = registerButton(lightGrayDyeColor);
    public static final Block LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(lightGrayDyeColor, lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_FENCE = registerFence(lightGrayDyeColor, lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_FENCE_GATE = registerFenceGate(lightGrayDyeColor, lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_DOOR = registerDoor(lightGrayDyeColor, lightGrayMapColor);
    public static final Block LIGHT_GRAY_MUSHROOM_TRAPDOOR = registerTrapdoor(lightGrayDyeColor, lightGrayMapColor);

    private static final String grayDyeColor = "gray_";
    private static final MapColor grayMapColor = MapColor.GRAY;
    public static final Block GRAY_MUSHROOM_PLANKS = registerPlanks(grayDyeColor, grayMapColor);
    public static final Block GRAY_MUSHROOM_STAIRS = registerStairs(grayDyeColor);
    public static final Block GRAY_MUSHROOM_SLAB = registerSlab(grayDyeColor);
    public static final Block GRAY_MUSHROOM_BUTTON = registerButton(grayDyeColor);
    public static final Block GRAY_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(grayDyeColor, grayMapColor);
    public static final Block GRAY_MUSHROOM_FENCE = registerFence(grayDyeColor, grayMapColor);
    public static final Block GRAY_MUSHROOM_FENCE_GATE = registerFenceGate(grayDyeColor, grayMapColor);
    public static final Block GRAY_MUSHROOM_DOOR = registerDoor(grayDyeColor, grayMapColor);
    public static final Block GRAY_MUSHROOM_TRAPDOOR = registerTrapdoor(grayDyeColor, grayMapColor);

    private static final String blackDyeColor = "black_";
    private static final MapColor blackMapColor = MapColor.BLACK;
    public static final Block BLACK_MUSHROOM_PLANKS = registerPlanks(blackDyeColor, blackMapColor);
    public static final Block BLACK_MUSHROOM_STAIRS = registerStairs(blackDyeColor);
    public static final Block BLACK_MUSHROOM_SLAB = registerSlab(blackDyeColor);
    public static final Block BLACK_MUSHROOM_BUTTON = registerButton(blackDyeColor);
    public static final Block BLACK_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(blackDyeColor, blackMapColor);
    public static final Block BLACK_MUSHROOM_FENCE = registerFence(blackDyeColor, blackMapColor);
    public static final Block BLACK_MUSHROOM_FENCE_GATE = registerFenceGate(blackDyeColor, blackMapColor);
    public static final Block BLACK_MUSHROOM_DOOR = registerDoor(blackDyeColor, blackMapColor);
    public static final Block BLACK_MUSHROOM_TRAPDOOR = registerTrapdoor(blackDyeColor, blackMapColor);

    private static final String brownDyeColor = "brown_";
    private static final MapColor brownMapColor = MapColor.BROWN;
    public static final Block BROWN_MUSHROOM_PLANKS = registerPlanks(brownDyeColor, brownMapColor);
    public static final Block BROWN_MUSHROOM_STAIRS = registerStairs(brownDyeColor);
    public static final Block BROWN_MUSHROOM_SLAB = registerSlab(brownDyeColor);
    public static final Block BROWN_MUSHROOM_BUTTON = registerButton(brownDyeColor);
    public static final Block BROWN_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(brownDyeColor, brownMapColor);
    public static final Block BROWN_MUSHROOM_FENCE = registerFence(brownDyeColor, brownMapColor);
    public static final Block BROWN_MUSHROOM_FENCE_GATE = registerFenceGate(brownDyeColor, brownMapColor);
    public static final Block BROWN_MUSHROOM_DOOR = registerDoor(brownDyeColor, brownMapColor);
    public static final Block BROWN_MUSHROOM_TRAPDOOR = registerTrapdoor(brownDyeColor, brownMapColor);

    private static final String redDyeColor = "red_";
    private static final MapColor redMapColor = MapColor.BRIGHT_RED;
    public static final Block RED_MUSHROOM_PLANKS = registerPlanks(redDyeColor, redMapColor);
    public static final Block RED_MUSHROOM_STAIRS = registerStairs(redDyeColor);
    public static final Block RED_MUSHROOM_SLAB = registerSlab(redDyeColor);
    public static final Block RED_MUSHROOM_BUTTON = registerButton(redDyeColor);
    public static final Block RED_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(redDyeColor, redMapColor);
    public static final Block RED_MUSHROOM_FENCE = registerFence(redDyeColor, redMapColor);
    public static final Block RED_MUSHROOM_FENCE_GATE = registerFenceGate(redDyeColor, redMapColor);
    public static final Block RED_MUSHROOM_DOOR = registerDoor(redDyeColor, redMapColor);
    public static final Block RED_MUSHROOM_TRAPDOOR = registerTrapdoor(redDyeColor, redMapColor);

    private static final String orangeDyeColor = "orange_";
    private static final MapColor orangeMapColor = MapColor.ORANGE;
    public static final Block ORANGE_MUSHROOM_PLANKS = registerPlanks(orangeDyeColor, orangeMapColor);
    public static final Block ORANGE_MUSHROOM_STAIRS = registerStairs(orangeDyeColor);
    public static final Block ORANGE_MUSHROOM_SLAB = registerSlab(orangeDyeColor);
    public static final Block ORANGE_MUSHROOM_BUTTON = registerButton(orangeDyeColor);
    public static final Block ORANGE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(orangeDyeColor, orangeMapColor);
    public static final Block ORANGE_MUSHROOM_FENCE = registerFence(orangeDyeColor, orangeMapColor);
    public static final Block ORANGE_MUSHROOM_FENCE_GATE = registerFenceGate(orangeDyeColor, orangeMapColor);
    public static final Block ORANGE_MUSHROOM_DOOR = registerDoor(orangeDyeColor, orangeMapColor);
    public static final Block ORANGE_MUSHROOM_TRAPDOOR = registerTrapdoor(orangeDyeColor, orangeMapColor);

    private static final String yellowDyeColor = "yellow_";
    private static final MapColor yellowMapColor = MapColor.YELLOW;
    public static final Block YELLOW_MUSHROOM_PLANKS = registerPlanks(yellowDyeColor, yellowMapColor);
    public static final Block YELLOW_MUSHROOM_STAIRS = registerStairs(yellowDyeColor);
    public static final Block YELLOW_MUSHROOM_SLAB = registerSlab(yellowDyeColor);
    public static final Block YELLOW_MUSHROOM_BUTTON = registerButton(yellowDyeColor);
    public static final Block YELLOW_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(yellowDyeColor, yellowMapColor);
    public static final Block YELLOW_MUSHROOM_FENCE = registerFence(yellowDyeColor, yellowMapColor);
    public static final Block YELLOW_MUSHROOM_FENCE_GATE = registerFenceGate(yellowDyeColor, yellowMapColor);
    public static final Block YELLOW_MUSHROOM_DOOR = registerDoor(yellowDyeColor, yellowMapColor);
    public static final Block YELLOW_MUSHROOM_TRAPDOOR = registerTrapdoor(yellowDyeColor, yellowMapColor);

    private static final String limeDyeColor = "lime_";
    private static final MapColor limeMapColor = MapColor.LIME;
    public static final Block LIME_MUSHROOM_PLANKS = registerPlanks(limeDyeColor, limeMapColor);
    public static final Block LIME_MUSHROOM_STAIRS = registerStairs(limeDyeColor);
    public static final Block LIME_MUSHROOM_SLAB = registerSlab(limeDyeColor);
    public static final Block LIME_MUSHROOM_BUTTON = registerButton(limeDyeColor);
    public static final Block LIME_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(limeDyeColor, limeMapColor);
    public static final Block LIME_MUSHROOM_FENCE = registerFence(limeDyeColor, limeMapColor);
    public static final Block LIME_MUSHROOM_FENCE_GATE = registerFenceGate(limeDyeColor, limeMapColor);
    public static final Block LIME_MUSHROOM_DOOR = registerDoor(limeDyeColor, limeMapColor);
    public static final Block LIME_MUSHROOM_TRAPDOOR = registerTrapdoor(limeDyeColor, limeMapColor);

    private static final String greenDyeColor = "green_";
    private static final MapColor greenMapColor = MapColor.GREEN;
    public static final Block GREEN_MUSHROOM_PLANKS = registerPlanks(greenDyeColor, greenMapColor);
    public static final Block GREEN_MUSHROOM_STAIRS = registerStairs(greenDyeColor);
    public static final Block GREEN_MUSHROOM_SLAB = registerSlab(greenDyeColor);
    public static final Block GREEN_MUSHROOM_BUTTON = registerButton(greenDyeColor);
    public static final Block GREEN_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(greenDyeColor, greenMapColor);
    public static final Block GREEN_MUSHROOM_FENCE = registerFence(greenDyeColor, greenMapColor);
    public static final Block GREEN_MUSHROOM_FENCE_GATE = registerFenceGate(greenDyeColor, greenMapColor);
    public static final Block GREEN_MUSHROOM_DOOR = registerDoor(greenDyeColor, greenMapColor);
    public static final Block GREEN_MUSHROOM_TRAPDOOR = registerTrapdoor(greenDyeColor, greenMapColor);

    private static final String cyanDyeColor = "cyan_";
    private static final MapColor cyanMapColor = MapColor.CYAN;
    public static final Block CYAN_MUSHROOM_PLANKS = registerPlanks(cyanDyeColor, cyanMapColor);
    public static final Block CYAN_MUSHROOM_STAIRS = registerStairs(cyanDyeColor);
    public static final Block CYAN_MUSHROOM_SLAB = registerSlab(cyanDyeColor);
    public static final Block CYAN_MUSHROOM_BUTTON = registerButton(cyanDyeColor);
    public static final Block CYAN_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(cyanDyeColor, cyanMapColor);
    public static final Block CYAN_MUSHROOM_FENCE = registerFence(cyanDyeColor, cyanMapColor);
    public static final Block CYAN_MUSHROOM_FENCE_GATE = registerFenceGate(cyanDyeColor, cyanMapColor);
    public static final Block CYAN_MUSHROOM_DOOR = registerDoor(cyanDyeColor, cyanMapColor);
    public static final Block CYAN_MUSHROOM_TRAPDOOR = registerTrapdoor(cyanDyeColor, cyanMapColor);

    private static final String lightBlueDyeColor = "light_blue_";
    private static final MapColor lightBlueMapColor = MapColor.LIGHT_BLUE;
    public static final Block LIGHT_BLUE_MUSHROOM_PLANKS = registerPlanks(lightBlueDyeColor, lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_STAIRS = registerStairs(lightBlueDyeColor);
    public static final Block LIGHT_BLUE_MUSHROOM_SLAB = registerSlab(lightBlueDyeColor);
    public static final Block LIGHT_BLUE_MUSHROOM_BUTTON = registerButton(lightBlueDyeColor);
    public static final Block LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(lightBlueDyeColor, lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_FENCE = registerFence(lightBlueDyeColor, lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_FENCE_GATE = registerFenceGate(lightBlueDyeColor, lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_DOOR = registerDoor(lightBlueDyeColor, lightBlueMapColor);
    public static final Block LIGHT_BLUE_MUSHROOM_TRAPDOOR = registerTrapdoor(lightBlueDyeColor, lightBlueMapColor);

    private static final String blueDyeColor = "blue_";
    private static final MapColor blueMapColor = MapColor.BLUE;
    public static final Block BLUE_MUSHROOM_PLANKS = registerPlanks(blueDyeColor, blueMapColor);
    public static final Block BLUE_MUSHROOM_STAIRS = registerStairs(blueDyeColor);
    public static final Block BLUE_MUSHROOM_SLAB = registerSlab(blueDyeColor);
    public static final Block BLUE_MUSHROOM_BUTTON = registerButton(blueDyeColor);
    public static final Block BLUE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(blueDyeColor, blueMapColor);
    public static final Block BLUE_MUSHROOM_FENCE = registerFence(blueDyeColor, blueMapColor);
    public static final Block BLUE_MUSHROOM_FENCE_GATE = registerFenceGate(blueDyeColor, blueMapColor);
    public static final Block BLUE_MUSHROOM_DOOR = registerDoor(blueDyeColor, blueMapColor);
    public static final Block BLUE_MUSHROOM_TRAPDOOR = registerTrapdoor(blueDyeColor, blueMapColor);

    private static final String purpleDyeColor = "purple_";
    private static final MapColor purpleMapColor = MapColor.PURPLE;
    public static final Block PURPLE_MUSHROOM_PLANKS = registerPlanks(purpleDyeColor, purpleMapColor);
    public static final Block PURPLE_MUSHROOM_STAIRS = registerStairs(purpleDyeColor);
    public static final Block PURPLE_MUSHROOM_SLAB = registerSlab(purpleDyeColor);
    public static final Block PURPLE_MUSHROOM_BUTTON = registerButton(purpleDyeColor);
    public static final Block PURPLE_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(purpleDyeColor, purpleMapColor);
    public static final Block PURPLE_MUSHROOM_FENCE = registerFence(purpleDyeColor, purpleMapColor);
    public static final Block PURPLE_MUSHROOM_FENCE_GATE = registerFenceGate(purpleDyeColor, purpleMapColor);
    public static final Block PURPLE_MUSHROOM_DOOR = registerDoor(purpleDyeColor, purpleMapColor);
    public static final Block PURPLE_MUSHROOM_TRAPDOOR = registerTrapdoor(purpleDyeColor, purpleMapColor);

    private static final String magentaDyeColor = "magenta_";
    private static final MapColor magentaMapColor = MapColor.MAGENTA;
    public static final Block MAGENTA_MUSHROOM_PLANKS = registerPlanks(magentaDyeColor, magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_STAIRS = registerStairs(magentaDyeColor);
    public static final Block MAGENTA_MUSHROOM_SLAB = registerSlab(magentaDyeColor);
    public static final Block MAGENTA_MUSHROOM_BUTTON = registerButton(magentaDyeColor);
    public static final Block MAGENTA_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(magentaDyeColor, magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_FENCE = registerFence(magentaDyeColor, magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_FENCE_GATE = registerFenceGate(magentaDyeColor, magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_DOOR = registerDoor(magentaDyeColor, magentaMapColor);
    public static final Block MAGENTA_MUSHROOM_TRAPDOOR = registerTrapdoor(magentaDyeColor, magentaMapColor);

    private static final String pinkDyeColor = "pink_";
    private static final MapColor pinkMapColor = MapColor.PINK;
    public static final Block PINK_MUSHROOM_PLANKS = registerPlanks(pinkDyeColor, pinkMapColor);
    public static final Block PINK_MUSHROOM_STAIRS = registerStairs(pinkDyeColor);
    public static final Block PINK_MUSHROOM_SLAB = registerSlab(pinkDyeColor);
    public static final Block PINK_MUSHROOM_BUTTON = registerButton(pinkDyeColor);
    public static final Block PINK_MUSHROOM_PRESSURE_PLATE = registerPressurePlate(pinkDyeColor, pinkMapColor);
    public static final Block PINK_MUSHROOM_FENCE = registerFence(pinkDyeColor, pinkMapColor);
    public static final Block PINK_MUSHROOM_FENCE_GATE = registerFenceGate(pinkDyeColor, pinkMapColor);
    public static final Block PINK_MUSHROOM_DOOR = registerDoor(pinkDyeColor, pinkMapColor);
    public static final Block PINK_MUSHROOM_TRAPDOOR = registerTrapdoor(pinkDyeColor, pinkMapColor);

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(OverworldHyphae.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);

        return block;

    }

    private static Identifier generateID(String path) {
        return Identifier.of(OverworldHyphae.MOD_ID, path);
    }

    private static RegistryKey<Block> generateRegistryKey(Identifier identifier) {
        return RegistryKey.of(RegistryKeys.BLOCK, identifier);
    }

    private static Block registerPlanks(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_planks";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)), Block::new, AbstractBlock.Settings.create()
                .mapColor(mapColor)
                .instrument(NoteBlockInstrument.BASS)
                .strength(blockStrength)
                .sounds(BlockSoundGroup.WOOD)
                .burnable());

        Items.register(block);

        return block;

    }

    private static Block registerStairs(String dyeColor) {
        String path = dyeColor + "mushroom_stairs";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new StairsBlock(MUSHROOM_PLANKS.getDefaultState(), settings),
                AbstractBlock.Settings.copy(MUSHROOM_PLANKS));

        Items.register(block);

        return block;

    }

    private static Block registerSlab(String dyeColor) {
        String path = dyeColor + "mushroom_slab";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                SlabBlock::new,
                AbstractBlock.Settings.copy(MUSHROOM_PLANKS));
        Items.register(block);

        return block;

    }
    private static Block registerButton(String dyeColor) {
        String path = dyeColor + "mushroom_button";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new ButtonBlock(BlockSetType.OAK, 30, settings),
                AbstractBlock.Settings.create()
                        .noCollision()
                        .strength(blockStrength)
                        .pistonBehavior(PistonBehavior.DESTROY));

        Items.register(block);

        return block;

    }

    private static Block registerPressurePlate(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_pressure_plate";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new PressurePlateBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .noCollision()
                        .strength(blockStrength)
                        .burnable()
                        .pistonBehavior(PistonBehavior.DESTROY));

        Items.register(block);

        return block;

    }

    private static Block registerFence(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_fence";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                FenceBlock::new,
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(blockStrength)
                        .sounds(BlockSoundGroup.WOOD)
                        .burnable());
        Items.register(block);

        return block;

    }

    private static Block registerFenceGate(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_fence_gate";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new FenceGateBlock(WoodType.OAK, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(blockStrength)
                        .burnable());

        Items.register(block);

        return block;

    }

    private static Block registerDoor(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_door";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new DoorBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(blockStrength)
                        .nonOpaque()
                        .burnable()
                        .pistonBehavior(PistonBehavior.DESTROY)
        );
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

        Items.register(block);

        return block;

    }

    private static Block registerTrapdoor(String dyeColor, MapColor mapColor) {
        String path = dyeColor + "mushroom_trapdoor";

        final Block block = Blocks.register(generateRegistryKey(generateID(path)),
                settings -> new TrapdoorBlock(BlockSetType.OAK, settings),
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .instrument(NoteBlockInstrument.BASS)
                        .strength(blockStrength)
                        .nonOpaque()
                        .allowsSpawning(Blocks::never)
                        .burnable());
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());

        Items.register(block);

        return block;

    }

    public static void initialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL)
                .register((itemGroup) -> itemGroup.addBefore(Items.MUSHROOM_STEM, ModBlocks.MUSHROOM_STEM));

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COLORED_BLOCKS)
                .register((itemGroup) -> {
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.PINK_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.MAGENTA_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.PURPLE_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.BLUE_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.CYAN_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.GREEN_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.LIME_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.YELLOW_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.ORANGE_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.RED_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.BROWN_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.BLACK_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.GRAY_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.WHITE_MUSHROOM_PLANKS);
                            itemGroup.addAfter(Items.PINK_CARPET, ModBlocks.MUSHROOM_PLANKS);
                        }
                );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS)
                .register((itemGroup) -> {
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PINK_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MAGENTA_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.PURPLE_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLUE_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_BLUE_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.CYAN_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GREEN_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIME_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.YELLOW_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.ORANGE_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.RED_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BROWN_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.BLACK_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.GRAY_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.LIGHT_GRAY_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.WHITE_MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_BUTTON);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_PRESSURE_PLATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_TRAPDOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_DOOR);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_FENCE_GATE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_FENCE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_SLAB);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_STAIRS);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_PLANKS);

                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.STRIPPED_MUSHROOM_HYPHAE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.STRIPPED_MUSHROOM_STEM);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_HYPHAE);
                    itemGroup.addAfter(Items.BAMBOO_BUTTON, ModBlocks.MUSHROOM_STEM);
                });
    }
}

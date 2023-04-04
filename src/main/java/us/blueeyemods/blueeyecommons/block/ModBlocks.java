package us.blueeyemods.blueeyecommons.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import us.blueeyemods.blueeyecommons.Main;
import us.blueeyemods.blueeyecommons.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);
    public static final RegistryObject<Block> PACKED_SNOW = registerBlock("packed_snow",
            () -> new Block(BlockBehaviour.Properties.of(Material.SNOW)
                    .strength(0.8f, 0.8f).sound(SoundType.SNOW).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_SNOW_SLAB = registerBlock("packed_snow_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_SNOW_STAIRS = registerBlock("packed_snow_stairs",
            () -> new StairBlock(ModBlocks.PACKED_SNOW.get()::defaultBlockState, BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_SNOW_WALL = registerBlock("packed_snow_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_ICE_SLAB = registerBlock("packed_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PACKED_SNOW_BRICKS = registerBlock("packed_snow_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_SNOW_BRICK_STAIRS = registerBlock("packed_snow_brick_stairs",
            () -> new StairBlock(ModBlocks.PACKED_SNOW_BRICKS.get()::defaultBlockState, BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW_BRICKS.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_SNOW_TILES = registerBlock("packed_snow_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PACKED_SNOW_TILE_STAIRS = registerBlock("packed_snow_tile_stairs",
            () -> new StairBlock(ModBlocks.PACKED_SNOW_TILES.get()::defaultBlockState, BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW_TILES.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_SNOW_PILLAR = registerBlock("packed_snow_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_PACKED_SNOW = registerBlock("chiseled_packed_snow",
            () -> new Block(BlockBehaviour.Properties.copy(ModBlocks.PACKED_SNOW.get()).sound(SoundType.SNOW).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_ICE_WALL = registerBlock("packed_ice_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> PACKED_ICE_BRICKS = registerBlock("packed_ice_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PACKED_ICE_TILES = registerBlock("packed_ice_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PACKED_ICE_PILLAR = registerBlock("packed_ice_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",
            () -> new StairBlock(Blocks.PACKED_ICE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_PACKED_ICE = registerBlock("chiseled_packed_ice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.PACKED_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_PACKED_ICE_BRICKS = registerBlock("cracked_packed_ice_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_PACKED_ICE_TILES = registerBlock("cracked_packed_ice_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_ICE_SLAB = registerBlock("blue_ice_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs",
            () -> new StairBlock(Blocks.BLUE_ICE::defaultBlockState, BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_ICE_WALL = registerBlock("blue_ice_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BLUE_ICE_BRICKS = registerBlock("blue_ice_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_ICE_TILES = registerBlock("blue_ice_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> BLUE_ICE_PILLAR = registerBlock("blue_ice_pillar",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CHISELED_BLUE_ICE = registerBlock("chiseled_blue_ice",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_BLUE_ICE_BRICKS = registerBlock("cracked_blue_ice_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> CRACKED_BLUE_ICE_TILES = registerBlock("cracked_blue_ice_tiles",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLUE_ICE).sound(SoundType.GLASS).requiresCorrectToolForDrops()));
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

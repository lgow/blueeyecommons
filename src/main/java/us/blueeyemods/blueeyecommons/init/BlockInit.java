package us.blueeyemods.blueeyecommons.init;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import us.blueeyemods.blueeyecommons.Main;
import us.blueeyemods.blueeyecommons.block.CrackableBlock;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;
import static net.minecraft.world.level.block.Blocks.BLUE_ICE;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

    public static final RegistryObject<Block> PACKED_SNOW, PACKED_SNOW_SLAB, PACKED_SNOW_STAIRS, PACKED_SNOW_WALL, PACKED_ICE_SLAB, PACKED_SNOW_BRICKS, PACKED_SNOW_BRICK_STAIRS, PACKED_SNOW_TILES, PACKED_SNOW_TILE_STAIRS, PACKED_SNOW_PILLAR, CHISELED_PACKED_SNOW, PACKED_ICE_WALL, PACKED_ICE_BRICKS, PACKED_ICE_TILES, PACKED_ICE_PILLAR, PACKED_ICE_STAIRS, CHISELED_PACKED_ICE, BLUE_ICE_SLAB, BLUE_ICE_STAIRS, BLUE_ICE_WALL, BLUE_ICE_BRICKS, BLUE_ICE_PILLAR, CHISELED_BLUE_ICE, CRACKED_PACKED_ICE_BRICKS, CRACKED_PACKED_ICE_TILES, CRACKED_BLUE_ICE_BRICKS, CRACKED_BLUE_ICE_TILES, BLUE_ICE_TILES;

    static {
        //PACKED SNOW
        PACKED_SNOW = registerBlock("packed_snow",
                () -> new Block(BlockBehaviour.Properties.copy(SNOW_BLOCK).strength(0.8f)));
        CHISELED_PACKED_SNOW = registerBlock("chiseled_packed_snow",
                () -> new Block(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_STAIRS = registerBlock("packed_snow_stairs",
                () -> new StairBlock(PACKED_SNOW.get()::defaultBlockState,
                        BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_SLAB = registerBlock("packed_snow_slab",
                () -> new SlabBlock(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_WALL = registerBlock("packed_snow_wall",
                () -> new WallBlock(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_BRICKS = registerBlock("packed_snow_bricks",
                () -> new Block(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_BRICK_STAIRS = registerBlock("packed_snow_brick_stairs",
                () -> new StairBlock(PACKED_SNOW_BRICKS.get()::defaultBlockState,
                        BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_TILES = registerBlock("packed_snow_tiles",
                () -> new Block(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_TILE_STAIRS = registerBlock("packed_snow_tile_stairs",
                () -> new StairBlock(PACKED_SNOW_TILES.get()::defaultBlockState,
                        BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_PILLAR = registerBlock("packed_snow_pillar",
                () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        //PACKED ICE
        CHISELED_PACKED_ICE = registerCopyBlock("chiseled_packed_ice", PACKED_ICE);
        PACKED_ICE_STAIRS = registerStairBlock("packed_ice_stairs", PACKED_ICE);
        PACKED_ICE_SLAB = registerSlabBlock("packed_ice_slab", PACKED_ICE);
        PACKED_ICE_WALL = registerWallBlock("packed_ice_wall", PACKED_ICE);
        PACKED_ICE_PILLAR = registerRotatedPillarBlock("packed_ice_pillar", PACKED_ICE);
        CRACKED_PACKED_ICE_BRICKS = registerCopyBlock("cracked_packed_ice_bricks", BLUE_ICE);
        PACKED_ICE_BRICKS = registerCrackableBlock("packed_ice_bricks", CRACKED_PACKED_ICE_BRICKS);
        CRACKED_PACKED_ICE_TILES = registerCopyBlock("cracked_packed_ice_tiles", BLUE_ICE);
        PACKED_ICE_TILES = registerCrackableBlock("packed_ice_tiles", CRACKED_PACKED_ICE_TILES);
        //BLUE ICE
        BLUE_ICE_SLAB = registerSlabBlock("blue_ice_slab", BLUE_ICE);
        BLUE_ICE_STAIRS = registerStairBlock("blue_ice_stairs", BLUE_ICE);
        BLUE_ICE_WALL = registerWallBlock("blue_ice_wall", BLUE_ICE);
        BLUE_ICE_PILLAR = registerCopyBlock("blue_ice_pillar", BLUE_ICE);
        CHISELED_BLUE_ICE = registerCopyBlock("chiseled_blue_ice", BLUE_ICE);
        CRACKED_BLUE_ICE_BRICKS = registerCopyBlock("cracked_blue_ice_bricks", BLUE_ICE);
        BLUE_ICE_BRICKS = registerCrackableBlock("blue_ice_bricks", CRACKED_BLUE_ICE_BRICKS);
        CRACKED_BLUE_ICE_TILES = registerCopyBlock("cracked_blue_ice_tiles", BLUE_ICE);
        BLUE_ICE_TILES = registerCrackableBlock("blue_ice_tiles", CRACKED_BLUE_ICE_TILES);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> sup) {
        RegistryObject<T> toReturn = BLOCKS.register(name, sup);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static RegistryObject<Block> registerCopyBlock(String name, Block block) {
        return registerBlock(name, () -> new Block(BlockBehaviour.Properties.copy(block)));
    }

    private static RegistryObject<Block> registerCrackableBlock(String name, RegistryObject<Block> block) {
        return registerBlock(name, () -> new CrackableBlocks(BlockBehaviour.Properties.copy(block.get()), block.get()));
    }

    private static RegistryObject<Block> registerStairBlock(String name, Block block) {
        return registerBlock(name,
                () -> new StairBlock(block::defaultBlockState, BlockBehaviour.Properties.copy(block)));
    }

    private static RegistryObject<Block> registerSlabBlock(String name, Block block) {
        return registerBlock(name, () -> new SlabBlock(BlockBehaviour.Properties.copy(block)));
    }

    private static RegistryObject<Block> registerWallBlock(String name, Block block) {
        return registerBlock(name, () -> new WallBlock(BlockBehaviour.Properties.copy(block)));
    }

    private static RegistryObject<Block> registerRotatedPillarBlock(String name, Block block) {
        return registerBlock(name, () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(block)));
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

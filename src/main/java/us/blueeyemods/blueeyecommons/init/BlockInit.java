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

    public static final DeferredRegister<Block> OVERWRITES = DeferredRegister.create(ForgeRegistries.BLOCKS, "minecraft");

    public static final RegistryObject<Block> PACKED_SNOW, PACKED_SNOW_SLAB, PACKED_SNOW_STAIRS, PACKED_SNOW_WALL,
            PACKED_ICE_SLAB, PACKED_SNOW_BRICKS, PACKED_SNOW_BRICK_STAIRS, PACKED_SNOW_TILES, PACKED_SNOW_TILE_STAIRS,
            PACKED_SNOW_PILLAR, CHISELED_PACKED_SNOW, PACKED_ICE_WALL, PACKED_ICE_BRICKS, PACKED_ICE_TILES, PACKED_ICE_PILLAR,
            PACKED_ICE_STAIRS, CHISELED_PACKED_ICE, BLUE_ICE_SLAB, BLUE_ICE_STAIRS, BLUE_ICE_WALL, BLUE_ICE_BRICKS,
            BLUE_ICE_PILLAR, CHISELED_BLUE_ICE, CRACKED_PACKED_ICE_BRICKS, CRACKED_PACKED_ICE_TILES, CRACKED_BLUE_ICE_BRICKS,
            CRACKED_BLUE_ICE_TILES, BLUE_ICE_TILES, STONE_BRICKS, INFESTED_STONE_BRICKS, DEEPSLATE_BRICKS, DEEPSLATE_TILES,
            NETHER_BRICKS, POLISHED_BLACKSTONE_BRICKS;

    static {
        // PACKED SNOW
        PACKED_SNOW = registerBlock("packed_snow", () ->
                new Block(BlockBehaviour.Properties.copy(SNOW_BLOCK)
                        .strength(0.8f)));
        CHISELED_PACKED_SNOW = registerBlock("chiseled_packed_snow", () ->
                new Block(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_STAIRS = registerBlock("packed_snow_stairs", () ->
                new StairBlock(PACKED_SNOW.get()::defaultBlockState,
                        BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_SLAB = registerBlock("packed_snow_slab", () ->
                new SlabBlock(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_WALL = registerBlock("packed_snow_wall", () ->
                new WallBlock(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_BRICKS = registerBlock("packed_snow_bricks", () ->
                new Block(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_BRICK_STAIRS = registerBlock("packed_snow_brick_stairs", () ->
                new StairBlock(PACKED_SNOW_BRICKS.get()::defaultBlockState,
                        BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_TILES = registerBlock("packed_snow_tiles", () ->
                new Block(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_TILE_STAIRS = registerBlock("packed_snow_tile_stairs", () ->
                new StairBlock(PACKED_SNOW_TILES.get()::defaultBlockState,
                        BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        PACKED_SNOW_PILLAR = registerBlock("packed_snow_pillar", () ->
                new RotatedPillarBlock(BlockBehaviour.Properties.copy(PACKED_SNOW.get())));
        // PACKED ICE
        CHISELED_PACKED_ICE = registerBlock("chiseled_packed_ice", () ->
                new Block(BlockBehaviour.Properties.copy(PACKED_ICE)));
        PACKED_ICE_STAIRS = registerBlock("packed_ice_stairs",() ->
                new StairBlock(PACKED_ICE::defaultBlockState,
                        BlockBehaviour.Properties.copy(PACKED_ICE)));
        PACKED_ICE_SLAB = registerBlock("packed_ice_slab", () ->
                new SlabBlock(BlockBehaviour.Properties.copy(PACKED_ICE)));
        PACKED_ICE_WALL = registerBlock("packed_ice_wall", () ->
                new WallBlock(BlockBehaviour.Properties.copy(PACKED_ICE)));
        PACKED_ICE_PILLAR = registerBlock("packed_ice_pillar", () ->
                new RotatedPillarBlock(BlockBehaviour.Properties.copy(PACKED_ICE)));
        CRACKED_PACKED_ICE_BRICKS = registerBlock("cracked_packed_ice_bricks", () ->
                new Block(BlockBehaviour.Properties.copy(PACKED_ICE)));
        PACKED_ICE_BRICKS = registerBlock("packed_ice_bricks", () ->
                new CrackableBlock(BlockBehaviour.Properties.copy(PACKED_ICE),
                        CRACKED_PACKED_ICE_BRICKS.get()));
        CRACKED_PACKED_ICE_TILES = registerBlock("cracked_packed_ice_tiles", () ->
                new Block(BlockBehaviour.Properties.copy(PACKED_ICE)));
        PACKED_ICE_TILES = registerBlock("packed_ice_tiles", () ->
                new CrackableBlock(BlockBehaviour.Properties.copy(PACKED_ICE),
                        CRACKED_PACKED_ICE_TILES.get()));
        // BLUE ICE
        BLUE_ICE_SLAB = registerBlock("blue_ice_slab", () ->
                new SlabBlock(BlockBehaviour.Properties.copy(BLUE_ICE)));
        BLUE_ICE_STAIRS = registerBlock("blue_ice_stairs", () ->
                new StairBlock(BLUE_ICE::defaultBlockState,
                        BlockBehaviour.Properties.copy(BLUE_ICE)));
        BLUE_ICE_WALL = registerBlock("blue_ice_wall", () ->
                new WallBlock(BlockBehaviour.Properties.copy(BLUE_ICE)));
        BLUE_ICE_PILLAR = registerBlock("blue_ice_pillar", () ->
                new RotatedPillarBlock(BlockBehaviour.Properties.copy(BLUE_ICE)));
        CHISELED_BLUE_ICE = registerBlock("chiseled_blue_ice", () ->
                new Block(BlockBehaviour.Properties.copy(BLUE_ICE)));
        CRACKED_BLUE_ICE_BRICKS = registerBlock("cracked_blue_ice_bricks", () ->
                new Block(BlockBehaviour.Properties.copy(BLUE_ICE)));
        BLUE_ICE_BRICKS = registerBlock("blue_ice_bricks", () ->
                new CrackableBlock(BlockBehaviour.Properties.copy(BLUE_ICE),
                        CRACKED_BLUE_ICE_BRICKS.get()));
        CRACKED_BLUE_ICE_TILES = registerBlock("cracked_blue_ice_tiles", () ->
                new Block(BlockBehaviour.Properties.copy(BLUE_ICE)));
        BLUE_ICE_TILES = registerBlock("blue_ice_tiles", () ->
                new CrackableBlock(BlockBehaviour.Properties.copy(BLUE_ICE),
                        CRACKED_BLUE_ICE_TILES.get()));
        // STONE
        STONE_BRICKS = overwriteBlock("stone_bricks", () ->
                new CrackableBlock(BlockBehaviour.Properties.of(Material.STONE)
                        .requiresCorrectToolForDrops().strength(1.5F, 6.0F),
                            CRACKED_STONE_BRICKS));
        INFESTED_STONE_BRICKS = overwriteBlock("infested_stone_bricks", () ->
                new CrackableBlock(BlockBehaviour.Properties.copy(CLAY)
                        .requiresCorrectToolForDrops(),
                            INFESTED_CRACKED_STONE_BRICKS));
        // DEEPSLATE
        DEEPSLATE_BRICKS = overwriteBlock("deepslate_bricks", () ->
                new CrackableBlock(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE)
                        .requiresCorrectToolForDrops(),
                            CRACKED_DEEPSLATE_BRICKS));
        DEEPSLATE_TILES = overwriteBlock("deepslate_tiles", () ->
                new CrackableBlock(BlockBehaviour.Properties.copy(COBBLED_DEEPSLATE)
                        .requiresCorrectToolForDrops(),
                            CRACKED_DEEPSLATE_TILES));
        // NETHER
        NETHER_BRICKS = overwriteBlock("nether_bricks", () ->
                new CrackableBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.NETHER)
                        .requiresCorrectToolForDrops().strength(2.0F, 6.0F)
                            .sound(SoundType.NETHER_BRICKS), CRACKED_NETHER_BRICKS));
        // BLACKSTONE
        POLISHED_BLACKSTONE_BRICKS = overwriteBlock("polished_blackstone_bricks", () ->
                new CrackableBlock(BlockBehaviour.Properties.copy(BLACKSTONE)
                        .requiresCorrectToolForDrops(),
                        CRACKED_POLISHED_BLACKSTONE_BRICKS));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> sup) {
        RegistryObject<T> toReturn = BLOCKS.register(name, sup);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<T> overwriteBlock(String name, Supplier<T> sup) {
        return OVERWRITES.register(name, sup);
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ItemInit.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        OVERWRITES.register(eventBus);
    }
}
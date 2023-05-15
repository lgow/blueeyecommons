package us.blueeyemods.blueeyecommons.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;
import us.blueeyemods.blueeyecommons.Main;
import us.blueeyemods.blueeyecommons.item.ModItems;

import java.util.function.Supplier;

import static net.minecraft.world.level.block.Blocks.*;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Main.MODID);

	public static final RegistryObject<Block> PACKED_SNOW, PACKED_SNOW_SLAB, PACKED_SNOW_STAIRS, PACKED_SNOW_WALL, PACKED_ICE_SLAB, PACKED_SNOW_BRICKS, PACKED_SNOW_BRICK_STAIRS, PACKED_SNOW_TILES, PACKED_SNOW_TILE_STAIRS, PACKED_SNOW_PILLAR, CHISELED_PACKED_SNOW, PACKED_ICE_WALL, PACKED_ICE_BRICKS, PACKED_ICE_TILES, PACKED_ICE_PILLAR, PACKED_ICE_STAIRS, CHISELED_PACKED_ICE, BLUE_ICE_SLAB, BLUE_ICE_STAIRS, BLUE_ICE_WALL, BLUE_ICE_BRICKS, BLUE_ICE_PILLAR, CHISELED_BLUE_ICE, CRACKED_PACKED_ICE_BRICKS, CRACKED_PACKED_ICE_TILES, CRACKED_BLUE_ICE_BRICKS, CRACKED_BLUE_ICE_TILES, BLUE_ICE_TILES, BLACK_PURPUR, BLACK_PURPUR_PILLAR, CHISELED_BLACK_PURPUR, SMOOTH_BLACK_PURPUR, BLACK_PURPUR_TILES, BLUE_PURPUR, BLUE_PURPUR_PILLAR, CHISELED_BLUE_PURPUR, SMOOTH_BLUE_PURPUR, BLUE_PURPUR_TILES, BROWN_PURPUR, BROWN_PURPUR_PILLAR, CHISELED_BROWN_PURPUR, SMOOTH_BROWN_PURPUR, BROWN_PURPUR_TILES, CYAN_PURPUR, CYAN_PURPUR_PILLAR, CHISELED_CYAN_PURPUR, SMOOTH_CYAN_PURPUR, CYAN_PURPUR_TILES, GRAY_PURPUR, GRAY_PURPUR_PILLAR, CHISELED_GRAY_PURPUR, SMOOTH_GRAY_PURPUR, GRAY_PURPUR_TILES, GREEN_PURPUR, GREEN_PURPUR_PILLAR, CHISELED_GREEN_PURPUR, SMOOTH_GREEN_PURPUR, GREEN_PURPUR_TILES, LIGHT_BLUE_PURPUR, LIGHT_BLUE_PURPUR_PILLAR, CHISELED_LIGHT_BLUE_PURPUR, SMOOTH_LIGHT_BLUE_PURPUR, LIGHT_BLUE_PURPUR_TILES, LIGHT_GRAY_PURPUR, LIGHT_GRAY_PURPUR_PILLAR, CHISELED_LIGHT_GRAY_PURPUR, SMOOTH_LIGHT_GRAY_PURPUR, LIGHT_GRAY_PURPUR_TILES, LIME_PURPUR, LIME_PURPUR_PILLAR, CHISELED_LIME_PURPUR, SMOOTH_LIME_PURPUR, LIME_PURPUR_TILES, MAGENTA_PURPUR, MAGENTA_PURPUR_PILLAR, CHISELED_MAGENTA_PURPUR, SMOOTH_MAGENTA_PURPUR, MAGENTA_PURPUR_TILES, ORANGE_PURPUR, ORANGE_PURPUR_PILLAR, CHISELED_ORANGE_PURPUR, SMOOTH_ORANGE_PURPUR, ORANGE_PURPUR_TILES, PINK_PURPUR, PINK_PURPUR_PILLAR, CHISELED_PINK_PURPUR, SMOOTH_PINK_PURPUR, PINK_PURPUR_TILES, PURPLE_PURPUR, PURPLE_PURPUR_PILLAR, CHISELED_PURPLE_PURPUR, SMOOTH_PURPLE_PURPUR, PURPLE_PURPUR_TILES, RED_PURPUR, RED_PURPUR_PILLAR, CHISELED_RED_PURPUR, SMOOTH_RED_PURPUR, RED_PURPUR_TILES, WHITE_PURPUR, WHITE_PURPUR_PILLAR, CHISELED_WHITE_PURPUR, SMOOTH_WHITE_PURPUR, WHITE_PURPUR_TILES, YELLOW_PURPUR, YELLOW_PURPUR_PILLAR, CHISELED_YELLOW_PURPUR, SMOOTH_YELLOW_PURPUR, YELLOW_PURPUR_TILES, CHISELED_POLISHED_ANDESITE, POLISHED_ANDESITE_BRICKS, POLISHED_ANDESITE_TILES, CHISELED_END_STONE, SMOOTH_END_STONE, CHISELED_PURPUR, SMOOTH_PURPUR;

	static {
		//PACKED SNOW
		PACKED_SNOW = registerBlock("packed_snow", () -> new Block(getPackedSnowProperties()));
		CHISELED_PACKED_SNOW = registerBlock("packed_snow_chiseled", () -> new Block(getPackedSnowProperties()));
		PACKED_SNOW_STAIRS = registerBlock("packed_snow_stairs",
				() -> new StairBlock(PACKED_SNOW.get()::defaultBlockState, getPackedSnowProperties()));
		PACKED_SNOW_SLAB = registerBlock("packed_snow_slab", () -> new SlabBlock(getPackedSnowProperties()));
		PACKED_SNOW_WALL = registerBlock("packed_snow_wall", () -> new WallBlock(getPackedSnowProperties()));
		PACKED_SNOW_BRICKS = registerBlock("packed_snow_bricks", () -> new Block(getPackedSnowProperties()));
		PACKED_SNOW_BRICK_STAIRS = registerBlock("packed_snow_brick_stairs",
				() -> new StairBlock(PACKED_SNOW_BRICKS.get()::defaultBlockState, getPackedSnowProperties()));
		PACKED_SNOW_TILES = registerBlock("packed_snow_tiles", () -> new Block(getPackedSnowProperties()));
		PACKED_SNOW_TILE_STAIRS = registerBlock("packed_snow_tile_stairs",
				() -> new StairBlock(PACKED_SNOW_TILES.get()::defaultBlockState, getPackedSnowProperties()));
		PACKED_SNOW_PILLAR = registerBlock("packed_snow_pillar",
				() -> new RotatedPillarBlock(getPackedSnowProperties()));
		//PACKED ICE
		CHISELED_PACKED_ICE = registerCopyBlock("packed_ice_chiseled", PACKED_ICE);
		PACKED_ICE_STAIRS = registerStairBlock("packed_ice_stairs", PACKED_ICE);
		PACKED_ICE_SLAB = registerSlabBlock("packed_ice_slab", PACKED_ICE);
		PACKED_ICE_WALL = registerWallBlock("packed_ice_wall", PACKED_ICE);
		PACKED_ICE_PILLAR = registerRotatedPillarBlock("packed_ice_pillar", PACKED_ICE);
		CRACKED_PACKED_ICE_BRICKS = registerCopyBlock("packed_ice_bricks_cracked", BLUE_ICE);
		PACKED_ICE_BRICKS = registerCrackableBlock("packed_ice_bricks", CRACKED_PACKED_ICE_BRICKS);
		CRACKED_PACKED_ICE_TILES = registerCopyBlock("packed_ice_tiles_cracked", BLUE_ICE);
		PACKED_ICE_TILES = registerCrackableBlock("packed_ice_tiles", CRACKED_PACKED_ICE_TILES);
		//BLUE ICE
		BLUE_ICE_SLAB = registerSlabBlock("blue_ice_slab", BLUE_ICE);
		BLUE_ICE_STAIRS = registerStairBlock("blue_ice_stairs", BLUE_ICE);
		BLUE_ICE_WALL = registerWallBlock("blue_ice_wall", BLUE_ICE);
		BLUE_ICE_PILLAR = registerRotatedPillarBlock("blue_ice_pillar", BLUE_ICE);
		CHISELED_BLUE_ICE = registerCopyBlock("blue_ice_chiseled", BLUE_ICE);
		CRACKED_BLUE_ICE_BRICKS = registerCopyBlock("blue_ice_bricks_cracked", BLUE_ICE);
		BLUE_ICE_BRICKS = registerCrackableBlock("blue_ice_bricks", CRACKED_BLUE_ICE_BRICKS);
		CRACKED_BLUE_ICE_TILES = registerCopyBlock("blue_ice_tiles_cracked", BLUE_ICE);
		BLUE_ICE_TILES = registerCrackableBlock("blue_ice_tiles", CRACKED_BLUE_ICE_TILES);
		//POLISHED ANDESITE
		CHISELED_POLISHED_ANDESITE = registerCopyBlock("polished_andesite_chiseled", POLISHED_ANDESITE);
		POLISHED_ANDESITE_BRICKS = registerCopyBlock("polished_andesite_bricks", POLISHED_ANDESITE);
		POLISHED_ANDESITE_TILES = registerCopyBlock("polished_andesite_tiles", POLISHED_ANDESITE);
		//POLISHED ENDSTONE
		CHISELED_END_STONE = registerCopyBlock("end_stone_chiseled", END_STONE);
		SMOOTH_END_STONE = registerCopyBlock("end_stone_smooth", END_STONE);
		//PURPUR
		CHISELED_PURPUR = registerCopyBlock("purpur_chiseled", PURPUR_BLOCK);
		SMOOTH_PURPUR = registerCopyBlock("purpur_smooth", PURPUR_BLOCK);
		//BLACK PURPUR
		BLACK_PURPUR = registerPurpurBlock("black_purpur");
		BLACK_PURPUR_PILLAR = registerRotatedPillarBlock("black_purpur_pillar", PURPUR_BLOCK);
		CHISELED_BLACK_PURPUR = registerPurpurBlock("black_purpur_chiseled");
		SMOOTH_BLACK_PURPUR = registerPurpurBlock("black_purpur_smooth");
		BLACK_PURPUR_TILES = registerPurpurBlock("black_purpur_tiles");
		//BLUE PURPUR
		BLUE_PURPUR = registerPurpurBlock("blue_purpur");
		BLUE_PURPUR_PILLAR = registerRotatedPillarBlock("blue_purpur_pillar", PURPUR_BLOCK);
		CHISELED_BLUE_PURPUR = registerPurpurBlock("blue_purpur_chiseled");
		SMOOTH_BLUE_PURPUR = registerPurpurBlock("blue_purpur_smooth");
		BLUE_PURPUR_TILES = registerPurpurBlock("blue_purpur_tiles");
		//BROWN PURPUR
		BROWN_PURPUR = registerPurpurBlock("brown_purpur");
		BROWN_PURPUR_PILLAR = registerRotatedPillarBlock("brown_purpur_pillar", PURPUR_BLOCK);
		CHISELED_BROWN_PURPUR = registerPurpurBlock("brown_purpur_chiseled");
		SMOOTH_BROWN_PURPUR = registerPurpurBlock("brown_purpur_smooth");
		BROWN_PURPUR_TILES = registerPurpurBlock("brown_purpur_tiles");
		//CYAN PURPUR
		CYAN_PURPUR = registerPurpurBlock("cyan_purpur");
		CYAN_PURPUR_PILLAR = registerRotatedPillarBlock("cyan_purpur_pillar", PURPUR_BLOCK);
		CHISELED_CYAN_PURPUR = registerPurpurBlock("cyan_purpur_chiseled");
		SMOOTH_CYAN_PURPUR = registerPurpurBlock("cyan_purpur_smooth");
		CYAN_PURPUR_TILES = registerPurpurBlock("cyan_purpur_tiles");
		//GRAY PURPUR
		GRAY_PURPUR = registerPurpurBlock("gray_purpur");
		GRAY_PURPUR_PILLAR = registerRotatedPillarBlock("gray_purpur_pillar", PURPUR_BLOCK);
		CHISELED_GRAY_PURPUR = registerPurpurBlock("gray_purpur_chiseled");
		SMOOTH_GRAY_PURPUR = registerPurpurBlock("gray_purpur_smooth");
		GRAY_PURPUR_TILES = registerPurpurBlock("gray_purpur_tiles");
		//GREEN PURPUR
		GREEN_PURPUR = registerPurpurBlock("green_purpur");
		GREEN_PURPUR_PILLAR = registerRotatedPillarBlock("green_purpur_pillar", PURPUR_BLOCK);
		CHISELED_GREEN_PURPUR = registerPurpurBlock("green_purpur_chiseled");
		SMOOTH_GREEN_PURPUR = registerPurpurBlock("green_purpur_smooth");
		GREEN_PURPUR_TILES = registerPurpurBlock("green_purpur_tiles");
		//LIGHT_BLUE PURPUR
		LIGHT_BLUE_PURPUR = registerPurpurBlock("light_blue_purpur");
		LIGHT_BLUE_PURPUR_PILLAR = registerRotatedPillarBlock("light_blue_purpur_pillar", PURPUR_BLOCK);
		CHISELED_LIGHT_BLUE_PURPUR = registerPurpurBlock("light_blue_purpur_chiseled");
		SMOOTH_LIGHT_BLUE_PURPUR = registerPurpurBlock("light_blue_purpur_smooth");
		LIGHT_BLUE_PURPUR_TILES = registerPurpurBlock("light_blue_purpur_tiles");
		//LIGHT_GRAY PURPUR
		LIGHT_GRAY_PURPUR = registerPurpurBlock("light_gray_purpur");
		LIGHT_GRAY_PURPUR_PILLAR = registerRotatedPillarBlock("light_gray_purpur_pillar", PURPUR_BLOCK);
		CHISELED_LIGHT_GRAY_PURPUR = registerPurpurBlock("light_gray_purpur_chiseled");
		SMOOTH_LIGHT_GRAY_PURPUR = registerPurpurBlock("light_gray_purpur_smooth");
		LIGHT_GRAY_PURPUR_TILES = registerPurpurBlock("light_gray_purpur_tiles");
		//LIME PURPUR
		LIME_PURPUR = registerPurpurBlock("lime_purpur");
		LIME_PURPUR_PILLAR = registerRotatedPillarBlock("lime_purpur_pillar", PURPUR_BLOCK);
		CHISELED_LIME_PURPUR = registerPurpurBlock("lime_purpur_chiseled");
		SMOOTH_LIME_PURPUR = registerPurpurBlock("lime_purpur_smooth");
		LIME_PURPUR_TILES = registerPurpurBlock("lime_purpur_tiles");
		//MAGENTA PURPUR
		MAGENTA_PURPUR = registerPurpurBlock("magenta_purpur");
		MAGENTA_PURPUR_PILLAR = registerRotatedPillarBlock("magenta_purpur_pillar", PURPUR_BLOCK);
		CHISELED_MAGENTA_PURPUR = registerPurpurBlock("magenta_purpur_chiseled");
		SMOOTH_MAGENTA_PURPUR = registerPurpurBlock("magenta_purpur_smooth");
		MAGENTA_PURPUR_TILES = registerPurpurBlock("magenta_purpur_tiles");
		//ORANGE PURPUR
		ORANGE_PURPUR = registerPurpurBlock("orange_purpur");
		ORANGE_PURPUR_PILLAR = registerRotatedPillarBlock("orange_purpur_pillar", PURPUR_BLOCK);
		CHISELED_ORANGE_PURPUR = registerPurpurBlock("orange_purpur_chiseled");
		SMOOTH_ORANGE_PURPUR = registerPurpurBlock("orange_purpur_smooth");
		ORANGE_PURPUR_TILES = registerPurpurBlock("orange_purpur_tiles");
		//PINK PURPUR
		PINK_PURPUR = registerPurpurBlock("pink_purpur");
		PINK_PURPUR_PILLAR = registerRotatedPillarBlock("pink_purpur_pillar", PURPUR_BLOCK);
		CHISELED_PINK_PURPUR = registerPurpurBlock("pink_purpur_chiseled");
		SMOOTH_PINK_PURPUR = registerPurpurBlock("pink_purpur_smooth");
		PINK_PURPUR_TILES = registerPurpurBlock("pink_purpur_tiles");
		//PURPLE PURPUR
		PURPLE_PURPUR = registerPurpurBlock("purple_purpur");
		PURPLE_PURPUR_PILLAR = registerRotatedPillarBlock("purple_purpur_pillar", PURPUR_BLOCK);
		CHISELED_PURPLE_PURPUR = registerPurpurBlock("purple_purpur_chiseled");
		SMOOTH_PURPLE_PURPUR = registerPurpurBlock("purple_purpur_smooth");
		PURPLE_PURPUR_TILES = registerPurpurBlock("purple_purpur_tiles");
		//RED PURPUR
		RED_PURPUR = registerPurpurBlock("red_purpur");
		RED_PURPUR_PILLAR = registerRotatedPillarBlock("red_purpur_pillar", PURPUR_BLOCK);
		CHISELED_RED_PURPUR = registerPurpurBlock("red_purpur_chiseled");
		SMOOTH_RED_PURPUR = registerPurpurBlock("red_purpur_smooth");
		RED_PURPUR_TILES = registerPurpurBlock("red_purpur_tiles");
		//WHITE PURPUR
		WHITE_PURPUR = registerPurpurBlock("white_purpur");
		WHITE_PURPUR_PILLAR = registerRotatedPillarBlock("white_purpur_pillar", PURPUR_BLOCK);
		CHISELED_WHITE_PURPUR = registerPurpurBlock("white_purpur_chiseled");
		SMOOTH_WHITE_PURPUR = registerPurpurBlock("white_purpur_smooth");
		WHITE_PURPUR_TILES = registerPurpurBlock("white_purpur_tiles");
		//YELLOW PURPUR
		YELLOW_PURPUR = registerPurpurBlock("yellow_purpur");
		YELLOW_PURPUR_PILLAR = registerRotatedPillarBlock("yellow_purpur_pillar", PURPUR_BLOCK);
		CHISELED_YELLOW_PURPUR = registerPurpurBlock("yellow_purpur_chiseled");
		SMOOTH_YELLOW_PURPUR = registerPurpurBlock("yellow_purpur_smooth");
		YELLOW_PURPUR_TILES = registerPurpurBlock("yellow_purpur_tiles");
	}

	@NotNull
	private static BlockBehaviour.Properties getPackedSnowProperties() {
		return BlockBehaviour.Properties.copy(SNOW_BLOCK).strength(0.8f);
	}

	private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> sup) {
		RegistryObject<T> toReturn = BLOCKS.register(name, sup);
		registerBlockItem(name, toReturn);
		return toReturn;
	}

	private static RegistryObject<Block> registerCopyBlock(String name, Block block) {
		return registerBlock(name, () -> new Block(BlockBehaviour.Properties.copy(block)));
	}

	private static RegistryObject<Block> registerPurpurBlock(String name) {
		return registerBlock(name, () -> new Block(BlockBehaviour.Properties.copy(PURPUR_BLOCK)));
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

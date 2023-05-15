package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import us.blueeyemods.blueeyecommons.Main;

import static us.blueeyemods.blueeyecommons.block.ModBlocks.*;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, Main.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		blockWithItem(BLACK_PURPUR);
		blockWithItem(CHISELED_BLACK_PURPUR);
		blockWithItem(SMOOTH_BLACK_PURPUR);
		blockWithItem(BLACK_PURPUR_TILES);
		blockWithItem(BLUE_PURPUR);
		blockWithItem(CHISELED_BLUE_PURPUR);
		blockWithItem(SMOOTH_BLUE_PURPUR);
		blockWithItem(BLUE_PURPUR_TILES);
		blockWithItem(BROWN_PURPUR);
		blockWithItem(CHISELED_BROWN_PURPUR);
		blockWithItem(SMOOTH_BROWN_PURPUR);
		blockWithItem(BROWN_PURPUR_TILES);
		blockWithItem(CYAN_PURPUR);
		blockWithItem(CHISELED_CYAN_PURPUR);
		blockWithItem(SMOOTH_CYAN_PURPUR);
		blockWithItem(CYAN_PURPUR_TILES);
		blockWithItem(GRAY_PURPUR);
		blockWithItem(CHISELED_GRAY_PURPUR);
		blockWithItem(SMOOTH_GRAY_PURPUR);
		blockWithItem(GRAY_PURPUR_TILES);
		blockWithItem(GREEN_PURPUR);
		blockWithItem(CHISELED_GREEN_PURPUR);
		blockWithItem(SMOOTH_GREEN_PURPUR);
		blockWithItem(GREEN_PURPUR_TILES);
		blockWithItem(LIGHT_BLUE_PURPUR);
		blockWithItem(CHISELED_LIGHT_BLUE_PURPUR);
		blockWithItem(SMOOTH_LIGHT_BLUE_PURPUR);
		blockWithItem(LIGHT_BLUE_PURPUR_TILES);
		blockWithItem(LIGHT_GRAY_PURPUR);
		blockWithItem(CHISELED_LIGHT_GRAY_PURPUR);
		blockWithItem(SMOOTH_LIGHT_GRAY_PURPUR);
		blockWithItem(LIGHT_GRAY_PURPUR_TILES);
		blockWithItem(LIME_PURPUR);
		blockWithItem(CHISELED_LIME_PURPUR);
		blockWithItem(SMOOTH_LIME_PURPUR);
		blockWithItem(LIME_PURPUR_TILES);
		blockWithItem(MAGENTA_PURPUR);
		blockWithItem(CHISELED_MAGENTA_PURPUR);
		blockWithItem(SMOOTH_MAGENTA_PURPUR);
		blockWithItem(MAGENTA_PURPUR_TILES);
		blockWithItem(ORANGE_PURPUR);
		blockWithItem(CHISELED_ORANGE_PURPUR);
		blockWithItem(SMOOTH_ORANGE_PURPUR);
		blockWithItem(ORANGE_PURPUR_TILES);
		blockWithItem(PINK_PURPUR);
		blockWithItem(CHISELED_PINK_PURPUR);
		blockWithItem(SMOOTH_PINK_PURPUR);
		blockWithItem(PINK_PURPUR_TILES);
		blockWithItem(PURPLE_PURPUR);
		blockWithItem(CHISELED_PURPLE_PURPUR);
		blockWithItem(SMOOTH_PURPLE_PURPUR);
		blockWithItem(PURPLE_PURPUR_TILES);
		blockWithItem(RED_PURPUR);
		blockWithItem(CHISELED_RED_PURPUR);
		blockWithItem(SMOOTH_RED_PURPUR);
		blockWithItem(RED_PURPUR_TILES);
		blockWithItem(WHITE_PURPUR);
		blockWithItem(CHISELED_WHITE_PURPUR);
		blockWithItem(SMOOTH_WHITE_PURPUR);
		blockWithItem(WHITE_PURPUR_TILES);
		blockWithItem(YELLOW_PURPUR);
		blockWithItem(CHISELED_YELLOW_PURPUR);
		blockWithItem(SMOOTH_YELLOW_PURPUR);
		blockWithItem(YELLOW_PURPUR_TILES);
		blockWithItem(CHISELED_POLISHED_ANDESITE);
		blockWithItem(POLISHED_ANDESITE_BRICKS);
		blockWithItem(POLISHED_ANDESITE_TILES);
		blockWithItem(CHISELED_END_STONE);
		blockWithItem(SMOOTH_END_STONE);
		blockWithItem(CHISELED_PURPUR);
		blockWithItem(SMOOTH_PURPUR);
		blockWithItem(PACKED_SNOW);
		blockWithItem(PACKED_SNOW_BRICKS);
		blockWithItem(PACKED_SNOW_TILES);
		blockWithItem(CHISELED_PACKED_SNOW);
		blockWithItem(PACKED_ICE_BRICKS);
		blockWithItem(PACKED_ICE_TILES);
		blockWithItem(CRACKED_PACKED_ICE_BRICKS);
		blockWithItem(CRACKED_PACKED_ICE_TILES);
		blockWithItem(CHISELED_PACKED_ICE);
		blockWithItem(BLUE_ICE_BRICKS);
		blockWithItem(BLUE_ICE_TILES);
		blockWithItem(CRACKED_BLUE_ICE_BRICKS);
		blockWithItem(CRACKED_BLUE_ICE_TILES);
		blockWithItem(CHISELED_BLUE_ICE);
		pillarBlock(BLACK_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/black_purpur_pillar"));
		pillarBlock(BLUE_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/blue_purpur_pillar"));
		pillarBlock(BROWN_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/brown_purpur_pillar"));
		pillarBlock(CYAN_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/cyan_purpur_pillar"));
		pillarBlock(GRAY_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/gray_purpur_pillar"));
		pillarBlock(GREEN_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/green_purpur_pillar"));
		pillarBlock(LIGHT_BLUE_PURPUR_PILLAR.get(),
				new ResourceLocation(Main.MODID + ":block/light_blue_purpur_pillar"));
		pillarBlock(LIGHT_GRAY_PURPUR_PILLAR.get(),
				new ResourceLocation(Main.MODID + ":block/light_gray_purpur_pillar"));
		pillarBlock(LIME_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/lime_purpur_pillar"));
		pillarBlock(MAGENTA_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/magenta_purpur_pillar"));
		pillarBlock(ORANGE_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/orange_purpur_pillar"));
		pillarBlock(PINK_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/pink_purpur_pillar"));
		pillarBlock(PURPLE_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/purple_purpur_pillar"));
		pillarBlock(RED_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/red_purpur_pillar"));
		pillarBlock(WHITE_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/white_purpur_pillar"));
		pillarBlock(YELLOW_PURPUR_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/yellow_purpur_pillar"));
		pillarBlock(PACKED_SNOW_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/packed_snow_pillar"));
		pillarBlock(PACKED_ICE_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/packed_ice_pillar"));
		pillarBlock(BLUE_ICE_PILLAR.get(), new ResourceLocation(Main.MODID + ":block/blue_ice_pillar"));
		halfBlock(PACKED_ICE_SLAB.get(), new ResourceLocation("minecraft:block/packed_ice"));
		halfBlock(BLUE_ICE_SLAB.get(), new ResourceLocation("minecraft:block/blue_ice"));
		halfBlock(PACKED_SNOW_SLAB.get(), new ResourceLocation(Main.MODID + ":block/packed_snow"));
		stairsBlock(PACKED_ICE_STAIRS.get(), new ResourceLocation("minecraft:block/packed_ice"));
		stairsBlock(BLUE_ICE_STAIRS.get(), new ResourceLocation("minecraft:block/blue_ice"));
		stairsBlock(PACKED_SNOW_STAIRS.get(), new ResourceLocation(Main.MODID + ":block/packed_snow"));
		stairsBlock(PACKED_SNOW_BRICK_STAIRS.get(), new ResourceLocation(Main.MODID + ":block/packed_snow_bricks"));
		stairsBlock(PACKED_SNOW_TILE_STAIRS.get(), new ResourceLocation(Main.MODID + ":block/packed_snow_tiles"));
		wallBlockWithItem(PACKED_SNOW_WALL.get(), new ResourceLocation(Main.MODID + ":block/packed_snow"),
				"packed_snow_wall_inventory");
		wallBlockWithItem(PACKED_ICE_WALL.get(), new ResourceLocation("minecraft:block/packed_ice"),
				"packed_ice_wall_inventory");
		wallBlockWithItem(BLUE_ICE_WALL.get(), new ResourceLocation("minecraft:block/blue_ice"),
				"blue_ice_wall_inventory");
	}

	private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
		simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
	}

	private void wallBlockWithItem(Block block, ResourceLocation texture, String wallInvName) {
		models().wallInventory(wallInvName, texture);
		wallBlock((WallBlock) block, texture);
		simpleBlockItem(block, models().getExistingFile(new ResourceLocation(Main.MODID, "block/" + wallInvName)));
	}

	private void pillarBlock(Block block, ResourceLocation texture) {
		axisBlock((RotatedPillarBlock) block, texture, new ResourceLocation(texture + "_top"));
	}

	private void halfBlock(Block block, ResourceLocation texture) {
		slabBlock((SlabBlock) block, texture, texture);
	}

	private void stairsBlock(Block block, ResourceLocation texture) {
		stairsBlock((StairBlock) block, texture);
	}
}
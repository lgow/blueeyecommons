package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

import static us.blueeyemods.blueeyecommons.block.ModBlocks.*;

public class ModBlockLootTables extends BlockLootSubProvider {
	public ModBlockLootTables() {
		super(Set.of(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		dropWhenSilkTouch(PACKED_SNOW.get());
		dropWhenSilkTouch(PACKED_SNOW_SLAB.get());
		dropWhenSilkTouch(PACKED_SNOW_STAIRS.get());
		dropWhenSilkTouch(PACKED_SNOW_BRICKS.get());
		dropWhenSilkTouch(PACKED_SNOW_TILES.get());
		dropWhenSilkTouch(PACKED_SNOW_PILLAR.get());
		dropWhenSilkTouch(CHISELED_PACKED_SNOW.get());
		dropWhenSilkTouch(PACKED_SNOW_WALL.get());
		dropWhenSilkTouch(PACKED_SNOW_BRICK_STAIRS.get());
		dropWhenSilkTouch(PACKED_SNOW_TILE_STAIRS.get());
		dropWhenSilkTouch(PACKED_ICE_BRICKS.get());
		dropWhenSilkTouch(PACKED_ICE_TILES.get());
		dropWhenSilkTouch(CRACKED_PACKED_ICE_BRICKS.get());
		dropWhenSilkTouch(CRACKED_PACKED_ICE_TILES.get());
		dropWhenSilkTouch(PACKED_ICE_PILLAR.get());
		dropWhenSilkTouch(CHISELED_PACKED_ICE.get());
		dropWhenSilkTouch(BLUE_ICE_BRICKS.get());
		dropWhenSilkTouch(BLUE_ICE_TILES.get());
		dropWhenSilkTouch(CRACKED_BLUE_ICE_BRICKS.get());
		dropWhenSilkTouch(CRACKED_BLUE_ICE_TILES.get());
		dropWhenSilkTouch(BLUE_ICE_PILLAR.get());
		dropWhenSilkTouch(CHISELED_BLUE_ICE.get());
		dropWhenSilkTouch(PACKED_ICE_SLAB.get());
		dropWhenSilkTouch(BLUE_ICE_SLAB.get());
		dropWhenSilkTouch(BLUE_ICE_STAIRS.get());
		dropWhenSilkTouch(PACKED_ICE_SLAB.get());
		dropWhenSilkTouch(PACKED_ICE_STAIRS.get());
		dropWhenSilkTouch(BLUE_ICE_WALL.get());
		dropWhenSilkTouch(PACKED_ICE_WALL.get());
		dropSelf(BLACK_PURPUR.get());
		dropSelf(BLACK_PURPUR_PILLAR.get());
		dropSelf(CHISELED_BLACK_PURPUR.get());
		dropSelf(SMOOTH_BLACK_PURPUR.get());
		dropSelf(BLACK_PURPUR_TILES.get());
		dropSelf(BLUE_PURPUR.get());
		dropSelf(BLUE_PURPUR_PILLAR.get());
		dropSelf(CHISELED_BLUE_PURPUR.get());
		dropSelf(SMOOTH_BLUE_PURPUR.get());
		dropSelf(BLUE_PURPUR_TILES.get());
		dropSelf(BROWN_PURPUR.get());
		dropSelf(BROWN_PURPUR_PILLAR.get());
		dropSelf(CHISELED_BROWN_PURPUR.get());
		dropSelf(SMOOTH_BROWN_PURPUR.get());
		dropSelf(BROWN_PURPUR_TILES.get());
		dropSelf(CYAN_PURPUR.get());
		dropSelf(CYAN_PURPUR_PILLAR.get());
		dropSelf(CHISELED_CYAN_PURPUR.get());
		dropSelf(SMOOTH_CYAN_PURPUR.get());
		dropSelf(CYAN_PURPUR_TILES.get());
		dropSelf(GRAY_PURPUR.get());
		dropSelf(GRAY_PURPUR_PILLAR.get());
		dropSelf(CHISELED_GRAY_PURPUR.get());
		dropSelf(SMOOTH_GRAY_PURPUR.get());
		dropSelf(GRAY_PURPUR_TILES.get());
		dropSelf(GREEN_PURPUR.get());
		dropSelf(GREEN_PURPUR_PILLAR.get());
		dropSelf(CHISELED_GREEN_PURPUR.get());
		dropSelf(SMOOTH_GREEN_PURPUR.get());
		dropSelf(GREEN_PURPUR_TILES.get());
		dropSelf(LIGHT_BLUE_PURPUR.get());
		dropSelf(LIGHT_BLUE_PURPUR_PILLAR.get());
		dropSelf(CHISELED_LIGHT_BLUE_PURPUR.get());
		dropSelf(SMOOTH_LIGHT_BLUE_PURPUR.get());
		dropSelf(LIGHT_BLUE_PURPUR_TILES.get());
		dropSelf(LIGHT_GRAY_PURPUR.get());
		dropSelf(LIGHT_GRAY_PURPUR_PILLAR.get());
		dropSelf(CHISELED_LIGHT_GRAY_PURPUR.get());
		dropSelf(SMOOTH_LIGHT_GRAY_PURPUR.get());
		dropSelf(LIGHT_GRAY_PURPUR_TILES.get());
		dropSelf(LIME_PURPUR.get());
		dropSelf(LIME_PURPUR_PILLAR.get());
		dropSelf(CHISELED_LIME_PURPUR.get());
		dropSelf(SMOOTH_LIME_PURPUR.get());
		dropSelf(LIME_PURPUR_TILES.get());
		dropSelf(MAGENTA_PURPUR.get());
		dropSelf(MAGENTA_PURPUR_PILLAR.get());
		dropSelf(CHISELED_MAGENTA_PURPUR.get());
		dropSelf(SMOOTH_MAGENTA_PURPUR.get());
		dropSelf(MAGENTA_PURPUR_TILES.get());
		dropSelf(ORANGE_PURPUR.get());
		dropSelf(ORANGE_PURPUR_PILLAR.get());
		dropSelf(CHISELED_ORANGE_PURPUR.get());
		dropSelf(SMOOTH_ORANGE_PURPUR.get());
		dropSelf(ORANGE_PURPUR_TILES.get());
		dropSelf(PINK_PURPUR.get());
		dropSelf(PINK_PURPUR_PILLAR.get());
		dropSelf(CHISELED_PINK_PURPUR.get());
		dropSelf(SMOOTH_PINK_PURPUR.get());
		dropSelf(PINK_PURPUR_TILES.get());
		dropSelf(PURPLE_PURPUR.get());
		dropSelf(PURPLE_PURPUR_PILLAR.get());
		dropSelf(CHISELED_PURPLE_PURPUR.get());
		dropSelf(SMOOTH_PURPLE_PURPUR.get());
		dropSelf(PURPLE_PURPUR_TILES.get());
		dropSelf(RED_PURPUR.get());
		dropSelf(RED_PURPUR_PILLAR.get());
		dropSelf(CHISELED_RED_PURPUR.get());
		dropSelf(SMOOTH_RED_PURPUR.get());
		dropSelf(RED_PURPUR_TILES.get());
		dropSelf(WHITE_PURPUR.get());
		dropSelf(WHITE_PURPUR_PILLAR.get());
		dropSelf(CHISELED_WHITE_PURPUR.get());
		dropSelf(SMOOTH_WHITE_PURPUR.get());
		dropSelf(WHITE_PURPUR_TILES.get());
		dropSelf(YELLOW_PURPUR.get());
		dropSelf(YELLOW_PURPUR_PILLAR.get());
		dropSelf(CHISELED_YELLOW_PURPUR.get());
		dropSelf(SMOOTH_YELLOW_PURPUR.get());
		dropSelf(YELLOW_PURPUR_TILES.get());
		dropSelf(CHISELED_POLISHED_ANDESITE.get());
		dropSelf(POLISHED_ANDESITE_BRICKS.get());
		dropSelf(POLISHED_ANDESITE_TILES.get());
		dropSelf(CHISELED_END_STONE.get());
		dropSelf(SMOOTH_END_STONE.get());
		dropSelf(CHISELED_PURPUR.get());
		dropSelf(SMOOTH_PURPUR.get());
	}

	@Override
	protected Iterable<Block> getKnownBlocks() {
		return BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
	}
}

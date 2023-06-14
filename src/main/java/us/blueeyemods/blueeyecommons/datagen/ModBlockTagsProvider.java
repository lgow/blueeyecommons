package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

import static us.blueeyemods.blueeyecommons.block.ModBlocks.*;

public class ModBlockTagsProvider extends BlockTagsProvider {
	public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, modId, existingFileHelper);
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		this.tag(BlockTags.MINEABLE_WITH_SHOVEL)//
				.add(PACKED_SNOW.get(), PACKED_SNOW_BRICKS.get(), PACKED_SNOW_TILES.get(), PACKED_SNOW_PILLAR.get(),
						PACKED_SNOW_STAIRS.get(), PACKED_SNOW_SLAB.get(), CHISELED_PACKED_SNOW.get());
		this.tag(BlockTags.MINEABLE_WITH_PICKAXE)//
				.add(PACKED_ICE_BRICKS.get(), PACKED_ICE_TILES.get(), PACKED_ICE_SLAB.get(),
						CRACKED_PACKED_ICE_BRICKS.get(), CRACKED_PACKED_ICE_TILES.get(), PACKED_ICE_PILLAR.get(),
						CHISELED_PACKED_ICE.get(), BLUE_ICE_BRICKS.get(), BLUE_ICE_TILES.get(),
						CRACKED_BLUE_ICE_BRICKS.get(), CRACKED_BLUE_ICE_TILES.get(), PACKED_SNOW_STAIRS.get(),
						BLUE_ICE_STAIRS.get(), BLUE_ICE_SLAB.get(), PACKED_ICE_STAIRS.get(), BLUE_ICE_PILLAR.get(),
						CHISELED_BLUE_ICE.get(), BLACK_PURPUR.get(), BLACK_PURPUR_PILLAR.get(),
						CHISELED_BLACK_PURPUR.get(), SMOOTH_BLACK_PURPUR.get(), BLACK_PURPUR_TILES.get(),
						BLUE_PURPUR.get(), BLUE_PURPUR_PILLAR.get(), CHISELED_BLUE_PURPUR.get(),
						SMOOTH_BLUE_PURPUR.get(), BLUE_PURPUR_TILES.get(), BROWN_PURPUR.get(),
						BROWN_PURPUR_PILLAR.get(), CHISELED_BROWN_PURPUR.get(), SMOOTH_BROWN_PURPUR.get(),
						BROWN_PURPUR_TILES.get(), CYAN_PURPUR.get(), CYAN_PURPUR_PILLAR.get(),
						CHISELED_CYAN_PURPUR.get(), SMOOTH_CYAN_PURPUR.get(), CYAN_PURPUR_TILES.get(),
						GRAY_PURPUR.get(), GRAY_PURPUR_PILLAR.get(), CHISELED_GRAY_PURPUR.get(),
						SMOOTH_GRAY_PURPUR.get(), GRAY_PURPUR_TILES.get(), GREEN_PURPUR.get(),
						GREEN_PURPUR_PILLAR.get(), CHISELED_GREEN_PURPUR.get(), SMOOTH_GREEN_PURPUR.get(),
						GREEN_PURPUR_TILES.get(), LIGHT_BLUE_PURPUR.get(), LIGHT_BLUE_PURPUR_PILLAR.get(),
						CHISELED_LIGHT_BLUE_PURPUR.get(), SMOOTH_LIGHT_BLUE_PURPUR.get(), LIGHT_BLUE_PURPUR_TILES.get(),
						LIGHT_GRAY_PURPUR.get(), LIGHT_GRAY_PURPUR_PILLAR.get(), CHISELED_LIGHT_GRAY_PURPUR.get(),
						SMOOTH_LIGHT_GRAY_PURPUR.get(), LIGHT_GRAY_PURPUR_TILES.get(), LIME_PURPUR.get(),
						LIME_PURPUR_PILLAR.get(), CHISELED_LIME_PURPUR.get(), SMOOTH_LIME_PURPUR.get(),
						LIME_PURPUR_TILES.get(), MAGENTA_PURPUR.get(), MAGENTA_PURPUR_PILLAR.get(),
						CHISELED_MAGENTA_PURPUR.get(), SMOOTH_MAGENTA_PURPUR.get(), MAGENTA_PURPUR_TILES.get(),
						ORANGE_PURPUR.get(), ORANGE_PURPUR_PILLAR.get(), CHISELED_ORANGE_PURPUR.get(),
						SMOOTH_ORANGE_PURPUR.get(), ORANGE_PURPUR_TILES.get(), PINK_PURPUR.get(),
						PINK_PURPUR_PILLAR.get(), CHISELED_PINK_PURPUR.get(), SMOOTH_PINK_PURPUR.get(),
						PINK_PURPUR_TILES.get(), PURPLE_PURPUR.get(), PURPLE_PURPUR_PILLAR.get(),
						CHISELED_PURPLE_PURPUR.get(), SMOOTH_PURPLE_PURPUR.get(), PURPLE_PURPUR_TILES.get(),
						RED_PURPUR.get(), RED_PURPUR_PILLAR.get(), CHISELED_RED_PURPUR.get(), SMOOTH_RED_PURPUR.get(),
						RED_PURPUR_TILES.get(), WHITE_PURPUR.get(), WHITE_PURPUR_PILLAR.get(),
						CHISELED_WHITE_PURPUR.get(), SMOOTH_WHITE_PURPUR.get(), WHITE_PURPUR_TILES.get(),
						YELLOW_PURPUR.get(), YELLOW_PURPUR_PILLAR.get(), CHISELED_YELLOW_PURPUR.get(),
						SMOOTH_YELLOW_PURPUR.get(), YELLOW_PURPUR_TILES.get(), CHISELED_POLISHED_ANDESITE.get(),
						POLISHED_ANDESITE_BRICKS.get(), POLISHED_ANDESITE_TILES.get(), CHISELED_END_STONE.get(),
						SMOOTH_END_STONE.get(), CHISELED_PURPUR.get(), SMOOTH_PURPUR.get());
		this.tag(BlockTags.ICE)//
				.add(PACKED_ICE_BRICKS.get(), PACKED_ICE_TILES.get(), CRACKED_PACKED_ICE_BRICKS.get(),
						CRACKED_PACKED_ICE_TILES.get(), PACKED_ICE_SLAB.get(), PACKED_ICE_STAIRS.get(),
						PACKED_ICE_PILLAR.get(), BLUE_ICE_WALL.get(), PACKED_ICE_WALL.get(), CHISELED_PACKED_ICE.get(),
						BLUE_ICE_SLAB.get(), BLUE_ICE_STAIRS.get(), BLUE_ICE_BRICKS.get(), BLUE_ICE_TILES.get(),
						CRACKED_BLUE_ICE_BRICKS.get(), CRACKED_BLUE_ICE_TILES.get(), BLUE_ICE_PILLAR.get(),
						CHISELED_BLUE_ICE.get(), BLUE_ICE_STAIRS.get(), PACKED_ICE_STAIRS.get());
		this.tag(BlockTags.STAIRS)//
				.add(PACKED_SNOW_STAIRS.get(), BLUE_ICE_STAIRS.get(), PACKED_ICE_STAIRS.get());
		this.tag(BlockTags.WALLS)//
				.add(PACKED_SNOW_WALL.get(), BLUE_ICE_WALL.get(), PACKED_ICE_WALL.get());
	}
}

package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import us.blueeyemods.blueeyecommons.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {

    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                ModBlocks.PACKED_SNOW.get(),
                ModBlocks.PACKED_SNOW_BRICKS.get(),
                ModBlocks.PACKED_SNOW_TILES.get(),
                ModBlocks.PACKED_SNOW_PILLAR.get(),
                ModBlocks.PACKED_SNOW_STAIRS.get(),
                ModBlocks.PACKED_SNOW_SLAB.get(),
                ModBlocks.CHISELED_PACKED_SNOW.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                ModBlocks.PACKED_ICE_BRICKS.get(),
                ModBlocks.PACKED_ICE_TILES.get(),
                ModBlocks.PACKED_ICE_SLAB.get(),
                ModBlocks.CRACKED_PACKED_ICE_BRICKS.get(),
                ModBlocks.CRACKED_PACKED_ICE_TILES.get(),
                ModBlocks.PACKED_ICE_PILLAR.get(),
                ModBlocks.CHISELED_PACKED_ICE.get(),
                ModBlocks.BLUE_ICE_BRICKS.get(),
                ModBlocks.BLUE_ICE_TILES.get(),
                ModBlocks.CRACKED_BLUE_ICE_BRICKS.get(),
                ModBlocks.CRACKED_BLUE_ICE_TILES.get(),
                ModBlocks.PACKED_SNOW_STAIRS.get(),
                ModBlocks.BLUE_ICE_STAIRS.get(),
                ModBlocks.BLUE_ICE_SLAB.get(),
                ModBlocks.PACKED_ICE_STAIRS.get(),
                ModBlocks.BLUE_ICE_PILLAR.get(),
                ModBlocks.CHISELED_BLUE_ICE.get());
        this.tag(BlockTags.ICE).add(
                ModBlocks.PACKED_ICE_BRICKS.get(),
                ModBlocks.PACKED_ICE_TILES.get(),
                ModBlocks.CRACKED_PACKED_ICE_BRICKS.get(),
                ModBlocks.CRACKED_PACKED_ICE_TILES.get(),
                ModBlocks.PACKED_ICE_SLAB.get(),
                ModBlocks.PACKED_ICE_STAIRS.get(),
                ModBlocks.PACKED_ICE_PILLAR.get(),
                ModBlocks.BLUE_ICE_WALL.get(),
                ModBlocks.PACKED_ICE_WALL.get(),
                ModBlocks.CHISELED_PACKED_ICE.get(),
                ModBlocks.BLUE_ICE_SLAB.get(),
                ModBlocks.BLUE_ICE_STAIRS.get(),
                ModBlocks.BLUE_ICE_BRICKS.get(),
                ModBlocks.BLUE_ICE_TILES.get(),
                ModBlocks.CRACKED_BLUE_ICE_BRICKS.get(),
                ModBlocks.CRACKED_BLUE_ICE_TILES.get(),
                ModBlocks.BLUE_ICE_PILLAR.get(),
                ModBlocks.CHISELED_BLUE_ICE.get(),
                ModBlocks.BLUE_ICE_STAIRS.get(),
                ModBlocks.PACKED_ICE_STAIRS.get());
        this.tag(BlockTags.STAIRS).add(
                ModBlocks.PACKED_SNOW_STAIRS.get(),
                ModBlocks.BLUE_ICE_STAIRS.get(),
                ModBlocks.PACKED_ICE_STAIRS.get());
        this.tag(BlockTags.WALLS).add(
                ModBlocks.PACKED_SNOW_WALL.get(),
                ModBlocks.BLUE_ICE_WALL.get(),
                ModBlocks.PACKED_ICE_WALL.get());

    }
}

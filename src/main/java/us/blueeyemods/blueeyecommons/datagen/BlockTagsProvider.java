package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;
import us.blueeyemods.blueeyecommons.init.BlockInit;

import java.util.concurrent.CompletableFuture;

public class BlockTagsProvider extends net.minecraftforge.common.data.BlockTagsProvider {

    public BlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, String modId, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                BlockInit.PACKED_SNOW.get(),
                BlockInit.PACKED_SNOW_BRICKS.get(),
                BlockInit.PACKED_SNOW_TILES.get(),
                BlockInit.PACKED_SNOW_PILLAR.get(),
                BlockInit.PACKED_SNOW_STAIRS.get(),
                BlockInit.PACKED_SNOW_SLAB.get(),
                BlockInit.CHISELED_PACKED_SNOW.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                BlockInit.PACKED_ICE_BRICKS.get(),
                BlockInit.PACKED_ICE_TILES.get(),
                BlockInit.PACKED_ICE_SLAB.get(),
                BlockInit.CRACKED_PACKED_ICE_BRICKS.get(),
                BlockInit.CRACKED_PACKED_ICE_TILES.get(),
                BlockInit.PACKED_ICE_PILLAR.get(),
                BlockInit.CHISELED_PACKED_ICE.get(),
                BlockInit.BLUE_ICE_BRICKS.get(),
                BlockInit.BLUE_ICE_TILES.get(),
                BlockInit.CRACKED_BLUE_ICE_BRICKS.get(),
                BlockInit.CRACKED_BLUE_ICE_TILES.get(),
                BlockInit.PACKED_SNOW_STAIRS.get(),
                BlockInit.BLUE_ICE_STAIRS.get(),
                BlockInit.BLUE_ICE_SLAB.get(),
                BlockInit.PACKED_ICE_STAIRS.get(),
                BlockInit.BLUE_ICE_PILLAR.get(),
                BlockInit.CHISELED_BLUE_ICE.get());
        this.tag(BlockTags.ICE).add(
                BlockInit.PACKED_ICE_BRICKS.get(),
                BlockInit.PACKED_ICE_TILES.get(),
                BlockInit.CRACKED_PACKED_ICE_BRICKS.get(),
                BlockInit.CRACKED_PACKED_ICE_TILES.get(),
                BlockInit.PACKED_ICE_SLAB.get(),
                BlockInit.PACKED_ICE_STAIRS.get(),
                BlockInit.PACKED_ICE_PILLAR.get(),
                BlockInit.BLUE_ICE_WALL.get(),
                BlockInit.PACKED_ICE_WALL.get(),
                BlockInit.CHISELED_PACKED_ICE.get(),
                BlockInit.BLUE_ICE_SLAB.get(),
                BlockInit.BLUE_ICE_STAIRS.get(),
                BlockInit.BLUE_ICE_BRICKS.get(),
                BlockInit.BLUE_ICE_TILES.get(),
                BlockInit.CRACKED_BLUE_ICE_BRICKS.get(),
                BlockInit.CRACKED_BLUE_ICE_TILES.get(),
                BlockInit.BLUE_ICE_PILLAR.get(),
                BlockInit.CHISELED_BLUE_ICE.get(),
                BlockInit.BLUE_ICE_STAIRS.get(),
                BlockInit.PACKED_ICE_STAIRS.get());
        this.tag(BlockTags.STAIRS).add(
                BlockInit.PACKED_SNOW_STAIRS.get(),
                BlockInit.BLUE_ICE_STAIRS.get(),
                BlockInit.PACKED_ICE_STAIRS.get());
        this.tag(BlockTags.WALLS).add(
                BlockInit.PACKED_SNOW_WALL.get(),
                BlockInit.BLUE_ICE_WALL.get(),
                BlockInit.PACKED_ICE_WALL.get());

    }
}

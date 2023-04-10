package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;
import us.blueeyemods.blueeyecommons.init.BlockInit;

import java.util.Set;

public class BlockLootTables extends BlockLootSubProvider {
    public BlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropWhenSilkTouch(BlockInit.PACKED_SNOW.get());
        dropWhenSilkTouch(BlockInit.PACKED_SNOW_SLAB.get());
        dropWhenSilkTouch(BlockInit.PACKED_SNOW_STAIRS.get());
        dropWhenSilkTouch(BlockInit.PACKED_SNOW_BRICKS.get());
        dropWhenSilkTouch(BlockInit.PACKED_SNOW_TILES.get());
        dropWhenSilkTouch(BlockInit.PACKED_SNOW_PILLAR.get());
        dropWhenSilkTouch(BlockInit.CHISELED_PACKED_SNOW.get());
        dropWhenSilkTouch(BlockInit.PACKED_ICE_BRICKS.get());
        dropWhenSilkTouch(BlockInit.PACKED_ICE_TILES.get());
        dropWhenSilkTouch(BlockInit.CRACKED_PACKED_ICE_BRICKS.get());
        dropWhenSilkTouch(BlockInit.CRACKED_PACKED_ICE_TILES.get());
        dropWhenSilkTouch(BlockInit.PACKED_ICE_PILLAR.get());
        dropWhenSilkTouch(BlockInit.CHISELED_PACKED_ICE.get());
        dropWhenSilkTouch(BlockInit.BLUE_ICE_BRICKS.get());
        dropWhenSilkTouch(BlockInit.BLUE_ICE_TILES.get());
        dropWhenSilkTouch(BlockInit.CRACKED_BLUE_ICE_BRICKS.get());
        dropWhenSilkTouch(BlockInit.CRACKED_BLUE_ICE_TILES.get());
        dropWhenSilkTouch(BlockInit.BLUE_ICE_PILLAR.get());
        dropWhenSilkTouch(BlockInit.CHISELED_BLUE_ICE.get());
        dropWhenSilkTouch(BlockInit.PACKED_ICE_SLAB.get());
        dropWhenSilkTouch(BlockInit.BLUE_ICE_SLAB.get());
        dropWhenSilkTouch(BlockInit.BLUE_ICE_STAIRS.get());
        dropWhenSilkTouch(BlockInit.PACKED_ICE_SLAB.get());
        dropWhenSilkTouch(BlockInit.PACKED_ICE_STAIRS.get());
        dropWhenSilkTouch(BlockInit.BLUE_ICE_WALL.get());
        dropWhenSilkTouch(BlockInit.PACKED_ICE_WALL.get());
        dropWhenSilkTouch(BlockInit.PACKED_SNOW_WALL.get());
        dropWhenSilkTouch(BlockInit.PACKED_SNOW_BRICK_STAIRS.get());
        dropWhenSilkTouch(BlockInit.PACKED_SNOW_TILE_STAIRS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return BlockInit.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

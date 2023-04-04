package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import us.blueeyemods.blueeyecommons.block.ModBlocks;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW.get());
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW_SLAB.get());
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW_STAIRS.get());
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW_BRICKS.get());
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW_TILES.get());
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW_PILLAR.get());
        dropWhenSilkTouch(ModBlocks.CHISELED_PACKED_SNOW.get());
        dropWhenSilkTouch(ModBlocks.PACKED_ICE_BRICKS.get());
        dropWhenSilkTouch(ModBlocks.PACKED_ICE_TILES.get());
        dropWhenSilkTouch(ModBlocks.CRACKED_PACKED_ICE_BRICKS.get());
        dropWhenSilkTouch(ModBlocks.CRACKED_PACKED_ICE_TILES.get());
        dropWhenSilkTouch(ModBlocks.PACKED_ICE_PILLAR.get());
        dropWhenSilkTouch(ModBlocks.CHISELED_PACKED_ICE.get());
        dropWhenSilkTouch(ModBlocks.BLUE_ICE_BRICKS.get());
        dropWhenSilkTouch(ModBlocks.BLUE_ICE_TILES.get());
        dropWhenSilkTouch(ModBlocks.CRACKED_BLUE_ICE_BRICKS.get());
        dropWhenSilkTouch(ModBlocks.CRACKED_BLUE_ICE_TILES.get());
        dropWhenSilkTouch(ModBlocks.BLUE_ICE_PILLAR.get());
        dropWhenSilkTouch(ModBlocks.CHISELED_BLUE_ICE.get());
        dropWhenSilkTouch(ModBlocks.PACKED_ICE_SLAB.get());
        dropWhenSilkTouch(ModBlocks.BLUE_ICE_SLAB.get());
        dropWhenSilkTouch(ModBlocks.BLUE_ICE_STAIRS.get());
        dropWhenSilkTouch(ModBlocks.PACKED_ICE_SLAB.get());
        dropWhenSilkTouch(ModBlocks.PACKED_ICE_STAIRS.get());
        dropWhenSilkTouch(ModBlocks.BLUE_ICE_WALL.get());
        dropWhenSilkTouch(ModBlocks.PACKED_ICE_WALL.get());
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW_WALL.get());
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW_BRICK_STAIRS.get());
        dropWhenSilkTouch(ModBlocks.PACKED_SNOW_TILE_STAIRS.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}

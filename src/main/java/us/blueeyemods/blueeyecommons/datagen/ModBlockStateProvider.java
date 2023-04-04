package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import us.blueeyemods.blueeyecommons.Main;
import us.blueeyemods.blueeyecommons.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, Main.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.PACKED_SNOW);
        blockWithItem(ModBlocks.PACKED_SNOW_BRICKS);
        blockWithItem(ModBlocks.PACKED_SNOW_TILES);
        blockWithItem(ModBlocks.CHISELED_PACKED_SNOW);
        blockWithItem(ModBlocks.PACKED_ICE_BRICKS);
        blockWithItem(ModBlocks.PACKED_ICE_TILES);
        blockWithItem(ModBlocks.CRACKED_PACKED_ICE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_PACKED_ICE_TILES);
        blockWithItem(ModBlocks.CHISELED_PACKED_ICE);
        blockWithItem(ModBlocks.BLUE_ICE_BRICKS);
        blockWithItem(ModBlocks.BLUE_ICE_TILES);
        blockWithItem(ModBlocks.CRACKED_BLUE_ICE_BRICKS);
        blockWithItem(ModBlocks.CRACKED_BLUE_ICE_TILES);
        blockWithItem(ModBlocks.CHISELED_BLUE_ICE);
        pillarBlock(ModBlocks.PACKED_SNOW_PILLAR.get(), new ResourceLocation(Main.MODID+":block/packed_snow_pillar"));
        pillarBlock(ModBlocks.PACKED_ICE_PILLAR.get(), new ResourceLocation(Main.MODID+":block/packed_ice_pillar"));
        pillarBlock(ModBlocks.BLUE_ICE_PILLAR.get(), new ResourceLocation(Main.MODID+":block/blue_ice_pillar"));
        halfBlock(ModBlocks.PACKED_ICE_SLAB.get(), new ResourceLocation("minecraft:block/packed_ice"));
        halfBlock(ModBlocks.BLUE_ICE_SLAB.get(), new ResourceLocation("minecraft:block/blue_ice"));
        halfBlock(ModBlocks.PACKED_SNOW_SLAB.get(), new ResourceLocation(Main.MODID+":block/packed_snow"));
        stairsBlock(ModBlocks.PACKED_ICE_STAIRS.get(), new ResourceLocation("minecraft:block/packed_ice"));
        stairsBlock(ModBlocks.BLUE_ICE_STAIRS.get(), new ResourceLocation("minecraft:block/blue_ice"));
        stairsBlock(ModBlocks.PACKED_SNOW_STAIRS.get(), new ResourceLocation(Main.MODID+":block/packed_snow"));
        stairsBlock(ModBlocks.PACKED_SNOW_BRICK_STAIRS.get(), new ResourceLocation(Main.MODID+":block/packed_snow_bricks"));
        stairsBlock(ModBlocks.PACKED_SNOW_TILE_STAIRS.get(), new ResourceLocation(Main.MODID+":block/packed_snow_tiles"));
        wallBlockWithItem(ModBlocks.PACKED_SNOW_WALL.get(), new ResourceLocation(Main.MODID+":block/packed_snow"), "packed_snow_wall_inventory");
        wallBlockWithItem(ModBlocks.PACKED_ICE_WALL.get(), new ResourceLocation("minecraft:block/packed_ice"), "packed_ice_wall_inventory");
        wallBlockWithItem(ModBlocks.BLUE_ICE_WALL.get(), new ResourceLocation("minecraft:block/blue_ice"), "blue_ice_wall_inventory");
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }

    private void wallBlockWithItem(Block block, ResourceLocation texture, String wallInvName) {
        models().wallInventory(wallInvName, texture);
        wallBlock((WallBlock) block, texture);
        simpleBlockItem(block, models().getExistingFile(new ResourceLocation(Main.MODID, "block/"+wallInvName)));
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
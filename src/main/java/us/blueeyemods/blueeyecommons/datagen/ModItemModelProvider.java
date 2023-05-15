package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import us.blueeyemods.blueeyecommons.Main;
import us.blueeyemods.blueeyecommons.block.ModBlocks;

import static us.blueeyemods.blueeyecommons.block.ModBlocks.*;
import static us.blueeyemods.blueeyecommons.block.ModBlocks.SMOOTH_PINK_PURPUR;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        blockItem(PACKED_SNOW_PILLAR);
        blockItem(PACKED_ICE_PILLAR);
        blockItem(PACKED_SNOW_SLAB);
        blockItem(PACKED_SNOW_STAIRS);
        blockItem(PACKED_SNOW_TILE_STAIRS);
        blockItem(PACKED_SNOW_BRICK_STAIRS);
        blockItem(BLUE_ICE_PILLAR);
        blockItem(PACKED_ICE_SLAB);
        blockItem(PACKED_ICE_STAIRS);
        blockItem(BLUE_ICE_SLAB);
        blockItem(BLUE_ICE_STAIRS);
        blockItem(BLACK_PURPUR);
        blockItem(BLACK_PURPUR_PILLAR);
        blockItem(CHISELED_BLACK_PURPUR);
        blockItem(SMOOTH_BLACK_PURPUR);
        blockItem(BLACK_PURPUR_TILES);
        blockItem(BLUE_PURPUR);
        blockItem(BLUE_PURPUR_PILLAR);
        blockItem(CHISELED_BLUE_PURPUR);
        blockItem(SMOOTH_BLUE_PURPUR);
        blockItem(BLUE_PURPUR_TILES);
        blockItem(BROWN_PURPUR);
        blockItem(BROWN_PURPUR_PILLAR);
        blockItem(CHISELED_BROWN_PURPUR);
        blockItem(SMOOTH_BROWN_PURPUR);
        blockItem(BROWN_PURPUR_TILES);
        blockItem(CYAN_PURPUR);
        blockItem(CYAN_PURPUR_PILLAR);
        blockItem(CHISELED_CYAN_PURPUR);
        blockItem(SMOOTH_CYAN_PURPUR);
        blockItem(CYAN_PURPUR_TILES);
        blockItem(GRAY_PURPUR);
        blockItem(GRAY_PURPUR_PILLAR);
        blockItem(CHISELED_GRAY_PURPUR);
        blockItem(SMOOTH_GRAY_PURPUR);
        blockItem(GRAY_PURPUR_TILES);
        blockItem(GREEN_PURPUR);
        blockItem(GREEN_PURPUR_PILLAR);
        blockItem(CHISELED_GREEN_PURPUR);
        blockItem(SMOOTH_GREEN_PURPUR);
        blockItem(GREEN_PURPUR_TILES);
        blockItem(LIGHT_BLUE_PURPUR);
        blockItem(LIGHT_BLUE_PURPUR_PILLAR);
        blockItem(CHISELED_LIGHT_BLUE_PURPUR);
        blockItem(SMOOTH_LIGHT_BLUE_PURPUR);
        blockItem(LIGHT_BLUE_PURPUR_TILES);
        blockItem(LIGHT_GRAY_PURPUR);
        blockItem(LIGHT_GRAY_PURPUR_PILLAR);
        blockItem(CHISELED_LIGHT_GRAY_PURPUR);
        blockItem(SMOOTH_LIGHT_GRAY_PURPUR);
        blockItem(LIGHT_GRAY_PURPUR_TILES);
        blockItem(LIME_PURPUR);
        blockItem(LIME_PURPUR_PILLAR);
        blockItem(CHISELED_LIME_PURPUR);
        blockItem(SMOOTH_LIME_PURPUR);
        blockItem(LIME_PURPUR_TILES);
        blockItem(MAGENTA_PURPUR);
        blockItem(MAGENTA_PURPUR_PILLAR);
        blockItem(CHISELED_MAGENTA_PURPUR);
        blockItem(SMOOTH_MAGENTA_PURPUR);
        blockItem(MAGENTA_PURPUR_TILES);
        blockItem(ORANGE_PURPUR);
        blockItem(ORANGE_PURPUR_PILLAR);
        blockItem(CHISELED_ORANGE_PURPUR);
        blockItem(SMOOTH_ORANGE_PURPUR);
        blockItem(ORANGE_PURPUR_TILES);
        blockItem(PINK_PURPUR);
        blockItem(PINK_PURPUR_PILLAR);
        blockItem(CHISELED_PINK_PURPUR);
        blockItem(SMOOTH_PINK_PURPUR);
        blockItem(PINK_PURPUR_TILES);
        blockItem(PURPLE_PURPUR);
        blockItem(PURPLE_PURPUR_PILLAR);
        blockItem(CHISELED_PURPLE_PURPUR);
        blockItem(SMOOTH_PURPLE_PURPUR);
        blockItem(PURPLE_PURPUR_TILES);
        blockItem(RED_PURPUR);
        blockItem(RED_PURPUR_PILLAR);
        blockItem(CHISELED_RED_PURPUR);
        blockItem(SMOOTH_RED_PURPUR);
        blockItem(RED_PURPUR_TILES);
        blockItem(WHITE_PURPUR);
        blockItem(WHITE_PURPUR_PILLAR);
        blockItem(CHISELED_WHITE_PURPUR);
        blockItem(SMOOTH_WHITE_PURPUR);
        blockItem(WHITE_PURPUR_TILES);
        blockItem(YELLOW_PURPUR);
        blockItem(YELLOW_PURPUR_PILLAR);
        blockItem(CHISELED_YELLOW_PURPUR);
        blockItem(SMOOTH_YELLOW_PURPUR);
        blockItem(YELLOW_PURPUR_TILES);
        blockItem(CHISELED_POLISHED_ANDESITE);
        blockItem(POLISHED_ANDESITE_BRICKS);
        blockItem(POLISHED_ANDESITE_TILES);
        blockItem(CHISELED_END_STONE);
        blockItem(SMOOTH_END_STONE);
        blockItem(CHISELED_PURPUR);
        blockItem(SMOOTH_PURPUR);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Main.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Main.MODID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder blockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation(Main.MODID,"block/" + item.getId().getPath()));
    }
}

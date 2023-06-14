package us.blueeyemods.blueeyecommons.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import us.blueeyemods.blueeyecommons.Main;
import us.blueeyemods.blueeyecommons.init.BlockInit;

public class ItemModelProvider extends net.minecraftforge.client.model.generators.ItemModelProvider {
    public ItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, Main.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        blockItem(BlockInit.PACKED_SNOW_PILLAR);
        blockItem(BlockInit.PACKED_ICE_PILLAR);
        blockItem(BlockInit.PACKED_SNOW_SLAB);
        blockItem(BlockInit.PACKED_SNOW_STAIRS);
        blockItem(BlockInit.PACKED_SNOW_TILE_STAIRS);
        blockItem(BlockInit.PACKED_SNOW_BRICK_STAIRS);
        blockItem(BlockInit.BLUE_ICE_PILLAR);
        blockItem(BlockInit.PACKED_ICE_SLAB);
        blockItem(BlockInit.PACKED_ICE_STAIRS);
        blockItem(BlockInit.BLUE_ICE_SLAB);
        blockItem(BlockInit.BLUE_ICE_STAIRS);
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

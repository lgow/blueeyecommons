package us.blueeyemods.blueeyecommons.datagen.language;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import us.blueeyemods.blueeyecommons.block.ModBlocks;
import us.blueeyemods.blueeyecommons.item.ModCreativeModeTabs;

public class ModEnglishLangProvider extends LanguageProvider {
    public ModEnglishLangProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModCreativeModeTabs.TAB1.getDisplayName().getString(), "Blue-Eye Commons: Cold Biomes");
        add(ModBlocks.PACKED_SNOW.get(), "Packed Snow");
        add(ModBlocks.PACKED_SNOW_SLAB.get(), "Packed Snow Slab");
        add(ModBlocks.PACKED_SNOW_STAIRS.get(), "Packed Snow Stairs");
        add(ModBlocks.PACKED_SNOW_WALL.get(), "Packed Snow Wall");
        add(ModBlocks.PACKED_SNOW_BRICKS.get(), "Packed Snow Bricks");
        add(ModBlocks.PACKED_SNOW_TILES.get(), "Packed Snow Tiles");
        add(ModBlocks.PACKED_SNOW_PILLAR.get(), "Packed Snow Pillar");
        add(ModBlocks.CHISELED_PACKED_SNOW.get(), "Chiseled Packed Snow");
        add(ModBlocks.PACKED_ICE_BRICKS.get(), "Packed Ice Bricks");
        add(ModBlocks.PACKED_ICE_TILES.get(), "Packed Ice Tiles");
        add(ModBlocks.PACKED_ICE_SLAB.get(), "Packed Ice Slab");
        add(ModBlocks.PACKED_ICE_WALL.get(), "Packed Ice Wall");
        add(ModBlocks.PACKED_ICE_STAIRS.get(), "Packed Ice Stairs");
        add(ModBlocks.CRACKED_PACKED_ICE_BRICKS.get(), "Cracked Packed Ice Bricks");
        add(ModBlocks.CRACKED_PACKED_ICE_TILES.get(), "Cracked Packed Ice Tiles");
        add(ModBlocks.PACKED_ICE_PILLAR.get(), "Packed Ice Pillar");
        add(ModBlocks.CHISELED_PACKED_ICE.get(), "Chiseled Packed Ice");
        add(ModBlocks.BLUE_ICE_BRICKS.get(), "Blue Ice Bricks");
        add(ModBlocks.BLUE_ICE_TILES.get(), "Blue Ice Tiles");
        add(ModBlocks.CRACKED_BLUE_ICE_BRICKS.get(), "Cracked Blue Ice Bricks");
        add(ModBlocks.CRACKED_BLUE_ICE_TILES.get(), "Cracked Blue Ice Tiles");
        add(ModBlocks.BLUE_ICE_PILLAR.get(), "Blue Ice Pillar");
        add(ModBlocks.CHISELED_BLUE_ICE.get(), "Chiseled Blue Ice");
        add(ModBlocks.BLUE_ICE_SLAB.get(), "Blue Ice Slab");
        add(ModBlocks.BLUE_ICE_WALL.get(), "Blue Ice Wall");
        add(ModBlocks.BLUE_ICE_STAIRS.get(), "Blue Ice Stairs");
    }
}

package us.blueeyemods.blueeyecommons.datagen.language;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import us.blueeyemods.blueeyecommons.block.ModBlocks;

public class ModRussianLangProvider extends LanguageProvider {
    public ModRussianLangProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModBlocks.PACKED_SNOW.get(), "Packed Snow");
        add(ModBlocks.PACKED_SNOW_BRICKS.get(), "Packed Snow Bricks");
        add(ModBlocks.PACKED_SNOW_TILES.get(), "Packed Snow Tiles");
        add(ModBlocks.PACKED_SNOW_PILLAR.get(), "Packed Snow Pillar");
        add(ModBlocks.CHISELED_PACKED_SNOW.get(), "Chiseled Packed Snow");
        add(ModBlocks.PACKED_ICE_BRICKS.get(), "Packed Ice Bricks");
        add(ModBlocks.PACKED_ICE_TILES.get(), "Packed Ice Tiles");
        add(ModBlocks.CRACKED_PACKED_ICE_BRICKS.get(), "Cracked Packed Ice Bricks");
        add(ModBlocks.CRACKED_PACKED_ICE_TILES.get(), "Cracked Packed Ice Tiles");
        add(ModBlocks.PACKED_ICE_PILLAR.get(), "Packed Ice Pillar");
        add(ModBlocks.CHISELED_PACKED_ICE.get(), "Packed Ice Pillar");
        add(ModBlocks.BLUE_ICE_BRICKS.get(), "Blue Ice Bricks");
        add(ModBlocks.BLUE_ICE_TILES.get(), "Blue Ice Tiles");
        add(ModBlocks.CRACKED_BLUE_ICE_BRICKS.get(), "Cracked Blue Ice Bricks");
        add(ModBlocks.CRACKED_BLUE_ICE_TILES.get(), "Cracked Blue Ice Tiles");
        add(ModBlocks.BLUE_ICE_PILLAR.get(), "Blue Ice Pillar");
        add(ModBlocks.CHISELED_BLUE_ICE.get(), "Chiseled Blue Ice");
    }
}

package us.blueeyemods.blueeyecommons.datagen.language;

import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;
import us.blueeyemods.blueeyecommons.block.ModBlocks;

import static us.blueeyemods.blueeyecommons.block.ModBlocks.*;

public class ModRussianLangProvider extends LanguageProvider {
    public ModRussianLangProvider(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add(PACKED_SNOW.get(), "Packed Snow");
        add(PACKED_SNOW_BRICKS.get(), "Packed Snow Bricks");
        add(PACKED_SNOW_TILES.get(), "Packed Snow Tiles");
        add(PACKED_SNOW_PILLAR.get(), "Packed Snow Pillar");
        add(CHISELED_PACKED_SNOW.get(), "Chiseled Packed Snow");
        add(PACKED_ICE_BRICKS.get(), "Packed Ice Bricks");
        add(PACKED_ICE_TILES.get(), "Packed Ice Tiles");
        add(CRACKED_PACKED_ICE_BRICKS.get(), "Cracked Packed Ice Bricks");
        add(CRACKED_PACKED_ICE_TILES.get(), "Cracked Packed Ice Tiles");
        add(PACKED_ICE_PILLAR.get(), "Packed Ice Pillar");
        add(CHISELED_PACKED_ICE.get(), "Packed Ice Pillar");
        add(BLUE_ICE_BRICKS.get(), "Blue Ice Bricks");
        add(BLUE_ICE_TILES.get(), "Blue Ice Tiles");
        add(CRACKED_BLUE_ICE_BRICKS.get(), "Cracked Blue Ice Bricks");
        add(CRACKED_BLUE_ICE_TILES.get(), "Cracked Blue Ice Tiles");
        add(BLUE_ICE_PILLAR.get(), "Blue Ice Pillar");
        add(CHISELED_BLUE_ICE.get(), "Chiseled Blue Ice");
    }
}

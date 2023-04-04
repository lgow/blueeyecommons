package us.blueeyemods.blueeyecommons.datagen;


import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import us.blueeyemods.blueeyecommons.Main;
import us.blueeyemods.blueeyecommons.datagen.language.ModEnglishLangProvider;
import us.blueeyemods.blueeyecommons.datagen.language.ModRussianLangProvider;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        String modid = Main.MODID.toString();

        generator.addProvider(true, new ModRecipeProvider(packOutput));
        generator.addProvider(true, ModLootTableProvider.create(packOutput));
        generator.addProvider(true, new ModBlockStateProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new ModItemModelProvider(packOutput, existingFileHelper));
        generator.addProvider(true, new ModBlockTagsProvider(packOutput, provider, modid, existingFileHelper));
        generator.addProvider(true, new ModEnglishLangProvider(packOutput, modid, "en_us"));
        generator.addProvider(true, new ModRussianLangProvider(packOutput, modid, "ru_ru"));
    }
}

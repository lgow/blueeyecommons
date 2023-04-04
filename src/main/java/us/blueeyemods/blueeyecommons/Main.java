package us.blueeyemods.blueeyecommons;

import com.mojang.logging.LogUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;
import us.blueeyemods.blueeyecommons.block.ModBlocks;
import us.blueeyemods.blueeyecommons.item.ModCreativeModeTabs;
import us.blueeyemods.blueeyecommons.item.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main {
    public static final String MODID = "blueeyecommons";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.PACKED_SNOW);
            event.accept(ModBlocks.PACKED_SNOW_SLAB);
            event.accept(ModBlocks.PACKED_SNOW_STAIRS);
            event.accept(ModBlocks.PACKED_SNOW_WALL);
            event.accept(ModBlocks.PACKED_SNOW_BRICKS);
            event.accept(ModBlocks.PACKED_SNOW_BRICK_STAIRS);
            event.accept(ModBlocks.PACKED_SNOW_TILES);
            event.accept(ModBlocks.PACKED_SNOW_TILE_STAIRS);
            event.accept(ModBlocks.PACKED_SNOW_PILLAR);
            event.accept(ModBlocks.CHISELED_PACKED_SNOW);
            event.accept(ModBlocks.PACKED_ICE_SLAB);
            event.accept(ModBlocks.PACKED_ICE_STAIRS);
            event.accept(ModBlocks.PACKED_ICE_WALL);
            event.accept(ModBlocks.PACKED_ICE_BRICKS);
            event.accept(ModBlocks.PACKED_ICE_TILES);
            event.accept(ModBlocks.CRACKED_PACKED_ICE_BRICKS);
            event.accept(ModBlocks.CRACKED_PACKED_ICE_TILES);
            event.accept(ModBlocks.PACKED_ICE_PILLAR);
            event.accept(ModBlocks.CHISELED_PACKED_ICE);
            event.accept(ModBlocks.BLUE_ICE_SLAB);
            event.accept(ModBlocks.BLUE_ICE_STAIRS);
            event.accept(ModBlocks.BLUE_ICE_WALL);
            event.accept(ModBlocks.BLUE_ICE_BRICKS);
            event.accept(ModBlocks.BLUE_ICE_TILES);
            event.accept(ModBlocks.CRACKED_BLUE_ICE_BRICKS);
            event.accept(ModBlocks.CRACKED_BLUE_ICE_TILES);
            event.accept(ModBlocks.BLUE_ICE_PILLAR);
            event.accept(ModBlocks.CHISELED_BLUE_ICE);
        }
        if(event.getTab() == ModCreativeModeTabs.TAB1) {
            event.accept(ModBlocks.PACKED_SNOW);
            event.accept(ModBlocks.PACKED_SNOW_SLAB);
            event.accept(ModBlocks.PACKED_SNOW_STAIRS);
            event.accept(ModBlocks.PACKED_SNOW_WALL);
            event.accept(ModBlocks.PACKED_SNOW_BRICKS);
            event.accept(ModBlocks.PACKED_SNOW_BRICK_STAIRS);
            event.accept(ModBlocks.PACKED_SNOW_TILES);
            event.accept(ModBlocks.PACKED_SNOW_TILE_STAIRS);
            event.accept(ModBlocks.PACKED_SNOW_PILLAR);
            event.accept(ModBlocks.CHISELED_PACKED_SNOW);
            event.accept(ModBlocks.PACKED_ICE_SLAB);
            event.accept(ModBlocks.PACKED_ICE_STAIRS);
            event.accept(ModBlocks.PACKED_ICE_WALL);
            event.accept(ModBlocks.PACKED_ICE_BRICKS);
            event.accept(ModBlocks.PACKED_ICE_TILES);
            event.accept(ModBlocks.CRACKED_PACKED_ICE_BRICKS);
            event.accept(ModBlocks.CRACKED_PACKED_ICE_TILES);
            event.accept(ModBlocks.PACKED_ICE_PILLAR);
            event.accept(ModBlocks.CHISELED_PACKED_ICE);
            event.accept(ModBlocks.BLUE_ICE_SLAB);
            event.accept(ModBlocks.BLUE_ICE_STAIRS);
            event.accept(ModBlocks.BLUE_ICE_WALL);
            event.accept(ModBlocks.BLUE_ICE_BRICKS);
            event.accept(ModBlocks.BLUE_ICE_TILES);
            event.accept(ModBlocks.CRACKED_BLUE_ICE_BRICKS);
            event.accept(ModBlocks.CRACKED_BLUE_ICE_TILES);
            event.accept(ModBlocks.BLUE_ICE_PILLAR);
            event.accept(ModBlocks.CHISELED_BLUE_ICE);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}

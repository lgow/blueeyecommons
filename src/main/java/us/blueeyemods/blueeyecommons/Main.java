package us.blueeyemods.blueeyecommons;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import us.blueeyemods.blueeyecommons.init.BlockInit;
import us.blueeyemods.blueeyecommons.item.ModCreativeModeTabs;
import us.blueeyemods.blueeyecommons.init.ItemInit;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main {
    public static final String MODID = "blueeyecommons";
    private static final Logger LOGGER = LogUtils.getLogger();

    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.register(modEventBus);
        BlockInit.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(CreativeModeTabEvent.BuildContents event) {
        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS || event.getTab() == ModCreativeModeTabs.TAB) {
            event.accept(BlockInit.PACKED_SNOW);
            event.accept(BlockInit.PACKED_SNOW_STAIRS);
            event.accept(BlockInit.PACKED_SNOW_SLAB);
            event.accept(BlockInit.PACKED_SNOW_WALL);
            event.accept(BlockInit.CHISELED_PACKED_SNOW);
            event.accept(BlockInit.PACKED_SNOW_BRICKS);
            event.accept(BlockInit.PACKED_SNOW_BRICK_STAIRS);
            event.accept(BlockInit.PACKED_SNOW_TILES);
            event.accept(BlockInit.PACKED_SNOW_TILE_STAIRS);
            event.accept(BlockInit.PACKED_SNOW_PILLAR);
            event.accept(BlockInit.PACKED_ICE_STAIRS);
            event.accept(BlockInit.PACKED_ICE_SLAB);
            event.accept(BlockInit.PACKED_ICE_WALL);
            event.accept(BlockInit.CHISELED_PACKED_ICE);
            event.accept(BlockInit.PACKED_ICE_BRICKS);
            event.accept(BlockInit.CRACKED_PACKED_ICE_BRICKS);
            event.accept(BlockInit.PACKED_ICE_TILES);
            event.accept(BlockInit.CRACKED_PACKED_ICE_TILES);
            event.accept(BlockInit.PACKED_ICE_PILLAR);
            event.accept(BlockInit.BLUE_ICE_STAIRS);
            event.accept(BlockInit.BLUE_ICE_SLAB);
            event.accept(BlockInit.BLUE_ICE_WALL);
            event.accept(BlockInit.CHISELED_BLUE_ICE);
            event.accept(BlockInit.BLUE_ICE_BRICKS);
            event.accept(BlockInit.CRACKED_BLUE_ICE_BRICKS);
            event.accept(BlockInit.BLUE_ICE_TILES);
            event.accept(BlockInit.CRACKED_BLUE_ICE_TILES);
            event.accept(BlockInit.BLUE_ICE_PILLAR);
        }
    }

    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {

        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}

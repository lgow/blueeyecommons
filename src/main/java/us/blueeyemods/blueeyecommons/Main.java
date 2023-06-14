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
import us.blueeyemods.blueeyecommons.block.ModBlocks;
import us.blueeyemods.blueeyecommons.item.ModCreativeModeTabs;
import us.blueeyemods.blueeyecommons.item.ModItems;

import static us.blueeyemods.blueeyecommons.block.ModBlocks.*;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main {
	public static final String MODID = "blueeyecommons";

	private static final Logger LOGGER = LogUtils.getLogger();

	public Main() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		ModItems.register(modEventBus);
		ModBlocks.register(modEventBus);
		modEventBus.addListener(this::commonSetup);
		MinecraftForge.EVENT_BUS.register(this);
		modEventBus.addListener(this::addCreative);
	}

	private void commonSetup(final FMLCommonSetupEvent event) {
	}

	private void addCreative(CreativeModeTabEvent.BuildContents event) {
		if (event.getTab() == CreativeModeTabs.BUILDING_BLOCKS || event.getTab() == ModCreativeModeTabs.TAB) {
			event.accept(PACKED_SNOW);
			event.accept(PACKED_SNOW_SLAB);
			event.accept(PACKED_SNOW_STAIRS);
			event.accept(PACKED_SNOW_WALL);
			event.accept(PACKED_ICE_SLAB);
			event.accept(PACKED_SNOW_BRICKS);
			event.accept(PACKED_SNOW_BRICK_STAIRS);
			event.accept(PACKED_SNOW_TILES);
			event.accept(PACKED_SNOW_TILE_STAIRS);
			event.accept(PACKED_SNOW_PILLAR);
			event.accept(CHISELED_PACKED_SNOW);
			event.accept(PACKED_ICE_WALL);
			event.accept(PACKED_ICE_BRICKS);
			event.accept(PACKED_ICE_TILES);
			event.accept(PACKED_ICE_PILLAR);
			event.accept(PACKED_ICE_STAIRS);
			event.accept(CHISELED_PACKED_ICE);
			event.accept(BLUE_ICE_SLAB);
			event.accept(BLUE_ICE_STAIRS);
			event.accept(BLUE_ICE_WALL);
			event.accept(BLUE_ICE_BRICKS);
			event.accept(BLUE_ICE_PILLAR);
			event.accept(CHISELED_BLUE_ICE);
			event.accept(CRACKED_PACKED_ICE_BRICKS);
			event.accept(CRACKED_PACKED_ICE_TILES);
			event.accept(CRACKED_BLUE_ICE_BRICKS);
			event.accept(CRACKED_BLUE_ICE_TILES);
			event.accept(BLUE_ICE_TILES);
			event.accept(BLACK_PURPUR);
			event.accept(BLACK_PURPUR_PILLAR);
			event.accept(CHISELED_BLACK_PURPUR);
			event.accept(SMOOTH_BLACK_PURPUR);
			event.accept(BLACK_PURPUR_TILES);
			event.accept(BLUE_PURPUR);
			event.accept(BLUE_PURPUR_PILLAR);
			event.accept(CHISELED_BLUE_PURPUR);
			event.accept(SMOOTH_BLUE_PURPUR);
			event.accept(BLUE_PURPUR_TILES);
			event.accept(BROWN_PURPUR);
			event.accept(BROWN_PURPUR_PILLAR);
			event.accept(CHISELED_BROWN_PURPUR);
			event.accept(SMOOTH_BROWN_PURPUR);
			event.accept(BROWN_PURPUR_TILES);
			event.accept(CYAN_PURPUR);
			event.accept(CYAN_PURPUR_PILLAR);
			event.accept(CHISELED_CYAN_PURPUR);
			event.accept(SMOOTH_CYAN_PURPUR);
			event.accept(CYAN_PURPUR_TILES);
			event.accept(GRAY_PURPUR);
			event.accept(GRAY_PURPUR_PILLAR);
			event.accept(CHISELED_GRAY_PURPUR);
			event.accept(SMOOTH_GRAY_PURPUR);
			event.accept(GRAY_PURPUR_TILES);
			event.accept(GREEN_PURPUR);
			event.accept(GREEN_PURPUR_PILLAR);
			event.accept(CHISELED_GREEN_PURPUR);
			event.accept(SMOOTH_GREEN_PURPUR);
			event.accept(GREEN_PURPUR_TILES);
			event.accept(LIGHT_BLUE_PURPUR);
			event.accept(LIGHT_BLUE_PURPUR_PILLAR);
			event.accept(CHISELED_LIGHT_BLUE_PURPUR);
			event.accept(SMOOTH_LIGHT_BLUE_PURPUR);
			event.accept(LIGHT_BLUE_PURPUR_TILES);
			event.accept(LIGHT_GRAY_PURPUR);
			event.accept(LIGHT_GRAY_PURPUR_PILLAR);
			event.accept(CHISELED_LIGHT_GRAY_PURPUR);
			event.accept(SMOOTH_LIGHT_GRAY_PURPUR);
			event.accept(LIGHT_GRAY_PURPUR_TILES);
			event.accept(LIME_PURPUR);
			event.accept(LIME_PURPUR_PILLAR);
			event.accept(CHISELED_LIME_PURPUR);
			event.accept(SMOOTH_LIME_PURPUR);
			event.accept(LIME_PURPUR_TILES);
			event.accept(MAGENTA_PURPUR);
			event.accept(MAGENTA_PURPUR_PILLAR);
			event.accept(CHISELED_MAGENTA_PURPUR);
			event.accept(SMOOTH_MAGENTA_PURPUR);
			event.accept(MAGENTA_PURPUR_TILES);
			event.accept(ORANGE_PURPUR);
			event.accept(ORANGE_PURPUR_PILLAR);
			event.accept(CHISELED_ORANGE_PURPUR);
			event.accept(SMOOTH_ORANGE_PURPUR);
			event.accept(ORANGE_PURPUR_TILES);
			event.accept(PINK_PURPUR);
			event.accept(PINK_PURPUR_PILLAR);
			event.accept(CHISELED_PINK_PURPUR);
			event.accept(SMOOTH_PINK_PURPUR);
			event.accept(PINK_PURPUR_TILES);
			event.accept(PURPLE_PURPUR);
			event.accept(PURPLE_PURPUR_PILLAR);
			event.accept(CHISELED_PURPLE_PURPUR);
			event.accept(SMOOTH_PURPLE_PURPUR);
			event.accept(PURPLE_PURPUR_TILES);
			event.accept(RED_PURPUR);
			event.accept(RED_PURPUR_PILLAR);
			event.accept(CHISELED_RED_PURPUR);
			event.accept(SMOOTH_RED_PURPUR);
			event.accept(RED_PURPUR_TILES);
			event.accept(WHITE_PURPUR);
			event.accept(WHITE_PURPUR_PILLAR);
			event.accept(CHISELED_WHITE_PURPUR);
			event.accept(SMOOTH_WHITE_PURPUR);
			event.accept(WHITE_PURPUR_TILES);
			event.accept(YELLOW_PURPUR);
			event.accept(YELLOW_PURPUR_PILLAR);
			event.accept(CHISELED_YELLOW_PURPUR);
			event.accept(SMOOTH_YELLOW_PURPUR);
			event.accept(YELLOW_PURPUR_TILES);
			event.accept(CHISELED_POLISHED_ANDESITE);
			event.accept(POLISHED_ANDESITE_BRICKS);
			event.accept(POLISHED_ANDESITE_TILES);
			event.accept(CHISELED_END_STONE);
			event.accept(SMOOTH_END_STONE);
			event.accept(CHISELED_PURPUR);
			event.accept(SMOOTH_PURPUR);
		}
	}

	@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientModEvents {
		@SubscribeEvent
		public static void onClientSetup(FMLClientSetupEvent event) {
		}
	}
}

package us.blueeyemods.blueeyecommons.item;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import us.blueeyemods.blueeyecommons.Main;
import us.blueeyemods.blueeyecommons.block.ModBlocks;

@Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static CreativeModeTab TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event) {
        TAB = event.registerCreativeModeTab(new ResourceLocation(Main.MODID, "cold_biome_blocks"),
                builder -> builder.icon(() -> new ItemStack(ModBlocks.PACKED_SNOW.get().asItem()))
                        .title(Component.translatable("creativemodetab.cold_biome_blocks")));
    }

}

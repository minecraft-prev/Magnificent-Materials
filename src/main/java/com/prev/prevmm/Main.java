package com.prev.prevmm;

//import com.mojang.logging.LogUtils;
import com.prev.prevmm.block.ModBlocks;
import com.prev.prevmm.client.ClientArmor;
import com.prev.prevmm.item.ModItems;
import com.prev.prevmm.worldgen.ModConfiguredFeatures;
import com.prev.prevmm.worldgen.ModPlacedFeatures;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import software.bernie.geckolib3.GeckoLib;
//import org.slf4j.Logger;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "prevmm";
    //private static final Logger LOGGER = LogUtils.getLogger();

    public Main() {

        GeckoLib.initialize();

        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModConfiguredFeatures.CONFIGURED_FEATURES.register(modEventBus);
        ModPlacedFeatures.PLACED_FEATURES.register(modEventBus);

        modEventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // placeholder
    }

    private void setupClient() {
        MinecraftForge.EVENT_BUS.register(ClientArmor.class);
    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}

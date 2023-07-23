package com.prev.prevmm.item;

import com.prev.prevmm.Main;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> MITHRIL_RAW = ITEMS.register("mithril_raw",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PREVMM_TAB_1)));
    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PREVMM_TAB_1)));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.PREVMM_TAB_1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

    }
}

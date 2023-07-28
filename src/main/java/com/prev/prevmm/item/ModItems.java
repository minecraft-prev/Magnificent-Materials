package com.prev.prevmm.item;

import com.prev.prevmm.Main;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    // these methods automate the creative tab assignments in each supplier
    private static Item.Properties eztab1() {
        return new Item.Properties().tab(ModCreativeModeTab.PREVMM_TAB_1);
    }
    private static Item.Properties eztab2() {
        return new Item.Properties().tab(ModCreativeModeTab.PREVMM_TAB_2);
    }

    public static final RegistryObject<Item> MITHRIL_RAW = ITEMS.register("mithril_raw",
            () -> new Item(eztab1()));
    public static final RegistryObject<Item> MITHRIL_NUGGET = ITEMS.register("mithril_nugget",
            () -> new Item(eztab1()));
    public static final RegistryObject<Item> MITHRIL_INGOT = ITEMS.register("mithril_ingot",
            () -> new Item(eztab1()));

    public static final RegistryObject<ArmorItem> MITHRIL_HELMET = ITEMS.register("mithril_helmet",
            () -> new MithrilArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.HEAD, eztab2()));
    public static final RegistryObject<ArmorItem> MITHRIL_CHESTPLATE = ITEMS.register("mithril_chestplate",
            () -> new MithrilArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.CHEST, eztab2()));
    public static final RegistryObject<ArmorItem> MITHRIL_LEGGINGS = ITEMS.register("mithril_leggings",
            () -> new MithrilArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.LEGS, eztab2()));
    public static final RegistryObject<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
            () -> new MithrilArmorItem(ModArmorMaterial.MITHRIL, EquipmentSlot.FEET, eztab2()));

    //public static final RegistryObject<ArmorItem> MITHRIL_BOOTS = ITEMS.register("mithril_boots",
    //       () -> new HorseArmorItem(eztab2()));

    public static final RegistryObject<SwordItem> MITHRIL_SWORD = ITEMS.register("mithril_sword",
            () -> new SwordItem(ToolTiers.MITHRIL, 6, -2.4f, eztab2()));
    public static final RegistryObject<PickaxeItem> MITHRIL_PICKAXE = ITEMS.register("mithril_pickaxe",
            () -> new PickaxeItem(ToolTiers.MITHRIL, 4, -2.8f, eztab2()));
    public static final RegistryObject<ShovelItem> MITHRIL_SHOVEL = ITEMS.register("mithril_shovel",
            () -> new ShovelItem(ToolTiers.MITHRIL, 4, -3.0f, eztab2()));
    public static final RegistryObject<AxeItem> MITHRIL_AXE = ITEMS.register("mithril_axe",
            () -> new AxeItem(ToolTiers.MITHRIL, 8, -3.0f,eztab2()));
    public static final RegistryObject<HoeItem> MITHRIL_HOE = ITEMS.register("mithril_hoe",
            () -> new HoeItem(ToolTiers.MITHRIL, 1, -1.0f, eztab2()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    public static class ToolTiers {

        public static final Tier MITHRIL = new ForgeTier(
                3,
                1231,
                10.0f,
                0f,
                20,
                null,
                () -> Ingredient.of(ModItems.MITHRIL_INGOT.get()));

    }
}

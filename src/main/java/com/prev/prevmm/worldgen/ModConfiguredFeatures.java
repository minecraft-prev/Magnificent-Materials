package com.prev.prevmm.worldgen;

import com.google.common.base.Suppliers;
import com.prev.prevmm.Main;
import com.prev.prevmm.block.ModBlocks;
import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;
import java.util.function.Supplier;

public class ModConfiguredFeatures {

    public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES =
            DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, Main.MOD_ID);

    public static final Supplier<List<OreConfiguration.TargetBlockState>> STONE_MITHRIL_REPLACEMENT =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.MITHRIL_ORE.get().defaultBlockState())
                                           ));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> DEEPSLATE_MITHRIL_REPLACEMENT =
            Suppliers.memoize(() -> List.of(
                    OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, ModBlocks.DEEPSLATE_MITHRIL_ORE.get().defaultBlockState())
                                           ));
    public static final Supplier<List<OreConfiguration.TargetBlockState>> NETHERRACK_MITHRIL_REPLACEMENT =
            Suppliers.memoize(() -> List.of(
                            OreConfiguration.target(OreFeatures.NETHERRACK, ModBlocks.NETHERRACK_MITHRIL_ORE.get().defaultBlockState())
                                           ));

    // for other dimensions or stone types, use OreConfiguration.target(new BlockMatchTest(Blocks.SOME_BLOCK), ModBlocks.OTHER_BLOCK.get()... /

    public static final RegistryObject<ConfiguredFeature<?, ?>> MITHRIL_ORE =
            CONFIGURED_FEATURES.register("stone_mithril_ore", () ->
                    new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(STONE_MITHRIL_REPLACEMENT.get(), 3)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> DEEPSLATE_MITHRIL_ORE =
            CONFIGURED_FEATURES.register("deepslate_mithril_ore", () ->
                    new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(DEEPSLATE_MITHRIL_REPLACEMENT.get(), 5)));

    public static final RegistryObject<ConfiguredFeature<?, ?>> NETHERRACK_MITHRIL_ORE =
            CONFIGURED_FEATURES.register("netherrack_mithril_ore", () ->
                    new ConfiguredFeature<>(Feature.ORE, new OreConfiguration(NETHERRACK_MITHRIL_REPLACEMENT.get(), 5)));

}

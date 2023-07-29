package com.prev.prevmm.worldgen;

import com.prev.prevmm.Main;
import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.List;

public class ModPlacedFeatures {

    public static final DeferredRegister<PlacedFeature> PLACED_FEATURES =
            DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, Main.MOD_ID);

    public static final RegistryObject<PlacedFeature> REPLACE_STONE_MITHRIL_ORE = PLACED_FEATURES.register("stone_mithril_ore",
            () -> new PlacedFeature(ModConfiguredFeatures.MITHRIL_ORE.getHolder().get(),
                    commonOrePlacement(12, HeightRangePlacement.uniform(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.absolute(18)
                    ))));
    public static final RegistryObject<PlacedFeature> REPLACE_DEEPSLATE_MITHRIL_ORE = PLACED_FEATURES.register("deepslate_mithril_ore",
            () -> new PlacedFeature(ModConfiguredFeatures.DEEPSLATE_MITHRIL_ORE.getHolder().get(),
                    commonOrePlacement(12, HeightRangePlacement.uniform(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.top()
                    ))));
    public static final RegistryObject<PlacedFeature> REPLACE_NETHERRACK_MITHRIL_ORE = PLACED_FEATURES.register("netherrack_mithril_ore",
            () -> new PlacedFeature(ModConfiguredFeatures.NETHERRACK_MITHRIL_ORE.getHolder().get(),
                    commonOrePlacement(12, HeightRangePlacement.uniform(
                            VerticalAnchor.bottom(),
                            VerticalAnchor.top()
                    ))));

    private static List<PlacementModifier> commonOrePlacement(int countPerChunk, PlacementModifier height) {
        return orePlacement(CountPlacement.of(countPerChunk), height);
    }

    private static List<PlacementModifier> orePlacement(PlacementModifier count, PlacementModifier height) {
        return List.of(count, InSquarePlacement.spread(), height, BiomeFilter.biome());
    }
}

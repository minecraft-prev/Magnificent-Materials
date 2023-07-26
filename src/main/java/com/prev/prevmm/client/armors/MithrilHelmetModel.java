package com.prev.prevmm.client.armors;

import com.prev.prevmm.Main;
import com.prev.prevmm.item.MithrilArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MithrilHelmetModel extends AnimatedGeoModel<MithrilArmorItem> {

    @Override
    public ResourceLocation getModelResource(MithrilArmorItem object) {
        return new ResourceLocation(Main.MOD_ID, "geo/mithril_helmet_armor.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MithrilArmorItem object) {
        return new ResourceLocation(Main.MOD_ID, "textures/models/mithril_helmet_armor.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MithrilArmorItem object) {
        return new ResourceLocation(Main.MOD_ID, "animations/mithril_helmet.animation.json");
    }

}

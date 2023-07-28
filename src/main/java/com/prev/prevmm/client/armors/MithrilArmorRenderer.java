package com.prev.prevmm.client.armors;

import com.prev.prevmm.item.MithrilArmorItem;
import software.bernie.geckolib3.renderers.geo.GeoArmorRenderer;

public class MithrilArmorRenderer extends GeoArmorRenderer<MithrilArmorItem> {
    public MithrilArmorRenderer() {
        super(new MithrilArmorModel());

        this.headBone = "armorHead";
        this.bodyBone = "armorBody";
        this.rightArmBone = "armorLeftArm";
        this.leftArmBone = "armorRightArm";
        this.rightLegBone = "armorLeftLeg";
        this.leftLegBone = "armorRightLeg";
        this.rightBootBone = "armorLeftBoots";
        this.leftBootBone = "armorRightBoots";

    }
}
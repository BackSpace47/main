package net.Mine_Facility.core;

import net.Mine_Facility.items.*;
import net.minecraft.item.Item;

/**
 * Created by magnus on 30.08.2014.
 */
public class MFItems {

    public static Item anthracite;
    public static Item TCAI;

    public static void preInit(){
        anthracite = new itemAnthracite().setCreativeTab(MFCore.MFCoreITab).setUnlocalizedName("Anthracite").setTextureName(MFCore.modid + ":" + "Anthracite");
        TCAI = new itemTCAI().setCreativeTab(MFCore.MFCoreITab).setUnlocalizedName("TCAI").setTextureName(MFCore.modid + ":" + "TCAI");
    }

    public static void init() {
        Recipes.registerItem(anthracite, "Anthracite");
        Recipes.registerItem(TCAI, "TCAI");
    }
}

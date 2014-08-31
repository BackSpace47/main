package net.Mine_Facility.core;

import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Created by magnus on 30.08.2014.
 */
@Mod(modid = MFCore.modid, name = "Mine Facility", version = "Beta 4.0.0")
public class MFCore implements IFuelHandler{

    public static final String modid = "mine_facility";

    public static CreativeTabs MFCoreBTab = new CreativeTabs(modid) {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return Item.getItemFromBlock(MFBlock.jadeBlock);
        }
    };

    public static CreativeTabs MFCoreITab = new CreativeTabs(modid) {
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return MFItems.TCAI;
        }
    };

    //@SidedProxy(clientSide="net.Mine_Facility.proxy.ClientProxy", serverSide="net.Mine_Facility.proxy.CommonProxy")

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        MFBlock.preInit();

        MFItems.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        MFBlock.init();

        MFItems.init();

        MFCrafting.init();

        MFSmelting.init();
    }

    public int getBurnTime(ItemStack fuel) {
        Item item = fuel.getItem();
        if(item == MFItems.anthracite){
            return 6400;
        }
        else{
            return 0;
        }

    }
}

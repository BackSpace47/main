package net.RPower.RPowermod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class itemprotopaintTungstencarbide extends Item{

public boolean hasContainerItem(ItemStack stack)
{
    return stack.getItemDamage()<55;}





    public itemprotopaintTungstencarbide()
     {
             super();
             this.setCreativeTab(CreativeTabs.tabTools);
             this.maxStackSize = 1;
             this.setMaxDamage(8);




     }

     @Override
     public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemstack)
     {
             return true;



     }

     @Override
     public ItemStack getContainerItem(ItemStack itemStack)
     {
        ItemStack cStack = itemStack.copy();
        cStack.setItemDamage(cStack.getItemDamage() + 1);
        cStack.stackSize = 1;
        return cStack;
     }
}



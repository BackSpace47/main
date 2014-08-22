package net.RPower.RPowermod.item;

import java.util.ArrayList;
import java.util.List;

import net.RPower.RPowermod.core.RPCore;
import net.RPower.RPowermod.util.texture.TextureLocation;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class enderCakefresh
  extends Block
{
  public static final String name = "enderCakebaked";
  @SideOnly(Side.CLIENT)
  private IIcon bottomIcon;
  @SideOnly(Side.CLIENT)
  private IIcon sideIcon;
private IIcon field_149761_L;

  public enderCakefresh()
  {
    super(Material.cake);
    TextureLocation.setBlockTexture(this, "enderCakebaked", "rpower");
    func_149676_a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    func_149683_g();
    func_149713_g(-4);
    func_149711_c(2.0F);
  }

  private void func_149711_c(float f) {

}

private void func_149713_g(int i) {

}

private void func_149683_g() {

}

private void func_149676_a(float f, float g, float h, float i, float j, float k) {

}

public boolean func_149662_c()
  {
    return false;
  }

  public Item func_149694_d(World world, int x, int y, int z)
  {
    return RPCore.enderCakefresh;
  }

  public ArrayList<ItemStack> getDrops(World world, int arg1, int arg2, int arg3, int arg4, int arg5)
  {
    ArrayList<ItemStack> toReturn = new ArrayList();

    return toReturn;
  }

  //public boolean func_149742_c(World world, int x, int y, int z)
  {
  //  EntityPlayer player = world.func_72977_a(x, y, z, -1.0D);
 //   if (player == null) {
  //    return false;
    }
 //   if (player.func_70093_af()) {
 //     return true;
 //   }
  //  return false;
 // }

  public int func_149692_a(int metadata)
  {
    return metadata;
  }

  @SideOnly(Side.CLIENT)
  public void func_149666_a(Item par1, CreativeTabs tab, List list)
  {
    for (int i = 0; i < 7; i++) {
      list.add(new ItemStack(this, 1, i));
    }
  }

  public void func_149719_a(IBlockAccess block, int x, int y, int z)
  {
  //  int metadata = block.func_72805_g(x, y, z);
  //  float blockBoundsX = 0.125F * (8.0F - metadata);
  //  func_149676_a(0.0F, 0.0F, 0.0F, blockBoundsX, 0.5F, 1.0F);
  }

 // public boolean func_149727_a(World world, int x, int y, int z, EntityPlayer player, int side, float dx, float dy, float dz)
  {
  //  if (player.func_71024_bL().func_75121_c())
 //   {
  //    int metadata = world.func_72805_g(x, y, z);
   //   if (metadata >= 7) {
   //     world.func_147449_b(x, y, z, Blocks.field_150350_a);
   //   } else {
    //    world.func_72921_c(x, y, z, metadata + 1, 2);
      }
    //  player.func_71024_bL().func_75122_a(2, 2.0F);

   //   return true;
   // }
 //   return false;
 // }

  @SideOnly(Side.CLIENT)
  public IIcon func_149691_a(int side, int par2)
  {
    switch (side)
    {
    case 0:
      return this.bottomIcon;
    case 1:
      return this.field_149761_L;
    }
    return this.sideIcon;
  }

  @SideOnly(Side.CLIENT)
  public void func_149651_a(IIconRegister iconRegister)
  {
   // this.field_149761_L = iconRegister.func_94245_a("RPCore:EnderCakeTopBlockTop");
  //  this.bottomIcon = iconRegister.func_94245_a("RPCore:EnderCakeTopBlockBottom");
   // this.sideIcon = iconRegister.func_94245_a("RPCore:EnderCakeTopBlockSide");
  }
}

package net.RPower.RPowermod.entity;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.RPower.RPowermod.core.RPCore;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.storage.WorldInfo;

public class EntityJadeTNTPrimed extends Entity
{
	private int exXcord;
	private int exYcord;
	private int exZcord;

	private int r;
	private int x;
	private int z;
	private int y;

    /** How long the fuse is */
    public int fuse;
    private EntityLivingBase tntPlacedBy;
	private boolean doBlockNotify;
    private static final String __OBFID = "CL_00001681";

    public EntityJadeTNTPrimed(World par1World)
    {
        super(par1World);
        this.preventEntitySpawning = true;
        this.setSize(0.98F, 0.98F);
        this.yOffset = this.height / 2.0F;
    }

    public EntityJadeTNTPrimed(World par1World, double par2, double par4, double par6, EntityLivingBase par8EntityLivingBase)
    {
        this(par1World);
        this.setPosition(par2, par4, par6);
        float f = (float)(Math.random() * Math.PI * 2.0D);
        this.motionX = (double)(-((float)Math.sin((double)f)) * 0.02F);
        this.motionY = 0.20000000298023224D;
        this.motionZ = (double)(-((float)Math.cos((double)f)) * 0.02F);
        this.fuse = 80;
        this.prevPosX = par2;
        this.prevPosY = par4;
        this.prevPosZ = par6;
        this.tntPlacedBy = par8EntityLivingBase;
        onUpdate(par1World);
    }

    protected void entityInit() {}

    /**
     * returns if this entity triggers Block.onEntityWalking on the blocks they walk on. used for spiders and wolves to
     * prevent them from trampling crops
     */
    protected boolean canTriggerWalking()
    {
        return false;
    }

    /**
     * Returns true if other Entities should be prevented from moving through this Entity.
     */
    public boolean canBeCollidedWith()
    {
        return !this.isDead;
    }

    /**
     * Called to update the entity's position/logic.
     */
    public void onUpdate(World world)
    {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= 0.03999999910593033D;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= 0.9800000190734863D;
        this.motionY *= 0.9800000190734863D;
        this.motionZ *= 0.9800000190734863D;

        if (this.onGround)
        {
            this.motionX *= 0.699999988079071D;
            this.motionZ *= 0.699999988079071D;
            this.motionY *= -0.5D;
        }

        if (this.fuse-- <= 0)
        {


        }
        else
        {
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 1D, 0.0D, 0.0D);
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 1D, 0.0D);
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 1D);
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 1D, 1D, 0.0D);
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 1D, 1D);
            this.worldObj.spawnParticle("smoke", this.posX, this.posY + 0.5D, this.posZ, 1D, 1D, 1D);
			this.worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 0.0D);
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.5D, this.posZ, 1D, 0.0D, 0.0D);
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 1D, 0.0D);
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 0.0D, 1D);
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.5D, this.posZ, 1D, 1D, 0.0D);
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.5D, this.posZ, 0.0D, 1D, 1D);
            this.worldObj.spawnParticle("magicCrit", this.posX, this.posY + 0.5D, this.posZ, 1D, 1D, 1D);


            //this.worldObj.spawnEntityInWorld(p_72838_1_)
            //http://minecraft.gamepedia.com/Data_values/Entity_IDs
            //^^Magnus




            this.setDead();
            this.explode(world);

        }
    }

    private void explode(World world)
    {
    	if (this.posX < 0){
    		exXcord = (int) this.posX - 1;
    	} else {
    		exXcord = (int) this.posX;
    	}
    	exYcord = (int) this.posY;
    	exZcord = (int) this.posZ;
    	int radius = 4;
        int radiusSquared = (radius*radius)+1;
    	for(int targetX=-(radius);targetX<=(radius); targetX++)
        {
             for(int targetY=-(radius);targetY<=(radius); targetY++)
             {
                 for(int targetZ=-(radius);targetZ<=(radius); targetZ++)
                 {
                	 if((((targetX*targetX)+(targetY*targetY))<=radiusSquared)&&(((targetX*targetX)+(targetZ*targetZ))<=radiusSquared)&&(((targetY*targetY)+(targetZ*targetZ))<=radiusSquared)){
                	 System.out.println("Testing:"+(exXcord+targetX)+","+(exYcord+targetY)+","+(exZcord+targetZ)+",");
                         if(this.worldObj.getBlock(exXcord+targetX, exYcord+targetY, exZcord+targetZ)==Blocks.air){
                        	 setBlockAndNotifyAdequately(world, exXcord+targetX, exYcord+targetY, exZcord+targetZ, RPCore.obsidianWhite, 0);
                     }
                	 }
                 }
             }
         }
    	int radius2 = 2;
        int radiusSquared2 = (radius2*radius2)+1;
    	for(int targetX2=-(radius2);targetX2<=(radius2); targetX2++)
        {
             for(int targetY2=-(radius2);targetY2<=(radius2); targetY2++)
             {
                 for(int targetZ2=-(radius2);targetZ2<=(radius2); targetZ2++)
                 {
                	 if((((targetX2*targetX2)+(targetY2*targetY2))<radiusSquared2)&&(((targetX2*targetX2)+(targetZ2*targetZ2))<radiusSquared2)&&(((targetY2*targetY2)+(targetZ2*targetZ2))<radiusSquared2)){
                	 System.out.println("Testing:"+(exXcord+targetX2)+","+(exYcord+targetY2)+","+(exZcord+targetZ2)+",");
                         if(this.worldObj.getBlock(exXcord+targetX2, exYcord+targetY2, exZcord+targetZ2)==RPCore.obsidianWhite){
                        	 setBlockAndNotifyAdequately(world, exXcord+targetX2, exYcord+targetY2, exZcord+targetZ2, RPCore.oreSilicon, 0);
                     }
                	 }
                 }
             }
         }

    }

    /**
     * (abstract) Protected helper method to write subclass entity data to NBT.
     */
    protected void writeEntityToNBT(NBTTagCompound par1NBTTagCompound)
    {
        par1NBTTagCompound.setByte("Fuse", (byte)this.fuse);
    }

    /**
     * (abstract) Protected helper method to read subclass entity data from NBT.
     */
    protected void readEntityFromNBT(NBTTagCompound par1NBTTagCompound)
    {
        this.fuse = par1NBTTagCompound.getByte("Fuse");
    }

    @SideOnly(Side.CLIENT)
    public float getShadowSize()
    {
        return 0.0F;
    }

    /**
     * returns null or the entityliving it was placed or ignited by
     */
    public EntityLivingBase getTntPlacedBy()
    {
        return this.tntPlacedBy;
    }

    protected void setBlockAndNotifyAdequately(World p_150516_1_, int p_150516_2_, int p_150516_3_, int p_150516_4_, Block p_150516_5_, int p_150516_6_)
    {
        if (this.doBlockNotify)
        {
            p_150516_1_.setBlock(p_150516_2_, p_150516_3_, p_150516_4_, p_150516_5_, p_150516_6_, 4);
        }
        else
        {
            p_150516_1_.setBlock(p_150516_2_, p_150516_3_, p_150516_4_, p_150516_5_, p_150516_6_, 3);
        }
    }
}

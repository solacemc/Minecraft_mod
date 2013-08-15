package net.minecraft.src;

public class ItemTpEgg extends Item
{
    public ItemTpEgg(int par1)
    {
        super(par1);
        this.maxStackSize = 64;
        this.setCreativeTab(CreativeTabs.tabRedstone);
    }

    /**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
    public ItemStack onItemRightClick(ItemStack par1ItemStack, World par2World, EntityPlayer par3EntityPlayer)
    {
        //if (par3EntityPlayer.capabilities.isCreativeMode)
        // {
        //return par1ItemStack;
        // }
        //else
        {
            --par1ItemStack.stackSize;
            par2World.playSoundAtEntity(par3EntityPlayer, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

            if (!par2World.isRemote)
            {
                par2World.spawnEntityInWorld(new EntityTpEgg(par2World, par3EntityPlayer));
            }

            return par1ItemStack;
        }
    }
}
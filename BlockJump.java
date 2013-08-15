package net.minecraft.src;

public class BlockJump extends Block
{
    public BlockJump(int par1, Material par2)
    {
        super(par1, par2);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

    public void onEntityWalking(World world, int x, int y, int z, Entity entity)
    {
        // Add to the entities upward velocity to send them up into the air
        entity.motionY += 2.0;
    }

    public void onFallenUpon(World par1World, int par2, int par3, int par4, Entity entity, float par6)
    {
        entity.motionY += 3.0;
    }

    public int idDropped()
    {
        return 251;
    }
}
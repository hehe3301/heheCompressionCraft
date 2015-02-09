package hehe.CompressionCraft.blocks;

import hehe.CompressionCraft.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Compresser extends Block implements ITileEntityProvider {
	
	public static String name = "blockCompresser";
	private String privName="blockCompresser";

	protected Compresser() {
		super(Material.rock);
		setHardness(1);
		setBlockName(privName);
		setCreativeTab(ModItems.heheTweaks);
		GameRegistry.registerBlock(this, privName);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int meta) {
		// TODO Auto-generated method stub
		return new TileEntityCompresser();
	}

	@Override
	public boolean hasTileEntity(int meta){
		return true;
	}
}

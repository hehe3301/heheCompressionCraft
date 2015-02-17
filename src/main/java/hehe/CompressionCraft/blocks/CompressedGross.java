package hehe.CompressionCraft.blocks;

import hehe.CompressionCraft.items.ItemBlockCompressedGross;
import hehe.CompressionCraft.items.ModItems;

import java.util.List;

import lib.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import cpw.mods.fml.common.registry.GameRegistry;

public class CompressedGross extends Block {

	private final String name = "compressedGross";
	private final int maxMeta = 5;
	private IIcon[] icons;

	public CompressedGross() {
		super(Material.cloth);
		setHardness(1);
		setBlockName(Constants.MODID + "_" + name);
		setCreativeTab(ModItems.heheTweaks);
		icons = new IIcon[maxMeta];
		GameRegistry.registerBlock(this, ItemBlockCompressedGross.class, name);
	}

	@Override
	public void registerBlockIcons(IIconRegister iconRegister) {
		for (int i = 0; i < icons.length; i++) {
			icons[i]=iconRegister.registerIcon(Constants.MODID + ":" + name + i);
		}
	}

	@Override
	public IIcon getIcon(int side, int meta) {
		return icons[meta%maxMeta];
	}
	@Override
	public int damageDropped(int meta){
		return meta;
	}
	
	
	public void getSubBlocks(Item item, CreativeTabs creativeTabs, List list){
		for(int i = 0; i <maxMeta; i++){
			list.add(new ItemStack(item, 1, i));
		}
	}
	
}

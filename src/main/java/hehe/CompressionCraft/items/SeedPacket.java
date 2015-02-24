package hehe.CompressionCraft.items;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import hehe.CompressionCraft.Constants;

public class SeedPacket extends Item {

	private final String name = "SeedPacket";
	private final static String[] subNames = { "Wheat", "Pumpkin", "Melon" };
	private final int maxMeta = subNames.length;
	public static IIcon[] textures = new IIcon[subNames.length];
	private IIcon[] icons;

	public SeedPacket() {
		setHasSubtypes(true);
		setMaxDamage(0);
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(ModItems.heheTweaks);
	}

	@Override
	public String getUnlocalizedName(ItemStack par1ItemStack) {
		return Constants.MODID +"." +name + "." + subNames[par1ItemStack.getItemDamage()];
	}

	@Override
	public IIcon getIconFromDamage(int meta) {
		return textures[meta];
	}

	@Override
	public void getSubItems(Item item, CreativeTabs tabs, List list) {
		for (int i = 0; i < subNames.length; i++) {
			list.add(new ItemStack(item, 1, i));
		}
	}

	@Override
	public void registerIcons(IIconRegister par1IconRegister) {
		for (int i = 0; i < subNames.length; i++) {
			textures[i] = par1IconRegister.registerIcon(Constants.MODID
					+ subNames[i]);
		}
	}

}

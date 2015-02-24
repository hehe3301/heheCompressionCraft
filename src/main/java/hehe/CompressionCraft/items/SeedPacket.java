package hehe.CompressionCraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import hehe.CompressionCraft.Constants;

public class SeedPacket extends Item {

	private final String name = "SeedPacket";
	private final static String[] subNames = {"Wheat", "Pumpkin", "Melon"};
	public SeedPacket(){
		setHasSubtypes(true);
		setMaxDamage(0);
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getUnlocalizedName(ItemStack itemStack) {
		return getUnlocalizedName() + "." + subNames[itemStack.getItemDamage()];
	}
	
	
}

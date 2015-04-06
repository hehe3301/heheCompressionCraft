package hehe.CompressionCraft.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import hehe.CompressionCraft.Constants;

public class TestItem extends Item {
	private final String name = "testItem";

	public TestItem() {
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}

}

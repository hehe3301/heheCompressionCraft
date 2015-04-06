package hehe.CompressionCraft;

import hehe.CompressionCraft.blocks.ModBlocks;
import hehe.CompressionCraft.items.ModItems;
import hehe.CompressionCraft.proxy.CommonProxy;
import hehe.CompressionCraft.recipes.ModRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.*;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)
public class CompressionCraft {

	@SidedProxy(clientSide = Constants.CLIENT_PROXY, serverSide = Constants.COMMON_PROXY)
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		ModBlocks.init();
		ModItems.init();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.registerTileEntities();
		ModRecipes.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}

package hehe.CompressionCraft.proxy;

import hehe.CompressionCraft.blocks.Compresser;
import hehe.CompressionCraft.blocks.TileEntityCompresser;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {
	public void registerTileEntities(){
		GameRegistry.registerTileEntity(TileEntityCompresser.class, TileEntityCompresser.name);
	}

}

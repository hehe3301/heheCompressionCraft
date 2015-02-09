package hehe.CompressionCraft.blocks;

import net.minecraft.tileentity.TileEntity;

public class TileEntityCompresser extends TileEntity {
	public static String name = "tileEntityCompresser";

	int tick = 0;

	public void updateEntity() {
		if (!worldObj.isRemote) {
			tick++;
			if (tick == 100) {
				worldObj.setWorldTime(1000);
				tick = 0;
			}
		}
	}
}

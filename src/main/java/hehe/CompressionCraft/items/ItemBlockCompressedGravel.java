package hehe.CompressionCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCompressedGravel extends ItemBlock {

	private final static String[] subNames = { "x1CompressedGravel",
			"x2CompressedGravel" };

	public ItemBlockCompressedGravel(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return getUnlocalizedName() + "." + subNames[itemStack.getItemDamage()];
	}

	@Override
	public int getMetadata(int meta) {
		return meta;
	}

}
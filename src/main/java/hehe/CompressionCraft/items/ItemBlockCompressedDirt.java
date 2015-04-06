package hehe.CompressionCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCompressedDirt extends ItemBlock {

	private final static String[] subNames = { "x1CompressedDirt",
			"x2CompressedDirt", "x3CompressedDirt", "x4CompressedDirt" };

	public ItemBlockCompressedDirt(Block block) {
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
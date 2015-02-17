package hehe.CompressionCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCompressedStone extends ItemBlock {

	private final static String[] subNames = { "x1CompressedStone",
			"x2CompressedStone", "x3CompressedStone", "x4CompressedStone",
			"x5CompressedStone", "x6CompressedStone", "x7CompressedStone",
			"x8CompressedStone" };

	public ItemBlockCompressedStone(Block block) {
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

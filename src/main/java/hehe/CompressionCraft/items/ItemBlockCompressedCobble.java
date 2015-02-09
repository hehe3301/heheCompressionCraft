package hehe.CompressionCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCompressedCobble extends ItemBlock {

	private final static String[] subNames = { "x1CompressedCobble",
			"x2CompressedCobble", "x3CompressedCobble", "x4CompressedCobble",
			"x5CompressedCobble", "x6CompressedCobble", "x7CompressedCobble",
			"x8CompressedCobble" };

	public ItemBlockCompressedCobble(Block block) {
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

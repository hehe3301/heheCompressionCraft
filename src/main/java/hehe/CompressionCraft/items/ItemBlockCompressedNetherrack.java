package hehe.CompressionCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCompressedNetherrack extends ItemBlock {

	private final static String[] subNames = { "x1CompressedNetherrack",
			"x2CompressedNetherrack", "x3CompressedNetherrack",
			"x4CompressedNetherrack", "x5CompressedNetherrack",
			"x6CompressedNetherrack", "x7CompressedNetherrack",
			"x8CompressedNetherrack" };

	public ItemBlockCompressedNetherrack(Block block) {
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

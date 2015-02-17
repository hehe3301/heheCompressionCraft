package hehe.CompressionCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCompressedGross extends ItemBlock {

	private final static String[] subNames = { "CompressedZombie",
			"CompressedRawChicken", "CompressedRawPig", "CompressedRawCow", "CompressedRawFish"};

	public ItemBlockCompressedGross(Block block) {
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
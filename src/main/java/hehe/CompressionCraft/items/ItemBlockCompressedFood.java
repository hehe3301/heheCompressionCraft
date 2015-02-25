package hehe.CompressionCraft.items;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockCompressedFood extends ItemBlock {

	private final static String[] subNames = { "CompressedBread", "CompressedBakedPotatos", "CompressedCookies"};

	public ItemBlockCompressedFood(Block block) {
		super(block);
		setHasSubtypes(true);
	}

	@Override
	public String getUnlocalizedName(ItemStack itemStack) {
		return getUnlocalizedName() + "." + subNames[itemStack.getItemDamage()%subNames.length];
	}

	@Override
	public int getMetadata(int meta) {
		return meta%subNames.length;
	}

}
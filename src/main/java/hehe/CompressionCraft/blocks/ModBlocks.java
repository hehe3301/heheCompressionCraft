package hehe.CompressionCraft.blocks;

import net.minecraft.block.Block;

public class ModBlocks {
	public static Block compressedCobble;
	public static Block compressedDirt;
	public static Block creditsBlock;
	public static Block compresser;
	public static Block compressedSand;
	public static Block compressedGravel;
	
	
	

	public static void init() {
		creditsBlock = new CreditsBlock();
		compressedCobble = new CompressedCobble();
		compressedDirt =new CompressedDirt();
		compressedSand = new CompressedSand();
		compressedGravel = new CompressedGravel();
		
		
		
		
		
		compresser = new Compresser();
	}

}
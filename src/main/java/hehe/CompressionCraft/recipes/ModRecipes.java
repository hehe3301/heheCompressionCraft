package hehe.CompressionCraft.recipes;

import hehe.CompressionCraft.blocks.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

	public static void init() {
		//De-compressing cobble
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9), new ItemStack(ModBlocks.compressedCobble, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 9, 0), new ItemStack(ModBlocks.compressedCobble, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 9, 1), new ItemStack(ModBlocks.compressedCobble, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 9, 2), new ItemStack(ModBlocks.compressedCobble, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 9, 3), new ItemStack(ModBlocks.compressedCobble, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 9, 4), new ItemStack(ModBlocks.compressedCobble, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 9, 5), new ItemStack(ModBlocks.compressedCobble, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 9, 6), new ItemStack(ModBlocks.compressedCobble, 1, 7));
		//compressing x0 cobble -> x1 cobble
		ItemStack cobble =  new ItemStack(Blocks.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 0),cobble,cobble,cobble,cobble,cobble,cobble,cobble,cobble, cobble);
		//compressing x1 cobble -> x2 cobble
		ItemStack compressedCobble0 =  new ItemStack(ModBlocks.compressedCobble, 1, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 1),compressedCobble0, compressedCobble0, compressedCobble0, compressedCobble0, compressedCobble0, compressedCobble0, compressedCobble0, compressedCobble0, compressedCobble0);
		//compressing x2 cobble -> x3 cobble
		ItemStack compressedCobble1 =  new ItemStack(ModBlocks.compressedCobble, 1, 1);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 2),compressedCobble1, compressedCobble1, compressedCobble1, compressedCobble1, compressedCobble1, compressedCobble1, compressedCobble1, compressedCobble1, compressedCobble1);
		//compressing x3 cobble -> x4 cobble
		ItemStack compressedCobble2 =  new ItemStack(ModBlocks.compressedCobble, 1, 2);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 3),compressedCobble2, compressedCobble2, compressedCobble2, compressedCobble2, compressedCobble2, compressedCobble2, compressedCobble2, compressedCobble2, compressedCobble2);
		//compressing x4 cobble -> x5 cobble
		ItemStack compressedCobble3 =  new ItemStack(ModBlocks.compressedCobble, 1, 3);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 4),compressedCobble3, compressedCobble3, compressedCobble3, compressedCobble3, compressedCobble3, compressedCobble3, compressedCobble3, compressedCobble3, compressedCobble3);
		//compressing x5 cobble -> x6 cobble
		ItemStack compressedCobble4 =  new ItemStack(ModBlocks.compressedCobble, 1, 4);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 5),compressedCobble4, compressedCobble4, compressedCobble4, compressedCobble4, compressedCobble4, compressedCobble4, compressedCobble4, compressedCobble4, compressedCobble4);	
		//compressing x6 cobble -> x7 cobble
		ItemStack compressedCobble5 =  new ItemStack(ModBlocks.compressedCobble, 1, 5);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 6),compressedCobble5, compressedCobble5, compressedCobble5, compressedCobble5, compressedCobble5, compressedCobble5, compressedCobble5, compressedCobble5, compressedCobble5);
		//compressing x7 cobble -> x8 cobble
		ItemStack compressedCobble6 =  new ItemStack(ModBlocks.compressedCobble, 1, 6);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 7),compressedCobble6, compressedCobble6, compressedCobble6, compressedCobble6, compressedCobble6, compressedCobble6, compressedCobble6, compressedCobble6, compressedCobble6);
							
		
		//Decompressing Dirt
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 9), new ItemStack(ModBlocks.compressedDirt, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 9, 0), new ItemStack(ModBlocks.compressedDirt, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 9, 1), new ItemStack(ModBlocks.compressedDirt, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 9, 2), new ItemStack(ModBlocks.compressedDirt, 1, 3));
		//compressing x0 dirt -> x1 dirt
		ItemStack dirt =  new ItemStack(Blocks.dirt);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 1, 0),dirt,dirt,dirt,dirt,dirt,dirt,dirt,dirt, dirt);
		//compressing x1 dirt -> x2 dirt
		ItemStack compressedDirt0 =  new ItemStack(ModBlocks.compressedDirt, 1, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 1, 1),compressedDirt0, compressedDirt0, compressedDirt0, compressedDirt0, compressedDirt0, compressedDirt0, compressedDirt0, compressedDirt0, compressedDirt0);
		//compressing x2 dirt -> x3 dirt
		ItemStack compressedDirt1 =  new ItemStack(ModBlocks.compressedDirt, 1, 1);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 1, 2),compressedDirt1, compressedDirt1, compressedDirt1, compressedDirt1, compressedDirt1, compressedDirt1, compressedDirt1, compressedDirt1, compressedDirt1);
		//compressing x3 dirt -> x4 dirt
		ItemStack compressedDirt2 =  new ItemStack(ModBlocks.compressedDirt, 1, 2);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 1, 3),compressedDirt2, compressedDirt2, compressedDirt2, compressedDirt2, compressedDirt2, compressedDirt2, compressedDirt2, compressedDirt2, compressedDirt2);
				
		
		
		
		
		
		//All my Gravel		
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.gravel, 9), new ItemStack(ModBlocks.compressedGravel, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGravel, 9, 0), new ItemStack(ModBlocks.compressedGravel, 1, 1));
		//compressing x0 gravel -> x1 gravel
		ItemStack gravel =  new ItemStack(Blocks.gravel);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGravel, 1, 0),gravel,gravel,gravel,gravel,gravel,gravel,gravel,gravel, gravel);
		//compressing x1 gravel -> x2 gravel
		ItemStack compressedGravel0 =  new ItemStack(ModBlocks.compressedGravel, 1, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGravel, 1, 1),compressedGravel0, compressedGravel0, compressedGravel0, compressedGravel0, compressedGravel0, compressedGravel0, compressedGravel0, compressedGravel0, compressedGravel0);
				
		
		//All my Sand
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 9), new ItemStack(ModBlocks.compressedSand, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSand, 9, 0), new ItemStack(ModBlocks.compressedSand, 1, 1));
		//compressing x0 sand -> x1 sand
		ItemStack sand =  new ItemStack(Blocks.sand);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSand, 1, 0),sand,sand,sand,sand,sand,sand,sand,sand, sand);
		//compressing x1 sand -> x2 sand
		ItemStack compressedSand0 =  new ItemStack(ModBlocks.compressedSand, 1, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSand, 1, 1),compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0);
						
				
	
	}

}

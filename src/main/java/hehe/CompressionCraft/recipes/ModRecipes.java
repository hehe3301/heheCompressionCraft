package hehe.CompressionCraft.recipes;

import hehe.CompressionCraft.blocks.ModBlocks;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

	public static void init() {
		ItemStack chest = new ItemStack(Blocks.log);
		GameRegistry.addRecipe(new ItemStack(Blocks.chest, 4), "xxx", "x x", "xxx", 'x', chest);
		ItemStack chest2 = new ItemStack(Blocks.log, 1, 1 ); 
		GameRegistry.addRecipe(new ItemStack(Blocks.chest, 4), "xxx", "x x", "xxx", 'x', chest2);
		ItemStack chest3 = new ItemStack(Blocks.log, 1, 2 ); 
		GameRegistry.addRecipe(new ItemStack(Blocks.chest, 4), "xxx", "x x", "xxx", 'x', chest3);
		ItemStack chest4 = new ItemStack(Blocks.log, 1, 3 ); 
		GameRegistry.addRecipe(new ItemStack(Blocks.chest, 4), "xxx", "x x", "xxx", 'x', chest4);
		
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
			
		//De-compressing Stone
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.stone, 9), new ItemStack(ModBlocks.compressedStone, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 9, 0), new ItemStack(ModBlocks.compressedStone, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 9, 1), new ItemStack(ModBlocks.compressedStone, 1, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 9, 2), new ItemStack(ModBlocks.compressedStone, 1, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 9, 3), new ItemStack(ModBlocks.compressedStone, 1, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 9, 4), new ItemStack(ModBlocks.compressedStone, 1, 5));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 9, 5), new ItemStack(ModBlocks.compressedStone, 1, 6));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 9, 6), new ItemStack(ModBlocks.compressedStone, 1, 7));
		//compressing x0 stone -> x1 stone
		ItemStack stone =  new ItemStack(Blocks.stone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 0),stone,stone,stone,stone,stone,stone,stone,stone, stone);
		//compressing x1 stone -> x2 stone
		ItemStack compressedStone0 =  new ItemStack(ModBlocks.compressedStone, 1, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 1),compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0);
		//compressing x2 stone -> x3 stone
		ItemStack compressedStone1 =  new ItemStack(ModBlocks.compressedStone, 1, 1);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 2),compressedStone1, compressedStone1, compressedStone1, compressedStone1, compressedStone1, compressedStone1, compressedStone1, compressedStone1, compressedStone1);
		//compressing x3 stone -> x4 stone
		ItemStack compressedStone2 =  new ItemStack(ModBlocks.compressedStone, 1, 2);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 3),compressedStone2, compressedStone2, compressedStone2, compressedStone2, compressedStone2, compressedStone2, compressedStone2, compressedStone2, compressedStone2);
		//compressing x4 stone -> x5 stone
		ItemStack compressedStone3 =  new ItemStack(ModBlocks.compressedStone, 1, 3);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 4),compressedStone3, compressedStone3, compressedStone3, compressedStone3, compressedStone3, compressedStone3, compressedStone3, compressedStone3, compressedStone3);
		//compressing x5 stone -> x6 stone
		ItemStack compressedStone4 =  new ItemStack(ModBlocks.compressedStone, 1, 4);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 5),compressedStone4, compressedStone4, compressedStone4, compressedStone4, compressedStone4, compressedStone4, compressedStone4, compressedStone4, compressedStone4);	
		//compressing x6 stone -> x7 stone
		ItemStack compressedStone5 =  new ItemStack(ModBlocks.compressedStone, 1, 5);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 6),compressedStone5, compressedStone5, compressedStone5, compressedStone5, compressedStone5, compressedStone5, compressedStone5, compressedStone5, compressedStone5);
		//compressing x7 stone -> x8 stone
		ItemStack compressedStone6 =  new ItemStack(ModBlocks.compressedStone, 1, 6);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 7),compressedStone6, compressedStone6, compressedStone6, compressedStone6, compressedStone6, compressedStone6, compressedStone6, compressedStone6, compressedStone6);
		
		//Rotten_Flesh
		ItemStack zFlesh = new ItemStack(Items.rotten_flesh, 9);
		GameRegistry.addShapelessRecipe(zFlesh, new ItemStack(ModBlocks.compressedGross, 9, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGross, 0),zFlesh,zFlesh,zFlesh,zFlesh,zFlesh,zFlesh,zFlesh,zFlesh, zFlesh);
		//Raw Chicken
		ItemStack rChicken = new ItemStack(Items.chicken, 9);
		GameRegistry.addShapelessRecipe(rChicken, new ItemStack(ModBlocks.compressedGross, 9, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGross, 1, 1),rChicken,rChicken,rChicken,rChicken,rChicken,rChicken,rChicken,rChicken, rChicken);
		//Raw Pork
		ItemStack rPork = new ItemStack(Items.porkchop, 9);
		GameRegistry.addShapelessRecipe(rPork, new ItemStack(ModBlocks.compressedGross, 9, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGross, 1, 2),rPork,rPork,rPork,rPork,rPork,rPork,rPork,rPork, rPork);
		//Raw Beef
		ItemStack rBeef = new ItemStack(Items.beef, 9);
		GameRegistry.addShapelessRecipe(rBeef, new ItemStack(ModBlocks.compressedGross, 9, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGross, 1, 3),rBeef,rBeef,rBeef,rBeef,rBeef,rBeef,rBeef,rBeef, rBeef);
		//Raw Fish
		ItemStack rfish = new ItemStack(Items.fish, 9);
		GameRegistry.addShapelessRecipe(rfish, new ItemStack(ModBlocks.compressedGross, 9, 4));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedGross, 1, 4),rfish,rfish,rfish,rfish,rfish,rfish,rfish,rfish, rfish);
		
		//Cooked Chicken
		ItemStack Chicken = new ItemStack(Items.cooked_chicken, 9);
		GameRegistry.addShapelessRecipe(Chicken, new ItemStack(ModBlocks.compressedYum, 9, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedYum, 1, 0),Chicken,Chicken,Chicken,Chicken,Chicken,Chicken,Chicken,Chicken, Chicken);
		//Cooked Pork
		ItemStack Pork = new ItemStack(Items.cooked_porkchop, 9);
		GameRegistry.addShapelessRecipe(Pork, new ItemStack(ModBlocks.compressedYum, 9, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedYum, 1, 1),Pork,Pork,Pork,Pork,Pork,Pork,Pork,Pork,Pork);
		//Cooked Beef
		ItemStack Beef = new ItemStack(Items.cooked_beef, 9);
		GameRegistry.addShapelessRecipe(Beef, new ItemStack(ModBlocks.compressedYum, 9, 2));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedYum, 1, 2),Beef,Beef,Beef,Beef,Beef,Beef,Beef,Beef,Beef);
		//Cooked Fish
		ItemStack fish = new ItemStack(Items.cooked_fished, 9);
		GameRegistry.addShapelessRecipe(fish, new ItemStack(ModBlocks.compressedYum, 9, 3));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedYum, 1, 3),fish,fish,fish,fish,fish,fish,fish,fish,fish);
				
		
		
		
				
	
	}

}

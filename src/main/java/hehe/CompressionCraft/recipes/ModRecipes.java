package hehe.CompressionCraft.recipes;

import hehe.CompressionCraft.blocks.ModBlocks;
import hehe.CompressionCraft.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ModRecipes {

	public static void init() {
		
		for(int i=0; i<4; i++){
			ItemStack chest = new ItemStack(Blocks.log, 1, i);
			GameRegistry.addRecipe(new ItemStack(Blocks.chest, 4), "xxx", "x x", "xxx", 'x', chest);
		}
		
		//De-compressing cobble
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.cobblestone, 9), new ItemStack(ModBlocks.compressedCobble, 0));
		//compressing x0 cobble -> x1 cobble
		ItemStack cobble =  new ItemStack(Blocks.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, 0),cobble,cobble,cobble,cobble,cobble,cobble,cobble,cobble, cobble);
		for(int i=0; i<=6; i++){
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 9, i), new ItemStack(ModBlocks.compressedCobble, 1, i+1));
			ItemStack compressedI =  new ItemStack(ModBlocks.compressedCobble, 1, i);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedCobble, 1, i+1),compressedI, compressedI, compressedI, compressedI, compressedI, compressedI, compressedI, compressedI, compressedI);
		}
		
		//Decompressing Dirt
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.dirt, 9), new ItemStack(ModBlocks.compressedDirt, 0));
		//compressing x0 dirt -> x1 dirt
		ItemStack dirt =  new ItemStack(Blocks.dirt);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 1, 0),dirt,dirt,dirt,dirt,dirt,dirt,dirt,dirt, dirt);
		for(int i=0; i<3; i++){
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 9, i), new ItemStack(ModBlocks.compressedDirt, 1, i+1));
			ItemStack tmp = new ItemStack(ModBlocks.compressedDirt, 1, i);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedDirt, 1, i+1),tmp, tmp, tmp, tmp, tmp, tmp, tmp, tmp, tmp);
		}
		
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
		//compressing stone
		ItemStack stone =  new ItemStack(Blocks.stone);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, 0),stone,stone,stone,stone,stone,stone,stone,stone, stone);
		for(int i=0; i<8; i++){
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 9, i), new ItemStack(ModBlocks.compressedStone, 1, i+1));
			ItemStack compressedStone0 =  new ItemStack(ModBlocks.compressedStone, 1, i);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedStone, 1, i+1),compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0);
			
		}
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
				
		//De-compressing Stone
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.netherrack, 9), new ItemStack(ModBlocks.compressedNetherrack, 0));
		//compressing stone
		ItemStack netherrack =  new ItemStack(Blocks.netherrack);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedNetherrack, 1, 0),netherrack,netherrack,netherrack,netherrack,netherrack,netherrack,netherrack,netherrack, netherrack);
		for(int i=0; i<8; i++){
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedNetherrack, 9, i), new ItemStack(ModBlocks.compressedNetherrack, 1, i+1));
			ItemStack compressedStone0 =  new ItemStack(ModBlocks.compressedNetherrack, 1, i);
			GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedNetherrack, 1, i+1),compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0, compressedStone0);
			
		}
		
		for(int i=0; i<8; i++){ //adds smelting compressed cobble into compressed stone
			GameRegistry.addSmelting(new ItemStack(ModBlocks.compressedCobble,1, i ), new ItemStack(ModBlocks.compressedStone,1, i ), 0.1f);
		}
		
		ItemStack wheatSeeds = new ItemStack(Items.wheat_seeds, 9, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.seedPacket, 1, 0),wheatSeeds, wheatSeeds, wheatSeeds, wheatSeeds, wheatSeeds, wheatSeeds, wheatSeeds, wheatSeeds, wheatSeeds);
		GameRegistry.addShapelessRecipe(wheatSeeds, new ItemStack(ModItems.seedPacket, 1, 0));
		
		ItemStack pumpkinSeeds = new ItemStack(Items.pumpkin_seeds, 9, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.seedPacket, 1, 1),pumpkinSeeds, pumpkinSeeds, pumpkinSeeds, pumpkinSeeds, pumpkinSeeds, pumpkinSeeds, pumpkinSeeds, pumpkinSeeds, pumpkinSeeds);
		GameRegistry.addShapelessRecipe(pumpkinSeeds, new ItemStack(ModItems.seedPacket, 1, 1));
		
		ItemStack melonSeeds = new ItemStack(Items.melon_seeds, 9, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModItems.seedPacket, 1, 2),melonSeeds, melonSeeds, melonSeeds, melonSeeds, melonSeeds, melonSeeds, melonSeeds, melonSeeds, melonSeeds);
		GameRegistry.addShapelessRecipe(melonSeeds, new ItemStack(ModItems.seedPacket, 1, 2));
		
		ItemStack bread = new ItemStack(Items.bread, 9, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedFood, 1, 0),bread, bread, bread, bread, bread, bread, bread, bread, bread);
		GameRegistry.addShapelessRecipe(bread, new ItemStack(ModBlocks.compressedFood, 1, 0));
		
		ItemStack potato = new ItemStack(Items.baked_potato, 9, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedFood, 1, 1),potato, potato, potato, potato, potato, potato, potato, potato, potato);
		GameRegistry.addShapelessRecipe(potato, new ItemStack(ModBlocks.compressedFood, 1, 1));
		
		ItemStack cookies = new ItemStack(Items.cookie, 9, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedFood, 1, 2),cookies, cookies, cookies, cookies, cookies, cookies, cookies, cookies, cookies);
		GameRegistry.addShapelessRecipe(cookies, new ItemStack(ModBlocks.compressedFood, 1, 2));
		
		
	}

}

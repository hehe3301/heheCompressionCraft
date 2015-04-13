package hehe.CompressionCraft.recipes;

import hehe.CompressionCraft.blocks.ModBlocks;
import hehe.CompressionCraft.items.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.oredict.ShapelessOreRecipe;

public class ModRecipes {
	
	public static void init() {
		
		//OreDict
		OreDictionary.registerOre("netherrack", new ItemStack(Blocks.netherrack));
		OreDictionary.registerOre("dirt", new ItemStack(Blocks.dirt));
		OreDictionary.registerOre("gravel", new ItemStack(Blocks.gravel));
		
		
		for(int i = 0; i<8; i++){
		OreDictionary.registerOre("cobbleCompressedx"+(i+1), new ItemStack(ModBlocks.compressedCobble, 1, i)) ;
		OreDictionary.registerOre("stoneCompressedx"+(i+1), new ItemStack(ModBlocks.compressedStone, 1, i)) ;
		OreDictionary.registerOre("netherrackCompressedx"+(i+1), new ItemStack(ModBlocks.compressedNetherrack, 1, i)) ;
		}
		for(int i = 0; i<4; i++){
			OreDictionary.registerOre("dirtCompressedx"+(i+1), new ItemStack(ModBlocks.compressedDirt, 1, i)) ;
		}
		for(int i = 0; i<2; i++){
			OreDictionary.registerOre("gravelCompressedx"+(i+1), new ItemStack(ModBlocks.compressedGravel, 1, i)) ;
			OreDictionary.registerOre("sandCompressedx"+(i+1), new ItemStack(ModBlocks.compressedSand, 1, i)) ;
		}
		
		//Recipes
		
		//add a recipie for chests 4 at a time.
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.chest, 4),
				"xxx",
				"x x",
				"xxx",
				'x', "logWood"
			));
		//De-compressing cobble
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(Blocks.cobblestone, 9), "cobbleCompressedx1"));
		//compressing x0 cobble -> x1 cobble
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedCobble, 1, 0), "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone", "cobblestone"));
		
		//de-compressing Stone
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(Blocks.stone, 9), "stoneCompressedx1"));
		//compressing stone
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedStone, 1, 0), "stone", "stone", "stone", "stone", "stone", "stone", "stone", "stone", "stone"));
		
		//de-compressing netherrack
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(Blocks.netherrack, 9), "netherrackCompressedx1"));
		//compressing netherrack
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedNetherrack, 1, 0), "netherrack", "netherrack", "netherrack", "netherrack", "netherrack", "netherrack", "netherrack", "netherrack", "netherrack"));
		
		for(int i=0; i<7; i++){
			//de-compresses cobblestone
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedCobble, 9, i),"cobbleCompressedx"+(i+2)));
			//compresses cobblestone
			GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedCobble, 1, i+1), "cobbleCompressedx"+(i+1), "cobbleCompressedx"+(i+1), "cobbleCompressedx"+(i+1), "cobbleCompressedx"+(i+1), "cobbleCompressedx"+(i+1), "cobbleCompressedx"+(i+1), "cobbleCompressedx"+(i+1), "cobbleCompressedx"+(i+1), "cobbleCompressedx"+(i+1)));
			//De-compressing Stone
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedStone, 9, i),"stoneCompressedx"+(i+2)));
			//compressing stone
			GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedStone, 1, i+1), "stoneCompressedx"+(i+1), "stoneCompressedx"+(i+1), "stoneCompressedx"+(i+1), "stoneCompressedx"+(i+1), "stoneCompressedx"+(i+1), "stoneCompressedx"+(i+1), "stoneCompressedx"+(i+1), "stoneCompressedx"+(i+1), "stoneCompressedx"+(i+1)));
			//de-compressing netherrack
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedNetherrack, 9, i),"netherrackCompressedx"+(i+2)));
			//compressing netherrack
			GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedNetherrack, 1, i+1), "netherrackCompressedx"+(i+1), "netherrackCompressedx"+(i+1), "netherrackCompressedx"+(i+1), "netherrackCompressedx"+(i+1), "netherrackCompressedx"+(i+1), "netherrackCompressedx"+(i+1), "netherrackCompressedx"+(i+1), "netherrackCompressedx"+(i+1), "netherrackCompressedx"+(i+1)));
		}
		
		//de-compressing dirt
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(Blocks.dirt, 9), "dirtCompressedx1"));
		//compressing dirt
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedDirt, 1, 0), "dirt", "dirt", "dirt", "dirt", "dirt", "dirt", "dirt", "dirt", "dirt"));
				
		for(int i=0; i<3; i++){
			//decompressing dirt
			GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedDirt, 9, i),"dirtCompressedx"+(i+2)));
			//compressing dirt
			GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedDirt, 1, i+1), "dirtCompressedx"+(i+1), "dirtCompressedx"+(i+1), "dirtCompressedx"+(i+1), "dirtCompressedx"+(i+1), "dirtCompressedx"+(i+1), "dirtCompressedx"+(i+1), "dirtCompressedx"+(i+1), "dirtCompressedx"+(i+1), "dirtCompressedx"+(i+1)));
		}
		
		
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(Blocks.gravel, 9), "gravelCompressedx1"));
		GameRegistry.addRecipe(new ShapelessOreRecipe(new ItemStack(ModBlocks.compressedGravel, 9,0),"gravelCompressedx2"));
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedGravel, 1, 0), "gravel", "gravel", "gravel", "gravel", "gravel", "gravel", "gravel", "gravel", "gravel"));
		GameRegistry.addRecipe(new ShapelessOreRecipe( new ItemStack(ModBlocks.compressedGravel, 1, 1), "gravelCompressedx1", "gravelCompressedx1", "gravelCompressedx1", "gravelCompressedx1", "gravelCompressedx1", "gravelCompressedx1", "gravelCompressedx1", "gravelCompressedx1", "gravelCompressedx1"));
		
		//TODO: convert sand to oreDict
		//All my Sand
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.sand, 9), new ItemStack(ModBlocks.compressedSand, 0));
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSand, 9, 0), new ItemStack(ModBlocks.compressedSand, 1, 1));
		//compressing x0 sand -> x1 sand
		ItemStack sand =  new ItemStack(Blocks.sand);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSand, 1, 0),sand,sand,sand,sand,sand,sand,sand,sand, sand);
		//compressing x1 sand -> x2 sand
		ItemStack compressedSand0 =  new ItemStack(ModBlocks.compressedSand, 1, 0);
		GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.compressedSand, 1, 1),compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0, compressedSand0);
		
		
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
		
		//hay bale to bread
		GameRegistry.addSmelting(new ItemStack(Blocks.hay_block ), new ItemStack(ModBlocks.compressedFood,1, 0 ), 0.9f);
		//Raw chicken -> chicken
		GameRegistry.addSmelting(new ItemStack(ModBlocks.compressedGross, 1, 1), new ItemStack(ModBlocks.compressedYum, 1, 0), 0.9f);
		//raw pork -> pork
		GameRegistry.addSmelting(new ItemStack(ModBlocks.compressedGross, 1, 2), new ItemStack(ModBlocks.compressedYum, 1, 1), 0.9f);
		//raw beef -> beef
		GameRegistry.addSmelting(new ItemStack(ModBlocks.compressedGross, 1, 3), new ItemStack(ModBlocks.compressedYum, 1, 2), 0.9f);
		//raw fish -> fish
		GameRegistry.addSmelting(new ItemStack(ModBlocks.compressedGross, 1, 4), new ItemStack(ModBlocks.compressedYum, 1, 3), 0.9f);
	}

}

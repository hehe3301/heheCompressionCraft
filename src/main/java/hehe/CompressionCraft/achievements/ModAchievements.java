package hehe.CompressionCraft.achievements;

import hehe.CompressionCraft.blocks.CompressedCobble;
import hehe.CompressionCraft.blocks.ModBlocks;

import java.util.HashMap;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraft.util.IIcon;

public class ModAchievements {
	static final HashMap<String, Achievement> achievementsList = new HashMap<String, Achievement>();
	private static int numAchievements = 8;
	
	public static void init() {
		int achievementId;
		String achievementName = "";
		int xCoord = -1;
		int yCoord = -1;
		ItemStack achievementIcon = new ItemStack(Blocks.air);
		Achievement achievementPreReq = AchievementList.openInventory;
		boolean isSpecial = false;
		for(int i = 0; i<numAchievements; i++){
			achievementId=42+i;
			switch(i){
			case 0:
				achievementName = "Cobble x 9^1";
				xCoord = 0;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 0);
				achievementPreReq = AchievementList.openInventory;
				break;
			case 1:
				achievementName = "Cobble x 9^2";
				xCoord = 1;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 1);
				achievementPreReq = achievementsList.get("Cobble x 9^1");
				break;
			case 2:
				achievementName = "Cobble x 9^3";
				xCoord = 2;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 2);
				achievementPreReq = achievementsList.get("Cobble x 9^2");
				break;
			case 3:
				achievementName = "Cobble x 9^4";
				xCoord = 3;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 3);
				achievementPreReq = achievementsList.get("Cobble x 9^3");
				break;
			case 4:
				achievementName = "Cobble x 9^5";
				xCoord = 4;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 4);
				achievementPreReq = achievementsList.get("Cobble x 9^4");
				break;
			case 5:
				achievementName = "Cobble x 9^6";
				xCoord = 5;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 5);
				achievementPreReq = achievementsList.get("Cobble x 9^5");
				break;
			case 6:
				achievementName = "Cobble x 9^7";
				xCoord = 6;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 6);
				achievementPreReq = achievementsList.get("Cobble x 9^6");
				break;
			case 7:
				achievementName = "Cobble x 9^8";
				xCoord = 7;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 7);
				achievementPreReq = achievementsList.get("Cobble x 9^7");
				isSpecial = true;
				break;
			}
			if(isSpecial){
				achievementsList.put(achievementName, new Achievement("Some String IDK what this does", achievementName, xCoord, yCoord, achievementIcon, achievementPreReq).setSpecial() );
				isSpecial = false;
			} else {
				achievementsList.put(achievementName, new Achievement("Some String IDK what this does", achievementName, xCoord, yCoord, achievementIcon, achievementPreReq));
			}
			
		}
	}
}

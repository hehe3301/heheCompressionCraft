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
	private static int numAchievements = 1;
	
	public static void init() {
		int achievementId;
		String achievementName = "";
		int xCoord = -1;
		int yCoord = -1;
		ItemStack achievementIcon = new ItemStack(Blocks.air);
		Achievement achievementPreReq = AchievementList.openInventory;
		
		for(int i = 0; i<numAchievements; i++){
			achievementId=42+i;
			switch(i){
			case 0:
				achievementName = "The Big Crunch";
				xCoord = 0;
				yCoord = 0;
				achievementIcon = new ItemStack(ModBlocks.compressedCobble, 1, 0);
				achievementPreReq = AchievementList.openInventory;
			}
			achievementsList.put(achievementName, new Achievement(achievementName+"_a", achievementName+"_b", xCoord, yCoord, achievementIcon, achievementPreReq) );
		}

	}
}

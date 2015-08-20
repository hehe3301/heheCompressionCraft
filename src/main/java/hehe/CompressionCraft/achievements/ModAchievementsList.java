package hehe.CompressionCraft.achievements;

import net.minecraftforge.common.AchievementPage;

public class ModAchievementsList {
	
	public static void init() {
		AchievementPage heheCompressionCraft = new AchievementPage("HeheCompressionCraft", 
													ModAchievements.achievementsList.get("The Big Crunch") );
		AchievementPage.registerAchievementPage(heheCompressionCraft);
		
	}
}

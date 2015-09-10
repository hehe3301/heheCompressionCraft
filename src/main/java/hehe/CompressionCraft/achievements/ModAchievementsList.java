package hehe.CompressionCraft.achievements;

import net.minecraftforge.common.AchievementPage;

public class ModAchievementsList {
	
	public static void init() {
		AchievementPage heheCompressionCraft = new AchievementPage("HeheCompressionCraft", 
													ModAchievements.achievementsList.get("Cobble x 9^1"),
													ModAchievements.achievementsList.get("Cobble x 9^2"),
													ModAchievements.achievementsList.get("Cobble x 9^3"),
													ModAchievements.achievementsList.get("Cobble x 9^4"),
													ModAchievements.achievementsList.get("Cobble x 9^5"),
													ModAchievements.achievementsList.get("Cobble x 9^6"),
													ModAchievements.achievementsList.get("Cobble x 9^7"),
													ModAchievements.achievementsList.get("Cobble x 9^8")
													);
		AchievementPage.registerAchievementPage(heheCompressionCraft);
		
	}
}

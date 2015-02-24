package hehe.CompressionCraft.items;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ModItems {
	public static Item testItem;
	public static Item seedPacket;
	public static CreativeTabs heheTweaks = (new CreativeTabs("HeheTweaks") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return testItem;
        }

        @Override
        public int getSearchbarWidth() {
            return 100;
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }
    });//.setBackgroundImageName("aikonia.png").setNoTitle();
	
	public static void init(){
		testItem = new TestItem();
		seedPacket= new SeedPacket();
		
		
	}

}

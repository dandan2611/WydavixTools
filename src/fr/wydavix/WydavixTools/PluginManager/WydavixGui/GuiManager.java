package fr.wydavix.WydavixTools.PluginManager.WydavixGui;

import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.wydavix.WydavixTools.PluginsManager.Main;

public class GuiManager {

	public ItemGui ItemGUi;
	public ServerGui ServerGui;
	public MainGui MainGui;
	public HammerGui HammerGui;

	public GuiManager() {
		this.ItemGUi = new ItemGui();
		this.ServerGui = new ServerGui();
		this.MainGui = new MainGui();
		this.HammerGui = new HammerGui();
	}
	
	public void setGlassInventory(Inventory inv) {
		ItemStack glass = Main.instance.Utils.CreateItem(Material.STAINED_GLASS_PANE, 0, " ");
		
		for (int i = 0; i < 10; i++)
			inv.setItem(i, glass);
		for (int i = 35; i < 45; i++)
			inv.setItem(i, glass);
		for (int i = 17; i < 27; i += 9)
			inv.setItem(i, glass);
		for (int i = 18; i < 28; i += 9)
			inv.setItem(i, glass);
	}
}

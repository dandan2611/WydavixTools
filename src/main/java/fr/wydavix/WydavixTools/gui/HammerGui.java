package fr.wydavix.wydavixtools.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.wydavix.WydavixTools.PluginsManager.Main;

public class HammerGui {
	private ItemStack back = Main.instance.Utils.CreateItem(Material.ARROW, 0, "�f�l� �4Retour");
	
	public Inventory getHammerGui() {
		Inventory HammerGui = Bukkit.createInventory(null, 45, "�3�l� �bHammer Settings");
		
		Main.instance.GuiManager.setGlassInventory(HammerGui);
		
		HammerGui.setItem(36, back);
		
		return HammerGui;
	}

}

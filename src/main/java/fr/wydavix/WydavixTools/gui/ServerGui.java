package fr.wydavix.wydavixtools.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.wydavix.WydavixTools.PluginsManager.Main;

public class ServerGui {

	private ItemStack back = Main.instance.Utils.CreateItem(Material.ARROW, 0, "�f�l� �4Retour");

	public Inventory getMainServerGui() {
		Inventory MainServerGui = Bukkit.createInventory(null, 45, "�c�k!!�4Server Menu�c�k!!");

		Main.instance.GuiManager.setGlassInventory(MainServerGui);
		MainServerGui.setItem(36, back);

		return MainServerGui;
	}
}
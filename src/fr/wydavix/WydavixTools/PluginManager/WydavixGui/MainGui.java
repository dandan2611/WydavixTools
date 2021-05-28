package fr.wydavix.WydavixTools.PluginManager.WydavixGui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.wydavix.WydavixTools.PluginsManager.Main;

public class MainGui {
	
	public Inventory getWydavixGui() {

		Inventory WydavixGui = Bukkit.createInventory(null, 45, "§f§l» §bWydavixTools Managers");
		ItemStack ItemMenu = Main.instance.Utils.CreateItemLore2(Material.ANVIL, 0, " ",
				"§6Menu to retrieve items added by WydavixTools", "§9§l» §d§k!!§5Items Menu§d§k!!");
		ItemStack ServerMenu = Main.instance.Utils.CreateItemLore2(Material.CHEST, 0, " ",
				"§6Menu to manage your server", "§9§l» §c§k!!§4Server Menu§c§k!!");
		ItemStack close = Main.instance.Utils.CreateItem(Material.ARROW, 0, "§f§l» §4Fermer");
		ItemStack credit = Main.instance.Utils.CreateItemLore4(Material.BOOK, 0, " ", "§f§l» Developed By Wydavix",
				"§9§l» §3WebSite §7: §b§nwww.wydavix.fr", "§4§l» §cNeed Support §7: §b§ndiscord.wydavix.fr",
				"§1§k!!§bWydavixTools§1§k!!");

		Main.instance.GuiManager.setGlassInventory(WydavixGui);

		WydavixGui.setItem(20, ItemMenu);
		WydavixGui.setItem(22, ServerMenu);
		WydavixGui.setItem(36, close);
		WydavixGui.setItem(44, credit);

		return WydavixGui;
	}
}

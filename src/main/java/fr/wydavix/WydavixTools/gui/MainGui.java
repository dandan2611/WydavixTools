package fr.wydavix.wydavixtools.gui;

import fr.wydavix.wydavixtools.WydavixUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MainGui {

	private static final ItemStack menuItem = WydavixUtils.createItem(
			Material.ANVIL,
			0,
			"§9§l» §d§k!!§5Items Menu§d§k!!",
			" ",
			"§6Menu to retrieve items added by WydavixTools");

	private static final ItemStack serverMenuItem = WydavixUtils.createItem(
			Material.CHEST,
			0,
			"§9§l» §c§k!!§4Server Menu§c§k!!",
			" ",
			"§6Menu to manage your server"
	);

	private static final ItemStack closeItem = WydavixUtils.createItem(
			Material.ARROW,
			0,
			"§f§l» §4Fermer"
	);

	private static final ItemStack creditItem = WydavixUtils.createItem(
			Material.BOOK,
			0,
			"§f§l» Developed By Wydavix",
			" ",
			"§9§l» §3WebSite §7: §b§nwww.wydavix.fr", "§4§l» §cNeed Support §7: §b§ndiscord.wydavix.fr"
	);

	private GuiManager manager;

	public MainGui(GuiManager manager) {
		this.manager = manager;
	}

	public Inventory generateGui() {

		Inventory inventory = Bukkit.createInventory(null, 45, "§f§l» §bWydavixTools Managers");

		manager.fillInventoryWithGlass(inventory);

		inventory.setItem(20, menuItem);
		inventory.setItem(22, serverMenuItem);
		inventory.setItem(36, closeItem);
		inventory.setItem(44, creditItem);

		return inventory;
	}
}

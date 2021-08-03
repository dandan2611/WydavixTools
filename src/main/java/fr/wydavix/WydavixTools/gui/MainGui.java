package fr.wydavix.wydavixtools.gui;

import fr.wydavix.wydavixtools.WydavixUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class MainGui {

	protected static final ItemStack MENU_ITEM = WydavixUtils.createItem(
			Material.ANVIL,
			0,
			"§9§l» §d§k!!§5Items Menu§d§k!!",
			" ",
			"§6Menu to retrieve items added by WydavixTools");

	protected static final ItemStack SERVER_MENU_ITEM = WydavixUtils.createItem(
			Material.CHEST,
			0,
			"§9§l» §c§k!!§4Server Menu§c§k!!",
			" ",
			"§6Menu to manage your server"
	);

	protected static final ItemStack CLOSE_ITEM = WydavixUtils.createItem(
			Material.ARROW,
			0,
			"§f§l» §4Fermer"
	);

	protected static final ItemStack CREDIT_ITEM = WydavixUtils.createItem(
			Material.BOOK,
			0,
			"§f§l» Developed By Wydavix",
			" ",
			"§9§l» §3WebSite §7: §b§nwww.wydavix.fr", "§4§l» §cNeed Support §7: §b§ndiscord.wydavix.fr"
	);

	private final GuiManager manager;

	public MainGui(GuiManager manager) {
		this.manager = manager;
	}

	public Inventory generateGui() {

		Inventory inventory = Bukkit.createInventory(null, 45, "§f§l» §bWydavixTools Managers");

		manager.fillInventoryWithGlass(inventory);

		inventory.setItem(20, MENU_ITEM);
		inventory.setItem(22, SERVER_MENU_ITEM);
		inventory.setItem(36, CLOSE_ITEM);
		inventory.setItem(44, CREDIT_ITEM);

		return inventory;
	}
}

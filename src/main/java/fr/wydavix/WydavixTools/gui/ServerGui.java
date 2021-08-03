package fr.wydavix.wydavixtools.gui;

import fr.wydavix.wydavixtools.WydavixUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ServerGui {

	private static final ItemStack BACK_ITEM = WydavixUtils.createItem(Material.ARROW, 0, "§f§l» §4Retour");

	private final GuiManager manager;

	public ServerGui(GuiManager manager) {
		this.manager = manager;
	}

	public Inventory getMainServerGui() {
		Inventory inventory = Bukkit.createInventory(null, 45, "§c§k!!§4Server Menu§c§k!!");

		manager.fillInventoryWithGlass(inventory);

		inventory.setItem(36, BACK_ITEM);

		return inventory;
	}

}
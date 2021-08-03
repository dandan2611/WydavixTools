package fr.wydavix.wydavixtools.gui;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class HammerGui {

	private static final ItemStack BACK_ITEM = ServerGui.BACK_ITEM;

	private final GuiManager manager;

	public HammerGui(GuiManager manager) {
		this.manager = manager;
	}

	public Inventory generateHammerGui() {
		Inventory inventory = Bukkit.createInventory(null, 45, "§3§l» §bHammer Settings");
		
		manager.fillInventoryWithGlass(inventory);
		
		inventory.setItem(36, BACK_ITEM);
		
		return inventory;
	}

}

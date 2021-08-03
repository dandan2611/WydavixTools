package fr.wydavix.WydavixTools.PluginManager.WydavixGui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.wydavix.WydavixTools.PluginsManager.Main;

public class ServerEventListener implements Listener {
	
	@EventHandler
	public void onInvetoryClick(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();
		if (it == null)
			return;

		if (inv.getName().equalsIgnoreCase("§c§k!!§4Server Menu§c§k!!")) {
			e.setCancelled(true);

			if (it.getType() == Material.ARROW) {
				p.openInventory(Main.instance.GuiManager.MainGui.getWydavixGui());
			}
		}

	}
}

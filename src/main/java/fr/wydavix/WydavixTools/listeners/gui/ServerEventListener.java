package fr.wydavix.wydavixtools.listeners.gui;

import fr.wydavix.wydavixtools.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ServerEventListener implements Listener {

	private final Main main;

	public ServerEventListener(Main main) {
		this.main = main;
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();

		if (it == null)
			return;

		if (inv.getName().equalsIgnoreCase("§c§k!!§4Server Menu§c§k!!")) {
			e.setCancelled(true);

			if (it.getType() == Material.ARROW) {
				p.openInventory(main.getGuiManager().getMainGui().generateGui());
			}
		}

	}
}

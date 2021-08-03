package fr.wydavix.wydavixtools.listeners.gui;

import fr.wydavix.wydavixtools.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemEventListener implements Listener {

	private final Main main;

	public ItemEventListener(Main main) {
		this.main = main;
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();
		InventoryAction action = e.getAction();

		if (it == null)
			return;

		if (inv.getName().equalsIgnoreCase("§d§k!!§5Items Managers§d§k!!")) {
			e.setCancelled(true);

			if (it.getType() == Material.ARROW) {
				p.openInventory(main.getGuiManager().getMainGui().generateGui());
			}

			if (it.getType() == Material.DIAMOND_CHESTPLATE) {
				p.openInventory(main.getGuiManager().getItemGui().generateArmorPageGui());
			}

			if (it.getType() == Material.DIAMOND_AXE) {
				p.openInventory(main.getGuiManager().getItemGui().generateToolPageGui());
			}

			if (it.getType() == Material.COBBLESTONE) {
				p.openInventory(main.getGuiManager().getItemGui().generateOtherPageGui());
			}
		}

		if (inv.getName().contains("Page 1")) {
			e.setCancelled(true);

			if (action == InventoryAction.PICKUP_ALL) {
				if (it.getType() == Material.ARROW) {
					p.openInventory(main.getGuiManager().getItemGui().generateMainItemGui());
				}

				if (it.getType() == Material.REDSTONE) {
					if (it.getItemMeta().getDisplayName().contains("Other")) {
						p.openInventory(main.getGuiManager().getItemGui().generateOtherPageGui());
					} else if (it.getItemMeta().getDisplayName().contains("Armor")) {
						p.openInventory(main.getGuiManager().getItemGui().generateArmorPageGui());
					} else if (it.getItemMeta().getDisplayName().contains("Tool")) {
						p.openInventory(main.getGuiManager().getItemGui().generateToolPageGui());
					}
				}

				if (it.getType() == Material.DIAMOND_PICKAXE && it.getItemMeta().getDisplayName().contains("Hammer")) {
					p.getInventory().addItem(main.getItemManager().getItemByIdentifier("hammer"));
				}

				if (it.getType() == Material.DIAMOND_AXE && it.getItemMeta().getDisplayName().contains("Mjolnir")) {
					p.getInventory().addItem(main.getItemManager().getItemByIdentifier("mjolnir"));
				}
			} else if (action == InventoryAction.PICKUP_HALF) {

				if (it.getType() == Material.DIAMOND_PICKAXE && it.getItemMeta().getDisplayName().contains("Hammer")) {
					p.openInventory(main.getGuiManager().getHammerGui().generateHammerGui());
				}
			}

		}
	}
}
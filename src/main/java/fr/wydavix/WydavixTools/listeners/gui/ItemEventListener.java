package fr.wydavix.WydavixTools.PluginManager.WydavixGui;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryAction;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.wydavix.WydavixTools.PluginsManager.Main;

public class ItemEventListener implements Listener {

	@EventHandler
	public void onInvetoryClick(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();
		InventoryAction action = e.getAction();

		if (it == null)
			return;

		if (inv.getName().equalsIgnoreCase("§d§k!!§5Items Managers§d§k!!")) {
			e.setCancelled(true);

			if (it.getType() == Material.ARROW) {
				p.openInventory(Main.instance.GuiManager.MainGui.getWydavixGui());
			}

			if (it.getType() == Material.DIAMOND_CHESTPLATE) {
				p.openInventory(Main.instance.GuiManager.ItemGUi.ArmorPage1ItemGui());
			}

			if (it.getType() == Material.DIAMOND_AXE) {
				p.openInventory(Main.instance.GuiManager.ItemGUi.ToolPage1ItemGui());
			}

			if (it.getType() == Material.COBBLESTONE) {
				p.openInventory(Main.instance.GuiManager.ItemGUi.OtherPage1ItemGui());
			}
		}

		if (inv.getName().contains("Page 1")) {
			e.setCancelled(true);

			if (action == InventoryAction.PICKUP_ALL) {
				if (it.getType() == Material.ARROW) {
					p.openInventory(Main.instance.GuiManager.ItemGUi.CreateMainItemGui());
				}

				if (it.getType() == Material.REDSTONE) {
					if (it.getItemMeta().getDisplayName().contains("Other")) {
						p.openInventory(Main.instance.GuiManager.ItemGUi.OtherPage1ItemGui());
					} else if (it.getItemMeta().getDisplayName().contains("Armor")) {
						p.openInventory(Main.instance.GuiManager.ItemGUi.ArmorPage1ItemGui());
					} else if (it.getItemMeta().getDisplayName().contains("Tool")) {
						p.openInventory(Main.instance.GuiManager.ItemGUi.ToolPage1ItemGui());
					}
				}

				if (it.getType() == Material.DIAMOND_PICKAXE && it.getItemMeta().getDisplayName().contains("Hammer")) {
					p.getInventory().addItem(Main.instance.ItemManager.HammerItem.getHammer());
				}

				if (it.getType() == Material.DIAMOND_AXE && it.getItemMeta().getDisplayName().contains("Mjolnir")) {
					p.getInventory().addItem(Main.instance.ItemManager.MjolnirItem.getMjolnir());
				}
			} else if (action == InventoryAction.PICKUP_HALF) {
				
				if (it.getType() == Material.DIAMOND_PICKAXE && it.getItemMeta().getDisplayName().contains("Hammer")) {
					p.openInventory(Main.instance.GuiManager.HammerGui.getHammerGui());
				}
			}

		}
	}
}

package fr.wydavix.WydavixTools.PluginsManager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import fr.wydavix.WydavixTools.PluginManager.ItemInventory.InventoryEventListener;

public class EventManager {

	public static void registerEvents(Plugin pl) {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new InventoryEventListener(), pl);
	}
}

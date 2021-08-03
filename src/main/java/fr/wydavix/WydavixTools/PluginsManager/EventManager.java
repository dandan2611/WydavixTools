package fr.wydavix.WydavixTools.PluginsManager;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;

import fr.wydavix.WydavixTools.PluginManager.WydavixGui.ItemEventListener;
import fr.wydavix.WydavixTools.PluginManager.WydavixGui.MainEventListener;
import fr.wydavix.WydavixTools.PluginManager.WydavixGui.ServerEventListener;
import fr.wydavix.WydavixTools.PluginManager.WydavixItem.HammerEventListener;
import fr.wydavix.WydavixTools.PluginManager.WydavixItem.MjolnirEventListener;

public class EventManager {

	public static void registerEvents(Plugin pl) {
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new MainEventListener(), pl);
		pm.registerEvents(new ItemEventListener(), pl);
		pm.registerEvents(new ServerEventListener(), pl);
		pm.registerEvents(new HammerEventListener(), pl);
		pm.registerEvents(new MjolnirEventListener(), pl);
		pm.registerEvents(new WarningsEvent(), pl);
	}
}

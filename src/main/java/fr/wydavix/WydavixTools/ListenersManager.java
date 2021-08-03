package fr.wydavix.wydavixtools;

import fr.wydavix.wydavixtools.listeners.HammerEventListener;
import fr.wydavix.wydavixtools.listeners.MjolnirEventListener;
import fr.wydavix.wydavixtools.listeners.WarningListener;
import fr.wydavix.wydavixtools.listeners.gui.ItemEventListener;
import fr.wydavix.wydavixtools.listeners.gui.MainEventListener;
import fr.wydavix.wydavixtools.listeners.gui.ServerEventListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

public class ListenersManager {

	protected void registerListeners(Main main) {
		PluginManager pm = Bukkit.getPluginManager();

		pm.registerEvents(new MainEventListener(main), main);
		pm.registerEvents(new ItemEventListener(main), main);
		pm.registerEvents(new ServerEventListener(main), main);
		pm.registerEvents(new HammerEventListener(main), main);
		pm.registerEvents(new MjolnirEventListener(), main);
		pm.registerEvents(new WarningListener(), main);
	}

}

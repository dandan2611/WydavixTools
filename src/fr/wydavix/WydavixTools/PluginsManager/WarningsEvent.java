package fr.wydavix.WydavixTools.PluginsManager;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class WarningsEvent implements Listener {
	@EventHandler
	public void warning(PlayerJoinEvent e) {
		Player p =e.getPlayer();

		if (p.isOp()) {
			p.sendMessage("§f§lWydavixTools §c§l» §4Please do not open or modify the config file in the WydavixTools folder.");
		}
			
	}
}

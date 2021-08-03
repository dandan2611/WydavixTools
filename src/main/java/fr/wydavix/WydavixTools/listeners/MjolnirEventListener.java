package fr.wydavix.wydavixtools.listeners;

import java.util.Random;

import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class MjolnirEventListener implements Listener {
	
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent e) {
		if (e.getDamager() instanceof Player) {

			Player p = (Player) e.getDamager();

			if (p.getItemInHand().getType() == Material.DIAMOND_AXE
					&& p.getItemInHand().getItemMeta().getDisplayName().equalsIgnoreCase("§1§k!!§9§lMjolnir§1§k!!")) {

				Random random = new Random();
				int number = 0;

				for (int counter = 1; counter < 2; counter++) {
					number = 1 + random.nextInt(20);

					if (number == 1) {

						Entity p1 = e.getEntity();
						p1.getWorld().strikeLightning(p1.getLocation());

						p.sendMessage("§f§l» §6La Foudre s'est abattue sur §e" + p1.getName());

						break;
					}
				}
			}

		}
	}
}

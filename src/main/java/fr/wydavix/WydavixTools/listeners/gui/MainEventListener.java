package fr.wydavix.wydavixtools.listeners.gui;

import fr.wydavix.wydavixtools.Main;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class MainEventListener implements Listener {

	private final Main main;

	public MainEventListener(Main main) {
		this.main = main;
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();

		if (it == null)
			return;

		if (inv.getName().equalsIgnoreCase("§f§l» §bWydavixTools Managers")) {
			e.setCancelled(true);

			if (it.getType() == Material.ANVIL
					&& it.getItemMeta().getDisplayName().equalsIgnoreCase("§9§l» §d§k!!§5Items Menu§d§k!!")) {
				p.openInventory(main.getGuiManager().getItemGui().generateMainItemGui());
				return;
			}

			if (it.getType() == Material.ARROW) {
				p.closeInventory();
			}

			if (it.getType() == Material.CHEST) {
				p.openInventory(main.getGuiManager().getServerGui().getMainServerGui());
			}

			if (it.getType() == Material.BOOK) {
				p.closeInventory();

				p.sendMessage("§f§lDeveloped By Wydavix");
				p.sendMessage(" ");
				p.spigot().sendMessage(Text("§3§l» §bTwitter §7 : "),
						TextClick("§b§n@Wydavix", "§b§nOfficial Twitter", "https://twitter.com/wydavix"));
				p.spigot().sendMessage(Text("§6§l» §eInstagram : "),
						TextClick("§e§nWydavix", "§e§nOfficial Instagram", "https://www.instagram.com/p/CMaBKJ3IKj6/"));
				p.spigot().sendMessage(Text("§5§l» §dWebSite : "),
						TextClick("§d§nwww.wydavix.fr", "§d§nOfficial WebSite", "https://wydavix.fr/"));
				p.spigot().sendMessage(Text("§4§l» §cNeed Support §7: "),
						TextClick("§c§nDiscord", "§c§nOfficial Support Discord", "http://discord.wydavix.fr"));
			}
		}
	}

	private TextComponent Text(String Name) {
		TextComponent Text = new TextComponent();

		Text.setText(Name);

		return Text;
	}

	private TextComponent TextClick(String Name, String Hover, String url) {
		TextComponent TextClick = new TextComponent();

		TextClick.setText(Name);
		TextClick.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, url));
		TextClick.setHoverEvent(new HoverEvent(net.md_5.bungee.api.chat.HoverEvent.Action.SHOW_TEXT,
				new ComponentBuilder(Hover).create()));

		return TextClick;
	}

}
package fr.wydavix.wydavixtools;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class WydavixUtils {

	public ItemStack createSkullItem(byte materialShort, String name, Player player, String... lore) {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) materialShort);
		SkullMeta meta = (SkullMeta) item.getItemMeta();

		meta.setOwner(player.getName());
		meta.setDisplayName(name);
		meta.setLore(Arrays.asList(lore));

		item.setItemMeta(meta);

		return item;
	}

	public ItemStack createItem(Material material, int materialShort, String name) {
		ItemStack item = new ItemStack(material, 1, (byte) materialShort);
		ItemMeta itemMeta = item.getItemMeta();

		itemMeta.setDisplayName(name);

		item.setItemMeta(itemMeta);
		
		return item;
	}

	public ItemStack createItem(Material material, int materialShort, String name, String... lore) {
		ItemStack item = new ItemStack(material, 1, (byte) materialShort);
		ItemMeta itemMeta = item.getItemMeta();

		itemMeta.setDisplayName(name);
		itemMeta.setLore(Arrays.asList(lore));

		item.setItemMeta(itemMeta);

		return item;
	}

}
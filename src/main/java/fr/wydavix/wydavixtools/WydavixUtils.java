package fr.wydavix.wydavixtools;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class WydavixUtils {

	/**
	 * Create a skull item
	 * @param materialShort Type of head
	 * @param name DisplayName of the head
	 * @param player If the head is a player head, set the skin to the player's one
	 * @param lore Item lore
	 * @return Fresh {@link ItemStack} with given informations
	 */
	public ItemStack createSkullItem(byte materialShort, String name, Player player, String... lore) {
		ItemStack item = new ItemStack(Material.SKULL_ITEM, 1, (byte) materialShort);
		SkullMeta meta = (SkullMeta) item.getItemMeta();

		meta.setOwner(player.getName());
		meta.setDisplayName(name);
		meta.setLore(Arrays.asList(lore));

		item.setItemMeta(meta);

		return item;
	}

	/**
	 * Create an item
	 * @param material Material of the item
	 * @param materialShort Type of the item
	 * @param name Name of the item
	 * @return Fresh {@link ItemStack} with given informations
	 */
	public ItemStack createItem(Material material, int materialShort, String name) {
		ItemStack item = new ItemStack(material, 1, (byte) materialShort);
		ItemMeta itemMeta = item.getItemMeta();

		itemMeta.setDisplayName(name);

		item.setItemMeta(itemMeta);
		
		return item;
	}

	/**
	 * Create an item
	 * @param material Material of the item
	 * @param materialShort Type of the item
	 * @param name Name of the item
	 * @param lore Lore of the item
	 * @return Fresh {@link ItemStack} with given informations
	 */
	public ItemStack createItem(Material material, int materialShort, String name, String... lore) {
		ItemStack item = new ItemStack(material, 1, (byte) materialShort);
		ItemMeta itemMeta = item.getItemMeta();

		itemMeta.setDisplayName(name);
		itemMeta.setLore(Arrays.asList(lore));

		item.setItemMeta(itemMeta);

		return item;
	}

}
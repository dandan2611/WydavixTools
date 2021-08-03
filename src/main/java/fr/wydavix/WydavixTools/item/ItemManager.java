package fr.wydavix.wydavixtools.item;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class ItemManager {

	private final HashMap<WydavixItem, ItemStack> builtItems;
	private final HashMap<WydavixItem, ItemStack> builtFakeItems;
	
	public ItemManager() {
		builtItems = new HashMap<>();
		builtFakeItems = new HashMap<>();
		registerItems();
	}

	private void registerItems() {
		registerItem(new HammerItem());
	}

	private void registerItem(WydavixItem item) {
		builtItems.put(item, item.build(false));
		builtItems.put(item, item.build(true));
	}

}

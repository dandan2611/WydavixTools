package fr.wydavix.wydavixtools.item;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class ItemManager {

	private final HashMap<AbstractWydavixItem, ItemStack> builtItems;
	private final HashMap<AbstractWydavixItem, ItemStack> builtFakeItems;
	
	public ItemManager() {
		builtItems = new HashMap<>();
		builtFakeItems = new HashMap<>();
		registerItems();
	}

	private void registerItems() {
		registerItem(new HammerItem());
	}

	private void registerItem(AbstractWydavixItem item) {
		builtItems.put(item, item.build(false));
		builtItems.put(item, item.build(true));
	}

}

package fr.wydavix.wydavixtools.item;

import org.bukkit.inventory.ItemStack;

import java.util.HashMap;

public class ItemManager {

	private final HashMap<String, AbstractWydavixItem> items;
	private final HashMap<String, ItemStack> builtItems;
	private final HashMap<String, ItemStack> builtFakeItems;
	
	public ItemManager() {
		items = new HashMap<>();
		builtItems = new HashMap<>();
		builtFakeItems = new HashMap<>();
		registerItems();
	}

	private void registerItems() {
		registerItem(new HammerItem());
		registerItem(new MjolnirItem());
	}

	private void registerItem(AbstractWydavixItem item) {
		String identifier = item.getIdentifier();
		items.put(identifier, item);
		builtItems.put(identifier, item.build(false));
		builtFakeItems.put(identifier, item.build(true));
	}

	public AbstractWydavixItem getWydavixItemByIdentifier(String identifier) {
		return items.get(identifier);
	}

	public ItemStack getItemByIdentifier(String identifier) {
		return builtItems.get(identifier);
	}

	public ItemStack getFakeItemByIdentifier(String identifier) {
		return builtFakeItems.get(identifier);
	}

}

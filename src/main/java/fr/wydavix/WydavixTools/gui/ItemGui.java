package fr.wydavix.wydavixtools.gui;

import fr.wydavix.wydavixtools.WydavixUtils;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemGui {

	private static final ItemStack BACK_ITEM = ServerGui.BACK_ITEM;
	private static final ItemStack PAGE_ONE_ITEM = WydavixUtils.createItem(
			Material.STAINED_GLASS_PANE,
			14,
			"§f§l» §cPage 1"
	);

	private static final ItemStack ARMOR_ITEM = WydavixUtils.createItem(
			Material.DIAMOND_CHESTPLATE,
			0,
			"§4§l» §cArmor"
	);
	private static final ItemStack TOOL_ITEM = WydavixUtils.createItem(
			Material.DIAMOND_AXE,
			0,
			"§3§l» §9Tool"
	);
	private static final ItemStack OTHER_ITEM = WydavixUtils.createItem(
			Material.COBBLESTONE,
			0,
			"§6§l» §eOther"
	);

	private final GuiManager manager;

	public ItemGui(GuiManager manager) {
		this.manager = manager;
	}

	public Inventory generateMainItemGui() {
		Inventory inventory = Bukkit.createInventory(null, 45, "§d§k!!§5Items Managers§d§k!!");

		manager.fillInventoryWithGlass(inventory);

		inventory.setItem(20, ARMOR_ITEM);
		inventory.setItem(22, OTHER_ITEM);
		inventory.setItem(24, TOOL_ITEM);
		inventory.setItem(36, BACK_ITEM);

		return inventory;
	}

	private static final ItemStack ARMOR_OTHER_ITEM = WydavixUtils.createItem(
			Material.REDSTONE,
			0,
			"§f§l» §eOther"
	);

	public Inventory generateArmorPageGui() {
		Inventory inventory = Bukkit.createInventory(null, 45, "§4§l» §cArmor Page 1");

		manager.fillInventoryWithGlass(inventory);

		inventory.setItem(36, BACK_ITEM);
		inventory.setItem(38, PAGE_ONE_ITEM);
		inventory.setItem(44, ARMOR_OTHER_ITEM);

		return inventory;
	}

	public Inventory generateToolPageGui() {
		Inventory inventory = Bukkit.createInventory(null, 45, "§3§l» §9Tool Page 1");

		manager.fillInventoryWithGlass(inventory);

		inventory.setItem(10, null); // TODO: Fake hammer item
		inventory.setItem(11, null); // TODO: Fake Mjolnir item
		inventory.setItem(36, BACK_ITEM);
		inventory.setItem(38, PAGE_ONE_ITEM);
		inventory.setItem(44, ARMOR_OTHER_ITEM);

		return inventory;
	}

	private static final ItemStack OTHER_TOOL_ITEM = WydavixUtils.createItem(
			Material.REDSTONE,
			0,
			"§f§l» §9Tool"
	);

	public Inventory generateOtherPageGui() {
		Inventory inventory = Bukkit.createInventory(null, 45, "§6§l» §eOther Page 1");

		manager.fillInventoryWithGlass(inventory);

		inventory.setItem(36, BACK_ITEM);
		inventory.setItem(38, PAGE_ONE_ITEM);
		inventory.setItem(44, OTHER_TOOL_ITEM);

		return inventory;
	}

}

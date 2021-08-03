package fr.wydavix.wydavixtools.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.wydavix.WydavixTools.PluginsManager.Main;

public class ItemGui {
	private ItemStack back = Main.instance.Utils.CreateItem(Material.ARROW, 0, "�f�l� �4Retour");
	private ItemStack page1 = Main.instance.Utils.CreateItem(Material.STAINED_GLASS_PANE, 14, "�f�l� �cPage 1");

	public Inventory CreateMainItemGui() {

		Inventory MainItemGui = Bukkit.createInventory(null, 45, "�d�k!!�5Items Managers�d�k!!");

		ItemStack armor = Main.instance.Utils.CreateItem(Material.DIAMOND_CHESTPLATE, 0, "�4�l� �cArmor");
		ItemStack tool = Main.instance.Utils.CreateItem(Material.DIAMOND_AXE, 0, "�3�l� �9Tool");
		ItemStack other = Main.instance.Utils.CreateItem(Material.COBBLESTONE, 0, "�6�l� �eOther");

		Main.instance.GuiManager.setGlassInventory(MainItemGui);
		MainItemGui.setItem(20, armor);
		MainItemGui.setItem(22, other);
		MainItemGui.setItem(24, tool);
		MainItemGui.setItem(36, back);

		return MainItemGui;
	}

	public Inventory ArmorPage1ItemGui() {

		Inventory ArmorPageItemGui = Bukkit.createInventory(null, 45, "�4�l� �cArmor Page 1");

		Main.instance.GuiManager.setGlassInventory(ArmorPageItemGui);

		ArmorPageItemGui.setItem(36, back);
		ArmorPageItemGui.setItem(38, page1);
		ArmorPageItemGui.setItem(44, Main.instance.Utils.CreateItem(Material.REDSTONE, 0, "�f�l� �eOther"));

		return ArmorPageItemGui;
	}

	public Inventory ToolPage1ItemGui() {

		Inventory ToolPageItemGui = Bukkit.createInventory(null, 45, "�3�l� �9Tool Page 1");

		Main.instance.GuiManager.setGlassInventory(ToolPageItemGui);

		ToolPageItemGui.setItem(10, Main.instance.ItemManager.HammerItem.getHammerFake());
		ToolPageItemGui.setItem(11, Main.instance.ItemManager.MjolnirItem.getMjolnirFake());
		ToolPageItemGui.setItem(36, back);
		ToolPageItemGui.setItem(38, page1);
		ToolPageItemGui.setItem(44, Main.instance.Utils.CreateItem(Material.REDSTONE, 0, "�f�l� �cArmor"));

		return ToolPageItemGui;
	}

	public Inventory OtherPage1ItemGui() {

		Inventory OtherPageItemGui = Bukkit.createInventory(null, 45, "�6�l� �eOther Page 1");

		Main.instance.GuiManager.setGlassInventory(OtherPageItemGui);

		OtherPageItemGui.setItem(36, back);
		OtherPageItemGui.setItem(38, page1);
		OtherPageItemGui.setItem(44, Main.instance.Utils.CreateItem(Material.REDSTONE, 0, "�f�l� �9Tool"));

		return OtherPageItemGui;
	}
}

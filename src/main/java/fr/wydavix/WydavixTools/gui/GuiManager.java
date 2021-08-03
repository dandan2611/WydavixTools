package fr.wydavix.wydavixtools.gui;

import fr.wydavix.wydavixtools.Main;
import fr.wydavix.wydavixtools.WydavixUtils;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GuiManager {

	private final MainGui mainGui;
	private final ItemGui itemGui;
	private final ServerGui serverGui;
	private final HammerGui hammerGui;

	public GuiManager() {
		this.mainGui = new MainGui(this);
		this.itemGui = new ItemGui();
		this.serverGui = new ServerGui();
		this.hammerGui = new HammerGui();
	}
	
	public void fillInventoryWithGlass(Inventory inv) {
		ItemStack glass = WydavixUtils.createItem(Material.STAINED_GLASS_PANE, 0, " ");
		
		for (int i = 0; i < 10; i++)
			inv.setItem(i, glass);
		for (int i = 35; i < 45; i++)
			inv.setItem(i, glass);
		for (int i = 17; i < 27; i += 9)
			inv.setItem(i, glass);
		for (int i = 18; i < 28; i += 9)
			inv.setItem(i, glass);
	}

	public MainGui getMainGui() {
		return mainGui;
	}

	public ItemGui getItemGui() {
		return itemGui;
	}

	public ServerGui getServerGui() {
		return serverGui;
	}

	public HammerGui getHammerGui() {
		return hammerGui;
	}

}

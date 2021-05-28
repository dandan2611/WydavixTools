package fr.wydavix.WydavixTools.PluginsManager;

import org.bukkit.plugin.java.JavaPlugin;

import fr.wydavix.WydavixTools.PluginManager.ItemInventory.InventoryManager;
import fr.wydavix.WydavixTools.PluginManager.ItemListener.ItemManager;
import fr.wydavix.WydavixTools.PluginsManager.Commands.CommandWydavix;

public class Main extends JavaPlugin {

	public static Main instance;

	public Utils Utils;
	public InventoryManager InventoryManager;
	public ItemManager ItemManager;

	public void onEnable() {
		System.out.println("[WydavixTools] Enabled");
		EventManager.registerEvents(this);

		Main.instance = this;

		this.Utils = new Utils();
		this.InventoryManager = new InventoryManager();
		this.ItemManager = new ItemManager();

		getCommand("wydavix").setExecutor(new CommandWydavix());

	}

	public void onDisable() {
		System.out.println("[WydavixTools] Disable");
	}

}

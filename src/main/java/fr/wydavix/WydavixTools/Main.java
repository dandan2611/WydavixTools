package fr.wydavix.wydavixtools;

import org.bukkit.plugin.java.JavaPlugin;

import fr.wydavix.WydavixTools.PluginManager.WydavixGui.GuiManager;
import fr.wydavix.WydavixTools.PluginManager.WydavixItem.ItemManager;
import fr.wydavix.WydavixTools.PluginsManager.Commands.CommandWydavix;

public class Main extends JavaPlugin {

	public static Main INSTANCE;

	public WydavixUtils utils;
	public GuiManager GuiManager;
	public ItemManager ItemManager;

	/**
	 * Called when the plugin is enabled
	 */
	public void onEnable() {
		System.out.println("[WydavixTools] Enabled");

		Main.INSTANCE = this;

		// Creating utils class
		this.utils = new WydavixUtils();

		this.GuiManager = new GuiManager();
		this.ItemManager = new ItemManager();

		getCommand("wydavix").setExecutor(new CommandWydavix());

		new ListenersManager().registerListeners(this);
	}

	/**
	 * Called when the plugin is disabling
	 */
	public void onDisable() {
		System.out.println("[WydavixTools] Disable");
	}

}

package fr.wydavix.WydavixTools.PluginsManager;

import org.bukkit.plugin.java.JavaPlugin;

import fr.wydavix.WydavixTools.PluginManager.WydavixGui.GuiManager;
import fr.wydavix.WydavixTools.PluginManager.WydavixItem.ItemManager;
import fr.wydavix.WydavixTools.PluginsManager.Commands.CommandWydavix;

public class Main extends JavaPlugin {

	public static Main instance;

	public Utils Utils;
	public GuiManager GuiManager;
	public ItemManager ItemManager;

	public void onEnable() {
		System.out.println("[WydavixTools] Enabled");
		EventManager.registerEvents(this);

		Main.instance = this;

		this.Utils = new Utils();
		this.GuiManager = new GuiManager();
		this.ItemManager = new ItemManager();

		getCommand("wydavix").setExecutor(new CommandWydavix());

	}

	public void onDisable() {
		System.out.println("[WydavixTools] Disable");
	}

}

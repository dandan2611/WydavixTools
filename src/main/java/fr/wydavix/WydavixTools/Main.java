package fr.wydavix.wydavixtools;

import fr.wydavix.wydavixtools.gui.GuiManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static Main INSTANCE;

	public GuiManager GuiManager;
	public ItemManager ItemManager;

	/**
	 * Called when the plugin is enabled
	 */
	public void onEnable() {
		System.out.println("[WydavixTools] Enabled");

		Main.INSTANCE = this;

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

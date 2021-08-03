package fr.wydavix.wydavixtools;

import fr.wydavix.wydavixtools.commands.WydavixCommand;
import fr.wydavix.wydavixtools.gui.GuiManager;
import fr.wydavix.wydavixtools.item.ItemManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public static Main INSTANCE;

	public GuiManager guiManager;
	public ItemManager itemManager;

	/**
	 * Called when the plugin is enabled
	 */
	public void onEnable() {
		System.out.println("[WydavixTools] Enabled");

		Main.INSTANCE = this;

		this.guiManager = new GuiManager();
		this.itemManager = new ItemManager();

		getCommand("wydavix").setExecutor(new WydavixCommand());

		new ListenersManager().registerListeners(this);
	}

	/**
	 * Called when the plugin is disabling
	 */
	public void onDisable() {
		System.out.println("[WydavixTools] Disable");
	}

}

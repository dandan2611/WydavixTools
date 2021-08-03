package fr.wydavix.WydavixTools.PluginManager.WydavixItem;

public class ItemManager {

	public HammerItem HammerItem;
	public MjolnirItem MjolnirItem;
	
	public ItemManager() {
		this.HammerItem = new HammerItem();
		this.MjolnirItem = new MjolnirItem();
	}
}

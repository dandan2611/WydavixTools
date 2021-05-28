package fr.wydavix.WydavixTools.PluginManager.ItemListener;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {

	public ItemStack getHammer() {
		ItemStack Hammer = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta HammerM = Hammer.getItemMeta();
		HammerM.setDisplayName("§3§k!!§bHammer§3§k!!");
		HammerM.setLore(Arrays.asList(" ","§f§l» §6Click Droit pour Choisir entre 3x3 et 5x5"));
		HammerM.addEnchant(Enchantment.DIG_SPEED, 5, true);
		HammerM.addEnchant(Enchantment.DURABILITY, 3, true);
		Hammer.setItemMeta(HammerM);
		
		return Hammer;
	}
}

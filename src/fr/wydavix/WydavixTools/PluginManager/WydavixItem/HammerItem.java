package fr.wydavix.WydavixTools.PluginManager.WydavixItem;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HammerItem {
	
	public ItemStack getHammer() {
		ItemStack Hammer = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta HammerM = Hammer.getItemMeta();
		HammerM.setDisplayName("§3§k!!§bHammer§3§k!! §f§l» §4Disable");
		HammerM.setLore(Arrays.asList(" ","§f§l» §6Right click to choose between 3x3 and 5x5"));
		HammerM.addEnchant(Enchantment.DIG_SPEED, 5, true);
		HammerM.addEnchant(Enchantment.DURABILITY, 3, true);
		Hammer.setItemMeta(HammerM);
		
		return Hammer;
	}
	
	public ItemStack getHammerFake() {
		ItemStack Hammer = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta HammerM = Hammer.getItemMeta();
		HammerM.setDisplayName("§3§k!!§bHammer§3§k!!");
		HammerM.setLore(Arrays.asList(" ","§f§l§nGive Item :"," ","§f§l» §7/§6wydavix give §7<§6player§7> §6hammer","§f§l» §6Left Click"));
		HammerM.addEnchant(Enchantment.DIG_SPEED, 5, true);
		HammerM.addEnchant(Enchantment.DURABILITY, 3, true);
		Hammer.setItemMeta(HammerM);
		
		return Hammer;
	}
}

package fr.wydavix.WydavixTools.PluginManager.WydavixItem;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MjolnirItem {

	public ItemStack getMjolnir() {
		ItemStack mjolnirn = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta mjolnirnM = mjolnirn.getItemMeta();
		mjolnirnM.setDisplayName("§1§k!!§9§lMjolnir§1§k!!");
		mjolnirnM.setLore(Arrays.asList(" ", "§f§l» §6One chance in 20 to have lightning strike your opponent "));
		mjolnirnM.addEnchant(Enchantment.DURABILITY, 4, true);
		mjolnirnM.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		mjolnirnM.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		mjolnirn.setItemMeta(mjolnirnM);

		return mjolnirn;
	}
	
	public ItemStack getMjolnirFake() {
		ItemStack mjolnirn = new ItemStack(Material.DIAMOND_AXE, 1);
		ItemMeta mjolnirnM = mjolnirn.getItemMeta();
		mjolnirnM.setDisplayName("§1§k!!§9§lMjolnir§1§k!!");
		mjolnirnM.setLore(Arrays.asList(" ","§f§l§nGive Item :"," ","§f§l» §7/§6wydavix give §7<§6player§7> §6mjolnir","§f§l» §6Left Click"));
		mjolnirnM.addEnchant(Enchantment.DURABILITY, 4, true);
		mjolnirnM.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		mjolnirnM.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
		mjolnirn.setItemMeta(mjolnirnM);

		return mjolnirn;
	}

}

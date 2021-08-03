package fr.wydavix.wydavixtools.item;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class MjolnirItem extends AbstractWydavixItem {

	@Override
	public Material material() {
		return Material.DIAMOND_AXE;
	}

	@Override
	public byte materialByte() {
		return 0;
	}

	@Override
	public int quantity() {
		return 1;
	}

	@Override
	public String displayName(boolean fake) {
		return "§1§k!!§9§lMjolnir§1§k!!";
	}

	@Override
	public String[] lore(boolean fake) {
		return fake ?
				new String[] {
						" ",
						"§f§l§nGive Item :",
						" ",
						"§f§l» §7/§6wydavix give §7<§6player§7> §6mjolnir",
						"§f§l» §6Left Click"
				} :
				new String[] {
						" ",
						"§f§l» §6One chance in 20 to have a lightning strike your opponent "
				};
	}

	@Override
	public void addEnchants(ItemMeta meta) {
		meta.addEnchant(Enchantment.DURABILITY, 4, true);
		meta.addEnchant(Enchantment.FIRE_ASPECT, 3, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 10, true);
	}
}

package fr.wydavix.wydavixtools.item;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class HammerItem extends AbstractWydavixItem {

	public ItemStack getHammer() {
		ItemStack Hammer = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta HammerM = Hammer.getItemMeta();
		HammerM.setDisplayName("�3�k!!�bHammer�3�k!! �f�l� �4Disable");
		HammerM.setLore(Arrays.asList(" ", "�f�l� �6Right click to choose between 3x3 and 5x5"));
		HammerM.addEnchant(Enchantment.DIG_SPEED, 5, true);
		HammerM.addEnchant(Enchantment.DURABILITY, 3, true);
		Hammer.setItemMeta(HammerM);

		return Hammer;
	}

	public ItemStack getHammerFake() {
		ItemStack Hammer = new ItemStack(Material.DIAMOND_PICKAXE, 1);
		ItemMeta HammerM = Hammer.getItemMeta();
		HammerM.setDisplayName("�3�k!!�bHammer�3�k!!");
		HammerM.setLore(Arrays.asList(" ", "�f�l�nGive Item :", " ", "�f�l� �7/�6wydavix give �7<�6player�7> �6hammer",
				"�f�l� �6Left Click", " ", "�f�l�nItem Settings :"," ", "�f�l� �6Right Click"));
		HammerM.addEnchant(Enchantment.DIG_SPEED, 5, true);
		HammerM.addEnchant(Enchantment.DURABILITY, 3, true);
		Hammer.setItemMeta(HammerM);

		return Hammer;
	}

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
		return fake ? "§3§k!!§bHammer§3§k!!" : "§3§k!!§bHammer§3§k!! §f§l» §4Disable";
	}

	@Override
	public String[] lore(boolean fake) {
		return fake ?
				new String[] {
						" ",
						"§f§l§nGive Item :",
						" ",
						"§f§l» §7/§6wydavix give §7<§6player§7> §6hammer",
						"§f§l» §6Left Click",
						" ",
						"§f§l§nItem Settings :",
						" ",
						"§f§l» §6Right Click"
		} :
				new String[] {
						" ",
						"§f§l» §6Right click to choose between 3x3 and 5x5"
				};
	}

	@Override
	public void addEnchants(ItemMeta meta) {
		meta.addEnchant(Enchantment.DIG_SPEED, 5, true);
		meta.addEnchant(Enchantment.DURABILITY, 3, true);
	}

}

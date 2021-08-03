package fr.wydavix.wydavixtools.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public abstract class WydavixItem {

    public abstract Material material();
    public abstract byte materialByte();
    public abstract int quantity();

    public abstract String displayName(boolean fake);
    public abstract String[] lore(boolean fake);
    public abstract void addEnchants(ItemMeta meta);

    public ItemStack build(boolean fake) {
        ItemStack item = new ItemStack(material(), quantity(), materialByte());
        ItemMeta meta = item.getItemMeta();

        meta.setDisplayName(displayName(fake));
        meta.setLore(Arrays.asList(lore(fake)));
        addEnchants(meta);

        item.setItemMeta(meta);

        return item;
    }

}

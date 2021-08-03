package fr.wydavix.wydavixtools.listeners;

import java.util.List;
import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.Plugin;

public class HammerEventListener implements Listener {

	private final Plugin plugin;

	public HammerEventListener(Plugin plugin) {
		this.plugin = plugin;
	}

	@EventHandler
	public void onClickBlock(BlockBreakEvent e) {
		Player p = e.getPlayer();

		int HammerSize = this.getHammer(p);
		if (HammerSize != -1 && HammerSize != -2) {
			Block b = e.getBlock();
			this.mine(getBlockFace(p, null), (HammerSize - 1) / 2, b);
		}

	}

	public void mine(BlockFace BF, final int size, Block b) {
		Bukkit.getScheduler().runTaskLater(plugin, new Runnable() {

			@Override
			public void run() {
				if (b.getType() == Material.AIR) {
					Location locMax = null, locMin = null;
					int Nsize = (size - (2 * size));
					if (BF == BlockFace.NORTH || BF == BlockFace.SOUTH) {
						locMax = b.getLocation().clone().add(size, size, 0);
						locMin = b.getLocation().clone().add(Nsize, Nsize, 0);
					} else if (BF == BlockFace.EAST || BF == BlockFace.WEST) {
						locMax = b.getLocation().clone().add(0, size, size);
						locMin = b.getLocation().clone().add(0, Nsize, Nsize);
					} else if (BF == BlockFace.UP || BF == BlockFace.DOWN) {
						locMax = b.getLocation().clone().add(size, 0, size);
						locMin = b.getLocation().clone().add(Nsize, 0, Nsize);
					}

					for (int x = locMin.getBlockX(); x <= locMax.getBlockX(); x++) {
						for (int y = locMin.getBlockY(); y <= locMax.getBlockY(); y++) {
							for (int z = locMin.getBlockZ(); z <= locMax.getBlockZ(); z++) {
								Block bb = new Location(locMax.getWorld(), x, y, z).getBlock();
								if (bb.getType() != Material.BEDROCK && (!bb.isLiquid())) {
									bb.breakNaturally();
								}
							}
						}
					}
				}
			}
		}, 1);
	}

	private BlockFace getBlockFace(Player player, Set<Material> object) {
		List<Block> lastTwoTargetBlocks = player.getLastTwoTargetBlocks(object, 100);
		return lastTwoTargetBlocks.get(1).getFace(lastTwoTargetBlocks.get(0));
	}

	public int getHammer(Player p) {
		if (p.getItemInHand() != null && p.getItemInHand().getType() == Material.DIAMOND_PICKAXE) {
			ItemMeta im = p.getItemInHand().getItemMeta();
			if (im.getDisplayName() != null && im.getDisplayName().startsWith("§3§k!!§bHammer§3§k!!§r §f§l» §b")) {
				String ssize = im.getDisplayName().split(" ")[2].substring(2, 3);
				try {
					return Integer.parseInt(ssize);
				} catch (Exception e) {
					return -1;
				}
			}
		}
		return -2;
	}

	@EventHandler
	public void onRightClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
		Action action = e.getAction();

		if (p.getItemInHand().getType() == Material.DIAMOND_PICKAXE && (!p.isSneaking())) {
			if (p.getItemInHand().getItemMeta().getDisplayName().contains("§3§k!!§bHammer§3§k!!")) {

				if (action == Action.RIGHT_CLICK_AIR || action == Action.RIGHT_CLICK_BLOCK) {
					Inventory inv = Bukkit.createInventory(null, 27, "§9§k!!§bHammer Menu§9§k!!");

					ItemStack x3 = new ItemStack(Material.DIAMOND_PICKAXE, 1);
					ItemMeta x3M = x3.getItemMeta();
					x3M.setDisplayName("§3§k!!§bHammer§3§k!!§r §f§l» §b3x3");
					x3.setItemMeta(x3M);

					ItemStack x5 = new ItemStack(Material.DIAMOND_PICKAXE, 1);
					ItemMeta x5M = x5.getItemMeta();
					x5M.setDisplayName("§3§k!!§bHammer§3§k!!§r §f§l» §b5x5");
					x5.setItemMeta(x5M);

					ItemStack retour = new ItemStack(Material.ARROW, 1);
					ItemMeta retourM = retour.getItemMeta();
					retourM.setDisplayName("§f§l» §4Retour");
					retour.setItemMeta(retourM);

					ItemStack désactiver = new ItemStack(Material.REDSTONE, 1);
					ItemMeta désactiverM = désactiver.getItemMeta();
					désactiverM.setDisplayName("§f§l» §4Disable");
					désactiver.setItemMeta(désactiverM);

					inv.setItem(11, x3);
					inv.setItem(13, désactiver);
					inv.setItem(15, x5);
					inv.setItem(18, retour);

					p.openInventory(inv);
				}
			}

		}
	}

	@EventHandler
	public void onInventoryClick(InventoryClickEvent e) {
		Inventory inv = e.getInventory();
		Player p = (Player) e.getWhoClicked();
		ItemStack it = e.getCurrentItem();
		if (it == null)
			return;

		if (inv.getName().equalsIgnoreCase("§9§k!!§bHammer Menu§9§k!!")) {

			e.setCancelled(true);

			if (it.getType() == Material.ARROW) {
				p.closeInventory();
			}

			if (it.getType() == Material.DIAMOND_PICKAXE || it.getType() == Material.REDSTONE) {

				ItemMeta itM = p.getItemInHand().getItemMeta();
				ItemStack it1 = p.getItemInHand();

				if (it.getItemMeta().getDisplayName().equalsIgnoreCase("§3§k!!§bHammer§3§k!!§r §f§l» §b3x3")) {
					itM.setDisplayName("§3§k!!§bHammer§3§k!!§r §f§l» §b3x3");
					p.closeInventory();
					it1.setItemMeta(itM);

					p.sendMessage("§f§l» §6Hammer §7: §c3x3");

					return;
				}

				if (it.getItemMeta().getDisplayName().equalsIgnoreCase("§3§k!!§bHammer§3§k!!§r §f§l» §b5x5")) {
					itM.setDisplayName("§3§k!!§bHammer§3§k!!§r §f§l» §b5x5");
					p.closeInventory();
					it1.setItemMeta(itM);

					p.sendMessage("§f§l» §6Hammer §7: §c5x5");

					return;
				}

				if (it.getItemMeta().getDisplayName().equalsIgnoreCase("§f§l» §4Disable")) {

					itM.setDisplayName("§3§k!!§bHammer§3§k!!§r §f§l» §4Disable");
					p.closeInventory();
					it1.setItemMeta(itM);

					p.sendMessage("§f§l» §6Hammer §7: §cDisable");
					return;
				}

			}

		}
	}

}

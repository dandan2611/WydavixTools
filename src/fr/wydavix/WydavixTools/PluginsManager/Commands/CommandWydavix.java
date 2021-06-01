package fr.wydavix.WydavixTools.PluginsManager.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import fr.wydavix.WydavixTools.PluginsManager.Main;

public class CommandWydavix implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {
			Player p = (Player) sender;

				if (args.length == 0) {
					p.openInventory(Main.instance.GuiManager.MainGui.getWydavixGui());
					return true;
				}

				if (args.length > 0) {

					if (!args[0].equalsIgnoreCase("give")) {
						p.sendMessage("§f§l» §6The Command is §f: §7/§6wydavix give §7<§6player§7> §7<§6items§7>");
						return true;
					}

					if (args.length > 1) {
						Player pget = Bukkit.getPlayer(args[1]);

						if (pget != null) {

							if (args.length > 2) {

								switch (args[2]) {

								case "Hammer":
									pget.getInventory().addItem(Main.instance.ItemManager.HammerItem.getHammer());
									pget.sendMessage("§f§l» §6The Hammer has given you");
									p.sendMessage("§f§l» §6You did give the Hammer a §e" + pget.getName());
									break;
								case "hammer":
									pget.getInventory().addItem(Main.instance.ItemManager.HammerItem.getHammer());
									pget.sendMessage("§f§l» §6The Hammer has given you");
									p.sendMessage("§f§l» §6You did give the Hammer a §e" + pget.getName());
									break;
								case "Mjolnir":
									pget.getInventory().addItem(Main.instance.ItemManager.MjolnirItem.getMjolnir());
									pget.sendMessage("§f§l» §6The Mjolnir has given you");
									p.sendMessage("§f§l» §6You did give the Mjolnir a §e" + pget.getName());
									break;
								case "mjolnir":
									pget.getInventory().addItem(Main.instance.ItemManager.MjolnirItem.getMjolnir());
									pget.sendMessage("§f§l» §6The Mjolnir has given you");
									p.sendMessage("§f§l» §6You did give the Mjolnir a §e" + pget.getName());
									break;
								}
							} else {
								p.sendMessage(
										"§f§l» §6The Command is §f: §7/§6wydavix give §7<§6player§7> §7<§6items§7>");
								return true;
							}

						} else {
							p.sendMessage("§f§l» §6The player is not connected");
							return true;
						}
					} else {
						p.sendMessage("§f§l» §6The Command is §f: §7/§6wydavix give §7<§6player§7> §7<§6items§7>");
						return true;
					}

				}

		} else {

			if (args.length > 0) {

				if (!args[0].equalsIgnoreCase("give")) {
					sender.sendMessage("§f§l» §6The Command is §f: §7/§6wydavix give §7<§6player§7> §7<§6items§7>");
					return true;
				}

				if (args.length > 1) {
					Player pget = Bukkit.getPlayer(args[1]);

					if (pget != null) {

						if (args.length > 2) {

							switch (args[2]) {

							case "Hammer":
								pget.getInventory().addItem(Main.instance.ItemManager.HammerItem.getHammer());
								pget.sendMessage("§f§l» §6The Hammer has given you");
								break;
							case "hammer":
								pget.getInventory().addItem(Main.instance.ItemManager.HammerItem.getHammer());
								pget.sendMessage("§f§l» §6The Hammer has given you");
								break;
							case "Mjolnir":
								pget.getInventory().addItem(Main.instance.ItemManager.MjolnirItem.getMjolnir());
								pget.sendMessage("§f§l» §6The Mjolnir has given you");
								break;
							case "mjolnir":
								pget.getInventory().addItem(Main.instance.ItemManager.MjolnirItem.getMjolnir());
								pget.sendMessage("§f§l» §6The Mjolnir has given you");
								break;
							}
						} else {
							sender.sendMessage(
									"§f§l» §6The Command is §f: §7/§6wydavix give §7<§6player§7> §7<§6items§7>");
							return true;
						}

					} else {
						sender.sendMessage("§f§l» §6The player is not connected");
						return true;
					}
				} else {
					sender.sendMessage("§f§l» §6The Command is §f: §7/§6wydavix give §7<§6player§7> §7<§6items§7>");
					return true;
				}

			}

		}

		return false;
	}

}

package fr.wydavix.WydavixTools.PluginsManager.Commands;

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

			if (p.hasPermission("WydavixTools.wydavix")) {

				if (args.length > 0) {
					p.sendMessage("§f§l» §6The Command is  §f: §7/§6wydavix");
					return true;
				}

				p.openInventory(Main.instance.GuiManager.MainGui.getWydavixGui());

			} else {
				p.sendMessage("§f§l» §6You do not have access to the command");
			}

		}

		return false;
	}

}

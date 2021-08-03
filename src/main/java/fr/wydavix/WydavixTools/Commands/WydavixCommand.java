package fr.wydavix.wydavixtools.commands;

import fr.wydavix.wydavixtools.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class WydavixCommand implements CommandExecutor {

	private final Main main;

	public WydavixCommand(Main main) {
		this.main = main;
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String msg, String[] args) {

		if (sender instanceof Player) {

			// Sender is a Player
			Player player = (Player) sender;

			switch (args.length) {
				case 0:
					player.openInventory(main.getGuiManager().getMainGui().generateGui());
					break;

				case 1:
					sendGiveHelp(player);

				case 2:
					sendGiveHelp(player);

				case 3:
					giveCommand(player, args);

			}

			return true;
		}

		return true;

	}

	private void sendGiveHelp(Player player) {
		player.sendMessage("§f§l» §6The Command is §f: §7/§6wydavix give §7<§6player§7> §7<§6items§7>");
	}

	private void giveCommand(Player player, String[] args) {
		String targetName = args[1];
		Player target = Bukkit.getPlayer(targetName);

		if (target == null) {
			player.sendMessage("§f§l» §6The player '" + targetName + "' is not connected");
			return;
		}

		String itemIdentifier = args[2];
		ItemStack item = main.getItemManager().getItemByIdentifier(itemIdentifier);

		if(item == null) {
			player.sendMessage("§f§l» §6Item '" + itemIdentifier + "' not found");
			return;
		}

		player.getInventory().addItem(item);

		// Making the first letter of the identifier in uppercase
		itemIdentifier = itemIdentifier.substring(0, 1).toUpperCase() + itemIdentifier.substring(1);

		player.sendMessage("§f§l» §6You did give the " + itemIdentifier + " to §e" + target.getName());
	}

}

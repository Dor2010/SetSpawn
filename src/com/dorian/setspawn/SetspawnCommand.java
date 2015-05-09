package com.dorian.setspawn;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetspawnCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		Player p = (Player) sender;
		
		if(p.hasPermission("spawn.set")){
			p.getWorld().setSpawnLocation(p.getLocation().getBlockX(), p.getLocation().getBlockY(), p.getLocation().getBlockZ());
			p.sendMessage(ChatColor.GRAY + "Vous venez de d�finir le spawn du monde.");
		} else {
			p.sendMessage(ChatColor.RED + "Vous n'avez pas la permission d'effectuer cette commande.");
		}
		return false;
	}
	
	

}

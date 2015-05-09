package com.dorian.setspawn;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SpawnCommand implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {
		
		Player p = (Player) sender;
		if(p.hasPermission("spawn.tp")){
			p.teleport(Bukkit.getServer().getWorld("world").getSpawnLocation());
			p.sendMessage(ChatColor.GRAY + "" + ChatColor.ITALIC + "VOus avez été téléporté au spawn.");
		} else {
			p.sendMessage(ChatColor.RED + "Vous n'avez pas la permission d'effectuer cette commande.");  
		}
		
		return false;
	}

}

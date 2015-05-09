package com.dorian.setspawn;

import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin{
	
	public void onEnable(){
	
		CommandExecutor spawn = new SpawnCommand();
		getCommand("spawn").setExecutor(spawn);
		
		CommandExecutor setspawn = new SetspawnCommand();
		getCommand("setspawn").setExecutor(setspawn);
	}


}

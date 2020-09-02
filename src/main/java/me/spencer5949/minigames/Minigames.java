package me.spencer5949.minigames;

import me.spencer5949.minigames.commands.minigames;
import me.spencer5949.minigames.events.ClickEvent;
import me.spencer5949.minigames.tools.GameCreator;
import org.bukkit.plugin.java.JavaPlugin;

public final class Minigames extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("minigames").setExecutor(new minigames());
        getServer().getPluginManager().registerEvents(new GameCreator(), this);

        getServer().getPluginManager().registerEvents(new ClickEvent(), this);

        Config.setup();
        Config.get().options().copyDefaults(true);
        Config.save();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

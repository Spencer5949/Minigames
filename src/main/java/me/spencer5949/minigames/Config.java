package me.spencer5949.minigames;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class Config {
    private static File file;
    private static FileConfiguration FloorIsLavaMaps;

    public static void setup(){
        file = new File(Bukkit.getServer().getPluginManager().getPlugin("Minigames").getDataFolder(), "FloorIsLavaMaps.yml");

        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e){

            }
        }
        FloorIsLavaMaps = YamlConfiguration.loadConfiguration(file);
    }

    public static FileConfiguration get(){
        return FloorIsLavaMaps;
    }

    public static void save(){
        try{
            FloorIsLavaMaps.save(file);
        } catch (IOException e) {
            System.out.println("Could not save file");
            e.printStackTrace();
        }
    }

    public static void reload(){
        FloorIsLavaMaps = YamlConfiguration.loadConfiguration(file);
    }
}











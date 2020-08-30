package me.spencer5949.minigames.tools;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class GameCreator implements Listener {

    public static void TheFloorIsLava(Player player) {
        ItemStack floorislava = new ItemStack(Material.STICK);
        ItemMeta floorislava_meta = floorislava.getItemMeta();
        floorislava_meta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Game Creator");
        ArrayList<String> floorislava_lore = new ArrayList<>();
        floorislava_lore.add(ChatColor.AQUA + "- " + ChatColor.GRAY + "Floor Is lava");
        floorislava_meta.setLore(floorislava_lore);
        floorislava.setItemMeta(floorislava_meta);

        player.getInventory().addItem(floorislava);

    }

    public static void  Siege() {

    }

    public static void CaptureTheFlag() {

    }

    public static void HungerGames() {

    }

    public static void TntRun() {

    }
}

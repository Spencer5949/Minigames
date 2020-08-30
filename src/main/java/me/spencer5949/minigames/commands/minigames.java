package me.spencer5949.minigames.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class minigames implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length > 0) {
                if (args[0].equalsIgnoreCase("create")) {

                    Inventory gui = Bukkit.createInventory(player, 27, "" + ChatColor.DARK_AQUA + ChatColor.BOLD + "Select Minigame to create");

                    ItemStack FloorIsLava = new ItemStack(Material.LAVA_BUCKET);
                    ItemStack Siege = new ItemStack(Material.DIAMOND_SWORD);
                    ItemStack CaptureTheFlag = new ItemStack(Material.LIME_WOOL);
                    ItemStack HungerGames = new ItemStack(Material.IRON_SWORD);
                    ItemStack TntRun = new ItemStack(Material.TNT);

                    ItemMeta FloorIsLava_meta = FloorIsLava.getItemMeta();
                    FloorIsLava_meta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "The Floor Is Lava");
                    ArrayList<String> FloorIsLava_lore = new ArrayList<>();
                    FloorIsLava_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "In this gamemode lava slowly rises");
                    FloorIsLava_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "players need to complete a parkour course");
                    FloorIsLava_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "before the lava reaches them");
                    FloorIsLava_meta.setLore(FloorIsLava_lore);
                    FloorIsLava.setItemMeta(FloorIsLava_meta);

                    ItemMeta Siege_meta = Siege.getItemMeta();
                    Siege_meta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Siege");
                    ArrayList<String> Siege_lore = new ArrayList<>();
                    Siege_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "In this gamemode there is two teams");
                    Siege_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "one team tries to defend a villager");
                    Siege_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "while the other team tries to kill it");
                    Siege_meta.setLore(Siege_lore);
                    Siege.setItemMeta(Siege_meta);

                    ItemMeta CaptureTheFlag_meta = CaptureTheFlag.getItemMeta();
                    CaptureTheFlag_meta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Capture the flag");
                    ArrayList<String> CaptureTheFlag_lore = new ArrayList<>();
                    CaptureTheFlag_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "In this gamemode there is two teams");
                    CaptureTheFlag_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "each team has to try and capture the");
                    CaptureTheFlag_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "other teams flag and return it to their base");
                    CaptureTheFlag_meta.setLore(CaptureTheFlag_lore);
                    CaptureTheFlag.setItemMeta(CaptureTheFlag_meta);

                    ItemMeta HungerGames_meta = HungerGames.getItemMeta();
                    HungerGames_meta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "Hunger Games");
                    ArrayList<String> HungerGames_lore = new ArrayList<>();
                    HungerGames_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "In this gamemode everyone has to fight");
                    HungerGames_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "against each other and attempt to be the");
                    HungerGames_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "last person standing in order to win");
                    HungerGames_meta.setLore(HungerGames_lore);
                    HungerGames.setItemMeta(HungerGames_meta);

                    ItemMeta TntRun_meta = TntRun.getItemMeta();
                    TntRun_meta.setDisplayName("" + ChatColor.DARK_RED + ChatColor.BOLD + "TNT run");
                    ArrayList<String> TntRun_lore = new ArrayList<>();
                    TntRun_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "In this gamemode everyone is spawned on a");
                    TntRun_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "floor of tnt that falls when stepped on");
                    TntRun_lore.add(ChatColor.DARK_GRAY + "- " + ChatColor.DARK_AQUA + "the goal is to run around and not fall off");
                    TntRun_meta.setLore(TntRun_lore);
                    TntRun.setItemMeta(TntRun_meta);

                    ItemStack[] menu_items = {FloorIsLava, Siege, CaptureTheFlag, HungerGames, TntRun};
                    gui.setContents(menu_items);
                    player.openInventory(gui);

                }
                if (args[0].equalsIgnoreCase("help")) {
                    player.sendMessage(ChatColor.GOLD + "Minigames by Spencer5949#6603");
                    player.sendMessage(ChatColor.GOLD + "Use '/minigames create' to create a new minigames map");
                }

            }
        }
        return false;
    }
}


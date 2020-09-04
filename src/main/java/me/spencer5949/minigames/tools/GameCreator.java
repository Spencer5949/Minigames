package me.spencer5949.minigames.tools;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import javax.swing.*;
import java.util.ArrayList;

public class GameCreator implements Listener {

    Integer FloorIsLava_Step = 0;
    public static ItemStack floorislava;
    Integer Siege_Step = 0;
    public static  ItemStack SiegeCreator;
    Integer CaptureTheFlag_Step = 0;
    public static ItemStack CaptureTheFlagCreator;
    Integer HungerGames_Step = 0;
    Integer TntRun_Step = 0;
    Integer Boom_Step = 0;

    public static void TheFloorIsLava(Player player) {
        ItemStack floorislava = new ItemStack(Material.STICK);
        ItemMeta floorislava_meta = floorislava.getItemMeta();
        floorislava_meta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Game Creator");
        ArrayList<String> floorislava_lore = new ArrayList<>();
        floorislava_lore.add(ChatColor.AQUA + "- " + ChatColor.GRAY + "Floor Is lava");
        floorislava_meta.setLore(floorislava_lore);
        floorislava.setItemMeta(floorislava_meta);
        player.getInventory().addItem(floorislava);
        player.sendMessage(ChatColor.GOLD + "Select the first point for the map");

    }

    public static void  Siege(Player player) {
        ItemStack siege = new ItemStack(Material.STICK);
        ItemMeta siege_meta = siege.getItemMeta();
        siege_meta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Game Creator");
        ArrayList<String> siege_lore = new ArrayList<>();
        siege_lore.add(ChatColor.AQUA + "- " + ChatColor.GRAY + "Siege");
        siege_meta.setLore(siege_lore);
        siege.setItemMeta(siege_meta);
        player.getInventory().addItem(siege);
        player.sendMessage(ChatColor.GOLD + "First to setup the defenders. Select ");
        SiegeCreator = siege;



    }

    public static void CaptureTheFlag(Player player) {
        ItemStack capturetheflag = new ItemStack(Material.STICK);
        ItemMeta capturetheflag_meta = capturetheflag.getItemMeta();
        capturetheflag_meta.setDisplayName("" + ChatColor.RED + ChatColor.BOLD + "Game Creator");
        ArrayList<String> capturetheflag_lore = new ArrayList<>();
        capturetheflag_lore.add(ChatColor.AQUA + "- " + ChatColor.GRAY + "Capture The Flag");
        capturetheflag_meta.setLore(capturetheflag_lore);
        capturetheflag.setItemMeta(capturetheflag_meta);
        player.getInventory().addItem(capturetheflag);
        player.sendMessage(ChatColor.GOLD + "Select the flag block for team 1");
        CaptureTheFlagCreator = capturetheflag;



    }

    public static void HungerGames() {

    }

    public static void TntRun() {

    }

    @EventHandler
    public void onClick(PlayerInteractEvent e) {
        Player player = e.getPlayer();


        if(e.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            Block block = e.getClickedBlock();
            String world = block.getWorld().getName();
            Integer X = block.getX();
            Integer Y = block.getY();
            Integer Z = block.getZ();

            if(e.getHand() == EquipmentSlot.OFF_HAND) {
                return;
            }
            if(player.getItemInHand().equals(GameCreator.floorislava)) {

            }

            if(player.getItemInHand().equals(GameCreator.SiegeCreator)) {

                switch(Siege_Step) {
                    case 0:
                        player.sendMessage(ChatColor.GOLD + "First spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 1 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the second position");
                        Siege_Step = 1;
                        break;

                    case 1:



                }


            }

            if(player.getItemInHand().equals(GameCreator.CaptureTheFlagCreator)) {

                switch(CaptureTheFlag_Step) {


                }
            }



        }
    }


}

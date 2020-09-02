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
import org.bukkit.persistence.PersistentDataContainer;

import java.util.ArrayList;

public class GameCreator implements Listener {

    Integer FloorIsLava_Step = 0;
    public static ItemStack floorislava;
    Integer Siege_Step = 0;
    public static  ItemStack SiegeCreator;
    Integer CaptureTheFlag_Step = 0;
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
        player.sendMessage(ChatColor.GOLD + "First to setup team one. Select 7 random spawn points for players");
        SiegeCreator = siege;



    }

    public static void CaptureTheFlag() {

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
                        player.sendMessage(ChatColor.GOLD + "Second spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 1 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the third position");
                        Siege_Step = 2;
                        break;

                    case 2:
                        player.sendMessage(ChatColor.GOLD + "Third spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 1 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the fourth position");
                        Siege_Step = 3;
                        break;
                    case 3:
                        player.sendMessage(ChatColor.GOLD + "Fourth spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 1 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the fifth position");
                        Siege_Step = 4;
                        break;

                    case 4:
                        player.sendMessage(ChatColor.GOLD + "Fifth spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 1 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the sixth position");
                        Siege_Step = 5;
                        break;

                    case 5:
                        player.sendMessage(ChatColor.GOLD + "Sixth spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 1 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the seventh position");
                        Siege_Step = 6;
                        break;

                    case 6:
                        player.sendMessage(ChatColor.GOLD + "Seventh spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 1 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the first position for " + ChatColor.WHITE + ChatColor.BOLD + "Team 2");
                        Siege_Step = 7;
                        break;

                    case 7:
                        player.sendMessage(ChatColor.GOLD + "First spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 2 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the second position");
                        Siege_Step = 8;
                        break;

                    case 8:
                        player.sendMessage(ChatColor.GOLD + "Second spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 2 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the third position");
                        Siege_Step = 9;
                        break;

                    case 9:
                        player.sendMessage(ChatColor.GOLD + "Third spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 2 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the fourth position");
                        Siege_Step = 10;
                        break;

                    case 10:
                        player.sendMessage(ChatColor.GOLD + "Fourth spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 2 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the fifth position");
                        Siege_Step = 11;
                        break;

                    case 11:
                        player.sendMessage(ChatColor.GOLD + "Fifth spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 2 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the sixth position");
                        Siege_Step = 12;
                        break;

                    case 12:
                        player.sendMessage(ChatColor.GOLD + "Sixth spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 2 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the seventh position");
                        Siege_Step = 13;
                        break;

                    case 13:
                        player.sendMessage(ChatColor.GOLD + "Seventh spawn point for " + ChatColor.WHITE + ChatColor.BOLD + "Team 2 " + ChatColor.GOLD + "set at " + ChatColor.WHITE + ChatColor.BOLD + X + " " + Y + " " + Z + " " + ChatColor.GOLD + "now right click the hostage spawn location");
                        Siege_Step = 14;
                        break;

                    case 14:
                        












                }


            }

        }
    }


}

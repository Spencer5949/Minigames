package me.spencer5949.minigames.events;

import me.spencer5949.minigames.tools.GameCreator;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class ClickEvent implements Listener {

    @EventHandler
    public void clickEvent(InventoryClickEvent e) {

        Player player = (Player) e.getWhoClicked();

        if (e.getView().getTitle().startsWith("" + ChatColor.DARK_AQUA + ChatColor.BOLD + "Select Minigame to create")) {

            switch (e.getCurrentItem().getType()) {
                case LAVA_BUCKET:
                    player.closeInventory();
                    GameCreator.TheFloorIsLava(player);



                case DIAMOND_SWORD:

                case LIME_WOOL:

                case IRON_SWORD:

                case TNT:


            }

            e.setCancelled(true);
        }
    }
}

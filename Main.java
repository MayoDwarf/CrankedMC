package Cranked;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: MayoDwarf
 * Date: 11/27/13
 * Time: 10:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Main {
           public ArrayList<String> inGame = new ArrayList<String>();
           public HashMap<String, Integer> XP = new HashMap<String, Integer>();
           public HashMap<String, Integer> Kills = new HashMap<String, Integer>();
           public HashMap<String, Integer> Deaths = new HashMap<String, Integer>();
           public HashMap<String, Boolean> GameStatus = new HashMap<String, Boolean>();
           public HashMap<String, ItemStack[]> Inventory = new HashMap<String, ItemStack[]>();      //Their inventory outside of the match.
        //PLANNING:
           //Player File, Primary: getGun();
           //Player File, Secondary: getSec();
           //Player File, ArmorCont: getArmor();
           //Player File, Knife: getKnife();
           //Player File, Perk1: getPerk1();
           //Player File, Perk2: getPerk2();
           //Player File, Perk3: getPerk3();
    public void StartGame() {
        if(!GameStatus.isEmpty()) {
        if(GameStatus.get("Game") == false) {
           //Start Game

        } else {
            //Game is not over or bugging

            }
        } else {
          //First Game Start of the day.

        }
    }
    public void EndGame() {
        Bukkit.getServer().shutdown();
    }
    public void ClassSelection(Player p) {
        //Open up their class selection.

    }
}

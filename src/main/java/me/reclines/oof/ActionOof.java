package me.reclines.oof;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;

public class ActionOof {
    public static void oof() {
        //noinspection InfiniteLoopStatement
        while (true)
            (new Thread(() -> {
                while (true)
                    Bukkit.broadcastMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "OOF");

            })).start();
    }
}


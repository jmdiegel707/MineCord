//package MineCord.Plugin;
//
//import org.bukkit.Bukkit;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//import org.bukkit.inventory.Inventory;
//
//public class seeInventoryCMD implements CommandExecutor {
//    @Override
//    public boolean onCommand( CommandSender commandSender, Command command, String s, String[] strings) {
//
//        Player player = (Player) commandSender;
//        Player target = Bukkit.getPlayer(strings[0]);
//
//        player.openInventory(target.getInventory());
//
//        return true;
//    }
//}

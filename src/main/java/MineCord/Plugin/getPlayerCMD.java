//package MineCord.Plugin;
//
//import org.bukkit.Bukkit;
//import org.bukkit.ChatColor;
//import org.bukkit.attribute.Attribute;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//import org.bukkit.entity.Player;
//
//public class getPlayerCMD implements CommandExecutor {
//
//    @Override
//    public boolean onCommand( CommandSender commandSender, Command command, String s, String[] strings) {
//
//        Player player = Bukkit.getPlayer(strings[0]);
//
//        commandSender.sendMessage(ChatColor.BOLD+player.getDisplayName()+"\n\n"+ChatColor.RESET+ChatColor.DARK_BLUE+"Position:\nX:"+player.getLocation().getX()+" Y:"+player.getLocation().getY()+" Z:"+player.getLocation().getZ()+ChatColor.RESET+ChatColor.DARK_PURPLE+"\n\nDimension: "+player.getWorld().getEnvironment().name()+ChatColor.RESET+ChatColor.RED+"\n\n\nHeath: "+player.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()+ChatColor.RESET+ChatColor.GRAY+"\nArmor: "+player.getAttribute(Attribute.GENERIC_ARMOR).getValue());
//
//        return true;
//    }
//}
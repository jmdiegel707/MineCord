//package MineCord.Plugin;
//
//import org.bukkit.Bukkit;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandSender;
//import org.bukkit.command.TabCompleter;
//import org.bukkit.entity.HumanEntity;
//
//import java.util.List;
//
//public class getPlayerCMDtab implements TabCompleter {
//    public List<String> onTabComplete( CommandSender commandSender, Command command, String s, String[] strings) {
//        return Bukkit.getOnlinePlayers().stream().map(HumanEntity::getName).toList();
//    }
//}
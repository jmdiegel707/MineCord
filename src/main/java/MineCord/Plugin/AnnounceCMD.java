//package MineCord.Plugin;
//
//import net.dv8tion.jda.api.EmbedBuilder;
//import net.dv8tion.jda.api.JDA;
//import net.dv8tion.jda.api.entities.MessageEmbed;
//import net.dv8tion.jda.api.entities.TextChannel;
//import org.bukkit.command.Command;
//import org.bukkit.command.CommandExecutor;
//import org.bukkit.command.CommandSender;
//
//import java.awt.*;
//
//public class AnnounceCMD implements CommandExecutor {
//
//    @Override
//    public boolean onCommand(CommandSender player, Command command, String lable, String[] args) {
//        StringBuilder builder = new StringBuilder("");
//        for (String str : args)
//            builder.append(str + " ");
//        String argString = builder.toString().trim();
//
//        TextChannel Channel = (TextChannel) Main.bot.getGuildChannelById(Main.Channel);
//        MessageEmbed Embed = new EmbedBuilder().setTitle("**"+player+"** Announced:").setDescription(argString).build();
//        Channel.sendMessageEmbeds(Embed);
//
//        return true;
//    }
//}

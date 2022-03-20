package MineCord.Plugin;

import MineCord.JDA.Bot;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Channel;
import net.dv8tion.jda.api.entities.MessageEmbed;
import net.dv8tion.jda.api.entities.TextChannel;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.NamespacedKey;
import org.bukkit.Server;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.Recipe;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

import javax.security.auth.login.LoginException;
import java.awt.*;
import java.io.IOException;

public class Main extends JavaPlugin {
    public static Server server;
    public static String BotToken;
    public static long Channel;
    public static long Role;
    public static long PostID;
    public static boolean PostToDiscord;
    public static boolean PostToMinecraft;
    public static boolean DefaultAchieveOnly;
    public static boolean PlayerJoinLeave;
    public static boolean PlayerAchieve;
    public static boolean PlayerRecipe;
    public static boolean PlayerDeath;
    public static boolean EntityDeath;
    public static boolean OnCommand;
    public static int Port;
    public static boolean OnJoinLeave;
    public static boolean PlayerMove;
    public static boolean RecipeGain;
    public static boolean AcheivementGain;
    public static boolean OnPlayerDeath;
    public static boolean OnEntityDeath;
    public static boolean OnCommandRun;
    public static JDA bot;

    @Override
    public void onEnable() {
//        getCommand("announce").setExecutor(new AnnounceCMD());
//        getCommand("get").setExecutor(new getPlayerCMD());
//        getCommand("seeinv").setExecutor(new seeInventoryCMD());
        getServer().getPluginManager().registerEvents(new Listeners(), this);
        server = this.getServer();
        BotToken = this.getConfig().getString("BotToken");
        Channel = Long.parseLong(this.getConfig().getString("Channel"));
        Role = Long.parseLong(this.getConfig().getString("Role"));
        PostID = Long.parseLong(this.getConfig().getString("PostID"));
        PostToDiscord = Boolean.parseBoolean(this.getConfig().getString("PostToDiscord"));
        PostToMinecraft = Boolean.parseBoolean(this.getConfig().getString("PostToMinecraft"));
        DefaultAchieveOnly = Boolean.parseBoolean(this.getConfig().getString("DefaultAchieveOnly"));
        PlayerJoinLeave = Boolean.parseBoolean(this.getConfig().getString("PlayerJoinLeave"));
        PlayerAchieve = Boolean.parseBoolean(this.getConfig().getString("PlayerAchieve"));
        PlayerRecipe = Boolean.parseBoolean(this.getConfig().getString("PlayerRecipe"));
        PlayerDeath = Boolean.parseBoolean(this.getConfig().getString("PlayerDeath"));
        EntityDeath = Boolean.parseBoolean(this.getConfig().getString("EntityDeath"));
        OnCommand = Boolean.parseBoolean(this.getConfig().getString("OnCommand"));
        Port = Integer.parseInt(this.getConfig().getString("Port"));
        OnJoinLeave = Boolean.parseBoolean(this.getConfig().getString("OnJoinLeave"));
        PlayerMove = Boolean.parseBoolean(this.getConfig().getString("PlayerMove"));
        RecipeGain = Boolean.parseBoolean(this.getConfig().getString("RecipeGain"));
        AcheivementGain = Boolean.parseBoolean(this.getConfig().getString("AcheivementGain"));
        OnPlayerDeath = Boolean.parseBoolean(this.getConfig().getString("OnPlayerDeath"));
        OnEntityDeath = Boolean.parseBoolean(this.getConfig().getString("OnEntityDeath"));
        OnCommandRun = Boolean.parseBoolean(this.getConfig().getString("OnCommandRun"));
        saveResource("config.yml", false);
//        try {
//            Websocket.EnableWS();
//        } catch (IOException e) {getServer().getLogger().severe("[MineCord] Websocket failed to load");}

        try {
            bot = Bot.Build();
        } catch (LoginException e) {
            getServer().getLogger().severe("[MineCord] Discord Bot failed to login");
        }
    }
}

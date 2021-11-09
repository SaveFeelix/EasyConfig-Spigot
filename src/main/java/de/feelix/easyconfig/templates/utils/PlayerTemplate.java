package de.feelix.easyconfig.templates.utils;

import de.feelix.easyconfig.PluginConfig;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;

public abstract class PlayerTemplate extends PluginConfig {

    /**
     * Default Constructor
     * @param plugin the Plugin
     */
    public PlayerTemplate(@NotNull JavaPlugin plugin) {
        super(plugin, "players");
    }

    /**
     * Default Constructor
     * @param plugin the Plugin
     * @param folderName the name of the Plugin
     */
    public PlayerTemplate(@NotNull JavaPlugin plugin, @NotNull String folderName) {
        super(plugin, folderName, "players");
    }

    /**
     * Method to add a Player to the Config
     * @param player the Player
     */
    public abstract void addPlayer(@NotNull Player player);

    /**
     * Method to remove a Player from the Config
     * @param player the Player
     */
    public abstract void removePlayer(@NotNull Player player);

    /**
     * Method to add one or more Players
     * @param players the Players
     */
    protected void addPlayers(@NotNull Player... players) {
        Arrays.asList(players).forEach(this::addPlayer);
    }

    /**
     * Method to add one or more Players
     * @param players the Players
     */
    protected void addPlayers(@NotNull List<Player> players) {
        players.forEach(this::addPlayer);
    }

    /**
     * Method to add all OnlinePlayers
     */
    protected void addOnlinePlayer() {
        Bukkit.getOnlinePlayers().forEach(this::addPlayer);
    }

    /**
     * Method to remove one or more Players
     * @param players the Players
     */
    protected void removePlayers(@NotNull Player... players) {
        Arrays.asList(players).forEach(this::removePlayer);
    }

    /**
     * Method to remove one or more Players
     * @param players the Players
     */
    protected void removePlayers(@NotNull List<Player> players) {
        players.forEach(this::removePlayer);
    }

    /**
     * Method to override the add Method
     * @param player the Player
     * @param key the Key
     * @param value the Value
     */
    protected void add(@NotNull Player player, @NotNull String key, @NotNull Object value) {
        super.add(player.getUniqueId() + "." + key, value);
    }

    /**
     * Method to override the set Method
     * @param player the Player
     * @param key the Key
     * @param value the Value
     */
    protected void set(@NotNull Player player, @NotNull String key, @NotNull Object value) {
        super.set(player.getUniqueId() + "." + key, value);
    }

    /**
     * Method to override the addAndSet Method
     * @param player the Player
     * @param key the Key
     * @param value the Value
     */
    protected void addAndSet(@NotNull Player player, @NotNull String key, @NotNull Object value) {
        super.addAndSet(player.getUniqueId() + "." + key, value);
    }

    /**
     * Method to override the remove Method
     * @param player the Player
     * @param key the Key
     */
    protected void remove(@NotNull Player player, @NotNull String key) {
        super.remove(player.getUniqueId() + "." + key);
    }
}

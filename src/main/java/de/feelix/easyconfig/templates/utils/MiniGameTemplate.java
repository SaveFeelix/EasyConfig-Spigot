package de.feelix.easyconfig.templates.utils;

import de.feelix.easyconfig.PluginConfig;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public abstract class MiniGameTemplate extends PluginConfig {

    /**
     * Default Constructor
     * @param plugin the Plugin
     */
    public MiniGameTemplate(@NotNull JavaPlugin plugin) {
        this(plugin, "");
    }

    /**
     * Default Constructor
     * @param plugin the Plugin
     * @param folderName the name of the Folder
     */
    public MiniGameTemplate(@NotNull JavaPlugin plugin, @NotNull String folderName) {
        super(plugin, folderName, "minigames");
    }

    @Override
    public void addDefault() {
        this.add("isRunning", false);
        this.add("player.min", 3);
        this.add("player.max", 10);
        addOtherDefault();
    }

    /**
     * Method to add other Values to the Config
     */
    public abstract void addOtherDefault();

    /**
     * Getter for isRunning
     * @return isRunning
     */
    public boolean isRunning() {
        return this.getFromConfig("isRunning");
    }

    /**
     * Setter for isRunning
     * @param running the value
     */
    public void isRunning(boolean running) {
        this.set("isRunning", running);
    }

    /**
     * Getter for the minimum Amount for the MiniGame
     * @return the minimum Amount of Player
     */
    public int getMinPlayer() {
        return this.getFromConfig("player.min");
    }

    /**
     * Setter for the minimum Amount for the MiniGame
     * @param minPlayer the minimum Amount of Player
     */
    public void setMinPlayer(int minPlayer) {
        this.set("player.min", minPlayer);
    }

    /**
     * Getter for the maximum Amount for the MiniGame
     * @return the maximum Amount of Player
     */
    public int getMaxPlayer() {
        return this.getFromConfig("player.max");
    }

    /**
     * Setter for the maximum Amount for the MiniGame
     * @param maxPlayer the maximum Amount of Player
     */
    public void setMaxPlayer(int maxPlayer) {
        this.set("player.max", maxPlayer);
    }
}

package de.feelix.easyconfig;

import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public abstract class PluginConfig extends EasyConfig {

    /**
     * Reference to the Plugin
     */
    protected final JavaPlugin plugin;

    /**
     * Default Constructor
     * @param plugin the Plugin
     * @param fileName the name of the File
     */
    public PluginConfig(@NotNull JavaPlugin plugin, @NotNull String fileName) {
        this(plugin, "", fileName);
    }

    /**
     * Default Constructor
     * @param plugin the Plugin
     * @param folderName the name of the Folder
     * @param fileName the name of the File
     */
    public PluginConfig(@NotNull JavaPlugin plugin, @NotNull String folderName, @NotNull String fileName) {
        super("plugins/" + plugin.getName() + "/" + folderName, fileName);
        this.plugin = plugin;
    }
}

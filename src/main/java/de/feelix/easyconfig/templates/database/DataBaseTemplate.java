package de.feelix.easyconfig.templates.database;

import de.feelix.easyconfig.PluginConfig;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * Class to create a DataBaseConfig
 */
public abstract class DataBaseTemplate extends de.feelix.easyconfig.templates.DataBaseTemplate {

    protected final JavaPlugin plugin;

    /**
     * Default Constructor
     * @param plugin the Plugin
     */
    public DataBaseTemplate(@NotNull JavaPlugin plugin) {
        this(plugin, "");
    }

    /**
     * Default Constructor
     * @param plugin the Plugin
     * @param folderName the folderName
     */
    public DataBaseTemplate(@NotNull JavaPlugin plugin, @NotNull String folderName) {
        super("plugins/" + plugin.getName() + "/" + folderName);
        this.plugin = plugin;
    }
}

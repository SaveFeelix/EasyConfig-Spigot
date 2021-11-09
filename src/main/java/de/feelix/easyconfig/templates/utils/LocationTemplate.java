package de.feelix.easyconfig.templates.utils;

import de.feelix.easyconfig.PluginConfig;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.Locale;
import java.util.Objects;

public abstract class LocationTemplate extends PluginConfig {

    /**
     * Default Constructor
     * @param plugin the Plugin
     */
    public LocationTemplate(@NotNull JavaPlugin plugin) {
        super(plugin, "locations");
    }

    /**
     * Default Constructor
     * @param plugin the Plugin
     * @param folderName the folderName
     */
    public LocationTemplate(@NotNull JavaPlugin plugin, @NotNull String folderName) {
        super(plugin, folderName, "locations");
    }

    /**
     * Method to override the add Method
     * @param location the Location
     * @param root the rootPath to the Location
     */
    protected void add(@NotNull Location location, @NotNull String root) {
        root = root.toLowerCase(Locale.ROOT);
        super.add(root + ".world", Objects.requireNonNull(location.getWorld()).getName());
        super.add(root + ".x", location.getX());
        super.add(root + ".y", location.getY());
        super.add(root + ".z", location.getZ());
        super.add(root + ".yaw", location.getYaw());
        super.add(root + ".pitch", location.getPitch());
    }

    /**
     * Method to override the set Method
     * @param location the Location
     * @param root the rootPath to the Location
     */
    protected void set(@NotNull Location location, @NotNull String root) {
        root = root.toLowerCase(Locale.ROOT);
        super.set(root + ".world", Objects.requireNonNull(location.getWorld()).getName());
        super.set(root + ".x", location.getX());
        super.set(root + ".y", location.getY());
        super.set(root + ".z", location.getZ());
        super.set(root + ".yaw", location.getYaw());
        super.set(root + ".pitch", location.getPitch());
    }

    /**
     * Method to override the addAndSet Method
     * @param location the Location
     * @param root the rootPath to the Location
     */
    protected void addAndSet(@NotNull Location location, @NotNull String root) {
        root = root.toLowerCase(Locale.ROOT);
        super.addAndSet(root + ".world", Objects.requireNonNull(location.getWorld()).getName());
        super.addAndSet(root + ".x", location.getX());
        super.addAndSet(root + ".y", location.getY());
        super.addAndSet(root + ".z", location.getZ());
        super.addAndSet(root + ".yaw", location.getYaw());
        super.addAndSet(root + ".pitch", location.getPitch());
    }

    /**
     * Method to override the remove Method
     * @param root the rootPath to the Location
     */
    protected void remove(@NotNull String root) {
        super.remove(root + ".world");
        super.remove(root + ".x");
        super.remove(root + ".y");
        super.remove(root + ".z");
        super.remove(root + ".yaw");
        super.remove(root + ".pitch");
        super.remove(root);
    }

    /**
     * Method to override the get Method
     * @param root the rootPath to the Location
     */
    protected Location get(@NotNull String root, @NotNull Boolean withYawAndPitch) {
        root = root.toLowerCase(Locale.ROOT);
        String worldName = this.getFromConfig(root + ".world");
        World world = Bukkit.getWorld(worldName);
        double x = this.getFromConfig(root + ".x"),
                y = this.getFromConfig(root + ".y"),
                z = this.getFromConfig(root + ".z");
        float yaw = this.getFromConfig(root + ".yaw"),
                pitch = this.getFromConfig(root + ".pitch");
        return withYawAndPitch ? new Location(world, x, y, z, yaw, pitch) : new Location(world, x, y, z);
    }
}

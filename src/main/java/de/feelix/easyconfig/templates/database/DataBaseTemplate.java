package de.feelix.easyconfig.templates.database;

import de.feelix.easyconfig.PluginConfig;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

/**
 * Class to create a DataBaseConfig
 */
public abstract class DataBaseTemplate extends PluginConfig {

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
        super(plugin, folderName, "database");
    }

    @Override
    public void addDefault() {
        this.add("isEnabled", false);
        this.add("host", "localhost");
        this.add("port", 3306);
        this.add("database", "myDatabase");
        this.add("user", "myUser");
        this.add("password", "myPassword");
        addOtherDefault();
    }

    /**
     * Method to add other Values to the Config
     */
    public abstract void addOtherDefault();

    /**
     * Getter for isEnabled
     * @return isEnabled
     */
    public boolean isEnabled() {
        return this.getFromConfig("isEnabled");
    }

    /**
     * Setter for isEnabled
     * @param enabled isEnabled
     */
    public void isEnabled(boolean enabled) {
        this.set("isEnabled", enabled);
    }

    /**
     * Getter for the Host
     * @return the Host
     */
    public String getHost() {
        return this.getFromConfig("host");
    }

    /**
     * Setter for the Host
     * @param host the Host
     */
    public void setHost(String host) {
        this.set("host", host);
    }

    /**
     * Getter for the Database
     * @return the DataBase
     */
    public String getDatabase() {
        return this.getFromConfig("database");
    }

    /**
     * Setter for the DataBase
     * @param database the DataBase
     */
    public void setDatabase(String database) {
        this.set("database", database);
    }

    /**
     * Getter for the User
     * @return the User
     */
    public String getUser() {
        return this.getFromConfig("user");
    }

    /**
     * Setter for the User
     * @param user the User
     */
    public void setUser(String user) {
        this.set("user", user);
    }

    /**
     * Getter for the Password
     * @return the Password
     */
    public String getPassword() {
        return this.getFromConfig("password");
    }

    /**
     * Setter for the Password
     * @param password the Password
     */
    public void setPassword(String password) {
        this.set("password", password);
    }

    /**
     * Getter for the Port
     * @return the Port
     */
    public int getPort() {
        return this.getFromConfig("port");
    }

    /**
     * Setter for the Port
     * @param port the Port
     */
    public void setPort(int port) {
        this.set("port", port);
    }
}

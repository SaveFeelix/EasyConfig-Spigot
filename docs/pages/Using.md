# Using

<hr />

1. [Basics](#basics)
2. [Templates](#templates)
3. [Initialize](#initialize)

<hr />
<hr />

### Basics

With this API you can create/manage Configs

<details>
<summary>Code Example</summary>

```java
import de.feelix.easyconfig.PluginConfig;
import de.feelix.easycore.EasyPlugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class MyConfig extends PluginConfig {

    /**
     * In this case you create a Config on this Position:
     * %ServerFolder%/plugins/%PluginName%/fileName
     */
    public MyConfig(@NotNull JavaPlugin plugin, @NotNull String fileName) {
        super(plugin, fileName);
    }

    /**
     * In this case you create a Config on this Position:
     * %ServerFolder%/plugins/%PluginName%/%folderName%/fileName
     */
    public MyConfig(@NotNull JavaPlugin plugin, @NotNull String folderName, @NotNull String fileName) {
        super(plugin, folderName, fileName);
    }

    @Override
    public void addDefault() {
        // Add Values to the config if the key not exists
        this.add("test1", "testString");
        this.add("test2", 2);
    }

    public String getTestString() {
        return this.getFromConfig("test1");
    }

    public Integer getTestString() {
        return this.getFromConfig("test2");
    }
}
```

</details>
<hr />
<hr />

### Templates

Also, you can use Templates. You can create your own, or you can use my Templates

<details>
<summary>Code Example</summary>

```java
import de.feelix.easyconfig.templates.database.DataBaseTemplate;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class MyTemplateClass extends DataBaseTemplate {

    /**
     * In this case he creates a database.yml File in the PluginFolder
     */
    public MyTemplateClass(@NotNull JavaPlugin plugin) {
        super(plugin);
    }

    /**
     * In this case he creates a database.yml File in the PluginFolder/%folderName%
     */
    public MyTemplateClass(@NotNull JavaPlugin plugin, @NotNull String folderName) {
        super(plugin, folderName);
    }

    @Override
    public void addOtherDefault() {

    }
}
```

</details>
<hr />
<hr />

### Initialize

You can initialize in your MainClass
<details>
<summary>Code Example</summary>

```java

import de.feelix.easyconfig.templates.database.DataBaseTemplate;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class MyPlugin extends JavaPlugin {

    private static MyConfig myConfig;
    private static MyTemplateConfig myTemplateConfig;

    @Override
    public void onLoad() {
        // This will create the NormalConfig and the TemplateConfig
        myConfig = new MyConfig(this);
        myTemplateConfig = new MyTemplateConfig(this);
    }

    @Override
    public void onEnable() {
    }

    @Override
    public void onDisable() {
    }
}

public class MyConfig extends PluginConfig {
    public MyConfig(@NotNull JavaPlugin plugin) {
        super(plugin, "test.yml");
    }

    @Override
    public void addDefault() {
    }
}

public class MyTemplateConfig extends DataBaseTemplate {
    public MyTemplateConfig(@NotNull JavaPlugin plugin) {
        super(plugin);
    }

    @Override
    public void addOtherDefault() {
    }
}
```

</details>
<hr />
<hr />
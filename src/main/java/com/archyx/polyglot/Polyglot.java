package com.archyx.polyglot;

import com.archyx.polyglot.config.PolyglotConfig;
import com.archyx.polyglot.lang.MessageManager;
import org.bukkit.plugin.Plugin;

public class Polyglot {

    private final Plugin plugin;
    private final PolyglotConfig config;
    private final MessageManager messageManager;

    public Polyglot(Plugin plugin, PolyglotConfig config) {
        this.plugin = plugin;
        this.config = config;
        this.messageManager = new MessageManager(this);
    }

    public Plugin getPlugin() {
        return plugin;
    }

    public PolyglotConfig getConfig() {
        return config;
    }

    public MessageManager getMessageManager() {
        return messageManager;
    }
}

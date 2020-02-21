package org.bing.plugin;

import org.dom4j.DocumentException;

import java.net.MalformedURLException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws DocumentException, MalformedURLException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        List<Plugin> pluginList = XMLParser.getPluginList();
        PluginManager pluginManager = new PluginManager(pluginList);
        for (Plugin plugin : pluginList) {
            PluginService instance = pluginManager.getInstance(plugin.getClazz());
            System.out.println("插件【"+plugin.getName()+"】开始运行。");
            instance.service();
            System.out.println("插件【"+plugin.getName()+"】运行结束。");

        }
    }
}

package org.bing.plugin;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.List;

public class PluginManager {

    private URLClassLoader urlClassLoader;

    public PluginManager(List<Plugin> plugins) throws MalformedURLException {
        init(plugins);
    }

    private void init(List<Plugin> plugins) throws MalformedURLException {
        URL[] urls = new URL[plugins.size()];
        for (int i = 0; i < plugins.size(); i++) {
            urls[i] = new URL("file:" + plugins.get(i).getJar());
        }
        this.urlClassLoader = new URLClassLoader(urls);
    }

    public PluginService getInstance(String clazz) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> loadClass = this.urlClassLoader.loadClass(clazz);
        return (PluginService)loadClass.newInstance();
    }
}

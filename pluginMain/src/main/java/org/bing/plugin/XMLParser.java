package org.bing.plugin;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLParser {
    public static List<Plugin> getPluginList() throws DocumentException {
        List<Plugin> list = new ArrayList<Plugin>();
        SAXReader saxReader = new SAXReader();
        Document read = saxReader.read(new File("plugin.xml"));
        Element root = read.getRootElement();
        List<Element> elements = root.elements("plugin");
        for (Element element : elements) {
            Plugin plugin = new Plugin();
            plugin.setName(element.elementText("name"));
            plugin.setJar(element.elementText("jar"));
            plugin.setClazz(element.elementText("class"));
            list.add(plugin);
        }
        return list;
    }
}

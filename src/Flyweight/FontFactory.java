package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> cache= new HashMap<>();

    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            System.out.println("Get Font from cache");
            return cache.get(font);
        } else{
            String[] split = font.split(":");
            String family = split[0];
            int size = Integer.parseInt(split[1]);
            Font newFont = new Font(family, size);
            cache.put(font,newFont);
            System.out.println("New Font Add in cache! ");
            System.out.println("cache = " + cache);
            return newFont;
        }
    }
}

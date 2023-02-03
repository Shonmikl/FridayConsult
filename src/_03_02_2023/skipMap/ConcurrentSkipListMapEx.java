package _03_02_2023.skipMap;

import org.openqa.selenium.devtools.v85.dom.model.ShapeOutsideInfo;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListMap;

public class ConcurrentSkipListMapEx {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, String> map =
                new ConcurrentSkipListMap<>();

        map.put("1", "Q");
        map.put("2", "WW");
        map.put("3", "E");
        map.put("4", "R");
        map.put("5", "TT");
        map.put("6", "YYY");

        System.out.println("Initial map: " + map);

        System.out.println("Ceiling Entry-2: " + map.ceilingEntry("2"));

        System.out.println("map.descendingKeySet(): " + map.descendingKeySet());

        System.out.println("map.firstEntry(): " + map.firstEntry());
    }
}
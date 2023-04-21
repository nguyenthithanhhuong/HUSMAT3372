package oop.lab08.ex3;

import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }
    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.get(key) == value;
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return  map.keySet();
    }

    public static Integer values(Map<Integer, Integer> map) {
        Set<Integer> keys = keySet(map);
        for (Integer key : keys) {
            return map.get(key);
        }
        return null;
    }

    public static String getColor(int value) {
        switch (value) {
            case 0:
                return "black";
            case 1:
                return "white";
            case 2:
                return "red";
        }
        return null;
    }
}

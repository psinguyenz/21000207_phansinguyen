package oop.collections.exercises;

import java.util.*;

public class Maps {

    public static int count(Map<Integer, Integer> map){
        return map.size();
    }

    public static void empty(Map<Integer,Integer> map){
        map.clear();
    }

    public static boolean contain(Map<Integer,Integer> map, int key){
        if (map.containsKey(key)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean containsKeyValue(Map<Integer,Integer> map, int key, int value){
        Set<Integer> set = map.keySet();
        for (Integer index : set){
            if (index == key && map.get(index) == value){
                return true;
            }
        }
        return false;
    }

    public static Set<Integer> keySet(Map<Integer,Integer> map){
        Set<Integer> set = map.keySet();
        return set;
    }

    public static Collection<Integer> values(Map<Integer,Integer> map){
        Set<Integer> set = map.keySet();
        Collection<Integer> newSet = new HashSet<Integer>();
        for (Integer key : set){
            newSet.add(map.get(key));
        }
        return newSet;
    }

    public static String getColor(int value){
        Map<Integer, String> map = new HashMap<Integer, String>();
        if (map.containsKey(0)) {
            return ("black");
        }
        else if (map.containsKey(1)) {
            return ("white");
        }
        else if (map.containsKey(2)) {
            return ("red");
        }
        return null;
    }
}

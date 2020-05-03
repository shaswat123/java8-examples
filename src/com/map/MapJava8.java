package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapJava8 {

    public static void main(String[] args) {

        Map<String,Integer> strLength = new HashMap<>();
        strLength.put("John",10);

        System.out.println(strLength.computeIfAbsent("John",s->s.length()));
        System.out.println(strLength.computeIfAbsent("Shaswat",s->s.length()));
        System.out.println(strLength.get("Shaswat"));
        System.out.println("No of elements in the map"+strLength.size());

        System.out.println(strLength.computeIfAbsent("Daniel ",s->null));
        System.out.println(strLength.get("Daniel"));
        System.out.println("No of elements in the map"+strLength.size());

       // strLength.computeIfAbsent("Marcas", s -> { throw new RuntimeException(); });

        //case-insensative keys
        //We should keep in mind that functions like put and get cost an average time of O(log n)
        // for the TreeMap compared to a HashMap that provides O(1) insertion and lookup.
        Map<String, Integer> treeMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        treeMap.put("abc", 1);
        treeMap.put("ABC", 2);
        System.out.println("Size of the tree map "+treeMap.size());
        System.out.println(treeMap.get("ABC"));
        System.out.println(treeMap.get("aBc"));

        Map<String, Integer> treeMapcse = new TreeMap<>();
        treeMapcse.put("abc", 1);
        treeMapcse.put("ABC", 2);
        System.out.println("Size of the case sensitive tree map "+treeMapcse.size());



    }

}

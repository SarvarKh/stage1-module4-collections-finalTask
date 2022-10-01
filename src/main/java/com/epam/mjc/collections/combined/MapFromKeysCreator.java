package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public static void main(String[] args) {
        MapFromKeysCreator mfkc = new MapFromKeysCreator();
        mfkc.createMap(
                Map.of("Monday", 1,
                        "Tuesday", 2,
                        "Wednesday", 3,
                        "Thursday", 4,
                        "Friday", 5)
        );
    }
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> result = new HashMap<>();
        for (Map.Entry<String, Integer> m : sourceMap.entrySet()) {
            Set<String> values = new HashSet<>();
            if (result.containsKey(m.getKey().length())) {
                values = result.get(m.getKey().length());
                values.add(m.getKey());
                result.put(
                        m.getKey().length(),
                        values
                );
            } else {
                values.add(m.getKey());
                result.put(
                        m.getKey().length(),
                        values
                );
            }
        }

        return result;
    }
}

//    Map<Integer, Set<String>> result = new HashMap<>();
//    Set<String> values = new HashSet<>();
//        for (Map.Entry<String, Integer> set : sourceMap.entrySet()) {
//        for (Map.Entry<String, Integer> inner : sourceMap.entrySet()) {
//        System.out.println("Outer: " + set.getKey().length() + "; Inner: " + inner.getKey().length() + " <= " + set.getKey() + " & " + inner.getKey());
//        System.out.println();
////                if (set.getKey().length() == inner.getKey().length()) {
////                    values.add(inner.getKey());
////                }
//        }
//        result.put(set.getKey().length(), values);
//        }
//
//        System.out.println(result);
//        return result;
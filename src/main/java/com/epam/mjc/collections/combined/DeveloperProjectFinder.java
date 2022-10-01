package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public static void main(String[] args) {
        DeveloperProjectFinder dpf = new DeveloperProjectFinder();
        dpf.findDeveloperProject(
                Map.of("AXE", Set.of("Helen", "Bob", "Marian", "Tom"),
                        "MazPay", Set.of("James", "John", "Robert"),
                        "SeaV", Set.of("John", "Robert", "Angelina", "David"),
                        "DelFo", Set.of("Patricia", "Jessica", "Mark", "Paul"),
                        "ReaNon", Set.of("George", "Kyle", "Robert", "Brandon", "Austin")),
                "Robert"
        );
    }
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> result = new ArrayList<>();

//        1-step find projects where dev is participating
        for (Map.Entry<String, Set<String>> m : projects.entrySet()) {
            if (m.getValue().contains(developer)) {
                result.add(m.getKey());
            }
        }

//        2-step sort found projects lists as per requirements
//        [MazPay, ReaNon, SeaV]
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o2.compareTo(o1);
                } else {
                    return o2.length() - o1.length();
                }
            }
        });

        return result;
    }
}

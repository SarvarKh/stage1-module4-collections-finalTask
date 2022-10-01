package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public static void main(String[] args) {
        LessonsGetter lg = new LessonsGetter();
        lg.getLessons(
                Map.of(
                        "Monday", List.of("English", "Mathematics", "Chemistry"),
                        "Tuesday", List.of("Biology", "Informatics"),
                        "Wednesday", List.of("Geography", "Astronomy", "English"),
                        "Thursday", List.of("Mathematics", "Literature"),
                        "Friday", List.of("Physics", "Technology", "English")
                )
        );
    }
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> result = new HashSet<>();
        for (Map.Entry<String, List<String>> set : timetable.entrySet()) {
            for (String val : set.getValue()) {
                result.add(val);
            }
        }

        return result;
    }
}

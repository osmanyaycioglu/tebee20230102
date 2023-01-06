package com.training.java.newfeatures.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;


public class OldWays {

    public static void main(final String[] args) {
        List<String> stringListLoc = new ArrayList<>();
        stringListLoc.add("osman");
        stringListLoc.add("mehmet");
        stringListLoc.add("ali");
        stringListLoc.add("ali");
        stringListLoc.add("veli");
        stringListLoc.add("osman");
        stringListLoc.add("mehmet");
        stringListLoc.add("fatma");
        stringListLoc.add("ayşe");
        stringListLoc.add("veli");

        Set<String> stringSet = new TreeSet<>(stringListLoc);
        List<String> listLoc = new ArrayList<>();
        for (String stringLoc : stringSet) {
            if (stringLoc.length() > 4) {
                listLoc.add(stringLoc);
            }
        }
        System.out.println(listLoc);

        List<String> collectLoc = stringListLoc.stream()
                                               .distinct()
                                               .filter(s -> s.length() > 4)
                                               .collect(Collectors.toList());
    }
}


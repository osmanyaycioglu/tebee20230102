package com.training.java.newfeatures.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamRun1 {

    public static void main(final String[] args) {
        Stream.of("osman",
                  "osman",
                  "ali",
                  "veli",
                  "mehmet",
                  "ayşe",
                  "fatma");

        List<String> nameListLoc = Arrays.asList("osman",
                                                 "osman",
                                                 "ali",
                                                 "veli",
                                                 "mehmet",
                                                 "ayşe",
                                                 "fatma");
        nameListLoc.stream()
                   .filter(s -> s.contains("a"))
                   .filter(s -> s.length() > 3)
                   .distinct()
                   .forEach(p -> System.out.println(p));

        List<String> collectLoc = nameListLoc.stream()
                                             .filter(s -> s.contains("a"))
                                             .filter(s -> s.length() > 3)
                                             .distinct()
                                             .collect(Collectors.toList());

        Set<String> collect2Loc = nameListLoc.stream()
                                             .filter(s -> s.contains("a"))
                                             .filter(s -> s.length() > 3)
                                             .distinct()
                                             .collect(Collectors.toSet());
        boolean allMatchLoc = nameListLoc.stream()
                                         .filter(s -> s.contains("a"))
                                         .filter(s -> s.length() > 3)
                                         .distinct()
                                         .allMatch(s -> s.contains("n"));
        boolean anyMatchLoc = nameListLoc.stream()
                                         .filter(s -> s.contains("a"))
                                         .filter(s -> s.length() > 3)
                                         .distinct()
                                         .anyMatch(s -> s.contains("n"));
        String findAnyLoc = nameListLoc.stream()
                                       .filter(s -> s.contains("a"))
                                       .filter(s -> s.length() > 3)
                                       .distinct()
                                       .findAny()
                                       .orElse("default");
        System.out.println("------------------");
        nameListLoc.stream()
                   .skip(3)
                   .limit(3)
                   .filter(s -> s.contains("a"))
                   .filter(s -> s.length() > 3)
                   .distinct()
                   .forEach(System.out::println);
        ArrayList<String> reduceLoc = nameListLoc.stream()
                                                 .filter(s -> s.contains("a"))
                                                 .filter(s -> s.length() > 3)
                                                 .distinct()
                                                 .reduce(new ArrayList<String>(),
                                                         (al,
                                                          s) -> {
                                                             al.add(s);
                                                             return al;
                                                         },
                                                         (al1,
                                                          al2) -> {
                                                             al1.addAll(al2);
                                                             return al1;
                                                         });

        String reduce2Loc = nameListLoc.stream()
                                       .filter(s -> s.contains("a"))
                                       .filter(s -> s.length() > 3)
                                       .distinct()
                                       .reduce("",
                                               (es,
                                                s) -> es + " " + s,
                                               (es1,
                                                es2) -> es1 + " " + es2);

        StringBuilder reduce3Loc = nameListLoc.stream()
                                              .filter(s -> s.contains("a"))
                                              .filter(s -> s.length() > 3)
                                              .distinct()
                                              .reduce(new StringBuilder(),
                                                      (sb,
                                                       s) -> sb.append(s),
                                                      (sb1,
                                                       sb2) -> sb1.append(sb2));
        Integer reduce4Loc = nameListLoc.stream()
                                        .filter(s -> s.contains("a"))
                                        .filter(s -> s.length() > 3)
                                        .distinct()
                                        .reduce(0,
                                                (i,
                                                 s) -> i + s.length(),
                                                (i1,
                                                 i2) -> i1 + i2);


    }
}

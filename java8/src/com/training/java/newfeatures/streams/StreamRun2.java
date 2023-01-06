package com.training.java.newfeatures.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.training.java.oo.CarImBuilder;

public class StreamRun2 {

    public static void main(final String[] args) {
        List<String> nameListLoc = Arrays.asList("osman",
                                                 "osman",
                                                 "ali",
                                                 "veli",
                                                 "mehmet",
                                                 "ayşe",
                                                 "fatma");
        Stream<String> stringStreamLoc = nameListLoc.stream();
        Stream<Integer> integerStreamLoc = stringStreamLoc.map(s -> s.length());
        List<CarImBuilder> collectLoc = nameListLoc.stream()
                                                   .distinct()
                                                   .filter(s -> s.length() > 3)
                                                   .map(s -> s.length())
                                                   .filter(i -> i > 3)
                                                   .map(i -> CarImBuilder.getBuilder()
                                                                         .setName("BMW")
                                                                         .setHoursePower(i * 20)
                                                                         .build())
                                                   .filter(ci -> ci.getHoursePower() > 100)
                                                   .collect(Collectors.toList());

        IntSummaryStatistics summaryStatisticsLoc = nameListLoc.stream()
                                                               .distinct()
                                                               .filter(s -> s.length() > 3)
                                                               .mapToInt(s -> s.length())
                                                               .summaryStatistics();
        System.out.println(summaryStatisticsLoc);

        IntSummaryStatistics collect2Loc = nameListLoc.stream()
                                                      .distinct()
                                                      .filter(s -> s.length() > 3)
                                                      .map(s -> s.length())
                                                      .collect(Collectors.summarizingInt(i -> i));

        List<String> myStringList = new ArrayList<>();
        nameListLoc.stream()
                   .filter(s -> s.contains("a"))
                   .filter(s -> s.length() > 3)
                   .distinct()
                   .peek(s -> myStringList.add(s))
                   .forEach(p -> System.out.println(p));
        IntSummaryStatistics collect3Loc = myStringList.stream()
                                                       .map(s -> s.length())
                                                       .collect(Collectors.summarizingInt(i -> i));

    }
}

package com.training.java.newfeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRun3 {

    public static void main(final String[] args) {
        List<String> nameListLoc = Arrays.asList("osman",
                                                 "osman",
                                                 "ali",
                                                 "veli",
                                                 "mehmet",
                                                 "ayşe",
                                                 "fatma");
        List<String> collectLoc = nameListLoc.stream()
                                             .peek(s -> System.out.println("first s : "
                                                                           + s
                                                                           + " t : "
                                                                           + Thread.currentThread()
                                                                                   .getName()))
                                             .filter(s -> s.contains("a"))
                                             .peek(s -> System.out.println("before filter s : "
                                                                           + s
                                                                           + " t : "
                                                                           + Thread.currentThread()
                                                                                   .getName()))
                                             .filter(s -> s.length() > 3)
                                             .peek(s -> System.out.println("before distinct s : "
                                                                           + s
                                                                           + " t : "
                                                                           + Thread.currentThread()
                                                                                   .getName()))
                                             .distinct()
                                             .peek(s -> System.out.println("end s : "
                                                                           + s
                                                                           + " t : "
                                                                           + Thread.currentThread()
                                                                                   .getName()))
                                             .collect(Collectors.toList());

        System.out.println("------------");
        System.out.println(collectLoc);

    }

}

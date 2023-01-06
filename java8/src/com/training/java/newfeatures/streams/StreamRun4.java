package com.training.java.newfeatures.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamRun4 {

    public static void main(final String[] args) {
        List<String> nameListLoc = Arrays.asList("osman",
                                                 "osman",
                                                 "ali",
                                                 "veli",
                                                 "mehmet",
                                                 "ayşe",
                                                 "fatma");
        List<String> collectLoc = nameListLoc.stream()
                                             .filter(s -> s.contains("a"))
                                             .filter(s -> s.length() > 3)
                                             .distinct()
                                             .collect(Collectors.toList());

        System.out.println("------------");
        System.out.println(collectLoc);

        nameListLoc.stream()
                   .filter(s -> s.contains("a"))
                   .filter(s -> s.length() > 3)
                   .distinct()
                   .flatMap(s -> {
                       char[] charArrayLoc = s.toCharArray();
                       Character[] coArray = new Character[charArrayLoc.length];
                       for (int iLoc = 0; iLoc < charArrayLoc.length; iLoc++) {
                           coArray[iLoc] = charArrayLoc[iLoc];
                       }
                       return Arrays.stream(coArray);
                   })
                   .distinct()
                   .sorted()
                   .forEach(System.out::println);

    }

}

package com.training.java.newfeatures.lab1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.stream.Collectors;

public class LabRun {

    public static void main(final String[] args) throws Exception {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Map<String, Person> mapLoc = Files.readAllLines(Paths.get("person.txt"))
                                          .stream()
                                          .map(s -> s.split(","))
                                          .map(sa -> new Person().setName(sa[0])
                                                                 .setSurname(sa[1])
                                                                 .setBirthdate(LocalDate.from(dtf.parse(sa[2])))
                                                                 .setUsername(sa[3])
                                                                 .setPassword(sa[4]))
                                          .filter(p -> p.getName()
                                                        .length() > 3)
                                          .filter(p -> p.getBirthdate()
                                                        .isAfter(LocalDate.of(2000,
                                                                              1,
                                                                              1)))
                                          .collect(Collectors.toMap(p -> p.getUsername(),
                                                                    p -> p));
        System.out.println(mapLoc);
    }
}

package com.training.java.newfeatures.dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateRun {

    public static void main(final String[] args) {
        Date dateLoc = new Date();
        GregorianCalendar calendarLoc = new GregorianCalendar();
        SimpleDateFormat dateFormatLoc = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        LocalDate nowDate = LocalDate.now();
        LocalDate plusDaysLoc = nowDate.plusDays(3);
        System.out.println("now : " + nowDate + " 3 plus : " + plusDaysLoc);

        LocalDateTime dateTimeLoc = LocalDateTime.now();
        LocalDateTime ofLoc = LocalDateTime.of(2021,
                                               3,
                                               5,
                                               10,
                                               30,
                                               20);
        DateTimeFormatter ofPatternLoc = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(ofPatternLoc.format(ofLoc));
        LocalDateTime parseLoc = LocalDateTime.from(ofPatternLoc.parse("2020-08-12 23:30:24"));
        System.out.println(parseLoc);

        ZonedDateTime nowLoc = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        nowLoc.toEpochSecond();
        nowLoc.toInstant()
              .toEpochMilli();

        long currentTimeMillisLoc = System.currentTimeMillis();
    }
}

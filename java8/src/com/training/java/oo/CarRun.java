package com.training.java.oo;

import java.security.SecureRandom;
import java.util.Random;
import java.util.UUID;

public class CarRun {

    public static void main(final String[] args) {
        Car car = new Car("BMW");
        car.setHoursePower(150);
        car.setRange(800);
        System.out.println("xyz");
        car.setCapacity(1000);

        Random randomLoc = new Random();
        SecureRandom random2Loc = new SecureRandom(UUID.randomUUID()
                                                       .toString()
                                                       .getBytes());

        CarIm carImLoc = new CarIm("BMW",
                                   120,
                                   1000,
                                   1100,
                                   0);

        CarImBuilder car2 = CarImBuilder.getBuilder()
                                        .setName("BMW")
                                        .setCapacity(1100)
                                        .setHoursePower(150)
                                        .setRange(800)
                                        .setCounter(1)
                                        .build();

        CarMutable car3 = CarMutable.createCar("BWM")
                                    .setCapacity(1000)
                                    .setHoursePower(150)
                                    .setRange(800);
    }

}

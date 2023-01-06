package com.training.java.oo;

public class CarMutable {

    private final String name;
    private Integer      hoursePower;
    private Integer      range;
    private Integer      capacity;
    private Integer      counter;


    public CarMutable(final String nameParam) {
        this.name = nameParam;
    }

    public static CarMutable createCar(final String name) {
        return new CarMutable(name);
    }

    public double forward(final int km) {
        return km / 100;
    }


    public String getName() {
        return this.name;
    }


    public Integer getHoursePower() {
        return this.hoursePower;
    }


    public CarMutable setHoursePower(final Integer hoursePowerParam) {
        this.hoursePower = hoursePowerParam;
        return this;
    }


    public Integer getRange() {
        return this.range;
    }


    public CarMutable setRange(final Integer rangeParam) {
        if (rangeParam > 5000) {
            throw new IllegalArgumentException("range max 5000 olabilir");
        }
        this.range = rangeParam;
        return this;
    }


    public Integer getCapacity() {
        return this.capacity;
    }


    public CarMutable setCapacity(final Integer capacityParam) {
        this.capacity = capacityParam;
        return this;
    }


}

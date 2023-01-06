package com.training.java.oo;

public class Car {

    private final String name;
    private Integer      hoursePower;
    private Integer      range;
    private Integer      capacity;
    private Integer      counter;


    public Car(final String nameParam) {
        this.name = nameParam;
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


    public void setHoursePower(final Integer hoursePowerParam) {
        this.hoursePower = hoursePowerParam;
    }


    public Integer getRange() {
        return this.range;
    }


    public void setRange(final Integer rangeParam) {
        if (rangeParam > 5000) {
            throw new IllegalArgumentException("range max 5000 olabilir");
        }
        this.range = rangeParam;
    }


    public Integer getCapacity() {
        return this.capacity;
    }


    public void setCapacity(final Integer capacityParam) {
        this.capacity = capacityParam;
    }


}

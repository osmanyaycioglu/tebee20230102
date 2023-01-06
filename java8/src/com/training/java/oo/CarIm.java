package com.training.java.oo;

public class CarIm {

    private final String  name;
    private final Integer hoursePower;
    private final Integer range;
    private final Integer capacity;
    private final Integer counter;

    public CarIm(final String nameParam,
                 final Integer hoursePowerParam,
                 final Integer rangeParam,
                 final Integer capacityParam,
                 final Integer counterParam) {
        super();
        this.name = nameParam;
        this.hoursePower = hoursePowerParam;
        this.range = rangeParam;
        this.capacity = capacityParam;
        this.counter = counterParam;
    }


    public String getName() {
        return this.name;
    }


    public Integer getHoursePower() {
        return this.hoursePower;
    }


    public Integer getRange() {
        return this.range;
    }


    public Integer getCapacity() {
        return this.capacity;
    }


    public Integer getCounter() {
        return this.counter;
    }


}

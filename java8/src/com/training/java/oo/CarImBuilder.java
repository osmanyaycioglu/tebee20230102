package com.training.java.oo;

public class CarImBuilder {

    private final String  name;
    private final Integer hoursePower;
    private final Integer range;
    private final Integer capacity;
    private final Integer counter;

    private CarImBuilder(final String nameParam,
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

    public static CarBuilder getBuilder() {
        return new CarBuilder();
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

    public static class CarBuilder {

        private String  name;
        private Integer hoursePower;
        private Integer range;
        private Integer capacity;
        private Integer counter;


        private CarBuilder() {
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


        public CarBuilder setName(final String nameParam) {
            this.name = nameParam;
            return this;
        }


        public CarBuilder setHoursePower(final Integer hoursePowerParam) {
            this.hoursePower = hoursePowerParam;
            return this;
        }


        public CarBuilder setRange(final Integer rangeParam) {
            this.range = rangeParam;
            return this;
        }


        public CarBuilder setCapacity(final Integer capacityParam) {
            this.capacity = capacityParam;
            return this;
        }


        public CarBuilder setCounter(final Integer counterParam) {
            this.counter = counterParam;
            return this;
        }


        public CarImBuilder build() {
            return new CarImBuilder(this.name,
                                    this.hoursePower,
                                    this.range,
                                    this.capacity,
                                    this.counter);
        }
    }
}

package com.training.javaee.rest.models;

public class PhoneRest {

    private String name;
    private String number;

    public String getName() {
        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public void setNumber(final String numberParam) {
        this.number = numberParam;
    }

    @Override
    public String toString() {
        return "PhoneRest [name=" + this.name + ", number=" + this.number + "]";
    }

}

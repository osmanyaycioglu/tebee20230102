package com.training.javaee.rest.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class AddressRest {

    @NotEmpty
    @NotNull
    private String city;
    @NotEmpty
    @NotNull
    private String street;

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public void setCity(final String cityParam) {
        this.city = cityParam;
    }

    public void setStreet(final String streetParam) {
        this.street = streetParam;
    }

    @Override
    public String toString() {
        return "AddressRest [city=" + this.city + ", street=" + this.street + "]";
    }

}

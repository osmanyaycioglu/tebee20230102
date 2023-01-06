package com.training.javaee.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProjectLocation {

    @Id
    @GeneratedValue
    private Long   plId;
    private String country;
    private String city;

    public String getCountry() {
        return this.country;
    }

    public String getCity() {
        return this.city;
    }

    public void setCountry(final String countryParam) {
        this.country = countryParam;
    }

    public void setCity(final String cityParam) {
        this.city = cityParam;
    }

    public Long getPlId() {
        return this.plId;
    }

    public void setPlId(final Long plIdParam) {
        this.plId = plIdParam;
    }

}

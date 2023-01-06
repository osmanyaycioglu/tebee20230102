package com.training.javaee.jpa.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProjectAddress {

    @Id
    @GeneratedValue
    private Long   paId;
    private String city;
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

    public Long getPaId() {
        return paId;
    }

    public void setPaId(Long paIdParam) {
        paId = paIdParam;
    }

}

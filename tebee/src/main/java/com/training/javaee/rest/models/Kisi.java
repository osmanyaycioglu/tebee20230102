package com.training.javaee.rest.models;

import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class Kisi {

    @QueryParam("n")
    private String  name;
    @QueryParam("s")
    private String  surname;
    @PathParam("h")
    private Integer height;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public void setSurname(final String surnameParam) {
        this.surname = surnameParam;
    }

    public void setHeight(final Integer heightParam) {
        this.height = heightParam;
    }

}

package com.training.javaee.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.javaee.rest.models.PersonRest;

@Path("/api/v1/person/provision")
@Produces(MediaType.APPLICATION_JSON)
public class PersonQueryRestController {

    @GET
    @Path("/get/one")
    public PersonRest getPerson(@QueryParam("pid") final long personId) {
        return null;
    }

    @GET
    @Path("/get/all")
    public List<PersonRest> getAllPersons() {
        return null;
    }

    @GET
    @Path("/get/by/surname")
    public List<PersonRest> getPersonsBySurname(@QueryParam("sn") final String surname) {
        return null;
    }

}

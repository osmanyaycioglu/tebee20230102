package com.training.javaee.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.javaee.rest.models.PersonRest;

@Path("/api/v1/person/provision")
@Produces(MediaType.TEXT_PLAIN)
public class PersonProvisionRestController2 {

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public String add(final PersonRest personRestParam) {
        return "OK";
    }

    @DELETE
    public String deactivate(@QueryParam("pid") final Long personId) {
        return "OK";
    }

    @POST
    public String activate(@QueryParam("pid") final Long personId) {
        return "OK";

    }

}

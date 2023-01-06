package com.training.javaee.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.javaee.rest.models.PersonRest;

// @RequestScoped
// @SessionScoped
@ApplicationScoped
@Path("/api/v1/person/provision")
@Produces(MediaType.TEXT_PLAIN)
public class PersonProvisionRestController {

    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public String add(@Valid final PersonRest personRestParam) {
        if (personRestParam.getName() == null) {
            throw new IllegalArgumentException("name null olamaz");
        }
        return "OK";
    }

    @GET
    @Path("/deactivate")
    public String deactivate(@QueryParam("pid") final Long personId) {
        return "OK";
    }

    @GET
    @Path("/activate")
    public String activate(@QueryParam("pid") final Long personId) {
        return "OK";

    }

}

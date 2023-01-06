package com.training.javaee.jpa.rest;

import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.javaee.jpa.models.Project;
import com.training.javaee.jpa.models.services.ProjectManagementService;

@Path("/api/v1/project/management")
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.APPLICATION_JSON)
public class ProjectRestController {

    @EJB
    private ProjectManagementService projectManagementService;

    @Path("/add")
    @POST
    public String add(final Project projectParam) {
        this.projectManagementService.addProject(projectParam);
        return "OK";
    }

    @Path("/delete")
    @POST
    public String delete(@QueryParam("pid") final Long projectID) {
        this.projectManagementService.delete(projectID);
        return "OK";
    }

}

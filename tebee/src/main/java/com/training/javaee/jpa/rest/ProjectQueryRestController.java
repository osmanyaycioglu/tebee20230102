package com.training.javaee.jpa.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.training.javaee.jpa.models.Project;
import com.training.javaee.jpa.models.services.ProjectQueryService;

@Path("/api/v1/project/query")
@Produces(MediaType.APPLICATION_JSON)
public class ProjectQueryRestController {

    @EJB
    private ProjectQueryService projectQueryService;

    @Path("/find/one")
    @GET
    public Project findOne(@QueryParam("pid") final Long projectId) {
        return this.projectQueryService.findProject(projectId);
    }

    @Path("/find/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Project> findAll() {
        return this.projectQueryService.findAllProjects();
    }

    @Path("/find/by/owner")
    @GET
    public List<Project> findByOwner(@QueryParam("owner") final String owner) {
        return this.projectQueryService.findByOwner(owner);
    }

}

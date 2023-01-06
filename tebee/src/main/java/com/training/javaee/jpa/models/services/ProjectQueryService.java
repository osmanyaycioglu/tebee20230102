package com.training.javaee.jpa.models.services;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.training.javaee.jpa.data.ProjectDao;
import com.training.javaee.jpa.models.Project;

@LocalBean
@Singleton
public class ProjectQueryService {

    @EJB
    private ProjectDao projectDao;

    public Project findProject(final Long projectIdParam) {
        return this.projectDao.findOne(projectIdParam);
    }

    public List<Project> findAllProjects() {
        return this.projectDao.findAll();
    }

    public List<Project> findByOwner(final String ownerParam) {
        return this.projectDao.findByOwner(ownerParam);
    }

}

package com.training.javaee.jpa.models.services;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

import com.training.javaee.jpa.data.ProjectDao;
import com.training.javaee.jpa.models.Project;

@LocalBean
@Singleton
public class ProjectManagementService {

    @EJB
    private ProjectDao projectDao;

    public void addProject(final Project projectParam) {
        this.projectDao.insertProject(projectParam);
    }

    public void delete(final Long projectIDParam) {
        this.projectDao.deleteProject(projectIDParam);
    }

}

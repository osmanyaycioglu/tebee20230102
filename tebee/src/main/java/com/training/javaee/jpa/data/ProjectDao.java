package com.training.javaee.jpa.data;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.training.javaee.jpa.models.Project;

@LocalBean
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ProjectDao {

    @PersistenceContext(unitName = "tebee")
    private EntityManager entityManager;

    @Transactional(TxType.REQUIRED)
    public void insertProject(final Project projectParam) {
        this.entityManager.persist(projectParam);
    }

    public void deleteProject(final Project projectParam) {
        this.entityManager.remove(projectParam);
    }

    public void updateProject(final Project projectParam) {
        boolean managedLoc = this.entityManager.contains(projectParam);
        if (!managedLoc) {
            this.entityManager.merge(projectParam);
        }
    }

    @Transactional(value = TxType.SUPPORTS)
    public Project findOne(final Long projectId) {
        return this.entityManager.find(Project.class,
                                       projectId);
    }

    public List<Project> findByOwner(final String ownStringParam) {
        TypedQuery<Project> createQueryLoc = this.entityManager.createQuery("select p from Project p where p.owner=?1",
                                                                            Project.class);
        createQueryLoc.setParameter(1,
                                    ownStringParam);
        return createQueryLoc.getResultList();
    }

    public List<Project> findByOwner2(final String ownStringParam) {
        TypedQuery<Project> createQueryLoc = this.entityManager.createQuery("select p from Project p where p.owner=:own",
                                                                            Project.class);
        createQueryLoc.setParameter("own",
                                    ownStringParam);
        return createQueryLoc.getResultList();
    }

    public void deleteProject(final Long projectIDParam) {
        Project findOneLoc = this.findOne(projectIDParam);
        if (findOneLoc != null) {
            this.deleteProject(findOneLoc);
        }
    }

    public List<Project> findAll() {
        TypedQuery<Project> createQueryLoc = this.entityManager.createQuery("select p from Project p",
                                                                            Project.class);
        return createQueryLoc.getResultList();
    }

}

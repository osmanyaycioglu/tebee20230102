package com.training.javaee.jpa.models;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long                 projectId;
    private String               name;
    private LocalDate            enDate;
    private Integer              days;
    private String               owner;
    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private ProjectAddress       projectAddress;
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<ProjectLocation> locations;

    public String getName() {
        return this.name;
    }

    public LocalDate getEnDate() {
        return this.enDate;
    }

    public Integer getDays() {
        return this.days;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setName(final String nameParam) {
        this.name = nameParam;
    }

    public void setEnDate(final LocalDate enDateParam) {
        this.enDate = enDateParam;
    }

    public void setDays(final Integer daysParam) {
        this.days = daysParam;
    }

    public void setOwner(final String ownerParam) {
        this.owner = ownerParam;
    }

    public Long getProjectId() {
        return this.projectId;
    }

    public void setProjectId(final Long projectIdParam) {
        this.projectId = projectIdParam;
    }

    public ProjectAddress getProjectAddress() {
        return this.projectAddress;
    }

    public void setProjectAddress(final ProjectAddress projectAddressParam) {
        this.projectAddress = projectAddressParam;
    }

    public Set<ProjectLocation> getLocations() {
        return this.locations;
    }

    public void setLocations(final Set<ProjectLocation> locationsParam) {
        this.locations = locationsParam;
    }

}

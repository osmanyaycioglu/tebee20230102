package com.training.javaee.ejb;

import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.PostActivate;
import javax.ejb.Remove;
import javax.ejb.Stateful;
import javax.persistence.PrePersist;

@Stateful
@LocalBean
public class HelloStateful {

    private final String uuidname;
    private int          counter;

    public HelloStateful() {
        this.uuidname = UUID.randomUUID()
                            .toString();
    }

    @PostConstruct
    public void initXyz() {
        System.out.println("************************* Hello yaratıldı");
    }

    @PreDestroy
    public void destroyAbc() {
        System.out.println("************************* Hello öldürüldü");
    }

    @PrePersist
    public void pasif() {

    }

    @PostActivate
    public void aktif() {

    }

    @Remove
    public void remove() {

    }

    public String hello(final String name,
                        final String surname) {
        this.counter++;
        return this.uuidname + " : " + this.counter + " Greetings " + name + " " + surname;
    }

    public String goodbye(final String name,
                          final String surname) {
        this.counter++;
        return this.uuidname + " : " + this.counter + " Goodbye " + name + " " + surname;
    }

}

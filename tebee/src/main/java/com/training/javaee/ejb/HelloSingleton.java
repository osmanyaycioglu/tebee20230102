package com.training.javaee.ejb;

import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

@Singleton
@LocalBean
public class HelloSingleton {

    private final String                 uuidname;
    private int                          counter;
    private final List<String>           listLoc       = new Vector<>();
    private final Map<String, String>    map           = new ConcurrentHashMap<>();

    private final AtomicInteger          atomicCounter = new AtomicInteger();

    private final ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public HelloSingleton() {
        this.uuidname = UUID.randomUUID()
                            .toString();
    }

    public synchronized void increaseCount() {
        this.counter++;
    }

    @PostConstruct
    public void initXyz() {
        this.readWriteLock.writeLock()
                          .lock();
        try {

        } finally {
            this.readWriteLock.writeLock()
                              .unlock();
        }
        System.out.println("************************* Hello yaratıldı");
    }

    @PreDestroy
    public void destroyAbc() {
        System.out.println("************************* Hello öldürüldü");
    }

    @Lock(LockType.WRITE)
    public String hello(final String name,
                        final String surname) {
        this.increaseCount();
        this.atomicCounter.incrementAndGet();
        return this.uuidname + " : " + this.counter + " Greetings " + name + " " + surname;
    }

    @Lock(LockType.WRITE)
    public String goodbye(final String name,
                          final String surname) {
        this.increaseCount();
        return this.uuidname + " : " + this.counter + " Goodbye " + name + " " + surname;
    }

    @Lock(LockType.READ)
    public int getCounter() {
        return this.counter;
    }

}

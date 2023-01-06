package com.training.javaee.ejb;

public class HelloStatelessProxy extends HelloStateless {

    public HelloStatelessProxy() {
    }

    @Override
    public String hello(final String name,
                        final String surname) {
        // pool dan instance all
        HelloStateless helloStatelessLoc = null;
        helloStatelessLoc.hello(name,
                                surname);
        // pool a geri koy
        return super.hello(name,
                           surname);
    }

    @Override
    public String goodbye(final String name,
                          final String surname) {
        return super.goodbye(name,
                             surname);
    }

}

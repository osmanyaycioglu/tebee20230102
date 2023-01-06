package com.training.java.oo.interfaces;


public interface IGreeting {

    String sayHello(String name,
                    String surname);

    String sayGoodbye(String name,
                      String surname);

    public static final String str_constant_1 = "test";
    String                     str_constant_2 = "test";

    default String sayAll(final String firstName,
                          final String lastName) {
        System.out.println("Say all started");
        return this.sayHello(firstName,
                             lastName)
               + "\n"
               + this.sayGoodbye(firstName,
                                 lastName);
    }

    static String doSomeGreet(final String str) {
        return "I am doing " + str;
    }
}

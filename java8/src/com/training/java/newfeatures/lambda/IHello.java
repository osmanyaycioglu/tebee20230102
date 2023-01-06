package com.training.java.newfeatures.lambda;

@FunctionalInterface
public interface IHello {

    String hello(String name,
                 String surname);

    default String default1() {
        return this.hello("defaultName",
                          "defaultSurname");
    }

    default String default2() {
        return "default2";
    }

}

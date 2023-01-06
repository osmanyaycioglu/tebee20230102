package com.training.java.newfeatures.lambda;

public class HelloRun {

    public static void main(final String[] args) {
        String prefix = "Ola";

        IHello helloLoc = new IHello() {

            @Override
            public String hello(final String nameParam,
                                final String surnameParam) {
                return prefix + " " + nameParam + " " + surnameParam;
            }
        };
        IHello helloLoc2 = new IHello() {

            @Override
            public String hello(final String nameParam,
                                final String surnameParam) {
                this.default1();
                return prefix + " " + nameParam + " " + surnameParam;
            }
        };

        IHello helloLoc3 = (name,
                            surname) -> {
            return prefix + " ------ " + name + " " + surname;
        };

        System.out.println("Lambda 1 : "
                           + helloLoc3.hello("osman",
                                             "alaz"));
        IHello helloLoc4 = (a,
                            b) -> prefix + " * " + a + " " + b;

        System.out.println("Lambda 2 : "
                           + helloLoc4.hello("osman",
                                             "alaz"));

    }

}

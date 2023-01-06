package com.training.java.oo.interfaces;

public class GreetingsRun {

    public static void main(final String[] args) {
        IGreeting greetingsEngLoc = GreetingFactory.createGreeting(1);

        String sayGoodbyeLoc = greetingsEngLoc.sayGoodbye("osman",
                                                          "yaycıoğlu");
        System.out.println(sayGoodbyeLoc);

        System.out.println(greetingsEngLoc.sayAll("osman",
                                                  "yaycıoğlu"));
    }
}

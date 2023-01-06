package com.training.java.oo.interfaces;


public class GreetingFactory {

    public static IGreeting createGreeting(final int language) {
        switch (language) {
            case 1:
                return new GreetingsEng();
            case 2:
            default:
                return new GreetingsTr();

        }
    }
}

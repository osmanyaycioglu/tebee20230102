package com.training.java.oo.interfaces;

public class GreetingsEng implements IGreeting {

    @Override
    public String sayHello(final String nameParam,
                           final String surnameParam) {
        return "Hello " + nameParam + "  " + surnameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam,
                             final String surnameParam) {
        return "Goodbye " + nameParam + "  " + surnameParam;
    }


}

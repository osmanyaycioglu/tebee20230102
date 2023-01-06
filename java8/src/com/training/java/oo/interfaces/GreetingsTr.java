package com.training.java.oo.interfaces;

public class GreetingsTr implements IGreeting {

    @Override
    public String sayHello(final String nameParam,
                           final String surnameParam) {
        return "Selam " + nameParam + "  " + surnameParam;
    }

    @Override
    public String sayGoodbye(final String nameParam,
                             final String surnameParam) {
        return "Güle güle " + nameParam + "  " + surnameParam;
    }


}

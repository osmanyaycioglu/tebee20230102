package com.training.java.oo.interfaces;


public class StringFormatter {

    private final String format = "Deneme %s";

    public void format(final String str) {
        String.format(this.format,
                      str);
    }

}

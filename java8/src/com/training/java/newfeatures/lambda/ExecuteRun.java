package com.training.java.newfeatures.lambda;


public class ExecuteRun {

    public static void main(final String[] args) {
        IExecute executeLoc1 = a -> "Gelen integer : " + a;

        IExecute executeLoc2 = a -> {
            int total = a + a + 100;
            return "Sonuç : " + total;
        };

        IExecute executeLoc3 = a -> {
            StringBuilder builderLoc = new StringBuilder();
            for (int iLoc = 0; iLoc < a; iLoc++) {
                builderLoc.append("C");
            }
            return "Sonuç : " + builderLoc.toString();
        };

        IExecute executeLoc4 = ExecuteRun::xyz;
        ExecuteRun executeRunLoc = new ExecuteRun();
        IExecute executeLoc5 = executeRunLoc::abc;

        IProcess processLoc = () -> "Processed";


    }

    public static String xyz(final Integer count) {
        StringBuilder builderLoc = new StringBuilder();
        for (int iLoc = 0; iLoc < count; iLoc++) {
            builderLoc.append("C");
        }
        return "Sonuç : " + builderLoc.toString();
    }

    public String abc(final Integer count) {
        StringBuilder builderLoc = new StringBuilder();
        for (int iLoc = 0; iLoc < count; iLoc++) {
            builderLoc.append("C");
        }
        return "Sonuç : " + builderLoc.toString();
    }

}

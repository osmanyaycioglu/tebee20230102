package com.training.java.newfeatures.general;

import java.util.Scanner;

public class NewFeaturesRun {

    public static void main(final String[] args) {
        int al = 10_000_000;
        long ll = 1_000_000_000_000_000L;

        Scanner scannerLoc = null;
        try {
            scannerLoc = new Scanner(System.in);
            System.out.println("Rakam girin");
            int nextIntLoc = scannerLoc.nextInt();
            System.out.println("Girdiğiniz rakam : " + nextIntLoc);
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        } finally {
            if (scannerLoc != null) {
                scannerLoc.close();
            }
        }
        try (Scanner scannerLoc2 = new Scanner(System.in)) {
            System.out.println("Rakam girin");
            int nextIntLoc = scannerLoc2.nextInt();
            System.out.println("Girdiğiniz rakam : " + nextIntLoc);

        } catch (IllegalAccessError | IllegalArgumentException eLoc) {
            System.err.println("Error");
        } catch (Exception eLoc) {
            eLoc.printStackTrace();
        }
    }
}

package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

    // Create three new variables: float, double, and a BigDecimal; initialize to 0
        float numF = 0;
        double numD = 0;
        BigDecimal lilD = BigDecimal.ZERO;

        // Regular loop for 10 increments
        for (int i = 0; i < 10; i++) {
            numF += 0.10f;
            numD += 0.10;
            lilD = lilD.add(new BigDecimal("0.10"));

            // Print each variable on one line inside the loop
            System.out.println("Float: " + numF);
            System.out.println("Double: " + numD);
            System.out.println("BigDecimal: " + lilD);
        }

        numF = 0;
        numD = 0;
        lilD = BigDecimal.ZERO;

        // Regular loop for 1000 increments
        for (int i = 0; i < 1000; i++) {
            numF += 19.99f;
            numD += 19.99;
            lilD = lilD.add(new BigDecimal("19.99"));
        }

        // Print each variable on one line after the loop
        System.out.println("Float: " + numF);
        System.out.println("Double: " + numD);
        System.out.println("BigDecimal: " + lilD);

        //1. numF (the float) is off by a few cents after 1000 iterations.
        //2. BigDecimal keeps the scale of values I've added to it.
        //3. The values stay the same because immutable (idk)?

    }
}
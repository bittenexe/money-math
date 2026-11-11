package com.pluralsight;
import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Create three new variables: float, double, and a BigDecimal; initialize to 0
        float numF = 0;
        double numD = 0;
        BigDecimal lilD = BigDecimal.ZERO;

        // Regular loop for 10 increment
        for (int i = 0; i < 10; i++) {
            numF += 0.10f;
            numD += 0.10;
            lilD = lilD.add(new BigDecimal("0.10"));

            // Print each variable on one line inside the loop
            System.out.println("Float: " + numF);
            System.out.println("Double: " + numD);
            System.out.println("BigDecimal: " + lilD);
        }
    }
}
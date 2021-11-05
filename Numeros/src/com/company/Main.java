package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        double x = 10.354473;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.println("resultado = " + x + "metros");
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);
        System.out.printf("resultado = %.2f metros%n", x);

    }
}

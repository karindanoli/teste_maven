package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        double horas;
        int x = sc.nextInt();
        int y = sc.nextInt();
        double z = sc.nextDouble();

        horas = y * z;

        System.out.println(x);
        System.out.printf("Salário = U$ %.2f%n ", horas);

        sc.close();
    }
}

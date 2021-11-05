package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double x = sc.nextInt();
            double y = sc.nextInt();
            double z = sc.nextInt();
            double soma = (2*x + 3*y + 5*z)/10;
            System.out.printf("%.1f%n",soma);
        }
    sc.close();
    }}


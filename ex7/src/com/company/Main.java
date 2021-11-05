package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        double conta;

        if (x == 1) {
            conta = y * 4.0;
        } else if (x == 2) {
            conta = y * 4.5;
        } else if (x == 3) {
            conta = y * 5;
        } else if (x == 4) {
            conta = y * 2;
        } else {
            conta = y * 1.5;
        }
        System.out.printf("Total: R$ %.2f%n", conta);
    }
}

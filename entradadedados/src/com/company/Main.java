package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// variavel scanner para colocar entrada de dados e tem que fechar
        Scanner sc = new Scanner(System.in);
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("voce digitou:" + x);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}

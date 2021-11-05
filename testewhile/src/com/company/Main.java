package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        while (x != 2002) {
           System.out.println("Senha Invalida");
            x= sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int tipo = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;


        while (tipo != 4) {
            if (tipo == 1) {
                alcool += 1;
            } else if (tipo == 2) {
                gasolina += 1;
            } else if (tipo == 3) {
                diesel += 1;
            } else
                System.out.println("valor inválido");
            tipo = sc.nextInt();
        }
        System.out.println("Muito obrigada");
        System.out.println("Alcool:" + alcool);
        System.out.println("Alcool:" + gasolina);
        System.out.println("Alcool:" + diesel);

        sc.close();



            }

        }

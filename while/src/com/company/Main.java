package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
                int x = sc.nextInt();
                int soma = 0;

                while (x !=0){
                    soma += x;//soma=soma+x
                    x = sc.nextInt();
                }
        System.out.println(soma);
        sc.close();
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a,b,c);

        showResult(higher);
        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x>y && x>z){
            aux=y;
        }
        else if(y>z){
            aux=y;
        }
        else {
            aux=z;
        }
        return aux;
    }
    public static void showResult(int value){
        System.out.println("Higher = " + value);
    }
}

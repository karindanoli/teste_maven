package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int somain = 0;
        int somaout = 0;
        for ( int i =1; i<n;i++){
            int x = sc.nextInt();
            if ( x >= 10 && x <= 20) {
                somain += 1;
            }else{
                somaout+=1;
            }
        }
        sc.close();
        System.out.println(somain + " : in");
        System.out.println(somaout + " : out");
    }
}

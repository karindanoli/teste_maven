package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x%y==0 || y%x==0){
            System.out.println("são multiplos");
        }
        else{
            System.out.println("não multiplos");
        }
        sc.close();
    }
}

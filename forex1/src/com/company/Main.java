package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 1;i<=x; i++) {
            if (i % 2 != 0){
            System.out.println(i);
        }}
        sc.close();
    }
}
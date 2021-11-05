package application;

import entities.CurrencyConverter;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);


        System.out.print("What is the dollar price? ");
        CurrencyConverter.dolarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        CurrencyConverter.dolarQuantity = sc.nextDouble();
        System.out.println("Amount to be paid in reais: ");
        System.out.println( CurrencyConverter.conversor());
    }
}

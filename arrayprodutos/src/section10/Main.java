package section10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Product[] vect = new Product[n];
        int i = 0;
        for (i=0;i< vect.length;i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name,price);
        }

        double sum = 0.0;
        for (i=0; i< vect.length; i++){
            sum += vect[i].getPrice();
        }

        double avg = sum/ vect.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", avg);
        sc.close();
    }
}

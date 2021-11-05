package section10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented?  ");
        int n = sc.nextInt();
        Pensionato[] vect = new Pensionato[n];
        int i = 0;
        for(i=0;i< vect.length;i++){
            sc.nextLine();
            System.out.print("Qual o nome? ");
            String name = sc.nextLine();
            System.out.print(" qual o email?");
            String email = sc.nextLine();
            System.out.print("qual o quarto? ");
            int number = sc.nextInt();
            vect[i] = new Pensionato(name,email,number);

        }
        System.out.println("Quartos lotados:");
        System.out.println( Arrays.toString(vect));
        sc.close();



    }
}

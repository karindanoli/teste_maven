package contadebanco;

import operacoes.Operacao;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner sc = new Scanner(System.in);
        Operacao opo;

        System.out.print(" Enter account number:");
        int number = sc.nextInt();
        System.out.print("Enter account holder:");
        sc.nextLine();
        String holder= sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?");
        char response = sc.next().charAt(0);
        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            opo = new Operacao(number, holder, initialDeposit); //pegou um dos construtores
        }else { opo = new Operacao(number, holder);

        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(opo);

        System.out.println();
        System.out.println("Enter a deposit value:");
        double depositValue = sc.nextDouble();
        opo.deposit(depositValue);//usando o metodo
        System.out.println(" Updated account data:");
        System.out.println(opo);//mostrando as novas infos

        System.out.println();
        System.out.println("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
        opo.withdraw(withdrawValue);
        System.out.println(" Updated account data:");
        System.out.println(opo);

        sc.close();










    }
}

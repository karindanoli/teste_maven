package application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();

        System.out.print("Nome: ");
        stu.name = sc.nextLine();
        System.out.print("Nota do primeiro semestre: ");
        stu.nota1 = sc.nextDouble();
        System.out.print("Nota do segundo semestre: ");
        stu.nota2 = sc.nextDouble();
        System.out.print("Nota do terceiro semestre: ");
        stu.nota3 = sc.nextDouble();

        System.out.printf("Final grade: %.2f%n", stu.notaFinal());

      if (stu.notaFinal()< 60) {
          System.out.println("FAILED");
          System.out.printf("Missing %.2f points%n", stu.reprovado());
      }else{
          System.out.println("PASS");
      }
sc.close();
    }
}

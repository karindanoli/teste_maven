package section10;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Employee> list = new ArrayList<>();

        System.out.println("Hoe many employees will be registered? ");
        int number = sc.nextInt();
        int i;
                for (i = 0; i<number;i++) {
                System.out.println("Employee #" + (i + 1) + ":");
                System.out.println("Entre com o id:");
                Integer id = sc.nextInt();
                System.out.println("Entre com o nome:");
                String name = sc.nextLine();
                System.out.println("Entre com o Salary:");
                Double salary = sc.nextDouble();

                Employee emp = new Employee(id, name, salary);
                list.add(emp);// instaciou a classe employee para adicionar na lista

            }



        System.out.println("Enter employee id the will have salary increase: ");
        int idsalary = sc.nextInt();
        //Integer pos = position(list, idsalary);

        Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
        if (emp == null){
            System.out.println("This id does not exist!");
        }
        else {
            System.out.println("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (Employee emp : list) {
            System.out.println(emp);
        }
        sc.close();

        }
    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
            }

public static boolean hasId(List<Employee> list, int id){
        Employee emp = list.stream().filter(x-> x.getId() == id).findFirst().orElse(null);
        return emp != null;
}}

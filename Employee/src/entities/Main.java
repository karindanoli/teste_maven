package entities;

public class Main {

    public static void main(String[] args) {
	// write your code here
        public String name;
        public double grossSalary;
        public double tax;

        public double netSalary(){
            return grossSalary - tax;
        }
    }
}

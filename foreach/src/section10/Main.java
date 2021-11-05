package section10;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String[] vect = new String[] { "Maria", "Bob","Alex"};

        for (int i = 0; i<vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println("-------------");
        System.out.println("código diferentes com resultados semelhantes");
        for (String obj : vect){
            System.out.println(obj);
        }
    }
}

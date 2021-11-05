package treinamento;

public class Main {

           public static void main(String[] args) {
            Pokemon pokemon01 = new Pokemon();
            pokemon01.setNome("Pikachu");
            pokemon01.setNivel(7);
            System.out.println("O nome do meu Pokemon é: " + pokemon01.getNome() + " do nivel " + pokemon01.getNivel());
    }
}

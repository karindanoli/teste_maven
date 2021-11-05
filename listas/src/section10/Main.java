package section10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Anna");
        list.add(2,"Marco");// add itens em 1 lista e na posicao 2
        System.out.println(list.size());//tamanho da lista
        for (String x: list) {//foreach percorre cada elemento da lista
            System.out.println(x);
        }
        System.out.println("-----------");
        list.removeIf(x-> x.charAt(0) == 'M');//remover se + funcao lambda
        for (String x: list) {//percorre cada elemento da lista que removeu para imprimir
            System.out.println(x);
        }
        System.out.println("-----------");
        System.out.println("Index of Bob:" + list.indexOf("Bob"));//indexof ver a posicao na lista
        System.out.println("Index of Marco: " + list.indexOf("Marco"));// indexof negativo é pq nao tem na lista -1
        System.out.println("--------");
        List<String> result = list.stream().filter(x-> x.charAt(0) == 'A').collect(Collectors.toList());
        //stream é para add o lambda na lista e vc filtra a lista de acordo com a condicao que vc quer e retorna boolean e coleta da lista
        for (String x : result) {
            System.out.println(x);

        }
        System.out.println("-----------");
        String name = list.stream().filter(x-> x.charAt(0) == 'J').findFirst().orElse(null);
        //findFirst primeira letra J aparece se nao aparece null. Nao percorreu a lista, já foi direto pro print
        System.out.println(name);

    }
}

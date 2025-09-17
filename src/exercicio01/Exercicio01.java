package exercicio01;

import java.util.Arrays;
import java.util.List;

public class Exercicio01 {
    public static void main(String[] args) {
        String[] aux = {"José", "Ana Paula", "Ana Carolina", "Vinicius", "Alberto"};
        List<String> lista = Arrays.asList(aux);

        lista.stream().filter(nome -> nome.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}

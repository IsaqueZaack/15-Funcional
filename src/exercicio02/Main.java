package exercicio02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Empregado> lista = new ArrayList<>();
        lista.add(new Empregado("C", 4, 10));
        lista.add(new Empregado("D", 20, 100));
        lista.add(new Empregado("B", 25, 1000));
        lista.add(new Empregado("A", 3, 10));

        // filtro lógico
        Predicate<Empregado> filtro =  e -> e.anosExperiencia() >= 5;

        // function para referenciar o método getNome()
        Function<Empregado, String> ref = Empregado::nome;

        /*lista.stream()
                .map(e -> new Empregado(e.nome(), e.anosExperiencia(),
                        e.salario() * (e.anosExperiencia() >= 5 ? 1.2 : 1.1)))
                .sorted(Comparator.comparing(Empregado::nome))
                .forEach(System.out::println);*/

        lista.stream()
                .map(e -> new Empregado(e.nome(), e.anosExperiencia(),
                        e.salario() * (filtro.test(e)? 1.2 : 1.1)))
                .sorted(Comparator.comparing(ref))
                .forEach(System.out::println);
    }
}

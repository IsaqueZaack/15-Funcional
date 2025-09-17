package exercicio03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Produto> lista = new ArrayList<>();
        lista.add(new Produto("C", 10, "D"));
        lista.add(new Produto("A", 1000, "Eletrônicos"));
        lista.add(new Produto("B", 100, "Eletrônicos"));

        lista.stream()
                .filter(categoria -> categoria.equals("Eletrônicos"))
                .forEach(System.out::println);
    }
}

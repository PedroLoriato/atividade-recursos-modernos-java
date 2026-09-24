package pedro.exercicio02;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> ehPar = n -> n % 2 == 0;
        Consumer<String> imprimeMaiusculo =
                texto -> System.out.println(texto.toUpperCase());

        System.out.println("--- Teste do Predicate (Números Pares) ---");
        Integer num1 = 10;
        Integer num2 = 15;

        System.out.println("O número " + num1 + " é par? " + ehPar.test(num1));
        System.out.println("O número " + num2 + " é par? " + ehPar.test(num2));

        System.out.println("\n--- Teste do Consumer (Texto Maiúsculo) ---");

        imprimeMaiusculo.accept("java");
        imprimeMaiusculo.accept("programação funcional");
    }
}
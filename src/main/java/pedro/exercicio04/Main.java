package pedro.exercicio04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> alunos = Arrays.asList("Ana", "Carlos", "Beatriz", "João", "Maria");

        System.out.println("--- Lista Original ---");
        System.out.println(alunos);

        List<String> alunosMaiusculos = alunos.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("\n--- Lista Transformada (Maiúsculas) ---");
        System.out.println(alunosMaiusculos);
    }
}
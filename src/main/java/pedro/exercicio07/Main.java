package pedro.exercicio07;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> equipe = Arrays.asList(
                new Funcionario("Ana", 4500.00),
                new Funcionario("Carlos", 3200.00),
                new Funcionario("Beatriz", 6000.00),
                new Funcionario("Daniel", 2800.00)
        );

        System.out.println("--- Relatório da Folha de Pagamento ---");
        exibeTotalFolha(equipe);
        exibeMaiorSalario(equipe);
        exibeMedia(equipe);
    }

    private static void exibeTotalFolha(List<Funcionario> equipe) {
        Double totalFolha = equipe.stream()
                .mapToDouble(Funcionario::getSalario)
                .sum();

        System.out.printf("Total da Folha: R$ %.2f%n", totalFolha);
    }

    private static void exibeMaiorSalario(List<Funcionario> equipe) {
        equipe.stream()
                .mapToDouble(Funcionario::getSalario)
                .max()
                .ifPresent(max -> System.out.printf("Maior Salário: R$ %.2f%n", max));
    }

    private static void exibeMedia(List<Funcionario> equipe) {
        equipe.stream()
                .mapToDouble(Funcionario::getSalario)
                .average()
                .ifPresent(media -> System.out.printf("Média Salarial: R$ %.2f%n", media));
    }
}
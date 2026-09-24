package pedro.exercicio09;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> equipe = Arrays.asList(
                new Funcionario("Ana", 4500.00, "TI"),
                new Funcionario("Carlos", 3200.00, "Vendas"),
                new Funcionario("Beatriz", 6000.00, "TI"),
                new Funcionario("Daniel", 2800.00, "RH"),
                new Funcionario("Eduardo", 5500.00, "Vendas")
        );

        listaPorDepartamento(equipe)
                .forEach((departamento, funcionarios) ->
                        System.out.println("Departamento " + departamento + ": " + funcionarios)
                );

        System.out.println("Funcionário com o maior salário: " + buscaNomeMaiorSalario(equipe));

        System.out.println("Todos os nomes: " + listaTodosOsNomes(equipe));
    }

    private static String listaTodosOsNomes(List<Funcionario> equipe) {
        return equipe.stream()
                .map(Funcionario::getNome)
                .collect(Collectors.joining(", "));
    }

    private static String buscaNomeMaiorSalario(List<Funcionario> equipe) {
        return equipe.stream()
                .max(Comparator.comparingDouble(Funcionario::getSalario))
                .map(Funcionario::getNome)
                .orElseThrow(() -> new IllegalArgumentException("A lista de funcionários está vazia!"));
    }

    private static Map<String, List<Funcionario>> listaPorDepartamento(List<Funcionario> equipe) {
        return equipe.stream()
                .collect(Collectors.groupingBy(Funcionario::getDepartamento));
    }
}
package pedro.exercicio08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Funcionario> equipe = Arrays.asList(
                new Funcionario("Ana", 4500.00),
                new Funcionario("Carlos", 3200.00),
                new Funcionario("Beatriz", 6000.00)
        );

        System.out.println("Buscando Carlos...");
        Double salarioCarlos = buscarFuncionarioPorNome(equipe, "Carlos")
                .map(Funcionario::getSalario)
                .orElseThrow(() -> new IllegalArgumentException("Funcionário não encontrado"));
        System.out.printf("Salário encontrado: R$ %.2f%n", salarioCarlos);
    }

    public static Optional<Funcionario> buscarFuncionarioPorNome(List<Funcionario> lista, String nome) {
        return lista.stream()
                .filter(f -> f.getNome().equalsIgnoreCase(nome))
                .findFirst();
    }
}
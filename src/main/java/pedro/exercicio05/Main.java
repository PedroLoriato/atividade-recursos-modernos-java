package pedro.exercicio05;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<String> ferramentas = Arrays.asList("Git", "Docker", "VS Code", "Figma");

        Optional<String> resultadoValido = buscarPorId(ferramentas, 1);
        resultadoValido.ifPresent(System.out::println);

        Optional<String> resultadoInvalido = buscarPorId(ferramentas, 2);
        String naoEncontrado = resultadoInvalido.orElse("não encontrado");
        System.out.println(naoEncontrado);
    }

    public static Optional<String> buscarPorId(List<String> lista, Integer indice) {
        return lista.stream()
                .skip(indice)
                .findFirst();
    }
}
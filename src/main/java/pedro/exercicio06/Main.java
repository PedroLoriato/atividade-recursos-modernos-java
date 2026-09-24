package pedro.exercicio06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> produtos = Arrays.asList("Saca", "Fertilizante", "Adubo", "Semente", "Trator", "Café");

        List<String> produtosStream = produtos.stream()
                .filter(p -> p.length() > 5)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println("Resultado (Stream): " + produtosStream);

        List<String> produtosFor = new ArrayList<>();

        for (String p : produtos) {
            if (p.length() > 5) {
                produtosFor.add(p.toUpperCase());
            }
        }
        Collections.sort(produtosFor);

        System.out.println("Resultado (Laço For): " + produtosFor);

        /*
         * COMPARAÇÃO DE LEGIBILIDADE:
         *
         * A versão com Stream é muito mais legível. O código é lido de cima
         * para baixo como se fosse uma frase estruturada em inglês: "pegue o fluxo, filtre
         * por tamanho, mapeie para maiúsculas, ordene e colete". O foco do código está no
         * O QUE deve ser feito, sem variáveis temporárias de controle.
         *
         * A versão com 'for' tradicional foca no COMO fazer. Precisa de
         * instanciar uma lista mutável no início, aninhar blocos 'if' dentro de 'for', e a
         * operação de ordenação quebra o fluxo de leitura, pois precisa ser feita numa
         * linha isolada após o encerramento do laço. Se houvesse mais regras de negócio,
         * o aninhamento de chaves tornaria o código complexo e difícil de dar manutenção.
         */
    }
}
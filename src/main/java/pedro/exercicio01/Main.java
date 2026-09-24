package pedro.exercicio01;

public class Main {
    public static void main(String[] args) {

        Operacao soma = (Integer a, Integer b) -> a + b;
        Operacao subtracao = (a, b) -> a - b;
        Operacao multiplicacao = (a, b) -> a * b;

        System.out.println("--- Testando Expressões Lambda ---");

        Integer x = 10;
        Integer y = 5;

        System.out.println("Valores base: a = " + x + ", b = " + y);
        System.out.println("Resultado da Soma: " + soma.aplicar(x, y));
        System.out.println("Resultado da Subtração: " + subtracao.aplicar(x, y));
        System.out.println("Resultado da Multiplicação: " + multiplicacao.aplicar(x, y));
    }
}
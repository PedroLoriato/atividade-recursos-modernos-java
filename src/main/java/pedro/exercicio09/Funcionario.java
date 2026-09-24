package pedro.exercicio09;

public class Funcionario {
    private final String nome;
    private final Double salario;
    private final String departamento;

    public Funcionario(String nome, Double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public Double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
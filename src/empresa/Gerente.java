package Empresa;

public class Gerente extends Funcionario {
    private String senha;

    public Gerente(String nome, String cpf, double salario, String senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    @Override
    public double getBonificacao() {
        // Bônus maior para gerentes
        return super.getBonificacao() + super.getSalario() * 0.15;
    }

    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }
}
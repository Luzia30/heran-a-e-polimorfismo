package Empresa;

public class EditorVideo extends Funcionario {

    public EditorVideo(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public double getBonificacao() {
        // Bônus fixo para editores
        return super.getBonificacao() + 200;
    }
}
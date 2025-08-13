package Empresa;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("João", "123456789-00", 2000);
        Gerente g1 = new Gerente("Maria", "987654321-00", 5000, "1234");
        EditorVideo e1 = new EditorVideo("Carlos", "112233445-00", 2500);

        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(f1);
        controle.registra(g1);
        controle.registra(e1);

        System.out.println("Total de bonificações: " + controle.getSoma());

        // Teste de autenticação do gerente
        System.out.println("Gerente autenticado? " + g1.autenticar("1234"));
    }
}
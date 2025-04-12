package iterator.example2;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.adicionarFuncionario(new Funcionario("João", "Desenvolvedor"));
        empresa.adicionarFuncionario(new Funcionario("Maria", "Analista"));
        empresa.adicionarFuncionario(new Funcionario("Pedro", "Gerente"));

        Iterator<Funcionario> iterator = empresa.criarIterator();

        System.out.println("Relatório de Funcionários:");
        while (iterator.hasNext()) {
            Funcionario f = iterator.next();
            System.out.println("• " + f);
        }
    }
}
package strategy.example2;

public class Main {
    public static void main(String[] args) {
        ServicoValidacaoSenha servico = new ServicoValidacaoSenha();

        servico.setValidador(new ValidadorComprimentoMinimo(8));
        System.out.println("Comprimento mínimo: " + servico.validar("abc123"));

        servico.setValidador(new ValidadorNumero());
        System.out.println("Contém número: " + servico.validar("abcdef"));

        servico.setValidador(new ValidadorEspecial());
        System.out.println("Contém caractere especial: " + servico.validar("abc123!"));
    }
}

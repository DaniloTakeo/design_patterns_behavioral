package visitor.example2;

public class Main {
    public static void main(String[] args) {
        // Expressão: (5 + 3) * 2
        Expressao expressao = new Multiplicacao(
            new Soma(new Valor(5), new Valor(3)),
            new Valor(2)
        );

        AvaliadorVisitor avaliador = new AvaliadorVisitor();
        expressao.aceitar(avaliador);
        System.out.println("Resultado da expressão: " + avaliador.getResultado());

        InfixoVisitor infixo = new InfixoVisitor();
        expressao.aceitar(infixo);
        System.out.println("Expressão infixa: " + infixo.getResultado());
    }
}
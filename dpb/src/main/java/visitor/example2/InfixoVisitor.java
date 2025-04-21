package visitor.example2;

public class InfixoVisitor implements Visitor {
    private String resultado;

    public String getResultado() {
        return resultado;
    }

    @Override
    public void visitar(Valor valor) {
        resultado = String.valueOf(valor.getValor());
    }

    @Override
    public void visitar(Soma soma) {
        soma.getEsquerda().aceitar(this);
        String esquerda = resultado;
        soma.getDireita().aceitar(this);
        String direita = resultado;
        resultado = "(" + esquerda + " + " + direita + ")";
    }

    @Override
    public void visitar(Multiplicacao multiplicacao) {
        multiplicacao.getEsquerda().aceitar(this);
        String esquerda = resultado;
        multiplicacao.getDireita().aceitar(this);
        String direita = resultado;
        resultado = "(" + esquerda + " * " + direita + ")";
    }
}
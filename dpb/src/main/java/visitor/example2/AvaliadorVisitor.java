package visitor.example2;

public class AvaliadorVisitor implements Visitor {
    private int resultado;

    public int getResultado() {
        return resultado;
    }

    @Override
    public void visitar(Valor valor) {
        resultado = valor.getValor();
    }

    @Override
    public void visitar(Soma soma) {
        soma.getEsquerda().aceitar(this);
        int esquerda = resultado;
        soma.getDireita().aceitar(this);
        int direita = resultado;
        resultado = esquerda + direita;
    }

    @Override
    public void visitar(Multiplicacao multiplicacao) {
        multiplicacao.getEsquerda().aceitar(this);
        int esquerda = resultado;
        multiplicacao.getDireita().aceitar(this);
        int direita = resultado;
        resultado = esquerda * direita;
    }
}
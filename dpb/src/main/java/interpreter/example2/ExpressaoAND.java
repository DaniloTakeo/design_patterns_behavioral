package interpreter.example2;

public class ExpressaoAND implements Expressao {
    private Expressao esquerda;
    private Expressao direita;

    public ExpressaoAND(Expressao esquerda, Expressao direita) {
        this.esquerda = esquerda;
        this.direita = direita;
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return esquerda.interpretar(contexto) && direita.interpretar(contexto);
    }
}
package visitor.example2;

public interface Visitor {
    void visitar(Valor valor);
    void visitar(Soma soma);
    void visitar(Multiplicacao multiplicacao);
}
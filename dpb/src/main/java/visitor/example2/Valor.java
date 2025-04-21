package visitor.example2;

public class Valor implements Expressao {
    private int valor;

    public Valor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
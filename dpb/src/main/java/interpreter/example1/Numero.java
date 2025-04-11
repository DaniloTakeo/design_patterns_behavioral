package interpreter.example1;

public class Numero implements Expressao {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    @Override
    public int interpretar() {
        return valor;
    }
}
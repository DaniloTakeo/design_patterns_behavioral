package strategy.example1;

public class Soma implements Operacao {
    @Override
    public int executar(int a, int b) {
        return a + b;
    }
}
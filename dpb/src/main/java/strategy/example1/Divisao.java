package strategy.example1;

public class Divisao implements Operacao {
    @Override
    public int executar(int a, int b) {
        return a / b;
    }
}
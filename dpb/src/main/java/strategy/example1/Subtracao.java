package strategy.example1;

public class Subtracao implements Operacao {
    @Override
    public int executar(int a, int b) {
        return a - b;
    }
}
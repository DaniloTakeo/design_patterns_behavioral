package strategy.example1;

public class Calculadora {
    private Operacao operacao;

    public void setOperacao(Operacao operacao) {
        this.operacao = operacao;
    }

    public int calcular(int a, int b) {
        if (operacao == null) {
            throw new IllegalStateException("Operação não definida.");
        }
        return operacao.executar(a, b);
    }
}
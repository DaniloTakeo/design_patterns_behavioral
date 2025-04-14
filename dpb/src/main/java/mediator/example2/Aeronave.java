package mediator.example2;

public abstract class Aeronave {
    protected TorreControle torre;
    protected String identificacao;

    public Aeronave(TorreControle torre, String identificacao) {
        this.torre = torre;
        this.identificacao = identificacao;
    }

    public abstract void solicitarDecolagem();
    public abstract void receberAutorizacao(String mensagem);
}
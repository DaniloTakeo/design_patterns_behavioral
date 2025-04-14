package mediator.example2;

public class AeronaveImpl extends Aeronave {

    public AeronaveImpl(TorreControle torre, String identificacao) {
        super(torre, identificacao);
    }

    @Override
    public void solicitarDecolagem() {
        System.out.println("Aeronave " + identificacao + " solicitando decolagem...");
        torre.solicitarDecolagem(this);
    }

    @Override
    public void receberAutorizacao(String mensagem) {
        System.out.println("Aeronave " + identificacao + " recebeu: " + mensagem);
    }
}
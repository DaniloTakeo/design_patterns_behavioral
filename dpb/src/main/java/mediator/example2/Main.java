package mediator.example2;

public class Main {
    public static void main(String[] args) {
        TorreControle torre = new TorreControleImpl();

        Aeronave a1 = new AeronaveImpl(torre, "LATAM123");
        Aeronave a2 = new AeronaveImpl(torre, "GOL456");

        torre.registrarAeronave(a1);
        torre.registrarAeronave(a2);

        a1.solicitarDecolagem();
    }
}
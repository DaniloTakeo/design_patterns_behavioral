package observer.example2;

public class ArCondicionado implements ObservadorTemperatura {
    @Override
    public void atualizar(int temperatura) {
        if (temperatura > 25) {
            System.out.println("Ar-condicionado: Ligando resfriamento...");
        } else if (temperatura < 18) {
            System.out.println("Ar-condicionado: Ligando aquecimento...");
        } else {
            System.out.println("Ar-condicionado: Temperatura ideal.");
        }
    }
}
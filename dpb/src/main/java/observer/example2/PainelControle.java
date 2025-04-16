package observer.example2;

public class PainelControle implements ObservadorTemperatura {
    @Override
    public void atualizar(int temperatura) {
        System.out.println("Painel: Temperatura atual -> " + temperatura + "°C");
    }
}
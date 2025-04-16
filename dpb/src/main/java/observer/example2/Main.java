package observer.example2;

public class Main {
    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();

        ArCondicionado ar = new ArCondicionado();
        PainelControle painel = new PainelControle();

        sensor.adicionar(ar);
        sensor.adicionar(painel);

        sensor.setTemperatura(30);
        sensor.setTemperatura(20);
        sensor.setTemperatura(15);
    }
}
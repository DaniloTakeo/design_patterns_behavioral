package observer.example2;

import java.util.ArrayList;
import java.util.List;

public class SensorTemperatura {
    private final List<ObservadorTemperatura> observadores = new ArrayList<>();
    private int temperatura;

    public void adicionar(ObservadorTemperatura o) {
        observadores.add(o);
    }

    public void remover(ObservadorTemperatura o) {
        observadores.remove(o);
    }

    public void setTemperatura(int novaTemperatura) {
        this.temperatura = novaTemperatura;
        System.out.println("\nSensor: Nova temperatura detectada: " + temperatura + "°C");
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (ObservadorTemperatura o : observadores) {
            o.atualizar(temperatura);
        }
    }
}
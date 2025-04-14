package mediator.example2;

import java.util.ArrayList;
import java.util.List;

public class TorreControleImpl implements TorreControle {
    private List<Aeronave> aeronaves = new ArrayList<>();

    @Override
    public void registrarAeronave(Aeronave aeronave) {
        aeronaves.add(aeronave);
    }

    @Override
    public void solicitarDecolagem(Aeronave aeronave) {
        System.out.println("Torre: Autorizando decolagem para " + aeronave.identificacao);
        aeronave.receberAutorizacao("Decolagem autorizada para " + aeronave.identificacao);
        for (Aeronave a : aeronaves) {
            if (a != aeronave) {
                a.receberAutorizacao("Aeronave " + aeronave.identificacao + " decolou.");
            }
        }
    }
}
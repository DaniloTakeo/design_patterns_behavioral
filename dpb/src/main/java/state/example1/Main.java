package state.example1;

public class Main {
    public static void main(String[] args) {
        MaquinaVendas maquina = new MaquinaVendas();

        maquina.inserirMoeda();
        maquina.pressionarBotao();

        System.out.println("\n--- Nova interação ---\n");

        maquina.inserirMoeda();
        maquina.ejetarMoeda();
        maquina.pressionarBotao();
    }
}
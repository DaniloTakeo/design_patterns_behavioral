package state.example1;

public class SemMoeda implements Estado {
    private final MaquinaVendas maquina;

    public SemMoeda(MaquinaVendas maquina) {
        this.maquina = maquina;
    }

    public void inserirMoeda() {
        System.out.println("Moeda inserida.");
        maquina.setEstado(maquina.getComMoeda());
    }

    public void ejetarMoeda() {
        System.out.println("Nenhuma moeda para ejetar.");
    }

    public void pressionarBotao() {
        System.out.println("Você precisa inserir uma moeda primeiro.");
    }

    public void dispensar() {
        System.out.println("Nenhum produto foi vendido.");
    }
}
package state.example1;

public class ComMoeda implements Estado {
    private final MaquinaVendas maquina;

    public ComMoeda(MaquinaVendas maquina) {
        this.maquina = maquina;
    }

    public void inserirMoeda() {
        System.out.println("Já existe uma moeda inserida.");
    }

    public void ejetarMoeda() {
        System.out.println("Moeda devolvida.");
        maquina.setEstado(maquina.getSemMoeda());
    }

    public void pressionarBotao() {
        System.out.println("Botão pressionado...");
        maquina.setEstado(maquina.getVendendoProduto());
    }

    public void dispensar() {
        System.out.println("Nenhum produto foi dispensado ainda.");
    }
}
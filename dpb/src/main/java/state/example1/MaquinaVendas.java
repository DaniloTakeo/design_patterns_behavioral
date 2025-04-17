package state.example1;

public class MaquinaVendas {
    private final Estado semMoeda;
    private final Estado comMoeda;
    private final Estado vendendoProduto;

    private Estado estadoAtual;

    public MaquinaVendas() {
        this.semMoeda = new SemMoeda(this);
        this.comMoeda = new ComMoeda(this);
        this.vendendoProduto = new VendendoProduto(this);
        this.estadoAtual = semMoeda;
    }

    public void setEstado(Estado estado) {
        this.estadoAtual = estado;
    }

    public Estado getSemMoeda() {
        return semMoeda;
    }

    public Estado getComMoeda() {
        return comMoeda;
    }

    public Estado getVendendoProduto() {
        return vendendoProduto;
    }

    public void inserirMoeda() {
        estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda() {
        estadoAtual.ejetarMoeda();
    }

    public void pressionarBotao() {
        estadoAtual.pressionarBotao();
        estadoAtual.dispensar();
    }
}
package state.example1;

public class VendendoProduto implements Estado {
    private final MaquinaVendas maquina;

    public VendendoProduto(MaquinaVendas maquina) {
        this.maquina = maquina;
    }

    public void inserirMoeda() {
        System.out.println("Aguarde, já estamos entregando seu produto.");
    }

    public void ejetarMoeda() {
        System.out.println("Desculpe, já estamos processando a venda.");
    }

    public void pressionarBotao() {
        System.out.println("Pressionar duas vezes não entrega dois produtos!");
    }

    public void dispensar() {
        System.out.println("Produto dispensado.");
        maquina.setEstado(maquina.getSemMoeda());
    }
}
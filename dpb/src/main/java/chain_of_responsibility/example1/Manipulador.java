package chain_of_responsibility.example1;

public abstract class Manipulador {
    protected Manipulador proximo;

    public void setProximo(Manipulador proximo) {
        this.proximo = proximo;
    }

    public abstract void tratar(RequisicaoSuporte requisicao);
}
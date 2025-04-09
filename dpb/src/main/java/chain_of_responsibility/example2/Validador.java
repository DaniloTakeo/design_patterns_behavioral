package chain_of_responsibility.example2;

public abstract class Validador {
    protected Validador proximo;

    public Validador linkar(Validador proximo) {
        this.proximo = proximo;
        return proximo;
    }

    public abstract boolean validar(Usuario usuario);
}
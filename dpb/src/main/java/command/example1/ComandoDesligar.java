package command.example1;

public class ComandoDesligar<T extends Comandavel> implements Comando {
    private T t;

    public ComandoDesligar(T t) {
        this.t = t;
    }

    @Override
    public void executar() {
        t.desligar();
    }
}
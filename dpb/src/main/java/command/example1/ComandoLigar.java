package command.example1;

public class ComandoLigar<T extends Comandavel> implements Comando {
    private T t;

    public ComandoLigar(T t) {
        this.t = t;
    }

    @Override
    public void executar() {
        t.ligar();
    }
}
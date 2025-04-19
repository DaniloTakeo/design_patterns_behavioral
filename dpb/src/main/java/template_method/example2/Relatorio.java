package template_method.example2;

public abstract class Relatorio {

    // Método template
    public final void gerarRelatorio() {
        adicionarCabecalho();
        adicionarCorpo();
        adicionarRodape();
    }

    protected abstract void adicionarCabecalho();
    protected abstract void adicionarCorpo();
    protected abstract void adicionarRodape();
}
package state.example2;

public class EditorTexto {
    private final EstadoEditor modoInsercao;
    private final EstadoEditor modoSelecao;
    private final EstadoEditor modoEdicao;

    private EstadoEditor estadoAtual;
    private final StringBuilder conteudo;

    public EditorTexto() {
        this.conteudo = new StringBuilder();
        this.modoInsercao = new ModoInsercao(this);
        this.modoSelecao = new ModoSelecao(this);
        this.modoEdicao = new ModoEdicao(this);
        this.estadoAtual = modoInsercao;
    }

    public void digitar(String texto) {
        estadoAtual.digitar(texto);
    }

    public void clicar() {
        estadoAtual.clicar();
    }

    public void setEstadoAtual(EstadoEditor estado) {
        this.estadoAtual = estado;
    }

    public EstadoEditor getModoInsercao() {
        return modoInsercao;
    }

    public EstadoEditor getModoSelecao() {
        return modoSelecao;
    }

    public EstadoEditor getModoEdicao() {
        return modoEdicao;
    }

    public StringBuilder getConteudo() {
        return conteudo;
    }
}
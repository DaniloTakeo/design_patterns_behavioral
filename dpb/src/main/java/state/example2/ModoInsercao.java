package state.example2;

public class ModoInsercao implements EstadoEditor {
    private final EditorTexto editor;

    public ModoInsercao(EditorTexto editor) {
        this.editor = editor;
    }

    public void digitar(String texto) {
        System.out.println("Inserindo texto: " + texto);
        editor.getConteudo().append(texto);
    }

    public void clicar() {
        System.out.println("Clicou: trocando para o modo SELEÇÃO.");
        editor.setEstadoAtual(editor.getModoSelecao());
    }
}
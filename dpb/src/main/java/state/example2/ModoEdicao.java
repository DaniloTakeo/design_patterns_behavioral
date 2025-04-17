package state.example2;

public class ModoEdicao implements EstadoEditor {
    private final EditorTexto editor;

    public ModoEdicao(EditorTexto editor) {
        this.editor = editor;
    }

    public void digitar(String texto) {
        System.out.println("Editando texto selecionado para: " + texto);
        editor.getConteudo().replace(0, editor.getConteudo().length(), texto);
    }

    public void clicar() {
        System.out.println("Clique detectado: voltando para o modo INSERÇÃO.");
        editor.setEstadoAtual(editor.getModoInsercao());
    }
}
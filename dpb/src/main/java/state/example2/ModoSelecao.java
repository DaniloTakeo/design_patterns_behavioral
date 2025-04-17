package state.example2;

public class ModoSelecao implements EstadoEditor {
    private final EditorTexto editor;

    public ModoSelecao(EditorTexto editor) {
        this.editor = editor;
    }

    public void digitar(String texto) {
        System.out.println("Não é possível digitar no modo SELEÇÃO.");
    }

    public void clicar() {
        System.out.println("Selecionou texto. Trocando para o modo EDIÇÃO.");
        editor.setEstadoAtual(editor.getModoEdicao());
    }
}
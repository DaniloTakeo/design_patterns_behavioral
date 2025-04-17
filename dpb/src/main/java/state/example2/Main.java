package state.example2;

public class Main {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();

        editor.digitar("Olá mundo!");
        editor.clicar();  // Modo seleção
        editor.digitar("Tentando digitar");
        editor.clicar();  // Modo edição
        editor.digitar("Texto editado.");
        editor.clicar();  // Volta para inserção
        editor.digitar(" Continua a digitar.");

        System.out.println("\nConteúdo final do editor: " + editor.getConteudo());
    }
}
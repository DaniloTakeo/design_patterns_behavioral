package memento.example1;

public class TextoEstado {
    private final String textoSalvo;

    public TextoEstado(String textoSalvo) {
        this.textoSalvo = textoSalvo;
    }

    public String getTextoSalvo() {
        return textoSalvo;
    }
}
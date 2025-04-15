package memento.example1;

public class Texto {
    private String conteudo = "";

    public void escrever(String novoTexto) {
        conteudo += novoTexto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public TextoEstado salvar() {
        return new TextoEstado(conteudo);
    }

    public void restaurar(TextoEstado estado) {
        this.conteudo = estado.getTextoSalvo();
    }
}
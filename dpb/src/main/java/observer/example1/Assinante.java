package observer.example1;

public class Assinante implements Observador {
    private final String nome;

    public Assinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String noticia) {
        System.out.println(nome + " recebeu a notícia: " + noticia);
    }
}
package observer.example1;

import java.util.ArrayList;
import java.util.List;

public class CanalDeNoticias {
    private final List<Observador> assinantes = new ArrayList<>();

    public void adicionar(Observador o) {
        assinantes.add(o);
    }

    public void remover(Observador o) {
        assinantes.remove(o);
    }

    public void novaNoticia(String noticia) {
        System.out.println("\nNova notícia publicada: " + noticia);
        for (Observador o : assinantes) {
            o.atualizar(noticia);
        }
    }
}
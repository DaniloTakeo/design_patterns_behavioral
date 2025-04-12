package iterator.example1;

import java.util.List;

public class PlaylistIterator implements Iterator<Musica> {
    private List<Musica> musicas;
    private int posicaoAtual = 0;

    public PlaylistIterator(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public boolean hasNext() {
        return posicaoAtual < musicas.size();
    }

    @Override
    public Musica next() {
        return musicas.get(posicaoAtual++);
    }
}
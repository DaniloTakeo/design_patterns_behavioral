package iterator.example1;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<Musica> musicas = new ArrayList<>();

    public void adicionarMusica(Musica musica) {
        musicas.add(musica);
    }

    public Iterator<Musica> criarIterator() {
        return new PlaylistIterator(musicas);
    }
}
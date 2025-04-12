package iterator.example1;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.adicionarMusica(new Musica("Imagine", "John Lennon"));
        playlist.adicionarMusica(new Musica("Bohemian Rhapsody", "Queen"));
        playlist.adicionarMusica(new Musica("Hotel California", "Eagles"));

        Iterator<Musica> iterator = playlist.criarIterator();

        System.out.println("Tocando playlist:");
        while (iterator.hasNext()) {
            Musica musica = iterator.next();
            System.out.println("▶️ " + musica);
        }
    }
}

package memento.example2;

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador();
        Checkpoint checkpoint = new Checkpoint();

        jogador.lutar();
        checkpoint.salvar(jogador.salvarProgresso());

        jogador.lutar(); // nova luta, pode perder vida
        jogador.lutar(); // mais uma luta

        System.out.println("Algo deu errado... restaurando progresso!");
        jogador.restaurarProgresso(checkpoint.restaurar());

        jogador.status();
    }
}
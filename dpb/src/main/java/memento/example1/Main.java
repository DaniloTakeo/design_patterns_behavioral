package memento.example1;

public class Main {
    public static void main(String[] args) {
        Texto texto = new Texto();
        HistoricoTexto historico = new HistoricoTexto();

        texto.escrever("Olá, ");
        historico.salvar(texto);

        texto.escrever("mundo!");
        historico.salvar(texto);

        texto.escrever(" Isso será desfeito.");
        System.out.println("Atual: " + texto.getConteudo());

        historico.desfazer(texto);
        System.out.println("Desfazer 1: " + texto.getConteudo());

        historico.desfazer(texto);
        System.out.println("Desfazer 2: " + texto.getConteudo());
    }
}
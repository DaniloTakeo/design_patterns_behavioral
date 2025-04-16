package observer.example1;

public class Main {
    public static void main(String[] args) {
        CanalDeNoticias canal = new CanalDeNoticias();

        Assinante joao = new Assinante("João");
        Assinante maria = new Assinante("Maria");

        canal.adicionar(joao);
        canal.adicionar(maria);

        canal.novaNoticia("Nova vacina é aprovada pela Anvisa");
        canal.novaNoticia("Chuva forte atinge o sul do país");

        canal.remover(joao);

        canal.novaNoticia("Taxa de juros sofre nova redução");
    }
}
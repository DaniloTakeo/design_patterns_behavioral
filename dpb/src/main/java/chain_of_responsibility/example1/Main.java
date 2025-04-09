package chain_of_responsibility.example1;

public class Main {
    public static void main(String[] args) {
        Manipulador nivel1 = new SuporteNivel1();
        Manipulador nivel2 = new SuporteNivel2();
        Manipulador nivel3 = new SuporteNivel3();

        nivel1.setProximo(nivel2);
        nivel2.setProximo(nivel3);

        RequisicaoSuporte r1 = new RequisicaoSuporte("Não consigo logar", 1);
        RequisicaoSuporte r2 = new RequisicaoSuporte("Erro ao carregar sistema", 2);
        RequisicaoSuporte r3 = new RequisicaoSuporte("Falha no servidor", 3);
        RequisicaoSuporte r4 = new RequisicaoSuporte("Pedido muito fora do escopo", 99);

        nivel1.tratar(r1);
        nivel1.tratar(r2);
        nivel1.tratar(r3);
        nivel1.tratar(r4);
    }
}
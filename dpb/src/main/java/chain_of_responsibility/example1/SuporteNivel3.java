package chain_of_responsibility.example1;

public class SuporteNivel3 extends Manipulador {
    @Override
    public void tratar(RequisicaoSuporte requisicao) {
        if (requisicao.getNivel() == 3) {
            System.out.println("Suporte Nível 3 resolveu: " + requisicao.getDescricao());
        } else {
            System.out.println("Requisição não pôde ser resolvida: " + requisicao.getDescricao());
        }
    }
}
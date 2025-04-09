package chain_of_responsibility.example1;

public class SuporteNivel2 extends Manipulador {
    @Override
    public void tratar(RequisicaoSuporte requisicao) {
        if (requisicao.getNivel() == 2) {
            System.out.println("Suporte Nível 2 resolveu: " + requisicao.getDescricao());
        } else if (proximo != null) {
            proximo.tratar(requisicao);
        }
    }
}
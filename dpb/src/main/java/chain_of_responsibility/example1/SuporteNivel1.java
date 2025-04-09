package chain_of_responsibility.example1;

public class SuporteNivel1 extends Manipulador {
    @Override
    public void tratar(RequisicaoSuporte requisicao) {
        if (requisicao.getNivel() == 1) {
            System.out.println("Suporte Nível 1 resolveu: " + requisicao.getDescricao());
        } else if (proximo != null) {
            proximo.tratar(requisicao);
        }
    }
}
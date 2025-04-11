package interpreter.example2;

public class ExpressaoPermissao implements Expressao {
    private String permissao;

    public ExpressaoPermissao(String permissao) {
        this.permissao = permissao.toLowerCase();
    }

    @Override
    public boolean interpretar(Contexto contexto) {
        return contexto.temPermissao(permissao);
    }
}
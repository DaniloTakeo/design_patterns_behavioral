package interpreter.example2;

import java.util.Set;

public class Contexto {
    private Set<String> permissoes;

    public Contexto(Set<String> permissoes) {
        this.permissoes = permissoes;
    }

    public boolean temPermissao(String permissao) {
        return permissoes.contains(permissao.toLowerCase());
    }
}
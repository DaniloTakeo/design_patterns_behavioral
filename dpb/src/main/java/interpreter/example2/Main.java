package interpreter.example2;

import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(Set.of("usuario", "ativo"));

        // usuario AND ativo
        Expressao regra = new ExpressaoAND(
            new ExpressaoPermissao("usuario"),
            new ExpressaoPermissao("ativo")
        );

        System.out.println("Pode acessar? " + regra.interpretar(contexto)); // true

        // admin OR gerente
        Expressao outraRegra = new ExpressaoOR(
            new ExpressaoPermissao("admin"),
            new ExpressaoPermissao("gerente")
        );

        System.out.println("Pode acessar? " + outraRegra.interpretar(contexto)); // false
    }
}

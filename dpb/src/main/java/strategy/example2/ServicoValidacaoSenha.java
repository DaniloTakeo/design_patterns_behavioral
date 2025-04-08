package strategy.example2;

public class ServicoValidacaoSenha {
    private ValidadorSenha validador;

    public void setValidador(ValidadorSenha validador) {
        this.validador = validador;
    }

    public boolean validar(String senha) {
        if (validador == null) {
            throw new IllegalStateException("Nenhum validador definido.");
        }
        return validador.validar(senha);
    }
}
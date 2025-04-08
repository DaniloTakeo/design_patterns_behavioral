package strategy.example2;

public class ValidadorComprimentoMinimo implements ValidadorSenha {
    private int minimo;

    public ValidadorComprimentoMinimo(int minimo) {
        this.minimo = minimo;
    }

    @Override
    public boolean validar(String senha) {
        return senha != null && senha.length() >= minimo;
    }
}
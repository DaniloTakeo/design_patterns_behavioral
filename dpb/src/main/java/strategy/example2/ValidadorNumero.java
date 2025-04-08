package strategy.example2;

public class ValidadorNumero implements ValidadorSenha {
    @Override
    public boolean validar(String senha) {
        return senha != null && senha.matches(".*\\d.*");
    }
}
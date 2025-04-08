package strategy.example2;

public class ValidadorEspecial implements ValidadorSenha {
    @Override
    public boolean validar(String senha) {
        return senha != null && senha.matches(".*[!@#$%^&*()].*");
    }
}
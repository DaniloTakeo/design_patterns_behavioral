package chain_of_responsibility.example2;

public class ValidadorSenha extends Validador {
    @Override
    public boolean validar(Usuario usuario) {
        if (usuario.getSenha() == null || usuario.getSenha().length() < 6) {
            System.out.println("Senha muito curta. Mínimo de 6 caracteres.");
            return false;
        }
        return proximo == null || proximo.validar(usuario);
    }
}
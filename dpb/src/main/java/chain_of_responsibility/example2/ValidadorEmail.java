package chain_of_responsibility.example2;

public class ValidadorEmail extends Validador {
    @Override
    public boolean validar(Usuario usuario) {
        if (usuario.getEmail() == null || !usuario.getEmail().matches(".+@.+\\..+")) {
            System.out.println("E-mail inválido.");
            return false;
        }
        return proximo == null || proximo.validar(usuario);
    }
}
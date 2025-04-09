package chain_of_responsibility.example2;

public class ValidadorNome extends Validador {
    @Override
    public boolean validar(Usuario usuario) {
        if (usuario.getNome() == null || usuario.getNome().trim().isEmpty()) {
            System.out.println("Nome inválido.");
            return false;
        }
        return proximo == null || proximo.validar(usuario);
    }
}
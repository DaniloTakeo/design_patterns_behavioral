package chain_of_responsibility.example2;

public class ServicoCadastroUsuario {
    private final Validador validadorInicial;

    public ServicoCadastroUsuario() {
        validadorInicial = new ValidadorNome();
        validadorInicial.linkar(new ValidadorEmail())
                        .linkar(new ValidadorSenha());
    }

    public void cadastrar(Usuario usuario) {
        System.out.println("\nValidando cadastro de: " + usuario.getNome());
        if (validadorInicial.validar(usuario)) {
            System.out.println("Usuário cadastrado com sucesso!");
        } else {
            System.out.println("Falha no cadastro.");
        }
    }
}

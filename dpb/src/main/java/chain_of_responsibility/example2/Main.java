package chain_of_responsibility.example2;

public class Main {
    public static void main(String[] args) {
        ServicoCadastroUsuario servico = new ServicoCadastroUsuario();

        Usuario valido = new Usuario("João", "joao@email.com", "senha123");
        Usuario semNome = new Usuario("", "joao@email.com", "senha123");
        Usuario emailInvalido = new Usuario("João", "joaoemail.com", "senha123");
        Usuario senhaCurta = new Usuario("João", "joao@email.com", "123");

        servico.cadastrar(valido);
        servico.cadastrar(semNome);
        servico.cadastrar(emailInvalido);
        servico.cadastrar(senhaCurta);
    }
}
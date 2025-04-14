package mediator.example1;

public interface ChatMediator {
    void enviarMensagem(String mensagem, Usuario usuario);
    void adicionarUsuario(Usuario usuario);
}
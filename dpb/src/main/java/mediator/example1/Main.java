package mediator.example1;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        Usuario u1 = new UsuarioImpl(mediator, "Alice");
        Usuario u2 = new UsuarioImpl(mediator, "Bob");
        Usuario u3 = new UsuarioImpl(mediator, "Carlos");

        mediator.adicionarUsuario(u1);
        mediator.adicionarUsuario(u2);
        mediator.adicionarUsuario(u3);

        u1.enviar("Olá, equipe!");
    }
}
package mediator.example1;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<Usuario> usuarios = new ArrayList<>();

    @Override
    public void enviarMensagem(String mensagem, Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u != usuario) {
                u.receber(mensagem);
            }
        }
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }
}
package mediator.example1;

public class UsuarioImpl extends Usuario {

    public UsuarioImpl(ChatMediator mediator, String nome) {
        super(mediator, nome);
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println(this.nome + " enviando: " + mensagem);
        mediator.enviarMensagem(mensagem, this);
    }

    @Override
    public void receber(String mensagem) {
        System.out.println(this.nome + " recebeu: " + mensagem);
    }
}
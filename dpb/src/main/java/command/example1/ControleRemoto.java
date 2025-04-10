package command.example1;

public class ControleRemoto {
    private Comando[] botoes;

    public ControleRemoto(int numBotoes) {
        botoes = new Comando[numBotoes];
    }

    public void configurarComando(int botao, Comando comando) {
        botoes[botao] = comando;
    }

    public void pressionarBotao(int botao) {
        if (botoes[botao] != null) {
            botoes[botao].executar();
        } else {
            System.out.println("Nenhum comando configurado para esse botão.");
        }
    }
}
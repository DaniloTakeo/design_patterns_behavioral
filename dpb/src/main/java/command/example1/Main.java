package command.example1;

public class Main {
	public static void main(String[] args) {
        Luz luz = new Luz();
        TV tv = new TV();
        Ventilador ventilador = new Ventilador();

        ControleRemoto controle = new ControleRemoto(6);

        controle.configurarComando(0, new ComandoLigar<Luz>(luz));
        controle.configurarComando(1, new ComandoDesligar<Luz>(luz));
        controle.configurarComando(2, new ComandoLigar<TV>(tv));
        controle.configurarComando(3, new ComandoDesligar<TV>(tv));
        controle.configurarComando(4, new ComandoLigar<Ventilador>(ventilador));
        controle.configurarComando(5, new ComandoDesligar<Ventilador>(ventilador));

        controle.pressionarBotao(0); // Ligar luz
        controle.pressionarBotao(2); // Ligar TV
        controle.pressionarBotao(4); // Ligar ventilador
        controle.pressionarBotao(1); // Desligar luz
        controle.pressionarBotao(3); // Desligar TV
        controle.pressionarBotao(5); // Desligar ventilador
    }
}
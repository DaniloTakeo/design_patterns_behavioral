package command.example1;

public class Ventilador extends Comandavel {

	@Override
	public void ligar() {
		 System.out.println("Ventilador ligado.");
	}

	@Override
	public void desligar() {
		 System.out.println("Ventilador desligado.");
	}

}

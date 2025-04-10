package command.example1;

public class Luz extends Comandavel {
    
	@Override
	public void ligar() {
        System.out.println("Luz ligada.");
    }

	@Override
	public void desligar() {
        System.out.println("Luz desligada.");
    }
}
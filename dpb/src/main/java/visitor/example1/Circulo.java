package visitor.example1;


public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public void aceitar(Visitor visitor) {
        visitor.visitar(this);
    }
}
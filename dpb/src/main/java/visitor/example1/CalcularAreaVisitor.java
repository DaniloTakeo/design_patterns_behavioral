package visitor.example1;

public class CalcularAreaVisitor implements Visitor {

    @Override
    public void visitar(Circulo circulo) {
        double area = Math.PI * Math.pow(circulo.getRaio(), 2);
        System.out.printf("Área do círculo: %.2f\n", area);
    }

    @Override
    public void visitar(Retangulo retangulo) {
        double area = retangulo.getLargura() * retangulo.getAltura();
        System.out.printf("Área do retângulo: %.2f\n", area);
    }
}
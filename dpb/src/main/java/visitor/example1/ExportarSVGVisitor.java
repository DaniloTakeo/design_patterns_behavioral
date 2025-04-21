package visitor.example1;

public class ExportarSVGVisitor implements Visitor {

    @Override
    public void visitar(Circulo circulo) {
        System.out.println("<circle r=\"" + circulo.getRaio() + "\" />");
    }

    @Override
    public void visitar(Retangulo retangulo) {
        System.out.println("<rect width=\"" + retangulo.getLargura() + 
                           "\" height=\"" + retangulo.getAltura() + "\" />");
    }
}

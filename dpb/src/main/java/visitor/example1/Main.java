package visitor.example1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Forma> formas = List.of(
            new Circulo(5),
            new Retangulo(4, 3)
        );

        Visitor exportarVisitor = new ExportarSVGVisitor();
        Visitor areaVisitor = new CalcularAreaVisitor();

        System.out.println("Exportando SVG:");
        formas.forEach(f -> f.aceitar(exportarVisitor));

        System.out.println("\nCalculando Áreas:");
        formas.forEach(f -> f.aceitar(areaVisitor));
    }
}
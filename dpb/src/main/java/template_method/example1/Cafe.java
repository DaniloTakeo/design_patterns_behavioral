package template_method.example1;

public class Cafe extends Bebida {

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando café à xícara...");
    }
}
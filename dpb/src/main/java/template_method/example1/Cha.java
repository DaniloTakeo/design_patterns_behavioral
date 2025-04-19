package template_method.example1;

public class Cha extends Bebida {

    @Override
    protected void adicionarIngredientes() {
        System.out.println("Adicionando chá à xícara...");
    }
}
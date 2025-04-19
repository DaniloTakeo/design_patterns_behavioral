package template_method.example1;

public abstract class Bebida {
    
    // Método template
    public final void preparar() {
        ferverAgua();
        adicionarIngredientes();
        despejarNaXicara();
        System.out.println("Bebida pronta!");
    }

    private void ferverAgua() {
        System.out.println("Aquecendo a água...");
    }

    protected abstract void adicionarIngredientes();

    private void despejarNaXicara() {
        System.out.println("Despejando na xícara...");
    }
}
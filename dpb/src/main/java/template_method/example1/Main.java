package template_method.example1;

public class Main {
    public static void main(String[] args) {
        Bebida cha = new Cha();
        cha.preparar();

        System.out.println("\n");

        Bebida cafe = new Cafe();
        cafe.preparar();
    }
}
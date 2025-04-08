package strategy.example1;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.setOperacao(new Soma());
        System.out.println("Soma: " + calculadora.calcular(10, 5));

        calculadora.setOperacao(new Subtracao());
        System.out.println("Subtração: " + calculadora.calcular(10, 5));

        calculadora.setOperacao(new Multiplicacao());
        System.out.println("Multiplicação: " + calculadora.calcular(10, 5));
    }
}
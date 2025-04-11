package interpreter.example1;

public class Main {
    public static void main(String[] args) {
        // Representa: (5 + 3) - (2 + 1)
        Expressao expressao = new Subtracao(
            new Soma(new Numero(5), new Numero(3)),
            new Soma(new Numero(2), new Numero(1))
        );

        int resultado = expressao.interpretar();
        System.out.println("Resultado: " + resultado); // Resultado: 5
    }
}
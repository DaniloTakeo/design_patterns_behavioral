package memento.example2;

public class Progresso {
    private final int vida;
    private final int experiencia;

    public Progresso(int vida, int experiencia) {
        this.vida = vida;
        this.experiencia = experiencia;
    }

    public int getVida() {
        return vida;
    }

    public int getExperiencia() {
        return experiencia;
    }
}
package memento.example2;

public class Jogador {
    private int vida = 100;
    private int experiencia = 0;

    public void lutar() {
        experiencia += 10;
        vida -= 20;
        System.out.println("Lutou! Vida: " + vida + ", XP: " + experiencia);
    }

    public Progresso salvarProgresso() {
        System.out.println("Salvando progresso...");
        return new Progresso(vida, experiencia);
    }

    public void restaurarProgresso(Progresso progresso) {
        this.vida = progresso.getVida();
        this.experiencia = progresso.getExperiencia();
        System.out.println("Progresso restaurado! Vida: " + vida + ", XP: " + experiencia);
    }

    public void status() {
        System.out.println("Status atual -> Vida: " + vida + ", XP: " + experiencia);
    }
}
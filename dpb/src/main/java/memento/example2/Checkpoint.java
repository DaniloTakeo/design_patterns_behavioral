package memento.example2;

public class Checkpoint {
    private Progresso progressoSalvo;

    public void salvar(Progresso progresso) {
        this.progressoSalvo = progresso;
    }

    public Progresso restaurar() {
        return progressoSalvo;
    }
}
package chain_of_responsibility.example1;

public class RequisicaoSuporte {
    private String descricao;
    private int nivel; // 1 = simples, 2 = técnico, 3 = crítico

    public RequisicaoSuporte(String descricao, int nivel) {
        this.descricao = descricao;
        this.nivel = nivel;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getNivel() {
        return nivel;
    }
}
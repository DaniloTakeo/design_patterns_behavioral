package template_method.example2;

public class RelatorioFinanceiro extends Relatorio {

    @Override
    protected void adicionarCabecalho() {
        System.out.println("Cabeçalho: Relatório Financeiro - 2025");
    }

    @Override
    protected void adicionarCorpo() {
        System.out.println("Corpo: Análise financeira do mês de março de 2025.");
    }

    @Override
    protected void adicionarRodape() {
        System.out.println("Rodapé: Confidencial - Somente para uso interno.");
    }
}
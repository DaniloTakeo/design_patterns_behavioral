package template_method.example2;

public class RelatorioVendas extends Relatorio {

    @Override
    protected void adicionarCabecalho() {
        System.out.println("Cabeçalho: Relatório de Vendas - Março 2025");
    }

    @Override
    protected void adicionarCorpo() {
        System.out.println("Corpo: Relatório de vendas por região e produto.");
    }

    @Override
    protected void adicionarRodape() {
        System.out.println("Rodapé: Dados extraídos do sistema de CRM.");
    }
}
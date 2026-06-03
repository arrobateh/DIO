package br.com.teh.heranca_poliformismo.ex_02;

import java.util.List;

public non-sealed class Gerente extends Funcionario {

    public Gerente() {}

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    public boolean getPerfilAdmin() {
        return true;
    }

    // Método para gerar relatório financeiro
   public void gerarRelatorio(Funcionario funcionarios) {
         if (funcionarios instanceof Atendente atendente) {
              System.out.println("Relatório Financeiro do Atendente: " + atendente.getNome());
              System.out.println("Valor em caixa: R$ " + atendente.getValorCaixa());
         } else if (funcionarios instanceof Vendedor vendedor) {
              System.out.println("Relatório Financeiro do Vendedor: " + vendedor.getNome());
              List<Venda> vendas = vendedor.getHistoricoVendas();
              int totalVendas = 0;
              double totalVendido = 0;
              for (Venda venda : vendas) {
                totalVendas += vendedor.getQtdVendas();
                totalVendido += venda.getValorVenda();

              }
              System.out.println("Total de vendas realizadas: R$ " + totalVendas);
              System.out.println("Valor total das vendas: R$ " + totalVendido);
         } else {
              System.out.println("Funcionário não encontrado para gerar relatório financeiro.");
         }
   }

   // Método para consultar as vendas
    public void consultarVendas(Vendedor vendedor) {
        List<Venda> vendas = vendedor.getHistoricoVendas();
        System.out.println("===== HISTÓRICO DE VENDAS DO VENDEDOR: " + vendedor.getNome() + " =====");
        for (Venda venda : vendas) {
            System.out.println("Cliente: " + venda.getCliente().getNome());
            System.out.println("Produtos vendidos: ");
            for (Produtos produto : venda.getProdutos()) {
                System.out.println("- " + produto.getNome());
            }
            System.out.println("-----------------------------");
        }
    }

}

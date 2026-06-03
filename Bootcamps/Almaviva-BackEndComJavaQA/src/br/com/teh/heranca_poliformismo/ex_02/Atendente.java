package br.com.teh.heranca_poliformismo.ex_02;

import java.util.List;

public non-sealed class Atendente extends Funcionario{

    private double valorCaixa;

    public Atendente (){}

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.valorCaixa = 0;

    }

    public double getValorCaixa() {
        return valorCaixa;
    }

    public void setValorCaixa(double valorCaixa) {
        this.valorCaixa = valorCaixa;
    }

    // Método para receber um pagamento e atualizar o valor em caixa
    public void receberPagamento (Funcionario f) {
        Venda venda = new Venda();
        double valorCarrinho = 0;
        if (f instanceof Vendedor vendedor) {
            List<Venda> vendas = vendedor.getHistoricoVendas();
            if (!vendas.isEmpty()) {
                Venda ultimaVenda = vendas.get(vendas.size() - 1);
                valorCarrinho = ultimaVenda.getValorVenda();
                this.valorCaixa += valorCarrinho;
                System.out.println("Pagamento recebido no valor de R$ " + valorCarrinho + " para o atendente: " + this.getNome());
            } else {
                System.out.println("Nenhuma venda encontrada para o vendedor: " + vendedor.getNome());
            }
        }
    }
}

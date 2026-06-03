package br.com.teh.heranca_poliformismo.ex_02;

import java.util.ArrayList;
import java.util.List;

public non-sealed class Vendedor extends Funcionario {

    private int qtdVendas;

    private List<Venda> historicoVendas;

    public Vendedor() {}

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.historicoVendas = new ArrayList<>();
    }

    public boolean getPerfilVendedor() {
        return false;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    // Método para realizar uma venda
    public void realizarVenda (Cliente c, List<Produtos> p) {
        Venda novaVenda = new Venda(this.getNome(), c, p);
        this.historicoVendas.add(novaVenda);
        qtdVendas++;
        System.out.println("Venda realizada com sucesso por " + this.getNome() + " para o cliente: " + c.getNome());
        System.out.println("Produtos vendidos: ");
        for (Produtos produto : p) {
            System.out.println("- " + produto.getNome() + ": R$ " + produto.getPreco());
        }
        System.out.println("Valor total da venda: R$ " + novaVenda.getValorVenda());
        System.out.println("-----------------------------");
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

    public List<Venda> getHistoricoVendas() {
        return historicoVendas;
    }


}

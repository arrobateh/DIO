package br.com.teh.heranca_poliformismo.ex_02;

import java.util.List;

public class Venda {

    private String nomeVendedor;

    private Cliente cliente;

    private List<Produtos> produtos;

    private double valorVenda;

    public Venda () {}

    public Venda(String nomeVendedor, Cliente cliente, List<Produtos> produtos) {
        this.nomeVendedor = nomeVendedor;
        this.cliente = cliente;
        this.produtos = produtos;
        this.valorVenda = calcularValorVenda();
    }

    private double calcularValorVenda() {
        return produtos.stream().mapToDouble(Produtos::getPreco).sum();
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }
}

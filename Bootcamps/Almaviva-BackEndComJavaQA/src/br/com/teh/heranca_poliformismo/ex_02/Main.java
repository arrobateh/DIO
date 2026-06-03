package br.com.teh.heranca_poliformismo.ex_02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Kratos", "kratos@gmail.com", "123");
        Vendedor vendedor = new Vendedor("Atreus", "atreus@email.com", "123");
        Atendente atendente = new Atendente("Sindri", "sindri@email.com", "1232");
        Cliente cliente = new Cliente("João", "1234567");
        Cliente cliente2 = new Cliente("Luigi", "1234567");

        List<Produtos> carrinho = new ArrayList<>();
        carrinho.add(new Produtos("Teclado", 100));
        carrinho.add(new Produtos("Monitor", 100));
        carrinho.add(new Produtos("Mouse", 100));

        vendedor.realizarVenda(cliente, carrinho);
        atendente.receberPagamento(vendedor);

        gerente.gerarRelatorio(atendente);



//        atendente.receberPagamento(atendente, 1500.00);

    }
}

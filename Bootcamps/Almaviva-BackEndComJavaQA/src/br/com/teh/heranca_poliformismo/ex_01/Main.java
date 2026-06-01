package br.com.teh.heranca_poliformismo.ex_01;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        MeiaEntrada meiaEntrada = new MeiaEntrada();
        IngressoFamilia ingressoFamilia = new IngressoFamilia();

        ingresso.setNomeFilme("Vingadores: Ultimato");
        ingresso.setIdiomaFilme("Português");
        ingresso.setValor(20.0);
        meiaEntrada.setValor(ingresso.getValor());
        ingressoFamilia.setNumeroPessoa(4);
        ingressoFamilia.setValor(ingresso.getValor());

        System.out.println("Titulo do filme: " + ingresso.getNomeFilme());
        System.out.println("Idioma do filme: " + ingresso.getIdiomaFilme());
        System.out.println("Valor do ingresso: " + ingresso.getValor());
        System.out.println("Valor da Meia Entrada: " + meiaEntrada.getValorMeia());
        System.out.println("Valor do Ingresso Familia para " + ingressoFamilia.getNumeroPessoa()  + " pessoas: " +  ingressoFamilia.getValorIngressoFamilia());
    }
}

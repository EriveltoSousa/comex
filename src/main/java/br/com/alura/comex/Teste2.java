package br.com.alura.comex;

public class Teste2 {
    public static void main(String[] args) {
        Produto produtoA = new Produto();
        produtoA.nome = "celular";
        produtoA.Descricao = "celular novo";
        produtoA.quantidade = 10;
        produtoA.precoUnitario = 1000;

        Produto produtoB = new Produto();
        produtoB.nome = "celular";
        produtoB.Descricao = "celular novo";
        produtoB.quantidade = 10;
        produtoB.precoUnitario = 1000;

        System.out.println(produtoA);
        System.out.println(produtoB);

        System.out.println(produtoA == produtoB);




    }
}

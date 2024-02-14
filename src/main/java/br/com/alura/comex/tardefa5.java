package br.com.alura.comex;

public class tardefa5 {
    public static void main(String[] args) {

        Produto produtoA = new Produto();
        produtoA.nome = "Senhor dos Aneis";
        produtoA.Descricao = "As Duas Torres";
        produtoA.precoUnitario = 49.50;
        produtoA.quantidade = 30;

        System.out.println(produtoA.nome);

        Produto produtoB = new Produto();
        produtoB.nome = "Senhor dos Aneis";
        produtoB.Descricao = "As Duas Torres";
        produtoB.precoUnitario = 49.50;
        produtoB.quantidade = 30;

        System.out.println(produtoA == produtoB);;


    }
}

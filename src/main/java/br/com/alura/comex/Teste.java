package br.com.alura.comex;

public class Teste {
    public static void main(String[] args) {
        int valor = 20;
        Produto celular = new Produto();
        celular.nome = "Iphone 15";
        celular.Descricao = "celular muito caro";
        celular.precoUnitario = 6000.00;
        celular.quantidade = 500;

        System.out.println(celular.nome);
        System.out.println(celular.Descricao);
        System.out.println(celular.precoUnitario);
        System.out.println(celular.quantidade);



    }


}

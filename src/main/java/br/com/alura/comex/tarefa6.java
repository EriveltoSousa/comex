package br.com.alura.comex;

public class tarefa6 {
    public static void main(String[] args) {

                cliente cliente = new cliente();
        cliente.cpf = "123.123.123.12";
        cliente.nome= "Erivelto";
        cliente.telefone = "912334567";
        cliente.endereco = "av paulista";

        System.out.println(cliente.nome);
        System.out.println(cliente.cpf);
        System.out.println(cliente.telefone);
        System.out.println(cliente.endereco);



    }

}

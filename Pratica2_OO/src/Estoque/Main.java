package Estoque;

public class Main {
    public static void main(String[] args) {

        Estoque novoEstoque = new Estoque("Macarrão", 50, 10);

        System.out.println(novoEstoque.mostrar());

        novoEstoque.darBaixa(10);

        System.out.println("Venda de 10 unidades");

        System.out.println(novoEstoque.mostrar());

        novoEstoque.darBaixa(20);

        System.out.println("Venda de 20 unidades");

        System.out.println(novoEstoque.mostrar());

        System.out.println("Precisa atualizar o estoque " +novoEstoque.precisaRepor());

        novoEstoque.darBaixa(15);

        System.out.println("Venda de 15 unidades");

        System.out.println(novoEstoque.mostrar());

        System.out.println("Precisa atualizar o estoque: " +novoEstoque.precisaRepor());

        novoEstoque.darEntrada(100);

        System.out.println("Entrada de 100 unidades");

        System.out.println("Precisa atualizar o estoque: " +novoEstoque.precisaRepor());


        System.out.println(novoEstoque.mostrar());

        novoEstoque.darBaixa(10);

        System.out.println("Venda de 10 unidades");

        System.out.println(novoEstoque.mostrar());



    }
}
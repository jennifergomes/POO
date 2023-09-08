package concessionaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Carro novoCarro = new Carro("Vermelho", "Polo", "ABC123", "WV", 2008 );
        novoCarro.atribuirPlaca("ABCD1234");
        Cliente novoCliente = new Cliente("João", "045450025589" , "15", "M");
        Transacao novaTransacao = new Transacao(1, "25/05/2023", 125.50, novoCarro, novoCliente);

        System.out.println(novoCarro.obterCor() + " " +  novoCarro.obterAno() + " " + novoCarro.obterMarca()+ " " + novoCarro.obterModelo() + " " + novoCarro.obterPlaca());

    }

}
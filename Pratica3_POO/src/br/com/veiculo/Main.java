package br.com.veiculo;

public class Main {
    public static void main(String[] args) {

        Caminhao c1 = new Caminhao("jkh123", 2015, 6);

        Onibus o1 = new Onibus("uio123", 2010, 60);

        System.out.println(c1.exibirDados());

        System.out.println(o1.exibirDados());

    }
}


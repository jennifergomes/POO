package br.com.carnaval;

public class Main {
    public static void main(String[] args) {


        Ingresso i1 = new Normal(1500);

        Normal n1 = new Normal(100);

        Vip v1 = new Vip(100, 100);

        Camarote c1 = new Camarote(100, 200, "FrontStage");

        n1.imprimeIngresso();

        v1.imprimeIngresso();

        c1.imprimeIngresso();


    }
}

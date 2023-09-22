package br.com.carnaval;

public class Vip extends Ingresso{

    private double valorAdicional;

    public Vip(double Ingresso, double valorAdicional) {
        super(Ingresso);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public void imprimeIngresso (){
        System.out.println("Ingresso Vip: " +(getIngresso() + getValorAdicional()));
    }


}

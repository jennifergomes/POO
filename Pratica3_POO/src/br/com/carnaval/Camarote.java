package br.com.carnaval;

public class Camarote extends Ingresso{

    private double valorAdicional;
    private String localizacao;

    public Camarote(double ingresso, double valorAdicional, String localizacao) {
        super(ingresso);
        this.valorAdicional = valorAdicional;
        this.localizacao = localizacao;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimeIngresso (){
        System.out.println("Ingresso Camarote: " +(getIngresso() + getValorAdicional()) + "\nLocalização Camarote: " +getLocalizacao());
    }
}

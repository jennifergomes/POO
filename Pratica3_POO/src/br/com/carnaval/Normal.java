package br.com.carnaval;

public class Normal extends Ingresso{

    public Normal (double Ingresso){
        super (Ingresso);
    }

    public void imprimeIngresso (){
        System.out.println("Ingresso normal: " +getIngresso());
    }

}

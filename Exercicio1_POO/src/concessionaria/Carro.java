package concessionaria;

public class Carro {

    private String cor, modelo, placa, marca;
    private int ano;

    public Carro(String cor, String modelo, String placa, String marca, int ano) {
        this.cor = cor;
        this.modelo = modelo;
        this.placa = placa;
        this.marca = marca;
        this.ano = ano;
    }

    public String obterPlaca (){
        return this.placa;
    }
    public String obterCor (){
        return this.cor;
    }

    public String obterModelo (){
        return this.modelo;
    }

    public String obterMarca (){
        return this.marca;
    }

    public int obterAno(){
        return this.ano;
    }


    public void atribuirPlaca (String placa){
        this.placa = placa;
    }

}

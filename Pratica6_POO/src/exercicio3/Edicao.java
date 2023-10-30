package exercicio3;

import exercicio2.Funcionario;

import java.util.ArrayList;

public class Edicao {

    private int numero, volume, tiragem;
    private String dataEdicao;

    private ArrayList<Artigo> artigos;

    public Edicao(int numero, int volume, int tiragem, String dataEdicao) {
        this.numero = numero;
        this.volume = volume;
        this.tiragem = tiragem;
        this.dataEdicao = dataEdicao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTiragem() {
        return tiragem;
    }

    public void setTiragem(int tiragem) {
        this.tiragem = tiragem;
    }

    public String getDataEdicao() {
        return dataEdicao;
    }

    public void setDataEdicao(String dataEdicao) {
        this.dataEdicao = dataEdicao;
    }

    public void cadastrarVariosArtigos(ArrayList<Artigo> listaDeArtigos) {

        for (Artigo item : listaDeArtigos) {

           this.artigos.add(item);
        }
    }
}

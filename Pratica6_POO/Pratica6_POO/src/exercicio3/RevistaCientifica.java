package exercicio3;

import java.util.ArrayList;

public class RevistaCientifica {

    private String titulo, peridiocidade;
    private long issn;

    private ArrayList<Edicao> edicoes;


    public RevistaCientifica(String titulo, String peridiocidade, long issn) {
        this.titulo = titulo;
        this.peridiocidade = peridiocidade;
        this.issn = issn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPeridiocidade() {
        return peridiocidade;
    }

    public void setPeridiocidade(String peridiocidade) {
        this.peridiocidade = peridiocidade;
    }

    public long getIssn() {
        return issn;
    }

    public void setIssn(long issn) {
        this.issn = issn;
    }


    public void adicionarEdicao(Edicao edicao) {

        this.edicoes.add(edicao);
    }
}

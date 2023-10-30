package exercicio3;

import exercicio2.Funcionario;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Artigo> artigo = new ArrayList<>();

        Artigo a1 = new Artigo("A", "agag", "Jennifer");
        Artigo a2 = new Artigo("B", "afesd", "João");
        Artigo a3 = new Artigo("C", "fsds", "Joyce");
        Artigo a4 = new Artigo("D", "fesf", "Ana");
        Artigo a5 = new Artigo("E", "efsg", "Leo");
        Artigo a6 = new Artigo("F", "rgs", "Davi");
        Artigo a7 = new Artigo("G", "ghfd", "Bento");
        Artigo a8 = new Artigo("H", "grgbds", "Apolo");
        Artigo a9 = new Artigo("I", "grsgsre", "Feijão");
        Artigo a10 = new Artigo("J", "gdgrde", "Luisa");


        artigo.add(a1);
        artigo.add(a2);
        artigo.add(a3);
        artigo.add(a4);
        artigo.add(a5);
        artigo.add(a6);
        artigo.add(a7);
        artigo.add(a8);
        artigo.add(a9);
        artigo.add(a10);

        Edicao e1 = new Edicao(1, 10, 1, "Hoje");

        e1.cadastrarVariosArtigos(artigo);

        RevistaCientifica r1 = new RevistaCientifica("ABC", "3 anos",12354);

        r1.adicionarEdicao(e1);




    }
}

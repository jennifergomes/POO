package Estoque;

public class Estoque {

    private String nome;
    private int qtdAtual, qtdMinima;

    public Estoque() {
    }


    public Estoque(String nome, int qtdAtual, int qtdMinima) {

        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return this.qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }


    public int getQtdMinima() {
        return this.qtdMinima;
    }


    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void darBaixa(int qtde) {

        int qtdAtual = this.getQtdAtual();
        int qtdAtualizada = qtdAtual - qtde;

        /* if(!(qtdAtualizada < 0)){
             this.setQtdAtual(qtdAtualizada);
         }*/

        if (qtdAtualizada >= 0) {
            this.setQtdAtual(qtdAtualizada);
        }

        //this.qtdAtual = this.qtdAtual - qtde;

    }

    public String mostrar() {

        String nome = this.getNome();
        int qtdAtual = this.getQtdAtual();
        int qtdMinima = this.getQtdMinima();

        String mensagem = "Nome do produto: " +nome + ", quantidade mínima: " +qtdMinima + ", quantidade atual: " +qtdAtual +"." ;

        //String mensagemPreguicosa = "Nome do produto: " +this.getNome() + ", quantidade mínima: " +this.getQtdMinima() + ", quantidade atual: " +this.getQtdAtual() +"." ;

        return mensagem;

    }

    public boolean precisaRepor() {
        /*if(this.getQtdAtual() <= this.getQtdMinima()){
            return true;
        } else return false;*/

        /*boolean precisaAtualizar = this.getQtdAtual() <= this.getQtdMinima();

       /* if(this.getQtdAtual() <= this.getQtdMinima()){
            precisaAtualizar = true;
        } else precisaAtualizar = false;


        return precisaAtualizar;*/


        return this.getQtdAtual() <= this.getQtdMinima();
    }

    public void darEntrada(int qtd){

        int qtdAtual = this.getQtdAtual();
        int qtdAtualizada = qtdAtual + qtd;

        this.setQtdAtual(qtdAtualizada);

    }


}

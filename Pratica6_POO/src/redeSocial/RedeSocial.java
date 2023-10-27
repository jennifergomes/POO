package redeSocial;
import java.util.ArrayList;

public class RedeSocial {

    private String dataCriacao, nomeUsuario, dataNascimento, senha;

    ArrayList<Publicacao> publicacoes = new ArrayList<> ();

    public RedeSocial(String dataCriacao, String nomeUsuario, String dataNascimento, String senha) {
        this.dataCriacao = dataCriacao;
        this.nomeUsuario = nomeUsuario;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
    }

    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void inserePublicacao(Publicacao publi){
        this.publicacoes.add(publi);
    }

    public void imprimePublicacoes(){

        int totalPublicacoes = this.publicacoes.size();

        System.out.println("Total de publicações: " +totalPublicacoes);

        for(Publicacao publi : this.publicacoes) {

            System.out.println("Texto: " +publi.getTextoPublicacao() + " Data: " +publi.getDataPublicacao());

        }

    }
}

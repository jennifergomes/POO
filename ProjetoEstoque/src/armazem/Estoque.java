package armazem;

public class Estoque {
    private  int id;
    private String  produto;
    private int estoque;
    private double preco;

    public Estoque(int id, String produto, int estoque, double preco){
        this.id = id;
        this.produto = produto;
        this.estoque = estoque;
        this.preco = preco;
    }
    // atalho para o construtor = alt + insert
    // o construtor tem obrigatoriamente o nome da classe, é público e serve para inicialiazar as variáveis.
    // o this serve para referenciar o atributo. O primeiro nome faz referência ao atributo e depois do = faz referência a variável.

    public void Acrescimo(int qtde){

        estoque += qtde;
        //estoque  = estoque + qtde;   poderia ser assim também, mas o ideal é a forma acima.

    }
    public void Baixa(int qtde){
        if (qtde <= estoque)
            estoque =estoque - qtde;
    }

    public double TotalEstoque(){
        return estoque * preco;

    }

    public String ConsultaEstoque(){
        return "Produto: "+produto+ "\nEstoque: " +estoque+ "\nPreço: " +preco;
    }
}

//É uma boa prática não ter print na classe. Fica no Main.
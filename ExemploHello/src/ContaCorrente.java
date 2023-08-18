public class ContaCorrente {

    private long numero;
    private String nome;
    private int agencia;
    private double saldo;

    public void cadastrar(long num, String nomePessoa, int ag){

        numero = num;
        nome = nomePessoa;
        agencia = ag;
        saldo = 0;

    }

    public void depositar(double valor){
        saldo = saldo + valor;

        //poderia ser saldo += valor; Essa é a melhor opção em questão de organização e boas práticas.
    }

    public void sacar(double valor){


        if (valor<=saldo){
            saldo = saldo - valor;
        }

        else
            System.out.println("Saldo Insuficiente");


        //poderia ser saldo -= valor; Essa é a melhor opção em questão de organização e boas práticas.

        //quando o if só tem um comando embaixo dele, não precisa das chaves.
    }

    public double consultarSaldo (){
        return saldo;
    }

    //Quando eu preciso que retorne a informação, o tipo não pode ser void. E nesse caso, utiliza o mesmo tipo do nome.
}

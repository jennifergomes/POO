package concessionaria;

public class Transacao {

    private int id;
    private String data;
    private double valor;
    private Carro carro;
    private Cliente cliente;

    public Transacao(int id, String data, double valor, Carro carro, Cliente cliente) {
        this.id = id;
        this.data = data;
        this.valor = valor;
        this.carro = carro;
        this.cliente = cliente;
    }
}

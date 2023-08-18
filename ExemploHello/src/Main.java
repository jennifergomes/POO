
public class Main {
    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente();  //cria um objeto chamado c1 do tipo conta corrente.
        c1.cadastrar(123, "Ana", 789);
        c1.depositar(1000);

        System.out.println("Saldo:" +c1.consultarSaldo());
        c1.sacar(100);
        System.out.println("Saldo:" +c1.consultarSaldo());
    }


}
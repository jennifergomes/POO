package empregoFaculdade;

public class Main {
    public static void main(String[] args) {

        EmpregoDaFaculdade novoEmprego = new EmpregoDaFaculdade("Geraldo", 4000, 60);

        System.out.println("O gasto é: " + novoEmprego.getGastos());
        System.out.println("As informações são: " +novoEmprego.getInfo());

    }
}

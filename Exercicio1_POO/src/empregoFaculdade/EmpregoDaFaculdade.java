package empregoFaculdade;

public class EmpregoDaFaculdade {

    private String nome;
    private double salario;
    private int horasAula;

    public EmpregoDaFaculdade (String nome, double salario, int horasAula){
        this.nome = nome;
        this.salario = salario;
        this.horasAula = horasAula;
    }

    double getGastos() {
        this.horasAula += 40;
        return this.salario;
    }

    String getInfo() {

        double salarioTotal = this.salario + this.horasAula;
        return "nome: " + this.nome +  " com salário " + salarioTotal;

    }

}







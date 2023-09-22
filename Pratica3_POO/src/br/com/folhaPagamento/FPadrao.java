package br.com.folhaPagamento;

public class FPadrao extends Funcionario{
    public FPadrao(int matricula, String nome, double salario) {
        super(matricula, nome, salario);
    }
    public double calcularProventos(){
        return getSalario();
    }
}

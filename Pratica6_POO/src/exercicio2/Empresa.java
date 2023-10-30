package exercicio2;

import java.util.ArrayList;

public class Empresa {

    private String nome, CNPJ;
    private int qtdFuncionarios;

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome, String CNPJ, int qtdFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public int getQtdFuncionarios() {
        return qtdFuncionarios;
    }

    public void setQtdFuncionarios(int qtdFuncionarios) {
        this.qtdFuncionarios = qtdFuncionarios;
    }

    public void cadastrarFuncionario(Funcionario funcionario){

        if (this.funcionarios.size() == 100){
            System.out.println("Limite excedido!");
        }else {
            funcionarios.add(funcionario);
        }

    }

    public void cadastrarVariosFuncionarios (ArrayList<Funcionario> listaDeFuncionarios){

        if (this.funcionarios.size() + listaDeFuncionarios.size() == 100){
            System.out.println("Limite excedido!");
        }else {
            for (Funcionario item : listaDeFuncionarios) {

                funcionarios.add(item);
            }

        }
    }
}

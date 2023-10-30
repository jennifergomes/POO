package exercicio2;

public class Funcionario extends Pessoa {


    private String departamento, dataEntradaEmpresa, RG;
    private double salario;
    private boolean ativoNaEmpresa;

    public Funcionario(String nome, String telefone, String email, String departamento, String dataEntradaEmpresa, String RG, double salario, boolean ativoNaEmpresa) {
        super(nome, telefone, email);
        this.departamento = departamento;
        this.dataEntradaEmpresa = dataEntradaEmpresa;
        this.RG = RG;
        this.salario = salario;
        this.ativoNaEmpresa = ativoNaEmpresa;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDataEntradaEmpresa() {
        return dataEntradaEmpresa;
    }

    public void setDataEntradaEmpresa(String dataEntradaEmpresa) {
        this.dataEntradaEmpresa = dataEntradaEmpresa;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivoNaEmpresa() {
        return ativoNaEmpresa;
    }

    public void setAtivoNaEmpresa(boolean ativoNaEmpresa) {
        this.ativoNaEmpresa = ativoNaEmpresa;
    }

    public void bonificar(double bonus) {

        this.salario += bonus;

    }

    public void demitir() {

        this.setAtivoNaEmpresa(false);
    }


    public String mostarDados() {
        return
                "\nNome: " + getNome()
                + "\n RG: " + getRG()
                + "\n Telefone: " + getTelefone()
                + "\n E-mail: " + getEmail()
                + "\n Data de entrada na empresa: " + getDataEntradaEmpresa()
                + "\n Departamento: " + getDepartamento()
                + "\n Salário: " + getSalario()
                + "\n Ativo na empresa? " + isAtivoNaEmpresa();
    }

}

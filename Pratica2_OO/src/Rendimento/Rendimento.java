package Rendimento;
import java.text.NumberFormat;
public class Rendimento {

    private double investimentoInicial, taxaRendimento, valorInvestimentoAtual;
    private int meses;


    public Rendimento (double investimentoInicial, double taxaRendimento, int meses){
        this.investimentoInicial = investimentoInicial;
        this.taxaRendimento = taxaRendimento;
        this.valorInvestimentoAtual = investimentoInicial;
        this.meses = meses;
    }


    public double getInvestimentoInicial(){
        return this.investimentoInicial;
    }

    public double getTaxaRendimento(){
        return this.taxaRendimento;
    }

    public double getValorInvestimentoAtual() {
        return this.valorInvestimentoAtual;
    }

    public int getMeses(){
        return this.meses;
    }

    public void setInvestimentoInicial(double investimentoInicial){
        this.investimentoInicial = investimentoInicial;
    }

    public void setTaxaRendimento(double taxaRendimento){
        this.taxaRendimento = taxaRendimento;
    }

    public void setValorInvestimentoAtual(double rendimentoMes) {
        this.valorInvestimentoAtual = this.valorInvestimentoAtual + rendimentoMes;
    }

    public void setMeses(int meses){
        this.meses = meses;
    }


    public void mostrarRendimento() {
        System.out.printf("O investimento inicial foi de R$%.2f: " , this.getInvestimentoInicial());

        System.out.println("\nA taxa de rendimento informada foi de: " +NumberFormat.getPercentInstance().format(this.getTaxaRendimento()/100));
        System.out.println("A quantidade de meses informada foi: " +this.getMeses());

        for (int mes = 1; mes <= this.getMeses(); mes++){

            double rendimentoMes = this.getValorInvestimentoAtual() * this.getTaxaRendimento()/100;


            this.setValorInvestimentoAtual(rendimentoMes);

            System.out.printf("\nMês " +mes + ":" + " o rendimento foi de R$%.2f " , this.getValorInvestimentoAtual());



        }

    }
}

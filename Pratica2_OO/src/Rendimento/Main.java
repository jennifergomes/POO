package Rendimento;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double investimentoInicial, taxaRendimento;
        int meses;

        System.out.println("Informe o investimento inicial: ");
        investimentoInicial = scan.nextDouble();

        System.out.println("Informe a taxa de rendimento %: ");
        taxaRendimento = scan.nextDouble();

        System.out.println("Informe a quantidade de meses: ");
        meses = scan.nextInt();

        Rendimento novoRendimento = new Rendimento(investimentoInicial, taxaRendimento, meses);


        novoRendimento.mostrarRendimento();

    }
}
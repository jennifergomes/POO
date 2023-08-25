import java.util.Scanner;

public class Viagem {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        double tempo, velocidade, kmLitro, distancia, consumo;

        System.out.println("Informe o tempo gasto:");
        tempo = entrada.nextDouble();

        System.out.println("Informe a velocidade média:");
        velocidade = entrada.nextDouble();

        System.out.println("Informe os litros gastos por km:");
        kmLitro = entrada.nextDouble();


        distancia = velocidade * tempo;
        consumo = distancia / kmLitro;

        System.out.println("O consumo final de combustível gasto é: " +consumo);


    }

}

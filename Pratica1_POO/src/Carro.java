import java.util.Scanner;

public class Carro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String placa;
        int anoFabricacao;


        System.out.println("Informe a placa do carro:");
        placa = entrada.nextLine();

        System.out.println("Informe o ano de fabricação:");
        anoFabricacao = entrada.nextInt();

        if(anoFabricacao <= 2010){

            System.out.println("Carro Velho");

        } else if (anoFabricacao <= 2022) {

            //Poderia ser também else if (anoFabricacao => 2011 && anoFabricacao <= 2022) {

            System.out.println("Carro Semi Novo");
            
        } else if (anoFabricacao == 2023){

            System.out.println("Carro Novo");
        } else {
            System.out.println("Inválido");
        }

        String vogais;



    }


}

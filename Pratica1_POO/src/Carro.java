import java.io.CharArrayReader;
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

        if (anoFabricacao <= 2010) {

            System.out.println("Carro Velho");

        } else if (anoFabricacao <= 2022) {

            //Poderia ser também else if (anoFabricacao => 2011 && anoFabricacao <= 2022) {

            System.out.println("Carro Semi Novo");

        } else if (anoFabricacao == 2023) {

            System.out.println("Carro Novo");
        } else {
            System.out.println("Inválido");

        }

            placa = placa.toUpperCase();


            for (int i = 0; i < placa.length(); i++) {

                if (placa.charAt(i) == 'A' || placa.charAt(i) == 'E' || placa.charAt(i) == 'I' || placa.charAt(i) == 'O' || placa.charAt(i) == 'U')
                    placa = placa.replace(placa.charAt(i), '*');



            }
            System.out.println("Placa alterada:" +placa);

        }

    }


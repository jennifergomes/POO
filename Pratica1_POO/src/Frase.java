import java.util.Scanner;

public class Frase {
    public static void main(String[] args) {
        String frase;
        int numVogal = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua frase:");
        frase = entrada.nextLine();
        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++) {

            if (frase.charAt(i) == 'A' || frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' || frase.charAt(i) == 'U')
            numVogal++;

        }
        System.out.println("Número de vogais na frase é:" +numVogal);

    }

    }


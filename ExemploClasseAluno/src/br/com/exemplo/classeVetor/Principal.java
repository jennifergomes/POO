package br.com.exemplo.classeVetor;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        String nome, buscar;
        int matricula, i;
        Aluno[] alunos = new Aluno[10];
        Scanner ler = new Scanner(System.in);

        for (i = 0; i < 2; i++) {

            System.out.println("Digite a matrícula: ");
            matricula = ler.nextInt();
            ler.nextLine();


            System.out.println("Digite o nome: ");
            nome = ler.nextLine();


            alunos[i] = new Aluno(nome, matricula);
            System.out.println(alunos[i].mostrar());
        }

        System.out.println("Digite um nome para buscar");
        buscar = ler.nextLine();


        for (i = 0; i < 2; i++) {
            if (alunos[i].getNome().equals(buscar))
                System.out.println("Nome encontrado com sucesso ");
        }
    }
}

package exercicio1;

import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        RedeSocial redeSocial = null;
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("<1>Cadastrar Rede Social\n<2>Imprimir Publicação\n<3>Cadastrar Publicação\n<4>Sair"));
            switch (opcao)
            {
                case 1:
                    String nomeUsuario= JOptionPane.showInputDialog("Digite o nome de usuário: ");
                    String  dataNascimento= JOptionPane.showInputDialog("Digite a data de nascimento: ");
                    String  senha= JOptionPane.showInputDialog("Digite a senha:");
                    redeSocial = new RedeSocial("hoje",nomeUsuario, dataNascimento, senha);
                    break;

                case 2:

                   redeSocial.imprimePublicacoes();
                    break;
                case 3:

                    String textoPublicacao= JOptionPane.showInputDialog("Digite o texto da sua publicação: ");
                    String  linkMidea= JOptionPane.showInputDialog("Digite o link da midea: ");
                    Publicacao publi = new Publicacao("hoje",textoPublicacao, linkMidea);
                    redeSocial.inserePublicacao(publi);
                    break;
                case 4:
                    break;
            }
        }while(opcao!=4);

    }

}


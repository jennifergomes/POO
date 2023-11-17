package pratica7;

import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        String id_isbn, nm_titulo, cod_excluir, buscaTitulo;
        int id_categoria, id_editora;
        double vl_preco, buscaValor;

        int menu;


        do {

           String menu2 = JOptionPane.showInputDialog("Livraria Universitária" +"\n1. Cadastrar livro"+"\n2. Pesquisar livro por preço"+"\n3. Pesquisar livro por título " +"\n4. Excluir livro " +"\n5. Sair" +"\n\n");
           menu = Integer.parseInt(menu2);



            switch (menu) {
                case 1:

                    id_isbn = JOptionPane.showInputDialog("Digite ISBN");
                    nm_titulo = JOptionPane.showInputDialog("Digite título");
                    id_categoria = Integer.parseInt(JOptionPane.showInputDialog("Digite código da categoria"));
                    id_editora = Integer.parseInt(JOptionPane.showInputDialog("Digite código da editora"));
                    vl_preco = Double.parseDouble(JOptionPane.showInputDialog("Digite preço do livro"));

                    Inserir inserir = new Inserir(id_isbn, id_categoria, id_editora, nm_titulo, vl_preco);


                    break;


                case 2:
                    cod_excluir = JOptionPane.showInputDialog("Digite ISBN para excluir");
                    Excluir excluir = new Excluir(cod_excluir);
                    break;

                case 3:
                    Consultar busca = new Consultar();
                    buscaTitulo = JOptionPane.showInputDialog("Digite título para buscar");
                    busca.BuscaTitulo(buscaTitulo);
                    break;

                case 4:
                    Consultar busca1 = new Consultar();
                    buscaValor = Double.parseDouble(JOptionPane.showInputDialog("Digite título para buscar"));
                    busca1.BuscaValor(buscaValor);
                    break;

                case 5:
                    System.out.println("Saindo do aplicativo!");

                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }

        } while (menu != 5);
    }
}
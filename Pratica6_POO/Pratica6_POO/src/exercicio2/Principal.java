package exercicio2;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario f1 = new Funcionario("Jennifer", "99999999", "jen@gmail.com", "Financeiro", "Hoje", "1230", 5000, true);
        Funcionario f2 = new Funcionario("João", "88888888", "jon@gmail.com", "Financeiro", "Hoje", "1530", 5000, true);
        Funcionario f3 = new Funcionario("Joyce", "77777777", "joy@gmail.com", "Comercial", "Hoje", "1830", 5000, true);
        Funcionario f4 = new Funcionario("Lucas", "66666666", "lu@gmail.com", "Comercial", "Hoje", "1730", 5000, true);
        Funcionario f5 = new Funcionario("Ana", "55555555", "ana@gmail.com", "Administrativo", "Hoje", "1430", 5000, true);

        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);
        funcionarios.add(f4);
        funcionarios.add(f5);

        for (Funcionario funcionario : funcionarios) {

            System.out.println(funcionario.mostarDados());

        }

        Empresa emp1 = new Empresa("Confeitaria", "1200", 0);

        emp1.cadastrarFuncionario(f1);
        emp1.cadastrarFuncionario(f2);
        emp1.cadastrarFuncionario(f3);
        emp1.cadastrarFuncionario(f4);
        emp1.cadastrarFuncionario(f5);

        emp1.cadastrarVariosFuncionarios(funcionarios);
    }
}

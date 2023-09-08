package notasAlunos;

public class Main {
    public static void main(String[] args) {

        Aluno novoAluno = new Aluno("Jennifer", "ADS", 1210, 3, 45, 50, 0);

        novoAluno.alterarNotaAV1(40);
        novoAluno.alterarNotaAV2(55);
        System.out.println("A situação do aluno " +novoAluno.obterNome() + " é: " +novoAluno.avaliarAluno());

    }
}

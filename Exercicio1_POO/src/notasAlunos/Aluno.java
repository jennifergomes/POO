package notasAlunos;

public class Aluno {

    private String nome, curso;
    private int matricula, periodo;
    private double notaAV1, notaAV2, notaAE;

    public Aluno (String nome, String curso, int matricula, int periodo, double notaAV1, double notaAV2, double notaAE){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.periodo = periodo;
        this.notaAV1 = notaAV1;
        this.notaAV2 = notaAV2;
        this.notaAE = notaAE;
    }

    public void alterarNotaAV1 (double novaNota){

        this.notaAV1 = novaNota;
    }

   public void alterarNotaAV2 (double novaNota){
        this.notaAV2 = novaNota;
   }

   public void alterarNotaAE (double novaNota){
        this.notaAE = novaNota;
   }

   public String avaliarAluno (){
        double notaTotal = this.notaAV1 + this.notaAV2;
        if(notaTotal >= 60){

            return "Aprovado";
        }else return "Recuperação";
   }

   public String obterNome (){
        return this.nome;
   }
}


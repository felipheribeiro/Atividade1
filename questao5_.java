public class Aluno {

    String nome, cpf; Double nota1, nota2, nota3;

    public Aluno(String nome, String cpf){

        this.nome = nome;
        this.cpf = cpf;
    }

    public Double calcularMedia(){
        return (this.nota1 + this.nota2 + this.nota3)/3;
    }
}

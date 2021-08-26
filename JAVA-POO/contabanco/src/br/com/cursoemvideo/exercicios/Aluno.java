package br.com.cursoemvideo.exercicios;

public class Aluno extends Pessoas {
    
    private int matricula;
    private String curso;

    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}

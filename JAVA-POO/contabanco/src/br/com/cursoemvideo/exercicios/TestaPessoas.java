package br.com.cursoemvideo.exercicios;

public class TestaPessoas {
    
    public static void main(String[] args) {
        
        Visitante v1 = new Visitante();
        v1.setNome("Camila");
        v1.setIdade(21);
        v1.setSexo("F");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Jubileu");
        b1.setMatricula(1112);
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
                
        
    }
    
}

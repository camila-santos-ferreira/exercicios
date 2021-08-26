package br.com.cursoemvideo.exercicios;

public class TestaLivro {
    
    public static void main(String[] args) {

    
    Pessoa[] p = new Pessoa[2];
    Livro[] l = new Livro[3];
    
    p[0] = new Pessoa("Camila",21,"F");
    p[1] = new Pessoa("Santos", 21, "F");
    
    l[0] = new Livro("A","B",300,p[0]);
    l[1] = new Livro("C","D",500,p[1]);
    l[2] = new Livro("E","F",800,p[0]);
    
        l[0].abrir();
        l[0].folhear(358);
        System.out.println(l[0].detalhes());
        
    
    
    }
}

package br.com.cursoemvideo.exercicios;

public class TestaAnimais2 {
    
    public static void main(String[] args){
        
        Mamifero x  = new Mamifero();
        x.emitirSom();
        
        Lobo2 y  = new Lobo2();
        y.emitirSom();
        
        Cachorro2 z = new Cachorro2();
        z.emitirSom();
        
        z.reagir("ola");
        z.reagir("b");
        z.reagir(19, 00);
        z.reagir(true);
        z.reagir(false);
        z.reagir(2, 12.5f);
        z.reagir(17, 4.5f);
        
    }
}

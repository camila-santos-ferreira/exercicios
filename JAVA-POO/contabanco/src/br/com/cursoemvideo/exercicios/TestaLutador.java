package br.com.cursoemvideo.exercicios;

public class TestaLutador {
    
    public static void main(String args[]){
        
        Lutador L[] = new Lutador[6];
                       
        L[0] = new Lutador("Pretty Boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        //L[0].apresentar();
        //L[0].status();
        
        L[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 57.8, 14, 2, 3);
        
        L[2] = new Lutador("Snapshadow", "Estados Unidos", 35, 1.65, 80.9, 12, 2, 1);
        
        L[3] = new Lutador("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        
        L[4] = new Lutador("Ufocobol", "Brasil", 37, 1.70, 119.30, 5, 4, 3);
        
        L[5] = new Lutador("Nerdaard", "Estados Unidos", 30, 1.81, 105.70, 12, 2, 4);
        
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[4], L[5]);
        UEC01.lutar();
        L[0].status();
        L[1].status();
        
    }
    
}

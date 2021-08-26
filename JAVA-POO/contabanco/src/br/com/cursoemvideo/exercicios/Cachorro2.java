package br.com.cursoemvideo.exercicios;

public class Cachorro2 extends Lobo2 {
    
    @Override
    public void emitirSom() {
        System.out.println("Au au"); 
    }
    
    public void reagir(String frase) {
        if("toma comida".equals(frase) || "ola".equals(frase)) {
            System.out.println("abanar e latir");
        }else{
        System.out.println("rosnar");
        }
    }
    
    public void reagir(int hora, int min) {
        if(hora < 12){
            System.out.println("abanar o rabo");
        }else if(hora >= 18){
            System.out.println("ignorar");
        } else {
            System.out.println("abanar e latir");
        }
    }
    
    public void reagir(boolean dono) {
        if(dono == true){
            System.out.println("abanar");
        }else{
            System.out.println("rosnar e latir");
        }
    }
   
    public void reagir(int idade, float peso) {
        if(idade < 5){
            if(peso < 10){
                System.out.println("abanar");
            } else {
                System.out.println("latir");
            } 
        } else {
            if(peso < 10){
                System.out.println("rosnar");
            } else {
                System.out.println("ignorar");
            }
        }
    }
    
}


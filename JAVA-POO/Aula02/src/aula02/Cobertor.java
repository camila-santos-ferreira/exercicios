package aula02;

public class Cobertor {
    
    String marca;
    String tecido;
    String cor;
    double altura;
    double largura;
    double espessura;
    boolean dobrada;
    
    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Tecido: " + this.tecido);
        System.out.println("Cor: " + this.cor);
        System.out.println("Medidas: " + this.altura + "cm x " + this.largura + "cm x " + this.espessura + "cm");
        System.out.println("Está esquentando? ");
    }
   
    void esquentar() {
        if(this.dobrada == true){
            System.out.println("Não! Desdobre a coberta antes...");
        } else {
        System.out.println("Sim! Esquentando...");
        }
    }
    void desdobrar() {
        this.dobrada = false;
        System.out.println("Desdobrando...");
    }
    void dobrar() {
        this.dobrada = true;
        System.out.println("Dobrando...");
    }
}

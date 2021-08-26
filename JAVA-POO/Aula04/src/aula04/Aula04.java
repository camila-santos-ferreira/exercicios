package aula04;

public class Aula04 {

    public static void main(String[] args) {
        
        Caneta c1 = new Caneta("NIC", 0.4f, "Amarela", true);
        Caneta c2 = new Caneta("BIC", 0.5f, "Preta", false);
        
        // c1.setModelo("BIC");
        // c1.setPonta(0.5f);
        
        // Não funciona porque os atributos são privados, desta forma, não é possível acessar diretamente
        // c1.modelo = "BIC";
        // c1.ponta = 0.5f;
        // System.out.println("Tenho uma caneta " + c1.modelo);
        
        
        c1.status();
        c2.status();
        //System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        
        
        
    }
    
}

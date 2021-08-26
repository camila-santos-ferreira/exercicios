package aula02;

public class TestaExemplos01 {
    
    public static void main(String[] args){
        
        Cobertor manta = new Cobertor();
        
        manta.marca = "Cobertinha";
        manta.tecido = "lã";
        manta.cor = "rosa";
        manta.altura = 2.30;
        manta.largura = 1.35;
        manta.espessura = 0.30;
        
        manta.status();       
        manta.desdobrar();
        manta.esquentar();
        
    }
    
}

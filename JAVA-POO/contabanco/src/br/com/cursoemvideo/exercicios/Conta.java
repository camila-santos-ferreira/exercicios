package br.com.cursoemvideo.exercicios;

public class Conta {

    public static void main(String[] args) {
      
       ContaBanco p1 = new ContaBanco();
       p1.setNumeroConta(1111);
       p1.setUsuario("Camila");
       p1.abrirConta("CC");
       p1.depositar(100);
       p1.sacar(150);
       p1.fecharConta();
       
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumeroConta(2222);
       p2.setUsuario("Santos");
       p2.abrirConta("CP");
       p2.depositar(500);
       p2.sacar(100);
       
       p1.estadoAtual();
       p2.estadoAtual();
       
        
    }
    
}

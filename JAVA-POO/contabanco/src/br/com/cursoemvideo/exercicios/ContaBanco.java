package br.com.cursoemvideo.exercicios;

public class ContaBanco {
    
    public int numeroConta;
    protected String tipoConta;
    private String usuario;
    private double saldo;
    private boolean status;
    
    // Construtor
    public ContaBanco () {
        this.saldo = 0.00;
        this.status = false;
    }
   
    
    // Métodos de acesso getters and setters
    public int getNumeroConta(){
        return numeroConta;
    }   
    public void setNumeroConta(int numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public String getTipoConta(){
        return tipoConta;
    }
    public void setTipoConta(String tipoConta){
        this.tipoConta = tipoConta;
    }
    
    public String getUsuario(){
        return usuario;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public boolean isStatus(){
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
    
    // Métodos personalizados
    public void estadoAtual(){
        System.out.println("Conta: " + this.getNumeroConta());
        System.out.println("Tipo: " + this.getTipoConta());
        System.out.println("Dono: " + this.getUsuario());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.isStatus());
        System.out.println("-------------------------");
    }
    
    public void abrirConta(String classificacaoConta){
         this.setTipoConta(classificacaoConta);
         this.setStatus(true);
         
         if(classificacaoConta == "CC"){
             this.setSaldo(50.00);
         }
         else if(classificacaoConta == "CP"){
             this.setSaldo(150.00);
         }
         System.out.println("Conta aberta com sucesso!");
         System.out.println("-------------------------");
    }
    
    public void fecharConta(){
            
         if(this.getSaldo() > 0.00){
         System.out.println("Conta com saldo positivo. Não é possível realizar o fechamento da conta!");
         }
         else if (this.getSaldo() < 0.00) {
         System.out.println("Conta com saldo negativo. Não é possível realizar o fechamento da conta!");    
         }
         else {
             this.setStatus(false);
             System.out.println("Conta fechada com sucesso!");
         }
        
    }
    
    public void depositar(double valorDeposito){
        if(this.isStatus() == true){
            this.setSaldo(this.getSaldo()+ valorDeposito);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getUsuario());     
        }
        else {
            System.out.println("Conta fechada. Impossível depositar.");
        }
    }
        
    public void sacar(double valorSaque){
        if(this.isStatus() == true){
            if (this.getSaldo() >= valorSaque) {
                this.setSaldo(this.getSaldo() - valorSaque);
                System.out.println("Saque realizado na conta de " + this.getUsuario());
            }
            else {
                System.out.println("Saldo insuficiente para saque!");
            }
                }
        else {
            System.out.println("Conta fechada. Impossível sacar.");
        }
    }
    
    public void pagarMensalidade(double valorMensal){
        if(this.getTipoConta() == "CC"){
            valorMensal = 12.00;
        } else if (this.getTipoConta() == "CP"){
            valorMensal = 20.00;
        }
        if(this.isStatus() == true){
            if(this.getSaldo() >= valorMensal){
                this.setSaldo(this.getSaldo() - valorMensal);
                System.out.println("Mensalidade paga com sucesso por " + this.getUsuario());
            } else {
                System.out.println("Conta fechada. Impossível pagar mensalidade.");
            }
            
        }
        
    }
}

package br.com.cursoemvideo.exercicios;

public interface Publicacao {
    
    public abstract void abrir();
    public abstract void fechar();
    public abstract void folhear(int pagina);
    public abstract void avancarPag();
    public abstract void voltarPag();
    
}

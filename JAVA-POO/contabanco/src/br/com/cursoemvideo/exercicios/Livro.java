package br.com.cursoemvideo.exercicios;

public class Livro implements Publicacao {
    
    private String titulo;
    private String autor;
    private int paginas;
    private int pagAtual;
    private boolean aberto;    
    private Pessoa leitor;

    public Livro(String titulo, String autor, int paginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.leitor = leitor;
        this.aberto = false;
        this.pagAtual = 0;
    }

    public String detalhes () {
        return "Livro{ " + "\nTitulo=" + titulo + "\nAutor=" + autor + "\nIdade=" + leitor.getIdade() + "\nSexo=" + leitor.getSexo() + "\nPaginas=" + paginas + "\nPagAtual=" + pagAtual + "\nAberto=" + aberto + "\nLeitor=" + leitor.getNome() + '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pagina) {
        this.pagAtual = pagina;
        if(pagina > this.paginas){
            this.pagAtual = 0;
        } else {
            this.pagAtual = pagina;
        }
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
    
}

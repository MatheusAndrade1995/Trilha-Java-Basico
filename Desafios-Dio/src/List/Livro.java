package List;

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livro(String titulo, String autor, int anoDePublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + 
        ", autor=" + autor + 
        ", anoDePublicacao=" + anoDePublicacao + "]";
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public String getTitulo() {
        return titulo;
    }

}

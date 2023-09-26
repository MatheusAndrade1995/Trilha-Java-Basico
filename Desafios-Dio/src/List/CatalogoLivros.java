package List;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.AdicionarLivros("Preto", "Matheus1", 1918);
        catalogoLivros.AdicionarLivros("Preto", "Matheus1", 1984);
        catalogoLivros.AdicionarLivros("Rosa", "Matheus2", 2010);
        catalogoLivros.AdicionarLivros("Pardo", "Matheus2", 1994);
        catalogoLivros.AdicionarLivros("Azul", "Matheus3", 2000);

        //System.out.println("Pesquisa por autor " + catalogoLivros.PesquisarPorAutor("Matheus1"));

        //System.out.println("Pesquisa por ano de publicação " + catalogoLivros.PesquisarPorIntervaloAnos(1995, 2001));

        System.out.println("Pesquisa por Titulo " + catalogoLivros.PesquisaPorTitulo("Preto"));
    }


    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void AdicionarLivros(String titulo, String autor, int anoDePublicacao) {
        livroList.add(new Livro(titulo, autor, anoDePublicacao));
    }

    public List<Livro> PesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        } else {
            System.out.println("Não há livros do Autor em nosso Catálogo");
        }
        return livrosPorAutor;

    }

    public List<Livro> PesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervalo = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoDePublicacao() >= anoInicial && l.getAnoDePublicacao() <= anoFinal) {
                    livrosPorIntervalo.add(l);
                }
            }
        } else {
            System.out.println("Não há livros no intervalor de tempo indicado em nosso Catálogo");
        }
        return livrosPorIntervalo;

    }

    public Livro PesquisaPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }

        }
        return livroPorTitulo;
    }
    

}

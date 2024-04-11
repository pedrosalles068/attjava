import java.util.ArrayList;
import java.util.List;

public class estante {
    private String titulo;
    private List<livro> livros = new ArrayList();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void agregarLivro(livro livros) {
        this.livros.add(livros);
    }
}


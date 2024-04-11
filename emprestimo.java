import java.util.ArrayList;

public class emprestimo {
    private String dataDevolucao;
    private ArrayList<itemEmprestado> livros;

    public emprestimo(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public void agregarLivro(livro livros) {
        this.livros.add(livros);
    }
}
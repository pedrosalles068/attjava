import java.util.ArrayList;
import java.util.List;

public class emprestimo {
    private String dataDevolucao;
    private List<itemEmprestado> itemEmprestados = new ArrayList();

    public emprestimo(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }
    public void agregarLivro(itemEmprestado livro) {
        this.itemEmprestados.add(livro);
    }
}
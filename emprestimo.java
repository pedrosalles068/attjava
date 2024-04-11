public class emprestimo {
    private ArrayList<ItemEmprestimo> livros;
    private String dataDevolucao;

    public Emprestimo() {
        livros = new ArrayList<ItemEmprestimo>();
    }

    public String getDataDevolucao() {
        return dataDevolucao != null ? dataDevolucao : "";
    }

    public void setDataDevolucao(String data) {
        this.dataDevolucao = data;
    }

    public ArrayList<ItemEmprestimo> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<ItemEmprestimo> livros) {
        this.livros = livros;
    }

    public void addLivro(ItemEmprestimo livro) {
        livros.add(livro);
    }
}
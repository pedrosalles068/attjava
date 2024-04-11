public class usuario {
    private String login;
    private String senha;

    public usuario(String senha, String login) {
        this.senha = senha;
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
}

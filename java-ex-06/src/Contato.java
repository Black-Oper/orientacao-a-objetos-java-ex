public class Contato {
    private String nome;
    private String email;
    private int telefone;

    public Contato(String nome, String email, int telefone){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }
}

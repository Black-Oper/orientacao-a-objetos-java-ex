public class Jogador {
    private String nome;
    private int pontuacao;
    private int nivel;

    public Jogador(String nome, int pontuacao, int nivel) {
        this.nome = nome;
        this.pontuacao = pontuacao;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public int getNivel() {
        return nivel;
    }

    public void setPontuacao(int nova_pontuacao) {
        this.pontuacao = nova_pontuacao;
    }

    public void setNivel(int novo_nivel) {
        this.nivel = novo_nivel;
    }
}

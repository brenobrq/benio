package soteste;

public class Teste1 {

    private String nome;

    private int idade;

    public Teste1 (String nomeDaPessoa){
        this.nome = nomeDaPessoa;
    }

    public void FAzaniversario() {

        int novaIdade = this.idade + 1;
        this.idade = novaIdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

public class Cliente {
    private String nome;
    private Endereco endereco;
    private Contato Contato;

    public Cliente(String nome, Endereco endereco, Contato Contato) {
        this.nome = nome;
        this.endereco = endereco;
        this.Contato = Contato;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public Contato getContato() {
        return Contato;
    }
}

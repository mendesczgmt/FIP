public class Dono{
    private String nome;
    private String cpf;

    public Dono(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

}

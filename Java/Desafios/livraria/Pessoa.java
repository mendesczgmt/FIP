public class Pessoa {
    private String nome;
    private Float salário;
    private String função;

    public Pessoa(String nome, Float salário, String função) {
        this.nome = nome;
        this.salário = salário;
        this.função = função;
    }

    public void setFunção(String função) {
        this.função = função;
    }

    public void setSalário(Float salário) {
        this.salário = salário;
    }

   public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

    public Float getSalário() {
        return salário;
    }

    public String getFunção() {
        return função;
    }   
}

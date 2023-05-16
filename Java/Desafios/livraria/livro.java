class Livro{
    private String nome;
    private float preço;

    public Livro(String nome, float preço){
        this.nome = nome;
        this.preço = preço;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreço(float preço) {
        this.preço = preço;
    }

    public String getNome() {
        return nome;
    }

    public float getPreço() {
        return preço;
    }
    
}

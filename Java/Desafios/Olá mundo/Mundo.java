class Mundo{
    private String frase;

    public Mundo(String frase){
        this.frase = frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    public void exibir() {
        System.out.println(getFrase());
    }
}
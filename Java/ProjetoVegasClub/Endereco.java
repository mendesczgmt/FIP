public class Endereco {
    private String cep;
    private String rua;
    private String bairro;
    private int numero;


    public Endereco(String cep, String rua, String bairro, int numero) {
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return cep;
    }
   
    public String getRua() {
        return rua;
    }

    public String getBairro() {
        return bairro;
    }

    public int getNumero() {
        return numero;
    }

   
    

}

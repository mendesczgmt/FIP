class Carro extends Veiculo {
    private int NumPortas;
    public Carro(String marca, String modelo, int ano, int NumPortas) 
    {   
        super(marca, modelo, ano);
        this.NumPortas = NumPortas;
    }

    public int getNumPortas() {
        return NumPortas;
    }
    public void setNumPortas(int numPortas) {
        NumPortas = numPortas;
    }

    public Boolean ligarVeiculo(Boolean modoVeiculo) {
        if(modoVeiculo == true) {
            return true;
        }
        return false;
    }
    
    
}

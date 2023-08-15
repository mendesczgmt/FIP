public class Moto extends Veiculo{
    private boolean flex;
    public Moto(String marca, String modelo, int ano, boolean flex) 
    {   
        super(marca, modelo, ano);
        this.flex = flex;
    }

    public boolean getflex() {
        return flex;
    }
    public void setflex(boolean flex) {
        this.flex = flex;
    }

    public String ligarVeiculo() {
        return "Moto ligada";
    }
}

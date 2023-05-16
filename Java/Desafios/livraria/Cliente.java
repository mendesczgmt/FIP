class Cliente extends Pessoa{

    public Cliente(String nome, Float salário, String função) {
        super(nome, salário, função);
    }

    @Override
    public void setSalário(Float salário) {
        super.setSalário(salário);
    }

    @Override
    public Float getSalário() {
        return super.getSalário();
    }
    
}

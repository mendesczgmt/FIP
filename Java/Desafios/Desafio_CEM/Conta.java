public class Conta {
    private Dono dono;
    private String tipo;
    private int saldo;
    private boolean status;
    private int valor;

    public Conta(int saldo, String tipo){
        this.tipo = tipo;
        this.saldo = saldo;
        status = false;
        saldo = 0;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Dono getDono() {
        return dono;
    }

    public int getValor() {
        return valor;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

   public void abrirConta() {
    status = true;
    if(tipo == "CC"){
        System.out.println("Conta corrente criada.");
        saldo += 50;
    }

    else{
        System.out.println("Conta poupança criada ");
        saldo += 150;
    }
    
   }

   public void fecharConta() {
    if(status == true && saldo == 0){
        System.out.println("OK! sua conta será fechada.");
    }
    else{
        System.out.println("Sua conta não pode ser fechada, verifique com nossa equipe o que pode ter acontecido");
    }
   }

   public void depositar(int valor){
    saldo += valor;
    System.out.println("Deposito feito com sucesso, saldo atualizado para: " +saldo);
   }

   public void sacar(int valor) {
    if(valor <= saldo){
        saldo -= valor;
        System.out.println("Saque efetuado com sucesso, seu saldo agora é de: " +saldo);
    }
    else{
        System.out.println("O valor ao qual deseja sacar é maior que seu saldo atual");
    }
   }

   public void pagarMensalidade() {
    if(tipo == "CC" && saldo >= 12){
        saldo -= 12;
        System.out.println("Mensalidade paga com sucesso, seu novo saldo é de: " +saldo);
    }
    else if(tipo == "CP" && saldo >=50){
        saldo -= 50;
        System.out.println("Mensalidade paga com sucesso, seu novo saldo é de: " +saldo);
    }
   }

   public void exibir() {
    if(status == true){
        System.out.println("Saldo: " +saldo);
    }
    else{
        System.out.println("Perdão, sua conta foi fechada ou não existe.");
    }
   }


}

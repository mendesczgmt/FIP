class Main{
    public static void main(String[] args) {
    Conta conta1 = new Conta(1200, "CC");
    conta1.abrirConta();
    conta1.depositar(30);
    conta1.sacar(50);
    conta1.fecharConta();
    conta1.pagarMensalidade();

    }
}
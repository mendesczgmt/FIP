import java.util.ArrayList;

class Livraria {
    private boolean possui;
    private float s_cliente;
    private Cliente cliente;
    private float saldo;
    private Livro livro;
    private Funcionario funcionario;
    ArrayList<Livro> livros = new ArrayList<Livro>();

    public Livraria(float saldo) {
        this.saldo = saldo;

    }

    public void adicionarLivro(Livro livro){
        livros.add(livro);
        System.out.println("O livro " +livro.getNome() +" foi adicionado");
        saldo -= livro.getPreço();
    }

    public void exibirLivros(){
        System.out.println("------------------------------------");
        System.out.println ("Essa é a lista de livros que temos.");
        for (Livro livro : livros) {
            System.out.println(livro.getNome());
        }
        System.out.println("------------------------------------");
    }

    public void venderLivros(Livro livro, Cliente cliente, Funcionario funcionario){
        if(cliente.getSalário()>=livro.getPreço() && livros.contains(livro)) { 
            s_cliente = cliente.getSalário();
            livros.remove(livro);
            System.out.println("O livro " +livro.getNome() +" foi vendido" +" para o cliente "+cliente.getNome() +" pelo funcionário " +funcionario.getNome());
            saldo += livro.getPreço();
            s_cliente -= livro.getPreço();
            cliente.setSalário(s_cliente);
        }

        else {
            if(cliente.getSalário() < livro.getPreço() && livros.contains(livro)) {
                System.out.println("O cliente não possui saldo");
            }
            else{
                System.out.println("O livro " +livro.getNome() +" não possui no estoque");
            }
        }}
    
    public void saldoEmpresa(Livraria livraria) {
        System.out.println("O saldo da empresa é de: " +saldo);
    }

    public void saldoCliente(Cliente cliente) {
        System.out.println("O saldo do Cliente " +cliente.getNome() +" é de: " +cliente.getSalário());
    }

    public void saldoFuncionario(Funcionario funcionario) {
        System.out.println("O saldo do funcionário " +funcionario.getNome() +" é de: " +funcionario.getSalário());
    }
}

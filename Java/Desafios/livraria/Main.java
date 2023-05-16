class Main{
    public static void main(String[] args) {
        Livro l1 = new Livro("Brabo", 12.00f);
        Livro l2 = new Livro("Braba", 12.50f);
        Livro l3 = new Livro("Torto arado", 20.00f);
        Livro l4 = new Livro("Clean Code", 30.00f);
        Cliente c1 = new Cliente("Mendes", 14.0f, "Cliente");
        Cliente c2 = new Cliente("Valeska", 1200.00f, "Cliente");
        Cliente c3 = new Cliente("Joãozin", 10.0f, "Cliente");
        Funcionario f1 = new Funcionario("Julio", 1200.00f, "Vendedor");
        Livraria livraria1 = new Livraria(1200.00f);

        livraria1.adicionarLivro(l1);
        livraria1.adicionarLivro(l2);
        livraria1.adicionarLivro(l4);
        livraria1.exibirLivros();
        livraria1.saldoCliente(c1);
        livraria1.venderLivros(l1, c1, f1);
        livraria1.venderLivros(l3, c2, f1);
        livraria1.venderLivros(l4, c3, f1);
        livraria1.saldoCliente(c1);
        
      
    }
}
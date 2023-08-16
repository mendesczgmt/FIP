public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("Marca generica", "modelo generico", 2023);
        Carro carro1 = new Carro("BMW", "X1", 2023, 4);
        Moto moto1 = new Moto("BMW", "F800", 2022, true);
        
        Veiculo[] veiculos = {veiculo1, carro1, moto1 };
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo.ligarVeiculo()); 
        }

        if(carro1.ligarVeiculo(true)) {
            System.out.println("Carro ligado");
        }
    
        System.out.println(moto1.ligarVeiculo());
        
        try {
            System.out.println(veiculos[5]);
        } catch (Exception e) {
            System.out.println("Não possui o veiculo desejado");
        }
    }
}

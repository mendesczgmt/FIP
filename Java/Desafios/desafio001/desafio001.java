import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String nomes[] = new String[5];
        double notas[] = new double[5];

        for(int i=0; i<5; i++) {
            System.out.println("Digite o nome do "+(i+1) +"º Aluno: ");
            nomes[i] = input.nextLine();
        }
        for(int i=0; i<5; i++) {
            System.out.println("Digite a nota do aluno "+nomes[i]);
            notas[i] = input.nextDouble();
        }

        for(int i=0; i<5; i++) {
            System.out.println("O aluno "+nomes[i] +" tirou a nota "+notas[i]);
        }
    }
}
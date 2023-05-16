import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String nomes[] = new String[5];
        double notas[][] = new double[5][10];
        double medias[] = new double[5];
        double soma = 0;

        for(int i=0; i<5; i++) {
            System.out.println("Digite o nome do " +(i+1) +" º aluno");
            nomes[i] = input.nextLine();
        }

        for(int i=0; i<5; i++) {
            soma = 0;
            for(int j=0; j<2; j++) {
                System.out.println("Digite a "+(j+1) +"ª nota do aluno "+nomes[i] );
                notas[i][j] = input.nextDouble();
                soma+=notas[i][j];
            }
            medias[i] = (soma/2);
        }
        for(int i=0; i<5; i++) {
            System.out.println("O aluno: "+nomes[i]);
            for (int j=0; j<2; j++) {
                System.out.println("Nota: " +notas[i][j]);
            }
            System.out.println("media: " +medias[i]);
        }
    }
}
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nomes [][] = new String[2][10];
        double notas [][][] = new double [2][10][2];

        for (int i=0; i<2; i++) {
            for (int j=0; j<10; j++){
                System.out.println("Digite o nome do "+(j+1) +" º aluno da " +(i+1) +"ª turma");
                nomes[i][j] = input.nextLine();
            }
        }
        for (int i=0; i<2; i++) {
            for(int j=0; j<10; j++) {
                System.out.println("Digite a nota do aluno "+nomes[i][j]);
                for(int k=0; k<2; k++) {
                    System.out.println( (k+1)+"ª Nota");
                    notas[i][j][k] = input.nextDouble();
                }

            }
        }
    }
}
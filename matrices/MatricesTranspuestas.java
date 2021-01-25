import java.util.Scanner;

public class MatricesTranspuestas {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite la matriz: ");
        for( int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("matriz original: ");
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println("");
        }

        // Transponiendo la matriz
        // utilizando dos bucles
        int aux;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }

        System.out.println("\nLa matriz compuesta es: ");
        for( int i = 0; i < 3; i++){
            for( int j = 0; j < 3; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println("");
        }
        entrada.close();
    }
}

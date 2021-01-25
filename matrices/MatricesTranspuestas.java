import java.util.Scanner;

public class MatricesTranspuestas {
    static Scanner entrada = new Scanner(System.in);
    static int[][] matriz = new int[3][3];
    public static void main(String[] args) {
        
        llenarMatriz(matriz);
        System.out.println("\nmatriz original: ");
        mostrarMatriz(matriz);
        transponerMatriz(matriz);
        System.out.println("\nLa matriz compuesta es: ");
        mostrarMatriz(matriz);
    }

    public static void transponerMatriz(int[][] matriz) {
        int aux;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < i; j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
    }

    public static void llenarMatriz(int[][] matriz) {
        System.out.println("Digite la matriz: ");
        for( int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print("Matriz[" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    public static void mostrarMatriz(int[][] matriz){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println("");
        }
    }
}

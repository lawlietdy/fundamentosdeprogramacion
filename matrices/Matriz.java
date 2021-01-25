
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Matriz{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        // Esta es de la manera manual
        // int matriz[][] = { 
        //     {1, 2, 3},  // 0
        //     {4, 5, 6},  // 1
        //     {7, 8, 9} }; //Manera Manual

        // // Imprimir las matrices utilizando
        // // dos bucles for anidados.

        // for( int i = 0; i < 3; i++){ // Numero de filas
        //     for( int j = 0; j < 3; j++)  // Numero de columnas
        //         System.out.print( matriz[i][j] );
            
        //     System.out.println("");
        // }

        // System.out.println(matriz[1][1]);

        // Manera dinamica con variables 
        int matriz[][], nFilas, nCol;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de columnas: "));

        matriz = new int[nFilas][nCol];

        System.out.println("Digite la matriz: "); 
        for( int i = 0; i < nFilas; i++){
            for( int j = 0; j < nCol; j++){
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nLa matriz es: ")        ;
        for( int i = 0; i < nFilas; i++){ // Numero de filas
            for( int j = 0; j < nCol; j++)  // Numero de columnas
                System.out.print( matriz[i][j] );
            
            System.out.println("");
        }
    }
}
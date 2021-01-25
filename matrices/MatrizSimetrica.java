
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrizSimetrica {
    static int[][] matriz;
    static int nFilas, nCol;
    static boolean simetrica = true;
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        
        matriz = asignarTamano();
        llenarMatriz(matriz);
        identificarSimetria();
    }

    public static int[][] asignarTamano(){
        int[][] x;
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));
        x = new int [nFilas][nCol];
        return x;
    }

    public static void llenarMatriz(int[][] matriz){
        System.out.println("Digite una matriz: ");
        for(int i = 0; i<nFilas; i++){
            for(int j = 0; j<nCol; j++){
                System.out.print("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
    }

    public static void identificarSimetria(){
        if(nFilas == nCol){
            int i, j;
            i = 0;
            while( i < nFilas && simetrica == true ){
                j = 0;
                while( j < i && simetrica == true ){
                    if(matriz[i][j] != matriz[j][i]) simetrica = false;
                    j++;
                }
                i++;
            }

            if( simetrica == true ) {
                JOptionPane.showMessageDialog(null, "La matriz es simetrica");
            } 
            else{
                JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "La matriz no es simetrica");
        }
    }
}

import java.util.Scanner;

import javax.swing.JOptionPane;
/* Crear y cargar una matriz de tamanio n x m y decir si
es simetrica o no */
public class MatrizSimetrica {

    public static void main(String[] args) {
        int[][] matriz;
        int nFilas, nCol;
        boolean simetrica = true;
        Scanner entrada = new Scanner(System.in);
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matriz = new int [nFilas][nCol];

        System.out.println("Digite una matriz: ");

        for(int i = 0; i<nFilas; i++){
            for(int j = 0; j<nCol; j++){
                System.out.println("Matriz [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }

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

        entrada.close();
    }
}
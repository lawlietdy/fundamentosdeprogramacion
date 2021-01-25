
public class MatrizDiagonal {
    static int nFilas = 10, nCol = 10, i, j;
    static int[][] matriz = new int[ nFilas ][ nCol ];
    public static void main(String[] args) {
        
        llenarMatriz(matriz);
        System.out.println("\nMatriz original: \n");
        mostrarMatriz(matriz);
        System.out.println("\nDiagonal: \n");
        mostrarDiagonal(matriz);
        System.out.println("\nFilas: " + nFilas + "\nColumnas: " + nCol);

    }

    public static void mostrarDiagonal(int[][] matriz) {
        for( i = 0; i < nFilas; i++ ){
            for( j = 0; j < nCol; j++ )
                System.out.print("\t-----");
            System.out.println("");
            for( j = 0; j < nCol; j++ ){
                if(j == i)
                    System.out.print("\t| " + matriz[i][j] + " | ");
                else
                    System.out.print("\t| 0 |");
            }
            System.out.println("");
        }
    }

    public static void mostrarMatriz(int[][] matriz) {
        for( i = 0; i < nFilas; i++ ){    
            for( j = 0; j < nCol; j++ )
                System.out.print("\t-----");
            System.out.println("");

            for( j = 0; j < nCol; j++ )
                System.out.print("\t| " + matriz[i][j] + " | ");
            System.out.println("");
        }
    }

    public static void llenarMatriz(int[][] matriz) {
        for( i = 0; i < nFilas; i++ ){
            for( j = 0; j < nCol; j++ )
                matriz[i][j] = (int)( Math.random()*10 );
        }
    }
}

public class MatrizInversa {
    static int nFilas = 10, nCol = 10, i, j;
    static int[][] datos = new int[ nFilas ][ nCol ];
    static int[][] datosInversos = new int[ nFilas ][ nCol ];
    static String separador = "\t-----";

    public static void main(String[] args){
        llenarMatriz(datos);
        System.out.println("\nMatriz original: \n");
        mostrarMatriz(datos);
        inversionMatriz(datos);
        System.out.println("\nMatriz Inversa: \n");
        mostrarMatriz(datosInversos);
        System.out.println("\nFilas: " + nFilas + "\nColumnas: " + nCol);
    }

    public static void mostrarMatriz(int[][] matriz){
        for( i = 0; i < nFilas; i++ ){
            for( j = 0; j < nCol; j++ )
                System.out.print(separador);
            System.out.println("");

            for( j = 0; j < nCol; j++ )
                System.out.print("\t| " + matriz[i][j] + " | ");
            
            System.out.println("");
        }
    }

    public static void inversionMatriz(int[][] datos){
        for(int i = 0; i < nFilas; i++ ){
            for(int j = 0; j < nCol; j++ )
                datosInversos[i][j] = datos[ ( nFilas - 1 ) - i ][ ( nCol - 1 ) - j ];
        }
    }

    public static void llenarMatriz(int[][] datos){
        for( i = 0; i < nFilas; i++ ){
            for( j = 0; j < nCol; j++ )
                datos[i][j] = (int)( Math.random()*10 );
        }
    }
}
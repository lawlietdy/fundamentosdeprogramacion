public class MatrizInversa {

    public static void main(String[] args){
        int nFilas = 10, nCol = 25, i, j;
        int[][] datos = new int[ nFilas ][ nCol ];
        int[][] datosInversos = new int[ nFilas ][ nCol ];
        String separador = "\t-----";
        // Asignacion de valores a la matriz
        for( i = 0; i < nFilas; i++ ){
            for( j = 0; j < nCol; j++ )
                datos[i][j] = (int)( Math.random()*10 );
        }

        System.out.println("\nMatriz original: \n");
        for( i = 0; i < nFilas; i++ ){
            // // Diseno tabla
            // for( j = 0; j < nCol; j++ )
            //     System.out.print(separador);
            // System.out.println("");

            for( j = 0; j < nCol; j++ )
                System.out.print("\t" + datos[i][j] + ""); // El caracter '\t' realiza una tabulacion
            
            System.out.println("");
        }

        // Asignacion de valores inversos a una nueva matriz
        for( i = 0; i < nFilas; i++ ){
            for( j = 0; j < nCol; j++ )
                datosInversos[i][j] = datos[ ( nFilas - 1 ) - i ][ ( nCol - 1 ) - j ]; // Formula de (n - 1)
        }

        System.out.println("\nMatriz Inversa: \n");
        for( i = 0; i < nFilas; i++ ){
            // Diseno tabla
            for( j = 0; j < nCol; j++ )
                System.out.print(separador);
            System.out.println("");
            for( j = 0; j < nCol; j++ )
                System.out.print("\t| " + datosInversos[i][j] + " | ");
            System.out.println("");
        }

        System.out.println("\nDiagonal: \n");
        for( i = 0; i < nFilas; i++ ){
            // Diseno tabla
            for( j = 0; j < nCol; j++ )
                System.out.print(separador);
            System.out.println("");
            for( j = 0; j < nCol; j++ ){
                if(j == i)
                    System.out.print("\t| " + datosInversos[i][j] + " | ");
                else
                    System.out.print("\t| 0 |");
            }
            System.out.println("");
        }

        System.out.println("\nFilas: " + nFilas + "\nColumnas: " + nCol);
    }
}
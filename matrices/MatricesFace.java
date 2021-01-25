import java.util.Scanner;

public class MatricesFace {
    // Realizar un programa en Codigo que dada una matriz de NXN, almacene la suma de los valores
    // de la columna exceptuando el valor de la posicion en donde se colocara el resultado. El 
    // progrma debera escriobir la matriz original y la matriz resultante. 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int m = 4, n = 4, sumaCol = 0;
        System.out.println("Ingresa m = ");
        m = entrada.nextInt();
        System.out.println("\nIngresa n = ");
        n = entrada.nextInt();
        int [][]matriz = new int[m][n]; //Arreglo original
        int [][]sumaMatriz = new int[m][n]; //Arrego que almacena la suma
        /*
        Pedir valores a guaradr en ArrayM[i][j]
        */
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                // System.out.print("[" + i +", " + j + "]");
                // matriz[i][j] = in.nextInt();
                matriz[i][j] = (int)(Math.random()*10);
            }
        }
        /*
        Mostrar arreglo original
        */
        System.out.print("\n\nOriginal\n\n");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++)
                System.out.print("\t[" + matriz[i][j] +"]");
            
        System.out.println("");
        }
        /*
        Crear suma del arreglo
        */
        for (int i = 0; i < m; i++){ //filas
            for (int j = 0; j < n; j++){ //columnas
                sumaCol = 0; //resetear variable sumaCol que es para guardar valores nuevos
                /*
                for para hacer guardar datos en la fila y columna de la
                casilla con excepción
                */
                for (int indCol = 0; indCol < n; indCol++){
                    if (indCol != i) //Comparar que indCol sea diferente a i para guardar la suma en la casilla del número que no se suma
                        sumaCol += matriz[indCol][j]; //sumar las columnas exceptuando la casilla indCol == i
                    
                    sumaMatriz[i][j] = sumaCol; //Almacenar suma en el arreglo
                }
            }
        }
        /*
        Mostrar arreglo de la suma
        */
        System.out.print("\n\nSuma\n\n");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++)
                System.out.print("\t[" + sumaMatriz[i][j] +"]");
        System.out.println("");
        }
    }
}

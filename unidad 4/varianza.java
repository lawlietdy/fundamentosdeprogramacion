/**
 * Ejercicio: Calcular la varianza y la desviacion estandar de un conjunto de
 * 250 numeros aleatorios de formato decimal y de precision sencilla.
 * archivo: varianza.java
 * 
 * @author Angel Rodriguez Aguirre
 */



 public class varianza{
    static int nFilas = 25, nCol = 10, j = 0, i = 0;
    static float[][] datos = new float[ nFilas ][ nCol ];
    static float promedio, varianza, desviacion, x, aleatorio = 0,  suma = 0, sigmaDatos = 0;
    public static void main(String[] args) {

        llenarMatriz(datos);
        System.out.println("\nDatos:  \n");
        mostrarMatriz(datos);
        // Se realiza la sumataria de cada numero.
        sumatoria();
        promedio = Math.round( ( suma / 250f ) * 100d ) / 100f;
        System.out.println("\nPromedio: " + promedio);
        // Se realiza la sumatoria del resultante de restar cada numero con el promedio.
        for (i = 0; i < nFilas; i++) {
            for (j = 0; j < nCol; j++) {
                x = datos[i][j] - promedio;
                sigmaDatos = sigmaDatos + (float) Math.pow(x , 2);
            }
        }
        // Se obtiene la varianza
        varianza = Math.round(( sigmaDatos / (250 - 1) ) * 100d ) / 100f;

        // Se obtiene la raiz cuadrada para determinar la desviacion
        desviacion =(float) Math.round( ( Math.sqrt(varianza) ) * 100d ) / 100f;

        mostrarResultados(varianza, desviacion);
    }

    public static void mostrarResultados(float varianza2, float desviacion2) {
        System.out.println("Varianza: " + varianza2 + "^2");
        System.out.println("Desviacion: " + desviacion2);
    }

    public static void llenarMatriz(float[][] datos) {
        for( i = 0; i < nFilas; i++ ){
            for( j = 0; j < nCol; j++ ){
                aleatorio = (float)( Math.random()*10 );
                datos[i][j] = (float)( Math.round( aleatorio * 100d ) / 100f );
            }
        }
    }

    public static void mostrarMatriz(float[][] datos){
        for( i = 0; i < nFilas; i++ ){
            for( j = 0; j < nCol; j++ )
                System.out.print("\t" + datos[i][j]+ " "); // El caracter '\t' realiza una tabulacion
            
            System.out.println("");
        }
    }

    public static void sumatoria(){
        for (i = 0; i < nFilas; i++) {
            for (j = 0; j < nCol; j++)
                suma = suma + datos[i][j];
        }
    }
 }
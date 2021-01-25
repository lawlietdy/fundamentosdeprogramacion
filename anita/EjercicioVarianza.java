
 public class EjercicioVarianza{

    public static void main(String[] args) {
        int numeroDeFilas = 25, numeroDeColumnas = 10, i = 0, j = 0;
        float[][] matriz = new float[ numeroDeFilas ][ numeroDeColumnas ];
        float sumaElementos = 0, promedio, varianza, desviacion, elemento;
        float sumatoriaDatos = 0;

        for( i = 0; i < numeroDeFilas; i++ ){
            for( j = 0; j < numeroDeColumnas; j++ ){
                matriz[i][j] = (float) (Math.random()*10 );
            }
        }

        System.out.println("\nDatos:  \n");
        for( i = 0; i < numeroDeFilas; i++ ){
            for( j = 0; j < numeroDeColumnas; j++ ){
                System.out.print("\t" + matriz[i][j]+ " "); // El caracter '\t' realiza una tabulacion
            }            
            System.out.println("");
        }

        for (i = 0; i < numeroDeFilas; i++) {
            for (j = 0; j < numeroDeColumnas; j++)
                sumaElementos = sumaElementos + matriz[i][j];
        }

        promedio = sumaElementos / 250f;

        for (i = 0; i < numeroDeFilas; i++) {
            for (j = 0; j < numeroDeColumnas; j++) {
                elemento = matriz[i][j] - promedio;
                sumatoriaDatos = sumatoriaDatos + (float) Math.pow(elemento , 2);
            }
        }

        varianza =  sumatoriaDatos / (250 - 1);

        desviacion = (float) Math.sqrt(varianza);

        System.out.println("Varianza: " + varianza);
        System.out.println("Desviacion: " + desviacion);
    }
 }
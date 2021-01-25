import java.util.Scanner;

public class menuMatrices {
    public static void main(String[] args) throws InterruptedException {
        Scanner entrada = new Scanner(System.in);
        boolean respuesta = true;
        String condicion;
        int opcion;
        int nFilas, nCol;
        System.out.println("Ingresa el tamaño de filas");
        nFilas = entrada.nextInt();
        System.out.println("Ingresa el tamaño de columnas");
        nCol = entrada.nextInt();
        int[][] matriz = new int[nFilas][nCol];
        
        do {
            System.out.println("Este programa realiza operaciones con un arreglo\n Selecciona una opcion");
            System.out.println("1. Llenar.");
            System.out.println("2. Mostrar.");
            System.out.println("3. Mostrar en orden inverso.");
            System.out.println("4. Multiplicar el arreglo.");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    entrada.nextLine();
                    System.out.println("Seleccionaste la opcion 1");

                    for (int i = 0; i < nFilas; i++) {
                        for (int j = 0; j < nCol; j++)
                            matriz[i][j] = (int) Math.random()*10;
                    }
                    System.out.println("Matriz llenada...");
                    System.out.println("¿Desea realizar otra accion? Si/No");
                    condicion = entrada.nextLine();
                    if(condicion.equals("No")|| condicion.equals("NO") || condicion.equals("no")) respuesta = false;
                    break;
                case 2:
                    System.out.println("Seleccionaste la opcion 2");
                    System.out.println("\nMatriz original: \n");
                    for( int i = 0; i < nFilas; i++ ){
                        // Diseno tabla
                        for( int j = 0; j < nCol; j++ )
                            System.out.print("\t-----");
                        System.out.println("");

                        for( int j = 0; j < nCol; j++ )
                            System.out.print("\t| " + matriz[i][j] + " | "); // El caracter '\t' realiza una tabulacion
                        
                        System.out.println("");
                    }
                    System.out.println("¿Desea realizar otra accion? Si/No");
                    condicion = entrada.nextLine();
                    if(condicion.equals("No")|| condicion.equals("NO") || condicion.equals("no")) respuesta = false;
                    break;
                case 3:
                    System.out.println("Seleccionaste la opcion 3");
                    System.out.println("¿Desea realizar otra accion? Si/No");
                    condicion = entrada.nextLine();
                    if(condicion.equals("No")|| condicion.equals("NO") || condicion.equals("no")) respuesta = false;
                    break;
                case 4:
                    System.out.println("Seleccionaste la opcion 4");
                    System.out.println("¿Desea realizar otra accion? Si/No");
                    condicion = entrada.nextLine();
                    if(condicion.equals("No")|| condicion.equals("NO") || condicion.equals("no")) respuesta = false;
                    break;

                default:
                    System.out.println("Seleccionaste una opcion invalida...");
                    Thread.sleep(2000);
                    break;
            }

        } while (respuesta);

        entrada.close();
    }
}

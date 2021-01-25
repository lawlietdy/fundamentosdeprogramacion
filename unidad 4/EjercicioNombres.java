// Diseñar un programa en Java que resuelva la siguiente problemática:
// Almacenar en un arreglo los nombres de 10 personas e imprimirlos en orden inverso a como fueron ingresados.

import java.util.*;
public class EjercicioNombres {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String nombres [] = new String[10];
        int i;
        for(i = 0; i < 10; i++){
            
            System.out.println("Ingrese el nombre " + (i+1));
            nombres[i] = sc.nextLine();
            // sc.nextLine(); // Limpiar el buffer
        }

        for(i = 9; i >= 0; i--)
            System.out.println("Nombre: " + nombres[i]);
    }
}
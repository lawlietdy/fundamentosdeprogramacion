// Un encuestador profesional, diariamente llena (escribir) una cantidad no 
// conocida de encuestas y su sueldo, se calcula al numero total que llena. 
// Calcular el total de encuestas que el empleado, lleno (elaboro) en un periodo de 10 dias. 
// Calcular el suldo del encuestador, conciderando que diariamente, puede llenar hasta 14 encuestas:
// -Cuando el encuestador llena al menos las encuestas, que pueda entender, en el periodo de tiempo,
// cada encuesta se paga a $75    pesos, de lo contrario cada encuesta se paga a $43.7.
// Imprimir el nombre del empleado y su sueldo. 

import java.util.*;
public class EjercicioEncuestador{
    public static void main(String[] args){
        float sueldoFinal;
        String nombre;
        nombre = leerNombre();
        sueldoFinal = obtenerSueldo();
        mostraResultados(nombre, sueldoFinal);
    }

    public static String leerNombre() {
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del encuestador: ");
        nombre = sc.nextLine();
        return nombre;
    }

    public static float obtenerSueldo() {
        float salario, subtotal, sueldoFinal = 0;
        int encuestasDiarias, i,totalEncuestas = 0;
        Scanner sc = new Scanner(System.in);
        for(i = 1; i<=10; i++){
            System.out.println("Ingrese el total de encuestas contestadas en el dia: " + i);
            encuestasDiarias = sc.nextInt();
            if(encuestasDiarias<=14) salario = 75f;
            else salario = 43.7f;
            subtotal = encuestasDiarias * salario;
            sueldoFinal += subtotal;
        }
        return sueldoFinal;
    }

    public static void mostraResultados(String nombre, float sueldoFinal) {
        System.out.println("El encuestador: " + nombre);
        System.out.println("Recibira un sueldo de: $" + sueldoFinal);
    }
}
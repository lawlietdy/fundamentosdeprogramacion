// Disenar un algoritmo para calcular el sueldo de un empleado, considerar el 
// numero de dias trabajados y el salario diario, cuando el empleado gana
// 5000 o mas, asignar un bono de 500, de lo contrario asignar un bono de 700 pesos.
// Imprimir sueldo calculado y nombre del empleado.

import java.util.*;

public class SueldoEmpleado{

    public static void main(String[] args){
        double sueldoDiario, diasTrabajados, bono, sueldo;
        String nombre;
        nombre = leerNombre();
        sueldoDiario = leerDato("sueldo diario");
        diasTrabajados = leerDato("dias trabajados");

        sueldo = sueldoDiario * diasTrabajados;
        if(sueldo>=5000){
            bono = 500;
        }else{
            bono = 700;
        }
        sueldo = sueldo + bono;

        mostrarResultado(nombre, sueldo);
    }

    public static String leerNombre(){
        String dato;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el nombre del trabajador: ");
        dato = sc.nextLine();
        return dato;
    }

    public static int leerDato(String datoSolicitado){
        int dato;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese " + datoSolicitado + ": ");
        dato = sc.nextInt();
        return dato;
    }

    public static void mostrarResultado(String nombre, Double sueldo){
        System.out.println("El empleado " + nombre + ", gano $" + sueldo);
    }
}
// Diseñar un programa que resuelva la siguiente problematica: 
// en una empresa los empleados trabajan de manera normal turnos
// diarios de ocho horas por cinco dias , el salario por turno es asignado 
// por el responsable de recursos humanos y cada empleado lavora en la semana 
// un conjunto de horas tatales diferentes(40 horas por semana de manera normal)
// para los empleados que laboran 40 horas a la semana el sueldo se calcula considerando el numero de horas 
// totales y el precio por hora. Pueden exixtir empleados que trabajan mas de 40 horas,
// en cuyo caso ademas del sueldo normal por 40 horas se consideran horas extras ,
// y cada hora extra es pagada doble. Calcular e imprimir el sueldo normal, el sueldo por hora
// extra si existe y el nombre del empleado

import java.util.*;

public class EjercicioEmpresa{
    public static void main(String[] args){
        String nombre;
        int salarioTurno, salarioHora,sueldoNormal, sueldoHorasExtras = 0;
        int horasLaboradas, horasExtras;
        nombre = leerNombre();
        salarioTurno = leerDato("salario por turno: ");
        horasLaboradas = leerDato("horas trabajadas: ");

        salarioHora = salarioTurno / 8;
        horasExtras = horasLaboradas - 40;
        if(horasExtras>=0) {
            sueldoHorasExtras = (salarioHora * 2) * horasExtras;
            sueldoNormal = salarioHora * 40;
        }else{
            sueldoNormal = salarioHora * horasLaboradas;
        }

        mostrarResultado(nombre, sueldoNormal, sueldoHorasExtras);
    }

    public static String leerNombre(){
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        return nombre;
    }

    public static int leerDato(String datoSolicitado){
        int dato;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese " + datoSolicitado + " : ");
        dato = sc.nextInt();
        return dato;
    }

    public static void mostrarResultado(String nombre, int sueldoNormal, int sueldoHorasExtras){
        System.out.println("El empleado: " + nombre);
        System.out.println("Tiene un sueldo normal de: $" + sueldoNormal);
        System.out.println("Sueldo por horas extras: $" + sueldoHorasExtras);
    }
}
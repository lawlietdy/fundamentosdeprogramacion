
/**
 * Un empleado de una tienda de conveniencia recibe un salario diario
 * de acuerdo al numero de dias laborados. Cuando el empleado trabaja
 * por lo menos 10 dias su salario diraio es de $95.00, de lo contrario
 * el salario es de $58.00. Calcular e imprimir el sueldo del empleado
 * ademas de su nombre. 
 */

import java.util.*;

public class CalcularSalario{

    public static void main(String[] args){
        int salarioDriario, dias, sueldoEmpleado;
        String nombre;
        nombre = leerNombre();
        dias = diasTrabajados();
        if(dias >=10) salarioDriario = 95;
        else salarioDriario = 58;
        sueldoEmpleado = dias * salarioDriario;
        mostrarSueldo(sueldoEmpleado, nombre);
    }

    public static String leerNombre(){
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        return nombre;
    }

    public static int diasTrabajados(){
        int dias;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el total de dias de trabajados: ");
        dias = sc.nextInt();
        return dias;
    }

    public static void mostrarSueldo(int sueldoEmpleado, String nombre){
        System.out.println("El salario de " + nombre + " por pagar es de: $" + sueldoEmpleado);
    }
}
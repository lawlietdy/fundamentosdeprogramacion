package unidad3;

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
        double salarioDriario, diasTrabajados, sueldoEmpleado;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el total de dias de trabajados: ");
        diasTrabajados = sc.nextDouble();
        if(diasTrabajados>=10) salarioDriario = 95;
        else salarioDriario = 58;
        sueldoEmpleado = diasTrabajados * salarioDriario;
        System.out.println("El salario de " + nombre + " por pagar es de: $" + sueldoEmpleado);
    }
}
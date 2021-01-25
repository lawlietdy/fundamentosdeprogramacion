// Disenar un algoritmo para calcular el sueldo de un empleado, considerar el 
// numero de dias trabajados y el salario diario, cuando el empleado gana
// 5000 o mas, asignar un bono de 500, de lo contrario asignar un bono de 700 pesos.
// Imprimir sueldo calculado y nombre del empleado.

import java.util.*;

public class SueldoEmpleado{

    public static void main(String[] args){
        double sueldoDiario, diasTrabajados, bono, sueldo;
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el nombre del trabajador: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese el sueldo diario: ");
        sueldoDiario = sc.nextDouble();
        System.out.println("Ingrese los dias trabajados: ");
        diasTrabajados = sc.nextInt();
        sueldo = sueldoDiario * diasTrabajados;
        if(sueldo>=5000){
            bono = 500;
        }else{
            bono = 700;
        }

        sueldo = sueldo + bono;
        System.out.println("El empleado " + nombre + ", gano $" + sueldo);

    }
}

/**
 * Determinar el salario total de un obrero que trabaja en una fábrica y 
 * su nombre de acuerdo con el total de piezas producidas en su jornada,
 *  por cada pieza elaborada se le paga un valor de $75 con un bono de
 *  $125 si es mayor o igual a 222 de lo contrario un descuento del 
 * salario equivalente a 1.3 piezas.
 * 
 * @author: Angel Rodriguez Aguirre
 */
import java.util.*;

public class sueldoObrero{
    public static void main(String[] args){
        double piezasObrero, sueldoObrero, subtotal, precioPorPieza = 75;
        double descuento, bono = 125;
        String nombre;
        nombre = leerNombre();
        piezasObrero = leerDato("piezas elaboradas");
        subtotal = piezasObrero * precioPorPieza;
        if( piezasObrero >= 222 ){
            sueldoObrero = subtotal + bono;
        } else {
            descuento = precioPorPieza * 1.3;
            sueldoObrero = subtotal - descuento;
        }
        mostrarResultado(nombre, sueldoObrero);
    }

    public static String leerNombre(){
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese nombre del obrero: ");
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

    public static void mostrarResultado(String nombre, double sueldoObrero){
        System.out.println("El sueldo de: " + nombre + "\nEs de: $" + sueldoObrero);
    }
} 
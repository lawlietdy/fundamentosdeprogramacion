// Ejercicio #9. Diseñar un algoritmo que reciba un número y 
// valide si este es: positivo, negativo o neutro.
import java.util.*;

public class TipoDeNumero{

    public static void main(String[] args){
        double numero;
        numero = leerDato();
        determinarNumero(numero);
    }
    
    public static double leerDato(){
        double numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        numero = sc.nextDouble();
        return numero;
    }

    public static void determinarNumero(double numero){
        if(numero>0){
            System.out.println("El numero ingresado es positivo");
            
        }else if(numero<0){
            System.out.println("El numero ingresado es negativo");
        }else{
            System.out.println("El numero ingresado es neutro");
        }
    }
}
// Ejercicio #9. Diseñar un algoritmo que reciba un número y 
// valide si este es: positivo, negativo o neutro.
import java.util.*;

public class TipoDeNumero{

    public static void main(String[] args){
        double numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = sc.nextDouble();
        if(numero>0){
            System.out.println("El numero ingresado es positivo");
            
        }else if(numero<0){
            System.out.println("El numero ingresado es negativo");
        }else{
            System.out.println("El numero ingresado es neutro");
        }
    }
    
}
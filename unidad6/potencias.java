// Elevar una base positiva a una potencia no negativa. 
import java.util.*;
public class potencias{
    public static void main(String[] args){
        int exponente, base, resultado;
        System.out.println("Este programa solo calcula exponentes y bases positivos");
        base = leerDato("base a elevar");
        if(base > 0){
            exponente = leerDato("exponente");
            if(exponente > 0){ 
                resultado = elevacion(base, exponente);
                mostrarMensaje("El resultado es: " + resultado);
            } else
                mostrarMensaje("El exponente que ingreso es negativo, vuelve a intentarlo");
        } else
            mostrarMensaje("La base que ingreso es negativa, vuelve a intentarlo");
    }

    public static int leerDato(String datoSolicitado){
        Scanner sc = new Scanner(System.in);
        int dato;
        System.out.print("Ingrese " + datoSolicitado + " : ");
        dato = sc.nextInt();
        return dato;
    }

    public static int elevacion(int numero, int exponente){
        int i = 1, resultado = 1;
        while(i <= exponente){
            resultado = resultado * numero;      
            i++;
        }
        return resultado;
    }

    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}
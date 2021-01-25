//DISENAR UN ALGORITMO PARA LEER UN NUMERO, E IMPRIMIR SU VALOR ABSOLUTO.

import java.util.*;

public class NumeroAbsoluto{
    public static void main(String[] args){
        int numero, resultado;
        numero = leerDato();
        resultado = numeroAbsoluto(numero);
        mostrarResultado(resultado);
    }

    public static int leerDato() {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero entero: ");
        numero = sc.nextInt();
        return numero;
    }

    public static int numeroAbsoluto(int numero) {
        if(numero < 0){
            numero = numero * -1;
        }
        return numero;
    }

    public static void mostrarResultado(int resultado){
        System.out.println("El numero es: " + resultado);
    }

}
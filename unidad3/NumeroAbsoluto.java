//DISENAR UN ALGORITMO PARA LEER UN NUMERO, E IMPRIMIR SU VALOR ABSOLUTO.

import java.util.*;

public class NumeroAbsoluto{
    public static void main(String[] args){
        int numero, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        numero = sc.nextInt();
        if(numero < 0){
            numero = numero * -1;
        }
        System.out.println("El numero es: " + numero);
    }
}
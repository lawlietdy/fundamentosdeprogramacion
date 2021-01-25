import java.util.*;

public class Ejercicio1{
    public static void main(String[] args){
        int dato1, dato2, valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa secuencial");
        System.out.println("Suma de dos numeros");
        System.out.println("Ingrese el primer numero: ");
        dato1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        dato2 = sc.nextInt();
        valor = dato1 + dato2;
        System.out.println("Resultado: " + valor);
    }
}

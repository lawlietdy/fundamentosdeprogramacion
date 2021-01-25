import java.util.*;

public class AreaCuadrado{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lado, resultado;
        System.out.println("Ingrese la medida del lado del cuadrado");
        lado = sc.nextInt();
        resultado = lado * lado;
        System.out.println("El area es: " + resultado);
    }
}
import java.util.*;

public class AreaCirculo{
    
    public static void main(String[] args){
        double pi = 3.1416;
        double radio, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este algoritmo encuentra el area de un circulo");
        System.out.println("Ingrese el radio del circulo");
        radio = sc.nextDouble();
        area = pi * (radio*radio);
        System.out.println("El area del circulo es: " + area);
    }
}
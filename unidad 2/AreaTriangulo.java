import java.util.*;

public class AreaTriangulo{

    public static void main(String[] args){
        double area, base, altura;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este algoritmo encuentra el area de un triangulo");
        System.out.println("Ingresa la base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = sc.nextDouble();
        area = (base * altura) / 2;
        System.out.println("El area es: " + area);
    }
}
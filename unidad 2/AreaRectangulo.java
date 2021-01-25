import java.util.*;

public class AreaRectangulo{

    public static void main(String[]args){
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este algoritmo encuentra el area de un rectangulo");
        System.out.println("Ingrese la base: ");
        base = sc.nextDouble();
        System.out.println("Ingrese la altura: ");
        altura = sc.nextDouble();
        area = base * altura;
        System.out.println("El area es: " + area);
    }
}
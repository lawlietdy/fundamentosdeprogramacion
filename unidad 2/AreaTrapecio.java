import java.util.*;

public class AreaTrapecio{

    public static void main(String[] args){
        double baseMayor, baseMenor, altura, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Este algoritmo encuentra el area de un trapecio");
        System.out.println("Ingrese a la altura: ");
        altura = sc.nextDouble();
        System.out.println("Ingrese la base mayor");
        baseMayor = sc.nextDouble();
        System.out.println("Ingrese la base menor");
        baseMenor = sc.nextDouble();
        area = (baseMayor * baseMenor) * altura / 2;
        System.out.println("El area es: " + area);
    }
}

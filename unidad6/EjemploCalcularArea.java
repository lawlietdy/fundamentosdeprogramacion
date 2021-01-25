import java.util.*;
import java.io.*;

public class EjemploCalcularArea{

    public static void main(String[] args) throws IOException{
        float diagonalMayor, diagonalMenor, area;
        System.out.println("Programa para calcular el area de un rombo\nIngresar diagonales menor y mayor.");
        diagonalMenor = leerDato("diagonal menor");
        diagonalMayor = leerDato("diagonal mayor");
        area = diagonalMayor * diagonalMenor / 2;
        mostrarResultado(area);
    }

    public static float leerDato(String valor) {
        float dato;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nIngrese " + valor + " : ");
        dato = sc.nextFloat();
        return dato;
    }

    public static void mostrarResultado(float area) {
        System.out.println("\nArea del rombo: " + area + " u^2");
    }
}
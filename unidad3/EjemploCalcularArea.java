import java.util.*;
import java.io.*;

public class EjemploCalcularArea{

    public static void main(String[] args) throws IOException{
        float diagonalMayor, diagonalMenor;
        System.out.println("Programa para calcular el area de un rombo\nIngresar diagonales menor y mayor.");
        diagonalMenor = leerDato();
        diagonalMenor = leerDato();
        mostrarResultado(diagonalMenor, diagonalMayor);
    }

    public static float leerDato() {
        float dato;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor: ");
        dato = sc.nextFloat();
        return dato;
    }

    public static void mostrarResultado(float diagonalMenor, float diagonalMayor) {
        float area;
        area = diagonalMayor * diagonalMenor / 2;
        System.out.println("Area del rombo: " + area);
    }
}
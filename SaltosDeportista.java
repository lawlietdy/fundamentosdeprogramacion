// 5) Un deportista de salto de longitud realiza durante un entrenamiento, 8 intentos los cuales registra para tener el control de su progreso.
// Realizar las siguientes operaciones:
// a) Leer la longitud de cada salto. 
// b) Comparar la longitud de cada salto, con la marca personal del deportista y contavilizar cuantos saltos son cuando mucho la marca personal y cuantos saltos son mayores. 
// c) Calcular el promedio de los 8 saltos 

import java.util.*;

public class SaltosDeportista{
    public static void main(String[] args){
        float longitudSalto, marcaPersonal, promedio, suma = 0;
        int saltosIgualMarcaPersonal = 0, saltosMayorMarcaPersonal = 0;
        marcaPersonal = leerDato("marca personal del deportista");
        for(int i = 1; i<=8; i++){
            longitudSalto = leerDato("Ingrese el salto numero " + i);
            suma += longitudSalto; 
            if(longitudSalto==marcaPersonal) 
                saltosIgualMarcaPersonal++; 
            else if(longitudSalto>marcaPersonal)
                saltosMayorMarcaPersonal++;
        }
        promedio = suma/8; 
        System.out.println("Saltos iguales a marca personal: " + saltosIgualMarcaPersonal);
        System.out.println("Saltos mayores a marca personal: " + saltosMayorMarcaPersonal);
        System.out.println("Promedio de saltos: " + promedio);
    }

    public static float leerDato(String datoSolicitado){
        float dato;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese " + datoSolicitado + " : ");
        dato = sc.nextFloat();
        return dato;
    }
}

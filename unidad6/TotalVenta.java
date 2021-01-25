// CALCULAR EL TOTAL DE UN CLIENTE QUE COMPRA UN SOLO PRODUCTO, DE ESE PRODUCTO PUEDE COMPRAR VARIOS ARTICULOS, CUANDO EL TOTAL QUE SE COBRA ES MAYOR
// A 1000, SE DESCUENTA LA CANTIDAD DE 125.

import java.util.*;

public class TotalVenta{

    public static void main(String[] args){
        int articulos, precio, resultado;
        articulos = leerDato("cantidad de articulos comprados");
        precio = leerDato("precio del producto");
        resultado = articulos * precio;         
        if(resultado > 1000){
            resultado -= 125;
        }
        mostrarResultado(resultado);
    }

    public static int leerDato(String datoSolicitado){
        Scanner sc = new Scanner(System.in);
        int dato;
        System.out.print("Ingrese " + datoSolicitado + " : ");   
        dato = sc.nextInt();
        return dato;
    }

    public static void mostrarResultado(int resultado){
        System.out.println("El total a pagar es de: " + resultado);
    }
}
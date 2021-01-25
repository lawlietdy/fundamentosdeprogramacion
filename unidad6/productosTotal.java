// Diseñar un programa que resuelva la siguiente problemática:
// Diseñar una aplicación que permita a un cliente comprar varios productos, y de cada producto varios artículos. 
// Calcular e imprimir:
// •	El nombre del producto. 
// •	Subtotal tomando en cuenta el precio del producto y la cantidad de artículos. 
// •	El total de la compra considerando la suma de todos los productos. 

import java.util.*;

public class productosTotal{

    public static void main(String[] args){
        float cantidadProductos, sumaTotal;
        cantidadProductos = leerDato("cantidad de productos a comprar");
        sumaTotal = obtenerSuma(cantidadProductos);
        mostrarResultado(cantidadProductos, sumaTotal);
    }

    public static float leerDato(String mensaje){
        float dato;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese " + mensaje + " : ");
        dato = sc.nextFloat();
        return dato;
    }

    public static String leerNombre(String mensaje){
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese " + mensaje + " : ");
        nombre = sc.nextLine();
        return nombre;
    }

    public static float obtenerSuma(float cantidadProductos){
        int i = 1;
        float precioProducto, subTotalProducto, sumaTotal = 0, cantidadArticulos;
        String nombreProducto;
        while( i <= cantidadProductos ){
            nombreProducto = leerNombre("nombre del producto " + i);
            precioProducto = leerDato("precio del producto " + i);
            cantidadArticulos = leerDato("Ingrese la cantidad de articulos de este producto " + i);
            subTotalProducto = precioProducto * cantidadArticulos;
            sumaTotal += subTotalProducto;
            System.out.println("Cantidad a pagar del producto " + nombreProducto +"\nEs de: " + subTotalProducto);
            i++;
        }

        return sumaTotal;
    }

    public static void mostrarResultado(float cantidadProductos, float sumaTotal){
        System.out.println("La cantidad total a pagar por el total de los " + cantidadProductos + " productos");
        System.out.println("Es de: $" + sumaTotal);
    }
}
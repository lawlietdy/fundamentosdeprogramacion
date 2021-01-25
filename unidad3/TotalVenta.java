// CALCULAR EL TOTAL DE UN CLIENTE QUE COMPRA UN SOLO PRODUCTO, DE ESE PRODUCTO PUEDE COMPRAR VARIOS ARTICULOS, CUANDO EL TOTAL QUE SE COBRA ES MAYOR
// // A 1000, SE DESCUENTA LA CANTIDAD DE 125.

import java.util.*;

public class TotalVenta{

    public static void main(String[] args){
        double productos, articulos, precio, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos productos compro? ");
        productos = sc.nextDouble();
        if(productos == 1){
            System.out.println("Cuantos articulos del producto compro? ");   
            articulos = sc.nextDouble();
            System.out.println("Cual es el precio del producto?");
            precio = sc.nextDouble();
            resultado = articulos * precio;         
            if(resultado > 1000){
                resultado -= 125;
            }
            System.out.println("El total a pagar es de: " + resultado);
        }else{
            System.out.println("Solo se puede hacer el calculo con un producto");  
        }
    }
}
//Diseñar un programa en java para resolver la siguiente problemática.
//Una empresa dedicada a la compra venta de semillas periódicamente compra
//una cantidad no conocida de bultos(50kg c/u). Calcular e imprimir el 
//monto total de la compra, la cantidad total de Kg comprados, el precio 
//de cada Kg comprado y el precio de cada kilogramo a la venta con una
//ganancia del 60%.

import java.util.*;

public class CompraSemillas{

    public static void main(String[] args){
        double precioPorBulto, totalKgComprados, montoTotal, precioKg, precioKgVenta;
        int bultosComprados, kgPorBulto = 50;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos bultos se compraron el dia de hoy?: ");
        bultosComprados = sc.nextInt();
        System.out.println("Cual fue el precio de cada bulto?");
        precioPorBulto = sc.nextDouble();
        totalKgComprados = bultosComprados * kgPorBulto;
        montoTotal = bultosComprados * precioPorBulto;
        precioKg = montoTotal / totalKgComprados;
        precioKgVenta = precioKg + precioKg * 60/100;
        System.out.println("El monto total de la compra es: $" + montoTotal);
        System.out.println("Usted obtuvo un total de: " + totalKgComprados + "kg");
        System.out.println("El precio por cada kg seria de: $" + precioKg);
        System.out.println("El precio de venta con ganancia del 60% es: $" + precioKgVenta);
    }
}
// Diseñar un programa que resulva la siguiente problematica. 
// En el buzon de entrega, de una biblioteca se alamcenan,
// un numero no conocido de libros, debueltos por los usuarios.

// Cada libro tiene registrado, un numero que puede estar en 
// el rango de 0 a 9 (especificarlo con Math.raundonm), lo que
// indica el numero de dias de retraso, en la entrega y debolucion
// del libro.

// a) Cuando el libro, tiene retrazo de entrega de 0 dias,
// la multa por retrazo, es de 0 pesos.
// b) Cuando el numero de dias por retrazo es de 1 a 4, 
// la multa es de, 10 pesos por dia.
// c) Cuando el numero de dias  de retrazo, es de 5 a 8, la multa es de 25 pesos por dia. 
// d) Cuando el numero de dias por retrazo, es de 9 a 10, la multa es de 50 pesos por dia.
// e) Mas de dies dias, la multa es de 100 pesos por dia. 
// Calcular e imprimir, el consto por retrazo de cada libro, 
// ademas de calcular, el costo total cobrado por todod los libros devueltos, en un dia.
// Contar e imprimir cuantos libros se ubicaron en cada categoria. 
// La categoría se refiere a separarlos por número de días de retraso? 
// Si imprimir cada dia de retrazo en que categoria.

import java.util.*; // Importacion de paquetes

public class EjercicioBiblioteca{

    public static void main(String[] args){
        Scanner entradaDatos = new Scanner( System.in );
        int libros, multa = 0, sumaMultas = 0, multaTotal, diasAtrasados, i = 1;
        int cat1 = 0, cat2 = 0, cat3 = 0, cat4 = 0, cat5 = 0; 
        System.out.println("Ingrese el numero de libros: ");
        libros = entradaDatos.nextInt(); // Almacenando el total de libros
        // Se necesita un ciclo while
        while( i <= libros ){
            diasAtrasados = (int)( Math.random()*10 ); // Genera un numero aleatorio de 0 a 9
            if( diasAtrasados == 0 ){
                // a) Cuando el libro, tiene retrazo de entrega de 0 dias,
                // la multa por retrazo, es de 0 pesos.
                multa = 0;
                cat1 = cat1 + 1;
            } 
            else if( diasAtrasados >= 1 && diasAtrasados <= 4  ){
                // b) Cuando el numero de dias por retrazo es de 1 a 4, 
                // la multa es de, 10 pesos por dia.
                multa = 10;
                cat2 = cat2 + 1;
            } else if( diasAtrasados >= 5 && diasAtrasados <= 8 ){
                // c) Cuando el numero de dias  de retrazo, es de 
                // 5 a 8, la multa es de 25 pesos por dia. 
                multa = 25;
                cat3++;  // cat3 += 1; // cat3 = cat3 + 1;
            } else if( diasAtrasados >= 9 && diasAtrasados <= 10 ){
                // d) Cuando el numero de dias por retrazo, es de 9 a 10,
                // la multa es de 50 pesos por dia.
                multa = 50;
                cat4 += 1;
            } else if( diasAtrasados > 10 ){
                // e) Mas de dies dias, la multa es de 100 pesos por dia. 
                multa = 100;
                cat5++;
            }
            multaTotal = diasAtrasados * multa;
            sumaMultas = sumaMultas + multaTotal;
            System.out.println("Dias atrasados: " + diasAtrasados);
            System.out.println("Multa : " + multaTotal);
            i++; // i(11) = i(10) + 1;
        }
        System.out.println("Suma de las multas: $" + sumaMultas);
        System.out.println("Categoria a: " + cat1);
        System.out.println("Categoria b: " + cat2);
        System.out.println("Categoria c: " + cat3);
        System.out.println("Categoria d: " + cat4);
        System.out.println("Categoria e: " + cat5);
    }
}
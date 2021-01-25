// AUTOR: TEODORO DEL ANGEL RODRIGUEZ AGUIRRE 		JAVA
// Archivo: EjercicioBiblioteca.java


// Diseñar un programa que resulva la siguiente problematica. 

// En el buzon de entrega, de una biblioteca se alamcenan, un numero no conocido de libros, debueltos por los usuarios.

// Cada libro tiene registrado, un numero que puede estar en el rango de 0 a 9 (especificarlo con Math.raundonm), 
// lo que indica el numero de dias de retraso, en la entrega y debolucion del libro. 
// a) Cuando el libro, tiene retrazo de entrega de 0 dias, la multa por retrazo, es de 0 pesos.
// b) Cuando el numero de dias por retrazo es de 1 a 4, la multa es de, 10 pesos por dia.
// c) Cuando el numero de dias  de retrazo, es de 5 a 8, la multa es de 25 pesos por dia. 
// d) Cuando el numero de dias por retrazo, es de 9 a 10, la multa es de 50 pesos por dia.
// e) Mas de dies dias, la multa es de 100 pesos por dia. 

// Calcular e imprimir, el consto por retrazo de cada libro, ademas de calcular, el costo total cobrado por todod los 
// libros devueltos, en un dia. Contar e imprimir cuantos libros se ubicaron en cada categoria. 

// La categoría se refiere a separarlos por número de días de retraso? Si imprimir cada dia de retrazo en que categoria.

import java.util.*;

public class EjercicioBiblioteca{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int multa = 0, libros, diasRetraso, i = 1, categoria1 = 0, categoria2 = 0, categoria3 = 0;
        int categoria4 = 0, categoria5 = 0, multaTotal = 0, sumaMulta = 0;
        System.out.print("Ingrese la cantidad de libros: "); 
        libros = sc.nextInt();
        while( i <= libros ){
            diasRetraso = (int)( Math.random()*10 );
            if( diasRetraso == 0 ) { 
                multa = 0; 
                categoria1 ++;
            } 
            else if( diasRetraso > 0 && diasRetraso <=4 ) { 
                multa = 10; 
                categoria2 ++; 
            } 
            else if( diasRetraso >= 5 && diasRetraso <= 8  ) {
                multa = 25; 
                categoria3 ++; 
            } 
            else if( diasRetraso >= 9 && diasRetraso <= 10 ) { 
                multa = 50;
                categoria4 ++; 
            } 
            else if( diasRetraso > 10 ) {
                multa = 100; 
                categoria5 ++; 
            } 
            System.out.println( "\nDias restraso: " + diasRetraso );
            multaTotal = diasRetraso * multa;
            sumaMulta += multaTotal;
            System.out.println( "La multa es de: $" + multaTotal );
            i++;
        }
        
        System.out.println( "\nCategoria de 0 dias: " + categoria1 + " libro(s)" );
        System.out.println( "\nCategoria de 1 a 4 dias: " + categoria2 + " libro(s)" );
        System.out.println( "\nCategoria de 5 a 8 dias: " + categoria3 + " libro(s)" );
        System.out.println( "\nCategoria de 9 a 10 dias: " + categoria4 + " libro(s)" );
        System.out.println( "\nCategoria de mas de 10 dias: " + categoria5 + " libro(s)" );
        System.out.println( "\nCosto total cobrado por todos los libros: $" + sumaMulta + ".00" );
    }
}
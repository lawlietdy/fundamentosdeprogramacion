import java.io.*;
import java.util.Random;

public class menu{
public static void main(String args[])throws IOException{

int i, j, dato;

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

int[][] tablaOriginal = new int[10][15];
int[][] tablaInvertida = new int [10][15];
int[][] tablaMultiplicada = new int [10][15];


//***********Llenado de tablas
for (i=0;i<10;i++)
	for (j=0;j<15;j++)
		tablaOriginal[i][j] = (int)(Math.random() * 10);

for (i=0;i<10;i++)
	for (j=0;j<15;j++) 
		tablaInvertida[9-i][14-j] = tablaOriginal[i][j];


//***********Imprimir tablas
System.out.println("Tabla Original:");
for (i=0;i<10;i++)
	for (j=0;j<15;j++)
		System.out.print(tablaOriginal[i][j] + " ");

System.out.println("");

System.out.println("Tabla Copia:");
for (i=0;i<10;i++)
	for (j=0;j<15;j++)
		System.out.print(tablaInvertida[i][j] + " ");

System.out.println("");


//***********Multiplicar tablas
System.out.println("Por que numero entero quiere multiplicar el arreglo?");
dato = Integer.parseInt(al.readLine());

for (i=0;i<10;i++)
	for (j=0;j<15;j++) 
		tablaMultiplicada[i][j] = tablaOriginal[i][j] * dato;

System.out.println("Tabla Multiplicada:");
for (i=0;i<10;i++)
	for (j=0;j<15;j++)
		System.out.print("|" + tablaMultiplicada[i][j] + "|");


}
}
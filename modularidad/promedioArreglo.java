public class promedioArreglo{
public static void main (String args[]){

//Declaracion de variables
int i, j, sumaArreglo=0,c1=0,c2=0,c3=0,par=0,impar=0;
float promedio;

//Declaracion y dimension de arreglo
int[][] tablaOriginal = new int[10][10];

//Ciclo para llenar el arreglo
for (i=0;i<10;i++) {
	for (j=0;j<10;j++) {
		tablaOriginal[i][j] = (int)(Math.random() * 10);
		System.out.print(tablaOriginal[i][j] + " ");
		sumaArreglo = sumaArreglo + tablaOriginal[i][j];
		c1++;
}
System.out.println();
}

//numeros par e impar
for (i=0;i<10;i++) 
	for (j=0;j<10;j++)
		if(tablaOriginal[i][j] % 2==0)
			par++;

impar = c1 - par;

System.out.println("");

promedio = sumaArreglo / c1;

//Que numeros son mayores o menores al promedio
for (i=0;i<10;i++)
	for (j=0;j<10;j++)
		if(tablaOriginal[i][j] > promedio)
			c2++;
c3 = c1 - c2;

//Impresion de datos
System.out.println("La suma del arreglo es: " + sumaArreglo);
System.out.println("El promedio del arreglo es: " + promedio);
System.out.println("Los numeros mayores al promedio son: " + c2);
System.out.println("Los numeros menores al promedio son: " + c3);
System.out.println("Los numeros pares son: " + par);
System.out.println("Los numeros impares son: " + impar);


}
}
public class promedioArreglo {
	static int i = 0, j;
	public static void main(String args[]) {

		// Declaracion de variables
		int sumaArreglo = 0, mayores, menores, iguales, par = 0, impar = 0;
		float promedio;

		// Declaracion y dimension de arreglo
		int[][] tablaOriginal = new int[10][10];

		// Ciclo para llenar el arreglo
		llenarArreglo(tablaOriginal);
		sumaArreglo = sumaArreglo(tablaOriginal);
		mostrarArreglo(tablaOriginal);
		// numeros par e impar
		par = obtenerPares(tablaOriginal);
		impar = obtenerImpares(tablaOriginal);

		promedio = sumaArreglo / 100;

		// Que numeros son mayores o menores al promedio
		mayores = obtenerNumerosMayoresPromedio(tablaOriginal, promedio);
		menores = obtenerNumerosMenoresPromedio(tablaOriginal, promedio);
		iguales = obtenerNumerosIgualesPromedio(tablaOriginal, promedio);

		// Impresion de datos
		mostrarResultados(sumaArreglo, promedio, mayores, menores, iguales, par, impar);
	
	}


	public static void mostrarResultados(int sumaArreglo, float promedio, int mayores, int menores, int iguales, int par, int impar) {
		System.out.println("La suma del arreglo es: " + sumaArreglo);
		System.out.println("El promedio del arreglo es: " + promedio);
		System.out.println("Los numeros mayores al promedio son: " + mayores);
		System.out.println("Los numeros menores al promedio son: " + menores);
		System.out.println("Los numeros iguales al promedio son: " + iguales);
		System.out.println("Los numeros pares son: " + par);
		System.out.println("Los numeros impares son: " + impar);
	}

	public static int obtenerImpares(int[][] arreglo) {
		int impar = 0;
		for (i = 0; i < 10; i++){
			for (j = 0; j < 10; j++){
				if (arreglo[i][j] % 2 != 0)
					impar++;
			}
		}
		return impar;
	}

	public static void llenarArreglo(int[][] arreglo) {
		for(i = 0; i < 10; i++){
			for (j = 0; j < 10; j++) {
				arreglo[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static int sumaArreglo(int[][] arreglo){
		int sumaArreglo = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				sumaArreglo = sumaArreglo + arreglo[i][j];
			}
		}

		return sumaArreglo;
	}

	public static int obtenerPares(int[][] arreglo){
		int par = 0;
		for (i = 0; i < 10; i++){
			for (j = 0; j < 10; j++){
				if (arreglo[i][j] % 2 == 0)
					par++;
			}
		}
		return par;
	}

	public static void mostrarArreglo(int[][] arreglo){
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++)
				System.out.print("\t| " + arreglo[i][j] + " | ");
			System.out.println("");
		}
	}

	public static int obtenerNumerosMayoresPromedio(int[][] arreglo, float promedio){
		int suma = 0;
		for (i = 0; i < 10; i++){
			for (j = 0; j < 10; j++){
				if (arreglo[i][j] < promedio)
					suma++;
			}
		}
		return suma;
	}

	public static int obtenerNumerosMenoresPromedio(int[][] arreglo, float promedio){
		int suma = 0;
		for (i = 0; i < 10; i++){
			for (j = 0; j < 10; j++){
				if (arreglo[i][j] > promedio)
					suma++;
			}
		}
		return suma;
	}

	public static int obtenerNumerosIgualesPromedio(int[][] arreglo, float promedio){
		int suma = 0;
		for (i = 0; i < 10; i++){
			for (j = 0; j < 10; j++){
				if (arreglo[i][j] == promedio)
					suma++;
			}
		}
		return suma;
	}

	

}
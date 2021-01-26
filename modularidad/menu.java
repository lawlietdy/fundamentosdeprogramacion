import java.io.*;

public class menu {
	static InputStreamReader ent = new InputStreamReader(System.in);
	static BufferedReader al = new BufferedReader(ent);
	static int i, j, dato;
	public static void main(String args[]) throws IOException {

		int[][] tablaOriginal = new int[10][15];
		int[][] tablaInvertida = new int[10][15];
		int[][] tablaMultiplicada = new int[10][15];

		// ***********Llenado de tablas
		llenarTabla(tablaOriginal);
		tablaInvertida = invertirTabla(tablaOriginal);
		// ***********Imprimir tablas
		System.out.println("Tabla Original:");
		mostrarTabla(tablaOriginal);

		System.out.println("Tabla Copia:");
		mostrarTabla(tablaInvertida);

		System.out.println("");

		// ***********Multiplicar tablas
		tablaMultiplicada = multiplicarTabla(tablaOriginal);

		System.out.println("Tabla Multiplicada:");
		mostrarTabla(tablaMultiplicada);

	}

	public static void llenarTabla(int[][] tabla){
		for (i = 0; i < 10; i++)
			for (j = 0; j < 15; j++)
				tabla[i][j] = (int) (Math.random() * 10);
	}

	public static int[][] invertirTabla(int[][] tabla){
		int[][] tablaInvertida = new int[10][15];
		for (i = 0; i < 10; i++)
			for (j = 0; j < 15; j++)
				tablaInvertida[9 - i][14 - j] = tabla[i][j];
		return tablaInvertida;
	}

	public static void mostrarTabla(int[][] tabla){
		for (i = 0; i < 10; i++){
			for (j = 0; j < 15; j++)
				System.out.print(tabla[i][j] + " ");
			System.out.println("");
		}
	}

	public static int[][] multiplicarTabla(int[][] tabla) throws NumberFormatException, IOException {
		System.out.println("Por que numero entero quiere multiplicar el arreglo?");
		dato = Integer.parseInt(al.readLine());
		int[][] tablaMultiplicada = new int[10][15];

		for (i = 0; i < 10; i++)
			for (j = 0; j < 15; j++)
				tablaMultiplicada[i][j] = tabla[i][j] * dato;
		
		return tablaMultiplicada;
	}
}
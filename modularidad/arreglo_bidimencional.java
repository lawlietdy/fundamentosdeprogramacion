public class arreglo_bidimencional {

	static int i, j, relleno;
	public static void main(String args[]) {

		int[][] tabla = new int[4][9];
		int[][] tablaCopia = new int[4][9];

		llenarTabla(tabla);
		tablaCopia = voltearTabla(tabla);

		System.out.println("Tabla 1:");
		mostrarTabla(tabla);

		System.out.println("Tabla 2:");
		mostrarTabla(tablaCopia);

	}

	public static void llenarTabla(int[][] tabla){
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 9; j++) {
				relleno = (int) (Math.random() * 10);
				tabla[i][j] = relleno;
			}
		}
	}

	public static int[][] voltearTabla(int[][] tabla){
		int[][] tablaCopia = new int[4][9];
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 9; j++) {
				tablaCopia[3 - i][8 - j] = tabla[i][j];
			}
		}

		return tablaCopia;
	}

	public static void mostrarTabla(int[][] tabla){
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 9; j++) {
				System.out.print(tabla[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println("");
	}


}
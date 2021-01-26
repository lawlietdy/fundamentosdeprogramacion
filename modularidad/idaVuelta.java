public class idaVuelta {
	static int i, relleno;
	public static void main(String args[]) {

		int[] ida = new int[15];
		int[] vuelta = new int[15];

		llenarArreglo(ida);
		vuelta = revertirArreglo(ida);
		mostrarResultado(ida, vuelta);

	}

	public static void llenarArreglo(int[] arreglo){
		for (i = 0; i < 15; i++) {
			relleno = (int) (Math.random() * 10);
			arreglo[i] = relleno;
		}
	}

	public static int[] revertirArreglo(int[] arreglo){
		int[] vuelta = new int[15];
		for (i = 14; i >= 0; i--)
			vuelta[i] = arreglo[14 - i];
		
		return vuelta;
	}

	public static void mostrarResultado(int[] arreglo, int[] arreglo2){
		System.out.println("ida " + " - " + " vuelta");
		for (i = 0; i < 15; i++)
			System.out.println(arreglo[i] + "    -    " + arreglo2[i]);
	}
}

import java.io.*;

public class MultiplicacionSuma {
	static InputStreamReader ent = new InputStreamReader(System.in);
	static BufferedReader al = new BufferedReader(ent);

	public static void main(String[] args) throws IOException {
		int numero, i = 0, cont = 0, numeroVeces = 0, suma = 0;

		numero = obtenerValor("Ingrese el numero");
		numeroVeces = obtenerValor("El numero multiplicador");

		while (i < numeroVeces) {
			cont = numero + cont;
			i++;
		}

		mostrarResultado(cont);
	}

	public static void mostrarResultado(int cont) {
		System.out.println("----------------------------------------------");
		System.out.println("MULTIPLICACION = " + cont);
	}

	public static int obtenerValor(String valor) throws NumberFormatException, IOException {
		int dato;
		System.out.println(valor);
		dato = Integer.parseInt(al.readLine());
		return dato;
	}
}
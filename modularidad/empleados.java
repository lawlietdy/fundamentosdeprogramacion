import java.io.*;

public class empleados {
	static InputStreamReader ent = new InputStreamReader(System.in);
	static BufferedReader al = new BufferedReader(ent);
	static int i;

	public static void main(String args[]) throws IOException {

		String[] nombre = new String[4];
		float[] dias = new float[4];
		float[] salariodiario = new float[4];

		for (i = 1; i <= 4; i++) {
			nombre[i - 1] = obtenerNombre("Dame un nombre: ");
			dias[i - 1] = obtenerValor("Cuantos dias trabajo? : ");
			salariodiario[i - 1] = obtenerValor("Cuanto es el salario diario?");
			System.out.println("");
		}

		mostrarResultados(nombre, dias, salariodiario);
	}

	public static void mostrarResultados(String[] nombre, float[]dias, float[]salariodiario){
		for (i = 1; i <= 4; i++) {
			System.out.println(i + ".-El empleado " + nombre[i - 1]);
			System.out.println("Tiene un salario de $" + (dias[i - 1] * salariodiario[i - 1]));
		}
	}

	public static String obtenerNombre(String dato) throws IOException {
		String nombre;
		System.out.println(dato);
		nombre = al.readLine();
		return nombre;
	}

	public static float obtenerValor(String valor) throws NumberFormatException, IOException {
		float dato;
		System.out.println(valor);
		dato = Float.parseFloat(al.readLine());
		return dato;
	}

}

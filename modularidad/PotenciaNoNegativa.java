import java.io.*;

public class PotenciaNoNegativa {
	static InputStreamReader ent = new InputStreamReader(System.in);
	static BufferedReader al = new BufferedReader(ent);
	public static void main(String[] args) throws IOException {

		int numeroBase = 0, exponente = 0, resultado = 0;

		numeroBase = obtenerValor("Ingresa un numero base positivo");
		evaluacion(numeroBase);
		exponente = obtenerValor("Ingrese el exponente del numero base");
		evaluacion(exponente);

		resultado = elevacion(numeroBase, exponente);

		mostrarResultado(resultado);
	}

	public static int elevacion(int numeroBase, int exponente) {
		int i = 0, resultado = 1;
		while (i < exponente) {
			resultado = resultado * numeroBase;
			i++;
		}
		return resultado;
	}

	public static void mostrarResultado(int resultado) {
		System.out.println("RESULTADO: " + resultado); 
	}

	public static int obtenerValor(String valor) throws NumberFormatException, IOException {
		int dato;
		System.out.println(valor);
		dato = Integer.parseInt(al.readLine());
		return dato;
	}

	public static void evaluacion(int numero){
		if(numero <= 0) {
			System.out.println("El numero " + numero + " no es positivo");
			System.exit(0);
		}
	}
}
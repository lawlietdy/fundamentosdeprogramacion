import java.io.*;

public class GenerarNumerosAleatorios {
	public static void main(String[] args) throws IOException {

		int sumaNumeros;
		float promedioNumeros = 0f;


		System.out.println("Generando numeros...");

		sumaNumeros = generadorAleatorios(20);
		promedioNumeros = sumaNumeros / 20;

		mostrarResultados(sumaNumeros, promedioNumeros);
		
	}

	public static void mostrarResultados(int sumaNumeros, float promedioNumeros) {
		System.out.println("La suma de los numeros es: " + sumaNumeros);
		System.out.println("El promedio de los numeros es: " + promedioNumeros);
	}

	public static int generadorAleatorios(int total) {
		int i = 0, numeroAleatorio = 0, sumaNumeros = 0;
		for (i = 1; i <= total; i = i + 1) {
			numeroAleatorio = (int) (Math.random() * 10);
			System.out.println(numeroAleatorio);
			sumaNumeros = sumaNumeros + numeroAleatorio;
		}

		return sumaNumeros;
	}
}
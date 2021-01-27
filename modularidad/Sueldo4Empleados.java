import java.io.*;

public class Sueldo4Empleados {
	static InputStreamReader ent = new InputStreamReader(System.in);
	static BufferedReader al = new BufferedReader(ent);

	public static void main(String[] args) throws IOException {

		int i = 0;
		float diasTrabajados, salario, sueldo = 0f, sumaSueldo = 0f, promedioSueldo = 0f;
		String nombre;

		for (i = 1; i <= 4; i++) {
			System.out.println(" ");
			nombre = obtenerNombre("Ingrese su nombre: ");
			salario = obtenerValor("Ingrese su salario diario");
			diasTrabajados = obtenerValor("Ingrese los dias laborados");
			sueldo = salario * diasTrabajados;
			sumaSueldo = sumaSueldo + sueldo;
			mostrarDatos(nombre, sueldo);
		}

		promedioSueldo = sumaSueldo / 4;
		mostrarResultados(sumaSueldo, promedioSueldo);
		
	}

	public static void mostrarResultados(float sumaSueldo, float promedioSueldo) {
		System.out.println(" ");
		System.out.println("La suma de los sueldos es de: " + sumaSueldo);
		System.out.println("El promedio de los sueldos es de: " + promedioSueldo);
	}

	public static void mostrarDatos(String nombre, float sueldo) {
		System.out.println("------------------------------------------");
		System.out.println("Tu nombre: " + nombre);
		System.out.println("Tu sueldo es de: " + sueldo);
		System.out.println("------------------------------------------");
	}

	public static float obtenerValor(String solicitud) throws NumberFormatException, IOException {
		float dato;
		System.out.println(solicitud);
		dato = Float.parseFloat(al.readLine());
		return dato;
	}

	public static String obtenerNombre(String solicitud) throws IOException {
		String nombre;
		System.out.println(solicitud);
		nombre = al.readLine();
		return nombre;
	}
}
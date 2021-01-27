import java.io.*;

public class PromedioMaterias {
	static InputStreamReader ent = new InputStreamReader(System.in);
	static BufferedReader al = new BufferedReader(ent);
	public static void main(String[] args) throws IOException {

		int i = 0;
		float nCalificaciones, calificacion = 0f, cont = 0, promedio = 0f;
		String nombreAlumno, nombreMateria;

		nombreAlumno = obtenerTexto("Ingresa tu nombre");
		nombreMateria = obtenerTexto("Ingresa el nombre de la materia: ");
		nCalificaciones = obtenerValor("Ingrese el numero de calificaciones ");

		while (i < nCalificaciones) {
			System.out.println("----------------------------------------------");
			calificacion = obtenerValor("Ingrese la calificacion n. " + (i + 1));
			evaluacion(calificacion);
			cont = cont + calificacion;
			i++;
		}
		
		promedio = cont / nCalificaciones;

		mostrarResultados(nombreAlumno, nombreMateria, promedio);
	}

	public static void mostrarResultados(String nombreAlumno, String nombreMateria, float promedio) {
		System.out.println("----------------------------------------------");
		System.out.println("Tu nombre: " + nombreAlumno);
		System.out.println("Materia: " + nombreMateria);
		System.out.println("PROMEDIO = " + promedio);
	}

	public static String obtenerTexto(String solicitud) throws IOException {
		String texto;
		System.out.println(solicitud);
		texto = al.readLine();
		return texto;
	}

	public static float obtenerValor(String solicitud) throws NumberFormatException, IOException {
		int dato;
		System.out.println(solicitud);
		dato = Integer.parseInt(al.readLine());
		return dato;
	}

	public static void evaluacion(float calificacion){
		if (calificacion < 7)
			System.out.println("TU PROMEDIO ES: 0");
		else 
			System.out.println("CALIFICACION APROBATORIA");
	}
}
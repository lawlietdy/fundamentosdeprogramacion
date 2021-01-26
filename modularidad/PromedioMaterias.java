import java.io.*;
public class PromedioMaterias {
    public static void main(String[] args) throws IOException {
	
	int nCalificaciones, i=0;
	float calificacion=0f, cont=0, promedio=0f;
	String nombreAlumno, nombreMateria;
	InputStreamReader ent = new InputStreamReader(System.in);
    BufferedReader al = new BufferedReader(ent);
	
	System.out.println("Ingresa tu nombre");
	nombreAlumno = (al.readLine());
	System.out.println("Ingresa el nombre de la materia");
	nombreMateria = (al.readLine());
	System.out.println("Ingrese el numero de calificaciones a evaluar");
	nCalificaciones = Integer.parseInt(al.readLine());
	
	while(i < nCalificaciones){
		System.out.println("----------------------------------------------");
		System.out.println("Ingrese la calificacion n. " + (i+1));
		calificacion = Float.parseFloat(al.readLine());
		if(calificacion < 7){
			System.out.println("TU PROMEDIO ES: 0");
			System.exit(0);
		}
		System.out.println("CALIFICACION APROBATORIA");
		cont = cont + calificacion;
		i++;
	}
	promedio = cont / nCalificaciones;
	System.out.println("----------------------------------------------");
	System.out.println("Tu nombre: " + nombreAlumno);
	System.out.println("Materia: " + nombreMateria);
	System.out.println("PROMEDIO = " + promedio);
}
}
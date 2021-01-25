import java.util.*;

public class EjercicioCalificacion {
	public static void main(String[] args) {
		int i;
		float valor = 0, promedio, suma = 0;
		String nombre;
		float calificacion[] = new float[7];
		Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese el nombre del alumno: ");
    nombre = sc.nextLine();
    for(i = 0; i < 7; i++){
    System.out.println("Ingrese la calificacion: " +(i + 1));
    calificacion[i] = sc.nextFloat();
    }
    
    for(i = 0; i<7; i++)
    	suma = suma + calificacion[i];
    
    promedio = suma / 7;
    for(i = 0; i<7; i++){
    	if(valor < calificacion[i])
    		valor = calificacion[i]; 
    	
    }
    System.out.println("El alumno: " + nombre);
    System.out.println("tiene promedio de: " + promedio);
    System.out.println("Su calificacion mas alta es: " + valor);
	}
}
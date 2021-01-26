import java.io.*;
public class Sueldo4Empleados {
    public static void main(String[] args) throws IOException {
	
	int i=0, diasTrabajados;
	float salario, sueldo = 0f, sumaSueldo = 0f, promedioSueldo = 0f;
	String nombre;
	
	InputStreamReader ent = new InputStreamReader(System.in);
    BufferedReader al = new BufferedReader(ent);
	
		for (i=1; i<=4; i++){
			System.out.println(" ");
			System.out.println("Ingrese su nombre");
			nombre = (al.readLine());
			System.out.println("Ingrese su salario diario");
			salario = Float.parseFloat(al.readLine());
			System.out.println("Ingrese los dias laborados");
			diasTrabajados = Integer.parseInt(al.readLine());
			sueldo = salario * diasTrabajados;
			sumaSueldo = sumaSueldo + sueldo;
			System.out.println("------------------------------------------");
			System.out.println("Tu nombre: " + nombre);
			System.out.println("Tu sueldo es de: " + sueldo);
			System.out.println("------------------------------------------");
		}
	
	promedioSueldo = sumaSueldo / 4;
	System.out.println(" ");
	System.out.println("La suma de los sueldos es de: " + sumaSueldo);
	System.out.println("El promedio de los sueldos es de: " + promedioSueldo);
    }	
}
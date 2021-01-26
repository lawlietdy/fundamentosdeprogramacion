import java.io.*;
public class GenerarNumerosAleatorios {
    public static void main(String[] args) throws IOException {
	
	int i=0, numeroAleatorio = 0, sumaNumeros = 0;
	float promedioNumeros = 0f;
	
	InputStreamReader ent = new InputStreamReader(System.in);
    BufferedReader al = new BufferedReader(ent);
	
	System.out.println("Generando numeros...");
	
	for (i=1; i<=20; i = i + 1){
		numeroAleatorio = (int)(Math.random() * 10);
		System.out.println(numeroAleatorio);
		sumaNumeros = sumaNumeros + numeroAleatorio;
		}
		
	promedioNumeros = sumaNumeros / 20;
	
	System.out.println("La suma de los numeros es: " + sumaNumeros);
	System.out.println("El promedio de los numeros es: " + promedioNumeros);
	
	}	
}
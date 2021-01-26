import java.io.*;
public class PotenciaNoNegativa {
    public static void main(String[] args) throws IOException {
	
	int numeroBase=0, exponente=0, i=0, resultado=0;

	InputStreamReader ent = new InputStreamReader(System.in);
    BufferedReader al = new BufferedReader(ent);
	
	System.out.println("Ingresa un numero base positivo");
	numeroBase = Integer.parseInt(al.readLine());
	if(numeroBase <= 0){
	System.out.println("El numero base no es positivo");
	System.exit(0);
	}		
	
	System.out.println("Ingrese el exponente del numero base");
	exponente = Integer.parseInt(al.readLine());
	if(exponente <= 0){
	System.out.println("El exponente del numero base no es positivo");
	System.exit(0);
	}	
	
	while(i < exponente){
		resultado = numeroBase;
		resultado = numeroBase * resultado;
		i++;
	}
	System.out.println("RESULTADO: " + resultado);
}
}
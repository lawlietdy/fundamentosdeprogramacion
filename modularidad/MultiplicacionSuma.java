import java.io.*;
public class MultiplicacionSuma {
    public static void main(String[] args) throws IOException {
	
	int numero, i=0, cont=0, numeroVeces=0, suma=0;
	
	InputStreamReader ent = new InputStreamReader(System.in);
    BufferedReader al = new BufferedReader(ent);
	
	System.out.println("El Nultiplicando");
	numero = Integer.parseInt(al.readLine());
	
	System.out.println("El numero Multiplicador");
	numeroVeces = Integer.parseInt(al.readLine());
	
	while(i < numeroVeces){
		cont = numero + cont;
		i++;
	}
	System.out.println("----------------------------------------------");
	System.out.println("MULTIPLICACION = " + cont);
}
}
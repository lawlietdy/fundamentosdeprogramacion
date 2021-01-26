import java.io.*;

public class empleados {
public static void main(String args[]) throws IOException {

InputStreamReader ent = new InputStreamReader(System.in);
BufferedReader al = new BufferedReader(ent);

int i;
String nombre[];
float dias[];
float salariodiario[];
nombre = new String[4];
dias = new float[4];	
salariodiario = new float[4];

for (i=1;i<=4;i++) {
	System.out.println("Dame un nombre");
	nombre[i-1] = al.readLine();
	System.out.println("Cuantos dias trabajo?");
	dias[i-1] = Float.parseFloat(al.readLine());
	System.out.println("Cuanto es el salario diario?");
	salariodiario[i-1] = Float.parseFloat(al.readLine());
	System.out.println("");
}

for (i=1;i<=4;i++) {
	System.out.println(i + ".-El empleado " + nombre[i-1]);
	System.out.println("Tiene un salario de $" + (dias[i-1]* salariodiario[i-1]));
}
}


}


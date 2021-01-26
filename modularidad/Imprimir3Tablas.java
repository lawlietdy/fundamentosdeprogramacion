import java.io.*;
public class Imprimir3Tablas {
    public static void main(String[] args) throws IOException {
	
	int i=0, numero, tablaMultiplicar;
	
	InputStreamReader ent = new InputStreamReader(System.in);
    BufferedReader al = new BufferedReader(ent);
	
		for (i=1; i<=3; i++){
			System.out.println("Ingresa un numero");
			numero = Integer.parseInt(al.readLine());
			tablaMultiplicar = numero * 1;
			System.out.println(numero + " * " + "1" + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 2;
			System.out.println(numero + " * " + "2" + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 3;
			System.out.println(numero + " * " + "3"  + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 4;
			System.out.println(numero + " * " + "4"  + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 5;
			System.out.println(numero + " * " + "5"  + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 6;
			System.out.println(numero + " * " + "6"  + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 7;
			System.out.println(numero + " * " + "7"  + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 8;
			System.out.println(numero + " * " + "8"  + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 9;
			System.out.println(numero + " * " + "9"  + " = " + tablaMultiplicar);
			tablaMultiplicar = numero * 10;
			System.out.println(numero + " * " + "10" + " = " + tablaMultiplicar);
		}
	}	
}
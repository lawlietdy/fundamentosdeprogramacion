import java.io.*;
public class Imprimir3Tablas {
	static InputStreamReader ent = new InputStreamReader(System.in);
    static BufferedReader al = new BufferedReader(ent);
    public static void main(String[] args) throws IOException {
	
	int i=0, numero;
	
	
	
		for (i=1; i<=3; i++){
			numero = obtenerValor("Ingresa un numero: ");
			mostarTabla(numero);
		}
	}	

	public static void mostarTabla(int numero){
		int resultado;
		System.out.print("Tabla del " + numero + "\n");
		for (int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println(numero + "\t*\t" + i + " = " + resultado);
		}
	}

	public static int obtenerValor(String valor) throws NumberFormatException, IOException {
		int dato;
		System.out.print(valor);
		dato= Integer.parseInt(al.readLine());
		return dato;
	}
}
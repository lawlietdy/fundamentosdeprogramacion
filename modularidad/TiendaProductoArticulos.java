import java.io.*;

public class TiendaProductoArticulos {
	static InputStreamReader ent = new InputStreamReader(System.in);
	static BufferedReader al = new BufferedReader(ent);
	public static void main(String[] args) throws IOException {

		int i = 0, producto = 0, articulos = 0;
		float subtotal = 0f, precioArticulo = 0f, total = 0f;
		String nombreProducto;
		
		System.out.println("Ingrese la cantidad de productos a comprar");
		producto = Integer.parseInt(al.readLine());
		while (i < producto) {
			System.out.println(" ");
			nombreProducto = obtenerTexto("Ingrese el nombre del producto " + (i + 1));
			precioArticulo = obtenerValor("Escriba la el precio de dicho producto");
			articulos = obtenerValor("Escriba la cantidad de articulos comprados de dicho producto");
			subtotal = precioArticulo * articulos;
			mostrarResultados(nombreProducto, subtotal);	
			total = total + subtotal;
			System.out.println(" ");
			i++;
		}

		System.out.println("El total de sus compras es: " + total);
	}

	public static void mostrarResultados(String nombreProducto, float subtotal) {
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("Nombre del producto: " + nombreProducto);
		System.out.println("Subtotal del producto: " + subtotal);
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
	}

	public static int obtenerValor(String solicitud) throws NumberFormatException, IOException {
		int dato;
		System.out.println(solicitud);
		dato = Integer.parseInt(al.readLine());
		return dato;
	}

	public static String obtenerTexto(String solicitud) throws IOException {
		String texto;
		System.out.println(solicitud);
		texto = al.readLine();
		return texto;
	}
	
}

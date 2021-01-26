import java.io.*;
public class TiendaProductoArticulos {
    public static void main(String[] args) throws IOException {
	
	int i=0, producto=0, articulos=0;
	float subtotal=0f, precioArticulo=0f, total=0f;
	String nombreProducto;
	InputStreamReader ent = new InputStreamReader(System.in);
    BufferedReader al = new BufferedReader(ent);
	
	System.out.println("Ingrese la cantidad de productos a comprar");
	producto = Integer.parseInt(al.readLine());
	i=0;
			while (i<producto){
				System.out.println(" ");
				System.out.println("Ingrese el nombre del producto " + (i + 1));
				nombreProducto = (al.readLine());
				System.out.println("Escriba la el precio de dicho producto");
				precioArticulo = Integer.parseInt(al.readLine());
				System.out.println("Escriba la cantidad de articulos comprados de dicho producto");
				articulos = Integer.parseInt(al.readLine());
				subtotal = precioArticulo * articulos;
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
				System.out.println("Nombre del producto: " + nombreProducto);
				System.out.println("Subtotal del producto: " + subtotal);
				System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
				total = total + subtotal;
				System.out.println(" ");
				i++;
				}		
				System.out.println("El total de sus compras es: " + total);
	}
}	

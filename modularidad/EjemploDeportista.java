import java.io.*;

public class EjemploDeportista {
    static InputStreamReader ent = new InputStreamReader(System.in);
    static BufferedReader al = new BufferedReader(ent);

    public static void main(String args[]) throws IOException {
        int i;
        float salto, nuevoSalto, sumaDeSaltos = 0, promedio = 0;
        String nombre;
        nombre = obtenerNombre("Ingrese el nombre del deportista: ");
        salto = obtenerDato("Ingrese el mejor salto que realizo: ");

        for (i = 1; i <= 8; i++) {
            System.out.println(" ");
            nuevoSalto = obtenerDato("Ingrese la marca de su nuevo salto: ");
            sumaDeSaltos = sumaDeSaltos + nuevoSalto;
            if (nuevoSalto <= salto)
                System.out.println("Esta en los parametros de su propia marca");
            else
                System.out.println("Supero su marca personal");
            promedio = sumaDeSaltos / 8;
        }

        mostrarMensaje(nombre, promedio);
        
    }

    public static void mostrarMensaje(String nombre, float promedio) {
        System.out.println("****************************");
        System.out.println("Su nombre es:" + nombre);
        System.out.println("El promedio de sus 8 saltos es:" + promedio);
    }

    public static float obtenerDato(String dato) throws NumberFormatException, IOException {
        float salto;
        System.out.println(dato);
        salto = Float.parseFloat(al.readLine());
        return salto;
    }

    public static String obtenerNombre(String dato) throws IOException {
        String nombre;
        System.out.println(dato);
        nombre = al.readLine();
        return nombre;
    }
}

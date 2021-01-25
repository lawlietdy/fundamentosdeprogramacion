// Disenar un programa que resuelva la siguiente problematica
// Una empresa dedicada al envio de paqueteria atiende a sus
// clientes registrando el peso del paquete, nombre del remitente
// y destinatario. El peso del paquete es usado para calcular
// el costo del envio, cuando el peso del paquete es cuando
// mucho en gramos cada gramo es de .35 pesos, en lo contrario
// cada gramo se cobra a .2 pesos. Imprimir el nombre del remitente
// y destinatario, y el costo del envio.

import java.util.*;

public class EjercicioPaqueteria{
    public static void main(String[] args){
        float costoEnvio, pesoPaquete, costoGramo;
        String nombreRemitente, nombreDestinatario;
        pesoPaquete = leerDato("peso del paquete en gramos");
        nombreRemitente = leerNombre("remitente");
        nombreDestinatario = leerNombre("destinatario");

        if(pesoPaquete<=1000) costoGramo = 0.35f;
        else costoGramo = 0.20f;
        costoEnvio = pesoPaquete * costoGramo;

        mostrarResultados(nombreRemitente, nombreDestinatario, costoEnvio);
    }

    public static float leerDato(String datoSolicitado) {
        float dato;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese " + datoSolicitado + " : ");
        dato = sc.nextFloat();
        return dato;
    }

    public static String leerNombre(String datoSolicitado){
        String nombre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el nombre de " + datoSolicitado + " : ");
        nombre = sc.nextLine();
        return nombre;
    }

    public static void mostrarResultados(String nombreRemitente, String nombreDestinatario, float costoEnvio) {
        System.out.println("Nombre del remitente: " + nombreRemitente);
        System.out.println("Nombre del destinatario: " + nombreDestinatario);
        System.out.println("Costo de envio: $" + costoEnvio);
    }
}
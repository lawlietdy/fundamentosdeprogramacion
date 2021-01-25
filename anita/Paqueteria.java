// Disenar un programa que resuelva la siguiente problematica
// Una empresa dedicada al envio de paqueteria atiende a sus
// clientes registrando el peso del paquete, nombre del remitente
// y destinatario. El peso del paquete es usado para calcular
// el costo del envio, cuando el peso del paquete es cuando
// mucho en 1000 gramos cada gramo es de .35 pesos, en lo contrario
// cada gramo se cobra a .2 pesos. Imprimir el nombre del remitente
// y destinatario, y el costo del envio.

/*      
    DIAGRAMA EPS ENTRADA - PROCESO - SALIDA
    ENTRADA.- pesoPaquete, nombreRemitente, nombreDestinatario.
    PROCESO.- pesoPaquete * .35(precioPorGramo)
    SALIDA.- nombreRemitente, nombreDestinatario y costoEnvio. 
*/
import java.util.*; //Mandar a llamar mas funciones

public class Paqueteria{

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in); //Te permite leer datos de entrada
        float pesoPaquete, precioEnvio;  //tipo(float) nombre(pesoPaquete)
        float precioPorGramo; // tipo(double) nombre(precioPorGramo)
        String nombreRemitente, nombreDestinatario; //VARIABLES
        /* Tipos de datos
        float 12.4 $120.45
        double 0.3 $0.3
        int 45
        String(cadena de texto) "Ana"*/
        System.out.println("Ingrese el nombre de quien envia: ");
        nombreRemitente = entrada.next(); //.next() y .nextLine();
        System.out.println("Ingrese el nombre de quien recibe: ");
        nombreDestinatario = entrada.next();
        System.out.println("Ingrese el peso del paquete en gramos: ");
        pesoPaquete = entrada.nextFloat();
        //PROCESO
        if(pesoPaquete <= 1000) precioPorGramo = .35f;
        else precioPorGramo = .2f;
        precioEnvio = precioPorGramo * pesoPaquete;
        //SALIDA
        System.out.println("El nombre de quien envia es: " + nombreRemitente);
        System.out.println("El nombre de quien recibe es: " + nombreDestinatario);
        System.out.println("El costo del envio es: $" + precioEnvio);
    }
}